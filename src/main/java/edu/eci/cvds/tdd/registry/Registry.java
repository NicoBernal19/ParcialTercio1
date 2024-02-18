package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    public static final int MAX_AGE = 135;
    public static final int VOTING_AGE = 18;
    private ArrayList<Integer> voters = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (!p.isAlive()) result =  RegisterResult.DEAD;
        if (0 <= p.getAge() && p.getAge() < VOTING_AGE) result =  RegisterResult.UNDERAGE;
        if (p.getAge() < 0 || p.getAge() > MAX_AGE) result =  RegisterResult.INVALID_AGE;
        if (voters.contains(p.getId())) result = RegisterResult.DUPLICATED;
        if (result == null) {
            voters.add(p.getId());
            result = RegisterResult.VALID;
        }
        return result;
    }
}