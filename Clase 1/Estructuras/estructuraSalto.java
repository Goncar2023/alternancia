/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        break:
        La declaración break se utiliza para salir de un bucle o un bloque de control
        antes de que se cumpla la condición normal de finalización.
    */
    for (int x = 1; x <= 10; x++) {
        if (x == 4) {
            break;
        }
        System.out.println("Número: " + x);
    }

    /*
        continue:
        La declaración continue se utiliza para saltar la iteración actual de un bucle y continuar con la siguiente iteración.
    */
    for (int i = 1; i <= 5; i++) {
        if (i == 2) {
            continue;
        }
        System.out.println("Número: " + i);
    }

}

