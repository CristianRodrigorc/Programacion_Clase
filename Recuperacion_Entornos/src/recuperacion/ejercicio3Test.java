package recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recuperacion.ejercicio3;

class ejercicio3Test {

    @Test
    public void testNumeroTotalMayorQue1() {
        assertEquals(8, ejercicio3.calcularSuma(5));
    }

    @Test
    public void testNumeroTotalIgualA1() {
        assertEquals(1, ejercicio3.calcularSuma(1));
    }

    @Test
    public void testNumeroTotalIgualA0() {
        assertEquals(0, ejercicio3.calcularSuma(0));
    }

    @Test
    public void testNumeroTotalNegativo() {
        // Puedes manejar este caso según lo que sea apropiado para tu aplicación.
        // En este ejemplo, asumimos que retorna null para entradas no válidas.
        assertNull(ejercicio3.calcularSuma(-3));
    }
}
