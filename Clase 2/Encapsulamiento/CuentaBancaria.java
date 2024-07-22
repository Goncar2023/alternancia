/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea una nueva clase
    -> Copia el código y pegalo dentro de la clase recién creada proyecto.
*/
public class CuentaBancaria {
    private String titular;
    private int saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0; // Inicialmente, el saldo es cero
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(int cantDinero) {
        if (cantDinero > 0) {
            saldo += cantDinero;
            System.out.println("Se ha depositado $" + cantDinero + " en la cuenta de " + titular);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(int cantDinero) {
        if (cantDinero > 0 && cantDinero <= saldo) {
            saldo -= cantDinero;
            System.out.println("Se ha retirado $" + cantDinero + " de la cuenta de " + titular);
        } else {
            System.out.println("¡UPS!, SALDO INSUFICIENTE");
        }
    }
}
