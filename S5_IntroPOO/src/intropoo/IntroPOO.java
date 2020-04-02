/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intropoo;

import java.awt.Point;

/**
 *
 * @author jeavila
 */
public class IntroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point punto1 = new Point();
        System.out.println(punto1);
        
        Point punto2 = new Point(punto1);
        System.out.println(punto2);
    }
    
}
