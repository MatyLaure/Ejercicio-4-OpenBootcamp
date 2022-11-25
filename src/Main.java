import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        System.out.println("Edad: " + cliente.edad);
        cliente.nombre = "Juan Perez";
        System.out.println("Nombre: "  + cliente.nombre);
        cliente.telefono = 41235678;
        System.out. println("Numero de telefono: " + cliente.telefono);
        cliente.credito = 25000;
        System.out.println("Su credito es: $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 41;
        System.out.println("Edad empleado: " + trabajador.edad);
        trabajador.nombre = "Angel Correa";
        System.out.println("Nombre: "  + trabajador.nombre);
        trabajador.telefono = 1552444848;
        System.out. println("Numero de telefono: " + trabajador.telefono);
        trabajador.salario = 150000;
        System.out.println("Salario es: $" + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    int credito;
    public Cliente() {
        System.out.println("Datos Cliente: ");
    }
}

class Trabajador extends Persona {
    int salario;
    public Trabajador() {
        System.out.println("Datos Trabajador: ");
    }
}

