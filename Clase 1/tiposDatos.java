/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        Los tipos de datos primitivos especifican el tamaño
        y el tipo de los valores de las variables.
    */

    //Booleano -> Solo puede ser VERDADERO o FALSO
    boolean booleano=true;

    //Almacenan un solo carácter
    char caracter='A'; //Utiliza comillas simples
    System.out.println("Valor Carácter ="+caracter);

    //Almacena un número entero sin fracciones ni decimales
    int entero = 10;
    System.out.println("Valor Entero ="+entero);
    long largo = 125362133223L; //La L indica que es de tipo long
    System.out.println("Valor Largo ="+largo);

    //Tipo flotante  -> Flotante y Doble
    //La diferencia está en la cantidad de números que "caben" en cada uno de estos formatos
    float flotante = 65.20298f; //32 Bits -> Precisión simples
    //La F indica que es de tipo float
    double decimal = 876.765d;  //64 Bits -> Precisión exacta

    /*
        Los tipos de datos NO primitivos o tipos de datos de referencia
        hacen releación a instancias u objetos

        El tipo de datos String almacena una secuencia o matriz de caracteres.
    */
    String nombre = "Walter White"; //Utiliza comillas dobles
    System.out.println("Datos Personales");
    System.out.println("Nombres: "+nombre);
}