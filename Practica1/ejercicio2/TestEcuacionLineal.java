package src.laboratorio1;
import java.util.Scanner;
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();
        System.out.print("Ingrese d: ");
        double d = sc.nextDouble();
        System.out.print("Ingrese e: ");
        double e = sc.nextDouble();
        System.out.print("Ingrese f: ");
        double f = sc.nextDouble();
        EcuacionLineal eq = new EcuacionLineal(a, b, c, d, e, f);
        if (eq.tieneSolucion()) {
            System.out.println("x = " + eq.getX() + ", y = " + eq.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
