public class Peliculas {
    private String pelicula;
    private double precioBase;
    private int edadEspectador;

    public Peliculas(String pelicula, double precioBase, int edadEspectador) {
        this.pelicula = pelicula;

        if (precioBase < 0) {
            this.precioBase = 0.0;
        } else {
            this.precioBase = precioBase;
        }

        if (edadEspectador < 0) {
            this.edadEspectador = 0;
        } else {
            this.edadEspectador = edadEspectador;
        }
    }

    public double calcularPrecioFinal() {
        if (edadEspectador < 12 || edadEspectador > 65) {
            return precioBase * 0.5;
        }

        return precioBase;
    }

    public boolean tieneDescuento() {
        return edadEspectador < 12 || edadEspectador > 65;
    }

    public void MostrarDatos() {
        System.out.println("Hola, espectador. Usted vera: " + pelicula);
        if (tieneDescuento()) {
            System.out.println("Tiene un descuento del 50 %.");
        } else {
            System.out.println("No tiene descuento.");
        }
        System.out.println("El precio base es: $" + precioBase);
        System.out.println("El precio final es: $" + calcularPrecioFinal());
    }
}