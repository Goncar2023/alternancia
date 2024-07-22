/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {

    //IF y ELSE se utiliza para controlar el flujo de los programas en relación a CONDICIONES

    int edad = 18;
    if (edad >= 18) {
        System.out.println("Eres mayor de edad");
    } else {
        System.out.println("Eres menor de edad");
    }

    //IF ANIDADO
    double promedio = 6.5;

    if (promedio >= 1.0 && promedio <= 7.0) { //Verifica que la nota este entre 1.0 y 7.0
        if (promedio >= 4.0) {
            System.out.println("APROBASTE la asignatura");
        } else {
            System.out.println("REPROBASTE la asignatura");
        }
    } else {
        System.out.println("La nota NO cumple con el rango");
    }

    //CONDICIONAL SWITCH
    int diaSemana = 2;
    /*
       SWITCH se utiliza en JAVA para seleccionar UNA de las múltiples opciones
       según el valor de la expresión, en este caso evaluará la variable diaSemana
    */
    switch (diaSemana) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        default:
            System.out.println("Es fin de semana");
    }

}
