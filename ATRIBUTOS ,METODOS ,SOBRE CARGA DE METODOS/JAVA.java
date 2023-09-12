public class Persona {
    // Atributos
     String nombre;
     int edad;


    // Constructor
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

   // Métodos
    public boolean num () {
     return true;
    }
     public void comer () {
        System.out.println(comer);

    // Sobrecarga de método para saludar con un mensaje personalizado
    public void saludar(String mensaje) {
        System.out.println(mensaje + ", mi nombre es " + nombre);
    }

    // Método con valor de retorno (tipo de dato String)
    public String obtenerGenero() {
        return genero == 'M' ? "Masculino" : "Femenino";
    }

    // Método con parámetros y argumentos
    public void cumplirAnios(int anios) {
        edad += anios;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // método con parámetros y argumentos
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        System.out.println("Mi nombre ha sido cambiado a " + nombre);
    }

    public static void main(String[] args) {
        // Crear dos objetos de la clase Persona
        Persona persona1 = new Persona("Juan", 30, 'M');
        Persona persona2 = new Persona("María", 25, 'F');

        // Llamar a los métodos de los objetos
        persona1.saludar();
        persona2.saludar("Hola");

        String generoPersona1 = persona1.obtenerGenero();
        System.out.println("El género de persona1 es: " + generoPersona1);

        persona1.cumplirAnios(1);
        persona2.cambiarNombre("Ana");
    }
}
