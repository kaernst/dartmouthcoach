/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs67proj;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author laurenmitchell
 */
public class Ticket {
    String dest;
    String dept; 
    boolean isCommuter;
    Date expDate;
    boolean isAdult;
    Format formatter;
    
    public Ticket(String dept, String dest, Boolean isCommuter, Date expDate,
            Boolean isAdult) {
        this.dept = dept;
        this.dest = dest;
        this.isCommuter = isCommuter;
        this.expDate = expDate;
        this.isAdult = isAdult;
        this.formatter = new SimpleDateFormat("MM/dd/yyyy");
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public void setDest(String dest) {
        this.dest = dest;
    }
    
    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }
    
    public void setIsCommuter(boolean isCommuter) {
        this.isAdult = isAdult;
    }
    
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    
    public String getDest() {
        return dest;
    }
    
    public String getDept() {
        return dept;
    }
    
    public String getLocation() {
        String loc = "";
        if (isCommuter)
            loc = "Comm.: " + dept + " // " + dest;
        else
            loc = dept + " -> " + dest;
        return loc;
    }
    
    public boolean getIsCommuter() {
        return isCommuter;
    }
    
    public boolean getIsAdult() {
        return isAdult;
    }
    
    public String getExpDate() {
        String eDate = formatter.format(expDate);
        return (eDate);
    }
}
