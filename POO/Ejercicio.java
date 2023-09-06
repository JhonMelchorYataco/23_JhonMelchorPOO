import java.util.Scanner;
import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona() {
        // Ingresar datos usando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        this.edad = scanner.nextInt();
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.mostrarInformacion();
    }
}

class Calculadora {
    private int resultado;

    // Constructor
    public Calculadora() {
        // Ingresar datos usando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();
        this.resultado = num1 + num2;
    }

    // Método para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("Resultado: " + resultado);
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.mostrarResultado();
    }
}

class Animal {
    private String nombre;

    // Constructor
    public Animal() {
        // Ingresar datos usando JOptionPane
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
    }

    // Método para mostrar el nombre del animal
    public void mostrarNombre() {
        JOptionPane.showMessageDialog(null, "Nombre del animal: " + nombre);
    }
}

class Auto {
    private String marca;
    private String modelo;

    // Constructor
    public Auto() {
        // Ingresar datos usando JOptionPane
        this.marca = JOptionPane.showInputDialog("Ingrese la marca del auto:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
    }

    // Método para mostrar la información del auto
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nModelo: " + modelo);
    }
}
