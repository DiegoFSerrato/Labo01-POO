import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Suma();
                    break;
                case 2:
                    Resta();
                    break;
                case 3:
                    Multiplicacion();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no invalida");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void Suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void Resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void Multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }

    public static void Division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
