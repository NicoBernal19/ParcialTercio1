package edu.eci.cvds.tdd.menorEdad;

public class underageCalculator {
    public static final int MAX_AGE = 135;
    public static final int UNDERAGE = 18;

    public boolean ageCalculator(personAge p) throws underageCalculatorException{
        boolean result;
        if (p.getAge() >= UNDERAGE && p.getAge()<=MAX_AGE) {
            result = false;
        } else if(p.getAge()<UNDERAGE && p.getAge()>=0){
            result = true;
        } else{
            throw new underageCalculatorException(underageCalculatorException.INVALID_AGE);
        }
        return result;
    }
}
