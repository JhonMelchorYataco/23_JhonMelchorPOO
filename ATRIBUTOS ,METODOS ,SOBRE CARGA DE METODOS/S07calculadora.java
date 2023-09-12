public class Calculadora {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }
        System.out.println("Suma: " + sumar(numero1, numero2));
        System.out.println("Resta: " + restar(numero1, numero2));
        System.out.println("Multiplicación: " + multiplicar(numero1, numero2));
        System.out.println("División: " + dividir(numero1, numero2));
    }
   
---------------------------------------------------------------------------------------


  

public class Calculadora2 {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        char operacion;

        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = sumar(numero1, numero2);
                break;
            case '-':
                resultado = restar(numero1, numero2);
                break;
            case '*':
                resultado = multiplicar(numero1, numero2);
                break;
            case '/':
                resultado = dividir(numero1, numero2);
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}

