/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs67proj;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kernst
 */
public class Directory {
    ArrayList<Person> dir;
    
    public Directory() {
        dir = new ArrayList<Person>();
    }
    
    public int getNumPeople() {
        return dir.size();
    } 
    
    public boolean contains(Person p) {
        return dir.contains(p);
    }
    
    public void remove(Person p) {
        dir.remove(p);
    }
    
    public ArrayList<Person> getMatches(String lastName) {
        ArrayList<Person> matches = new ArrayList<Person>();
        if (dir.size() == 0)
            return null;
        for (int i = 0; i < getNumPeople(); i++) {
            Person toMatch = dir.get(i);
            if (toMatch.getLast().equals(lastName))
                matches.add(toMatch);
        }
        return matches;
    }
    
    public Person findPerson(String first, String middle, String last) {
        for (int i = 0; i < getNumPeople(); i++) {
            Person toMatch = dir.get(i);
            if (toMatch.getLast().equals(last) &&
                    toMatch.getFirst().equals(first) &&
                    toMatch.getMiddle().equals(middle))
                return toMatch;
        }
        return null;
    }
    
    public void addPerson(String first, String middle, String last, Date birthDate) {
        Person p = new Person(first, middle, last, birthDate);
        dir.add(p);
    }
    
    public void addPerson(Person p) {
        if (p == null) {
            return;
        }
       dir.add(p);
    }
    
    public void removePerson(Person p) {
        dir.remove(p);
    }
    
}
