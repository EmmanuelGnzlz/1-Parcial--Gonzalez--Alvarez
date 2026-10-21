import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la pelicula: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el precio base: ");
        double precio = teclado.nextDouble();

        System.out.print("Ingrese la edad del espectador: ");
        int edad = teclado.nextInt();

        Peliculas pelicula = new Peliculas(nombre, precio, edad);

        System.out.println("\n=== Datos de la compra ===");
        pelicula.MostrarDatos();

        teclado.close();
    }
}


/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Pedir datos de 3 entradas por consola
        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Registro de Entrada " + i + " ===");

            System.out.print("Ingrese el nombre de la película: ");
            String pelicula = scanner.nextLine();

            System.out.print("Ingrese el precio base: ");
            double precioBase = scanner.nextDouble();

            System.out.print("Ingrese la edad del espectador: ");
            int edadEspectador = scanner.nextInt();

            // Limpieza del buffer de Scanner
            scanner.nextLine();

            System.out.println(); // Salto de línea estético

            // Crear el objeto con los datos ingresados por el usuario
            Peliculas peliculas = Peliculas (pelicula, precioBase, edadEspectador);

            // Mostrar la información formateada
            peliculas.mostrarDatos();
            System.out.println("-----------------------------------\n");
        }

        scanner.close();
    }
}




/*public class Main {
    public static void main(String[] args) {
        Peliculas pelicula = new Peliculas(
                "Cien anios de soledad",
                25000.0,
                14
        );

        pelicula.MostrarDatos();
    }
}*/