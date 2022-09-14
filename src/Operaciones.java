import java.util.ArrayList;
/**
 * La clase Operaciones proporciona las operaciones matemáticas:
 * calcularPotencia()
 * calcularLogaritmo()
 *
 * El objetico de la clase es utilizar el mínimo funciones provenientes de la libreria nativa Math de java
 *
 * @author Oscar Javier gonzalez
 * @version 1.0
 * */
public class Operaciones {

    //TODO: Implementar excepciones que manejen posibles errores en las funciones

    /**
     * La funcion calcularPotencia() calcula la potencia de una base dada a un exponente dado
     * En esta funcion solo se hace uso de la funcion nativa Math.abs() para iterear las operaciones hasta el exponente dado
     * @param intBase Base de la potencia a Calcular
     * @param intExponente Exponente de la potencia a Calcular
     * @return flRsultado Potencia calculada a partir de la base y el exponente ingresados
     */
    public static float calcularPotencia(int intBase, int intExponente){

        //TODO: Completar función agregando una variable de limite que permita el calculo de exponentes negativos

        float flResultado = 1f;
        int intLimite = 0;
        if(intBase == 0){
            return 0;
        }
        if(intExponente == 0){
            return 1;
        }

        for(int i = 0; i < Math.abs(intExponente); i++){
            flResultado *= intBase;
        }
        if (intExponente > 0){
            return flResultado;
        }

        if(intExponente < 0){
            flResultado = 1 / flResultado;
        }

        return flResultado;
    }

    /**
     * La funcion calcularLogaritmo() calcular el logaritmo natural de una base dada a partir de una potencia dada
     * El cáclculo del logaritmo parte de la premisa de que una potencia es divisible n veces por su base
     * Si el modulo de una Potencia dividido su base es diferente de 0, devuelve la potencia
     * @param intBase Base del logaritmo a calcular
     * @param intPotencia Potencia del logaritmo a calcular
     * @return intExponente logaritmo calculado a partir de la base y la potencias proporcionados
     */
    public static int calcularLogaritmo(int intBase, int intPotencia){

        int intExponente = 0;
        if(intBase == 0){
            return intExponente;
        }

        if(intPotencia % intBase != 0){
            return intExponente;
        }


        int intDivision = intPotencia;
        while(intDivision > 1){
            intDivision = intDivision / intBase;;
            intExponente += 1;
        }
        return intExponente;
    }
}
