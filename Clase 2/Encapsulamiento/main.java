/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {

    //Creación de Objetos de la clase ECuentaBancaria
    CuentaBancaria cuentaBancaria = new CuentaBancaria("Eliana González");

    //Obtener la información asociada a la cuenta
    System.out.println("Titular de la cuenta: " + cuentaBancaria.getTitular());
    System.out.println("Saldo inicial: $" + cuentaBancaria.getSaldo());

    //Depositar dinero
    cuentaBancaria.depositar(100000);
    System.out.println("Saldo después del depósito: $" + cuentaBancaria.getSaldo());

    //Retirar dinero
    cuentaBancaria.retirar(20000);
    System.out.println("Saldo después del retiro: $" + cuentaBancaria.getSaldo());
}