import java.util.Scanner;
public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this. saldo = saldo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titular;
        double saldo;
        
        System.out.print("Ingrese el titular de la cuenta: ");
        titular = sc.nextLine();
        System.out.print("Ingrese su saldo actual: ");
        saldo = sc.nextDouble();
        System.out.println("\n");
        
        TipodeCuenta tc = new TipodeCuenta(titular, saldo);
        tc.MostrarSaldo();
        
    }
}
