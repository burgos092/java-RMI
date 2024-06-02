import java.rmi.Naming;
import java.util.Scanner;

public class MathClient {
    public static void main(String[] args) {
        try {
            MathOperations math = (MathOperations) Naming.lookup("MathService");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Suma: " + math.suma(num1, num2));
            System.out.println("Resta: " + math.resta(num1, num2));
            System.out.println("Multiplicación: " + math.multiplicacion(num1, num2));

            try {
                System.out.println("División: " + math.division(num1, num2));
            } catch (RemoteException e) {
                System.err.println(e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}