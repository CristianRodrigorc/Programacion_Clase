package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClienteTest {

	@Test
	public void testGetSaldo() {
		Cliente cliente = new Cliente(1, 1234);
		double saldo = cliente.getSaldo();
		assertEquals(0.0, saldo, 0.001);
	}

	@Test
	public void testSetSaldo() {
		Cliente cliente = new Cliente(1, 1234);
		cliente.setSaldo(1500.0);
		assertEquals(1500.0, cliente.getSaldo(), 0.001);
	}

	@Test
	public void testDropSaldo() {
		Cliente cliente = new Cliente(1, 1234);
		cliente.setSaldo(2000.0);
		cliente.dropSaldo(500.0);
		assertEquals(1500.0, cliente.getSaldo(), 0.001);
	}

	@Test
	public void testEquals() {
		Cliente cliente1 = new Cliente(1, 1234);
		Cliente cliente2 = new Cliente(1, 1234);
		Cliente cliente3 = new Cliente(2, 5678);
		assertTrue(cliente1.equals(cliente2));
		assertFalse(cliente1.equals(cliente3));
	}

}
