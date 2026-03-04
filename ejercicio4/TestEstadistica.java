package src.laboratorio1;
public class TestEstadistica {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(datos);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviacion estandar es " + est.desviacion());
    }
}
