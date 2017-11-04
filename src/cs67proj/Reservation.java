/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs67proj;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kernst
 */
public class Reservation {
    
    public ArrayList<Ticket> ticketsInRes;
    
    private boolean isOneWay;
    private boolean isCommuter;
    private String dept;
    private String dest;
    private int adults;
    private int kids;
    private int bags;
    private Date expDate;
    
    public Reservation(boolean isOneWay, boolean isCommuter, String dept,
            String dest, int adults, int kids, int bags, Date expDate) {
        this.ticketsInRes = new ArrayList<Ticket>();
        this.isOneWay = isOneWay;
        this.isCommuter = isCommuter;
        this.dept = dept;
        this.dest = dest;
        this.adults = adults;
        this.kids = kids;
        this.bags = bags;
        this.expDate = expDate;
        createTickets();
    }
    
    public Reservation() {
        this.ticketsInRes = new ArrayList<Ticket>();
        this.isOneWay = true;
        this.isCommuter = false;
        this.dept = "HANOVER";
        this.dest = "BOSTON: SOUTH STATION";
        this.adults = 1;
        this.kids = 0;
        this.bags = 1;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1); 
        this.expDate = cal.getTime();
        createTickets();
    }
    
    public void createTickets() {
        ticketsInRes.clear();
        if (isCommuter) {
            for (int i = 0; i < 9; i++) {
                Ticket t = new Ticket(dest, dept, true, expDate, true);
                ticketsInRes.add(t);
            }
        }
        else if (!isOneWay) {
            for (int i = 0; i < adults; i++) {
                Ticket t = new Ticket(dest, dept, isCommuter, expDate, true);
                ticketsInRes.add(t);
            }
            for (int i = 0; i < kids; i++) {
                Ticket t = new Ticket(dest, dept, isCommuter, expDate, false);
                ticketsInRes.add(t);
            }
        }
    }
    
    //SETTERS  
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    
    public void setIsCommuter(boolean isCommuter) {
        this.isCommuter = isCommuter;
    }
    
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }
    
    public void setDest(String dest) {
        this.dest = dest;
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public void setAdults(int adults) {
        this.adults = adults;
    }
    
    public void setKids(int kids) {
        this.kids = kids;
    }
    
    public void setBags(int bags) {
        this.bags = bags;
    }
    
    public void addTicket(Ticket t) {
        ticketsInRes.add(t);
    }
    
    public void removeTicket(Ticket t) {
        ticketsInRes.remove(t);
    }
    
    public void setTickets(ArrayList<Ticket> ts) {
        ticketsInRes = ts;
    }
    
    //GETTERS
    public ArrayList<Ticket> getTicketsInRes() {
        return ticketsInRes;
    }
    
    public Ticket getTicket(int i) {
        if (ticketsInRes.isEmpty() || ticketsInRes.size() <= i)
            return null;
        return ticketsInRes.get(i);
    }
    
    public Date getExpDate() {
        return expDate;
    }
    
    public boolean getIsCommuter() {
        return isCommuter;
    }
    
    public boolean getIsOneWay() {
        return isOneWay;
    }
    
    public String getDest() {
        return dest;
    }
    
    public String getDept() {
        return dept;
    }
    
    public int getAdults() {
        return adults;
    }
    
    public int getKids() {
        return kids;
    }
    
    public int getBags() {
        return bags;
    }
    
    public int getNumTicketsInRes() {
        return ticketsInRes.size();
    }
}
