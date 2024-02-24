package edu.eci.cvds.tdd.menorEdad;

public class underageCalculatorException extends Exception {
    public static final String INVALID_AGE = "La edad es negativa o mayor de lo maximo establecido";

    public underageCalculatorException(String m) {
        super(m);
    }
}
