package reto4_4;

import java.time.LocalDate;
import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private boolean disponible;
    private LocalDate fechaDisponible;

    public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.disponible = true;
        this.fechaDisponible = null;
    }

    public void alquilarCoche(int dias) {
        if (disponible) {
            disponible = false;
            fechaDisponible = LocalDate.now().plusDays(dias);
            System.out.println("Coche alquilado por " + dias + " días. Disponible hasta: " + fechaDisponible);
        } else {
            System.out.println("El coche no está disponible para alquilar.");
        }
    }

    public void devolverCoche() {
        if (!disponible) {
            disponible = true;
            fechaDisponible = null;
            System.out.println("Coche devuelto. Disponible ahora.");
        } else {
            System.out.println("El coche ya está disponible.");
        }
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + " (" + matricula + ")";
    }

    public boolean isDisponible() {
        return disponible;
    }

    public LocalDate getFechaDisponible() {
        return fechaDisponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Marca1", "Modelo1", "123ABC");
        Coche coche2 = new Coche("Marca2", "Modelo2", "456DEF");
        Coche coche3 = new Coche("Marca3", "Modelo3", "789GHI");

        menu(coche1, coche2, coche3);
    }

    public static void menu(Coche... coches) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu alquiler coches");
            System.out.println("1.- Alquilar un coche");
            System.out.println("2.- Devolver un coche");
            System.out.println("0.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    alquilarCoche(coches);
                    break;
                case 2:
                    devolverCoche(coches);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static void alquilarCoche(Coche... coches) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del coche que desea alquilar: ");
        String matricula = scanner.next();

        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                System.out.print("Ingrese el número de días para alquilar: ");
                int dias = scanner.nextInt();
                coche.alquilarCoche(dias);
                return;
            }
        }

        System.out.println("No se encontró un coche con esa matrícula.");
    }

    public static void devolverCoche(Coche... coches) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del coche que desea devolver: ");
        String matricula = scanner.next();

        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                coche.devolverCoche();
                return;
            }
        }

        System.out.println("No se encontró un coche con esa matrícula.");
    }
}
