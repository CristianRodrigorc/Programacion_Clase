package random;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ALUMNO CCC - TARDE
 */
public class Conductor {

    private String nombre;
    private LocalDate fechaNacimiento;
    private int puntos;
    private LocalDate fechaCarnet;
    private boolean carnetRetirado;

    public Conductor(String nombre, LocalDate fechaNacimiento, LocalDate fechaCarnet) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCarnet = fechaCarnet;
        this.puntos = 12;
        this.carnetRetirado = false;
    }

    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Juan Pérez", LocalDate.of(1990, 5, 15), LocalDate.of(2015, 8, 20));
        Conductor conductor2 = new Conductor("María López", LocalDate.of(1985, 3, 10), LocalDate.of(2010, 6, 5));
        Conductor conductor3 = new Conductor("Carlos Rodríguez", LocalDate.of(2000, 8, 25), LocalDate.of(2022, 1, 1));

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    faltaLeve(conductor1);
                    break;
                case 2:
                    faltaGrave(conductor1);
                    break;
                // Añade casos para conductor2 y conductor3 si es necesario
            }

        } while (opcion != 0);
    }
    
        public static int menu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu infracciones de tráfico");
            System.out.println("1.- Infracción falta leve");
            System.out.println("2.- Infracción falta grave");
            System.out.println("0.- Salir");
            return scanner.nextInt();
        }
        
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getPuntos() {
        return puntos;
    }

    public LocalDate getFechaCarnet() {
        return fechaCarnet;
    }

    public boolean isCarnetRetirado() {
        return carnetRetirado;
    }

    public void retirarPuntos(int puntos) {
        this.puntos -= puntos;
        if (this.puntos <= 0) {
            this.carnetRetirado = true;
        }
    }

    @Override
    public String toString(){
        return "Conductor[" +
                "nombre ='" + nombre+"'" +
                ", fechaNacimiento="+ fechaNacimiento +
                ", puntos="+puntos+
                ", fechaCarnet="+fechaCarnet+
                ", carnetRetirado=" + carnetRetirado +
                ']';
    }
    
        public static void faltaLeve(Conductor conductor) {
            Scanner scanner = new Scanner(System.in);

            if (conductor.isCarnetRetirado()) {
                System.out.println("¡El conductor tiene el carnet retirado! Multa de 10000 euros.");
            } else {
                System.out.println("¿El conductor es novel? (S/N): ");
                String respuesta = scanner.nextLine().toUpperCase();

                int puntosARetirar = 4;
                double multa = 75;

                if (respuesta.equals("S") || conductor.getFechaCarnet().plusYears(2).isAfter(LocalDate.now())) {
                    puntosARetirar = 3;
                    multa = 50;
                }

                if (conductor.getFechaNacimiento().plusYears(30).isAfter(LocalDate.now())) {
                    multa *= 1.5; // Se incrementa la multa en un 50% si el conductor tiene menos de 30 años.
                }

                conductor.retirarPuntos(puntosARetirar);
                System.out.println("Falta leve cometida por " + conductor.getNombre());
                System.out.println("Puntos retirados: " + puntosARetirar);
                System.out.println("Multa: " + multa + " euros");
                System.out.println(conductor);
            }
        }

        public static void faltaGrave(Conductor conductor) {
            Scanner scanner = new Scanner(System.in);

            if (conductor.isCarnetRetirado()) {
                System.out.println("¡El conductor tiene el carnet retirado! Multa de 100000 euros.");
            } else {
                System.out.println("¿El conductor es novel o joven? (S/N): ");
                String respuesta = scanner.nextLine().toUpperCase();

                int puntosARetirar = 10;
                double multa = 10000;

                if (respuesta.equals("S") || conductor.getFechaCarnet().plusYears(2).isAfter(LocalDate.now())
                        || conductor.getFechaNacimiento().plusYears(30).isAfter(LocalDate.now())) {
                    multa *= 1.5; // Se incrementa la multa en un 50% si el conductor es novel o joven.
                }

                conductor.retirarPuntos(puntosARetirar);

                if (conductor.getPuntos() <= 0) {
                    System.out.println("¡Retirada de carnet!");
                } else {
                    System.out.println("Falta grave cometida por " + conductor.getNombre());
                    System.out.println("Puntos retirados: " + puntosARetirar);
                    System.out.println("Multa: " + multa + " euros");
                    System.out.println(conductor);
                }
            }
        }
}