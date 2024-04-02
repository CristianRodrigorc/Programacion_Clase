package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class cajeroMainTest {

	 @Test
	    public void testCheckUser() {
	        ArrayList<Cliente> users = new ArrayList<>();
	        users.add(new Cliente(1, 111));
	        users.add(new Cliente(2, 222));
	        users.add(new Cliente(3, 333));

	        assertTrue(cajeroMain.checkUser(users, new Cliente(1, 111)));
	        assertFalse(cajeroMain.checkUser(users, new Cliente(4, 444)));
	    }

	    @Test
	    public void testViewSaldo() {
	        ArrayList<Cliente> users = new ArrayList<>();
	        users.add(new Cliente(1, 111));
	        users.get(0).setSaldo(1500.0);
	        assertEquals(1500.0, users.get(0).getSaldo(), 0.001);
	    }

	    @Test
	    public void testDepositSaldo() {
	        ArrayList<Cliente> users = new ArrayList<>();
	        users.add(new Cliente(1, 111));
	        cajeroMain.depositSaldo(users, 0, 1000.0);
	        assertEquals(1000.0, users.get(0).getSaldo(), 0.001);
	    }

	    @Test
	    public void testRetireSaldo() {
	        ArrayList<Cliente> users = new ArrayList<>();
	        users.add(new Cliente(1, 111));
	        users.get(0).setSaldo(2000.0);
	        cajeroMain.retireSaldo(users, 0, 500.0);
	        assertEquals(1500.0, users.get(0).getSaldo(), 0.001);
	    }

	    @Test
	    public void testTransferSaldo() {
	        ArrayList<Cliente> users = new ArrayList<>();
	        users.add(new Cliente(1, 111));
	        users.add(new Cliente(2, 222));
	        users.get(0).setSaldo(2000.0);
	        users.get(1).setSaldo(1000.0);
	        cajeroMain.transferSaldo(users, 0, 1, 500.0);
	        assertEquals(1500.0, users.get(0).getSaldo(), 0.001);
	        assertEquals(1500.0, users.get(1).getSaldo(), 0.001);
	    }
}
