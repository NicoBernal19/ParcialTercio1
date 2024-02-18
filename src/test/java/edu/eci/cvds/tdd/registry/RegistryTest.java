package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();
    
    @Test
    public void validateAgeFor18YearsOld() {
        Person person = new Person("nicolas", 1000184936, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateAgeFor17YearsOld() {
        Person person = new Person("nicolas", 1000184936, 17, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateAgeFor1YearOld() {
        Person person = new Person("nicolas", 1000184936, 1, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateAgeFor19YearsOld() {
        Person person = new Person("nicolas", 1000184936, 19, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateAgeFor135YearsOld() {
        Person person = new Person("nicolas", 1000184936, 135, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateAgeFor136YearsOld() {
        Person person = new Person("nicolas", 1000184936, 136, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateAgeForInvalidAgeMinus1() {
        Person person = new Person("nicolas", 1000184936, -1, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateAgeForInvalidAgeMinus100() {
        Person person = new Person("nicolas", 1000184936, -100, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validatePersonIsAlive() {
        Person person = new Person("nicolas", 1000184936, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validatePersonIsDead() {
        Person person = new Person("nicolas", 1000184936, 18, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateIfPersonIsDuplicated() {
        Person person = new Person("nicolas", 1000184936, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Person person2 = new Person("santiago", 1000184936, 26, Gender.MALE, true);
        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }

    @Test
    public void validateIfPersonIsNotDuplicated() {
        Person person = new Person("nicolas", 1000184936, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Person person2 = new Person("santiago", 1000456789, 26, Gender.MALE, true);
        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.VALID, result2);
    }
    
    @Test
    public void validatePersonIsMale() {
        Person person = new Person("Nombre Uno", 1001, 20, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validatePersonIsFemale() {
        Person person = new Person("Nombre Dos", 1002, 25, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validatePersonIsUnidentified() {
        Person person = new Person("Nombre Tres", 1003, 76, Gender.UNIDENTIFIED, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
}