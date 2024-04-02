package recuperacion;

public class Ejercicio4 {

    public static int calcularPrima(String codEmpleado, String nombre, String apellidos, int años, String tipo) {
        // Validación de las reglas
        if (!codEmpleado.matches("\\d{3}")) {
            System.out.println("Error: CODEMPLEADO no es correcto");
            return -1;
        }

        if (nombre.length() > 15 || !nombre.matches("[a-zA-Z0-9]+")) {
            System.out.println("Error: NOMBRE no es correcto");
            return -1;
        }

        if (apellidos.length() > 15 || !apellidos.matches("[a-zA-Z0-9]+")) {
            System.out.println("Error: APELLIDOS no es correcto");
            return -1;
        }

        if (años < 0) {
            System.out.println("Error: AÑOS no es correcto");
            return -1;
        }

        if (!tipo.equals("DIRECTIVO") && !tipo.equals("EMPLEADO")) {
            System.out.println("Error: TIPO no es correcto");
            return -1;
        }

        // Cálculo de la prima según el tipo de empleado
        if (tipo.equals("EMPLEADO")) {
            if (años > 10) {
                return 200;
            } else if (años > 5) {
                return 100;
            }
        }

        return 0; // En caso de no cumplir ninguna condición especial
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int prima = calcularPrima("123", "John", "Doe", 7, "EMPLEADO");
        if (prima != -1) {
            System.out.println("La prima es: " + prima);
        }
    }
}

 


