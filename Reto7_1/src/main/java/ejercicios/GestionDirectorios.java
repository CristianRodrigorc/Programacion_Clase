package ejercicios;

import java.io.File;
import java.util.Scanner;

public class GestionDirectorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la ruta del directorio:");
        String directorioPath = scanner.nextLine();

        System.out.println("Ingrese el nombre del elemento:");
        String elementoNombre = scanner.nextLine();

        File directorio = new File(directorioPath);

        // Comprobar si el directorio existe
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("El directorio especificado no existe.");
            return;
        }

        // Comprobar si el elemento existe en el directorio
        File elemento = new File(directorio, elementoNombre);
        if (!elemento.exists()) {
            System.out.println("El elemento especificado no existe en el directorio.");
            return;
        }

        if (elemento.isDirectory()) {
            // Listar contenido del directorio
            File[] contenido = elemento.listFiles();
            System.out.println("Contenido del directorio:");
            for (File file : contenido) {
                System.out.println(file.getName());
            }
        } else {
            // Es un fichero
            System.out.println("El elemento es un fichero.");
            System.out.println("Longitud del fichero: " + elemento.length() + " bytes");

            // Si es un fichero, pedir al usuario un nuevo nombre
            System.out.println("Ingrese el nuevo nombre para el fichero (o presione enter para cancelar):");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.isEmpty()) {
                File nuevoArchivo = new File(directorio, nuevoNombre);
                if (elemento.renameTo(nuevoArchivo)) {
                    System.out.println("El fichero ha sido renombrado exitosamente.");
                } else {
                    System.out.println("No se pudo renombrar el fichero.");
                }
            }
        }
    }
}

