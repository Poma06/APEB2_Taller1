public class Animal {
    String clase;
    int edad;

    public Animal(String clase, int edad) {
        this.clase = clase;
        this.edad = edad;
    }

    public void mostrarDatos() { 
        System.out.println("Clase: " + clase);
        System.out.println("Edad: " + edad);
    }
}
