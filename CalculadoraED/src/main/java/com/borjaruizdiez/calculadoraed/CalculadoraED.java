package com.borjaruizdiez.calculadoraed;

/**
 *
 * @author borja
 */
public class CalculadoraED {

    public static void main(String[] args) {
        
        Calculadora miCalculadora = new Calculadora();

        
        int resultadoSuma = miCalculadora.sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        
    }
}
