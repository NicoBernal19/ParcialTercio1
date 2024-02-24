package edu.eci.cvds.tdd.menorEdad;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class underageCalculatorTest {
    private underageCalculator p = new underageCalculator();

    @Test
    public void validateAgeFor17YearsOld() {
        try {
            personAge person = new personAge(17);
            boolean result = p.ageCalculator(person);
            Assert.assertEquals(true, result);
        } catch (underageCalculatorException e) {
            fail("Lanzo excepcion");
        }
    }

    @Test
    public void validateAgeFor18YearsOld() {
        try {
            personAge person = new personAge(18);
            boolean result = p.ageCalculator(person);
            Assert.assertEquals(false, result);
        } catch (underageCalculatorException e) {
            fail("Lanzo excepcion");
        }
    }

    @Test
    public void validateAgeFor0YearsOld() {
        try {
            personAge person = new personAge(0);
            boolean result = p.ageCalculator(person);
            Assert.assertEquals(true, result);
        } catch (underageCalculatorException e) {
            fail("Lanzo excepcion");
        }
    }

    @Test
    public void validateAgeFor135YearsOld() {
        try {
            personAge person = new personAge(135);
            boolean result = p.ageCalculator(person);
            Assert.assertEquals(false, result);
        } catch (underageCalculatorException e) {
            fail("Lanzo excepcion");
        }
    }

    @Test
    public void validateAgeForMinusOneYearOld() {
        try {
            personAge person = new personAge(-1);
            boolean result = p.ageCalculator(person);
            fail("No lanzo ninguna excepcion");
        } catch (underageCalculatorException e) {
            Assert.assertEquals(underageCalculatorException.INVALID_AGE, e.getMessage());
        }
    }

    @Test
    public void validateAgeFor136YearsOld() {
        try {
            personAge person = new personAge(136);
            boolean result = p.ageCalculator(person);
            fail("No lanzo ninguna excepcion");
        } catch (underageCalculatorException e) {
            Assert.assertEquals(underageCalculatorException.INVALID_AGE, e.getMessage());
        }
    }
}
