package src.laboratorio1;
import java.util.Scanner;
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("No es ecuación cuadrática");
            return;
        }
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double discriminante = eq.getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices:"
                    + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz: "
                    + (-b / (2 * a)));
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
