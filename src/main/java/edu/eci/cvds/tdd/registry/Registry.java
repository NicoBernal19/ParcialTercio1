package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge < 18 && p.getAge >= 0){
            return RegisterResult.UNDERAGE;
        }
        if (p.isAlive = false){
            return RegisterResult.DEAD;
        }
        if (p.getAge <= -1 || p.getAge > 135){
            return RegisterResult.INVALID_AGE;
        }
        return RegisterResult.VALID;
    }
}