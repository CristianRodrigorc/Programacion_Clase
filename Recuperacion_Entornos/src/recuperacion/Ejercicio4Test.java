package recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    @Test
    public void testCalcularPrima() {
        assertEquals(100, Ejercicio4.calcularPrima("001", "Juan", "Pérez", 6, "EMPLEADO"));
        assertEquals(200, Ejercicio4.calcularPrima("002", "Ana", "Gómez", 11, "EMPLEADO"));
        assertEquals(-1, Ejercicio4.calcularPrima("1234", "John", "Doe", 7, "EMPLEADO"));
        assertEquals(-1, Ejercicio4.calcularPrima("003", "Juan", "Pérez", -2, "EMPLEADO"));
        assertEquals(-1, Ejercicio4.calcularPrima("004", "María", "López", 8, "ESTUDIANTE"));
    }
}