import java.util.Scanner;
public class TipodeCuenta extends Cuenta{
    double interes;
    String tipodeCuenta;
    Scanner sc = new Scanner(System.in);

    public TipodeCuenta(String titular, double saldo) {
        super(titular, saldo);
    }
    
    public void MostrarSaldo(){
        System.out.println("Titular: " +titular);
        if(saldo <= 1000){
            System.out.println("Tipo de interés: 5%");
            interes = saldo * 0.05;
            System.out.println("Saldo: " + (saldo +interes));
            tipodeCuenta = "Ahorros";
            System.out.println("Tipo de cuenta: " + tipodeCuenta);
        }else if (saldo > 1000){
            System.out.println("Tipo de interés: 7%");
            interes = saldo * 0.07;
            System.out.println("Saldo: " + (saldo + interes));
            tipodeCuenta = "Corriente";
            System.out.println("Tipo de cuenta: " + tipodeCuenta);
            
        }
    }
    
}
