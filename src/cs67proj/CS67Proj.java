/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs67proj;

import java.util.ArrayList;

/**
 *
 * @author laurenmitchell
 */
public class CS67Proj {
    public static Boolean is_home = true;
    public static Boolean is_existing = false;
    public static Directory dir = new Directory();
    public static HomeScreen hs = new HomeScreen();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hs.setVisible(true);
            }
        });
    }
    
}
