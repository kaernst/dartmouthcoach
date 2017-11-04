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
public class Person {
    
    public ArrayList<Reservation> reservations;
    
    String first;
    String middle;
    String last;
    Date birthDate;
    
    public Person (String first, String middle, String last, Date birthDate) {
        reservations = new ArrayList<Reservation>();
        this.first = first;
        this.last = last;
        this.middle = middle;
        this.birthDate = birthDate;
    }
    
    // SETTERS
    public void setFirst(String first) {
        this.first = first;
    }
    
    public void setLast(String last) {
        this.last = last;
    }
    
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public void addReservation(Reservation res) {
        reservations.add(res);
    }
    
    public void removeReservation(Reservation res) {
        reservations.remove(res);
    }
    
    //GETTERS
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    
    public void removeTicket(Ticket t) {
        if (reservations.isEmpty())
            return;
        boolean found = false;
        for (int i = 0; i < reservations.size(); i++) {
            if (found == true)
                return;
            else if (!reservations.get(i).ticketsInRes.isEmpty()) {
                for (int j = 0; j < reservations.get(i).ticketsInRes.size(); j++) {
                    if (reservations.get(i).ticketsInRes.get(j).equals(t)) {
                        found = true;
                        reservations.get(i).ticketsInRes.remove(j);
                        if (reservations.get(i).ticketsInRes.isEmpty()) {
                            reservations.remove(i);
                        }
                        return;
                    }
                }
            }
            else {
                return;
            }
        }
    }
    
    public ArrayList<Ticket> getAllTickets() {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        if (reservations.isEmpty())
            return null;
        for (int i = 0; i < getNumReservations(); i++) {
            Reservation r = reservations.get(i);
            if (r == null) 
                break;
            for (int j = 0; j < r.getNumTicketsInRes(); j++) {
                tickets.add(r.getTicket(j));
            }
        }
        return tickets;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getLast() {
        return last;
    }
    
    public String getMiddle() {
        return middle;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public int getNumReservations() {
        return reservations.size();
    }
    
    public int getNumTickets() {
        int numTicks = 0;
        for (int i = 0; i < getNumReservations(); i++) {
            numTicks += getReservations().get(i).getNumTicketsInRes();
        }
        return numTicks;
    }
}
