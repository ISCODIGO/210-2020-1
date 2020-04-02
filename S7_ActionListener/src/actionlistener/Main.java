/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionlistener;

import javax.swing.*;

/**
 *
 * @author enrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frmVentana = new JFrame("ActionListener");
        frmVentana.setSize(300, 300);
        frmVentana.setLocationRelativeTo(null);
        frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField txt1 = new JTextField("");
        frmVentana.add(txt1);
        txt1.setBounds(50, 50, 100, 30);
        
        JButton btn1 = new JButton("Presionar");
        btn1.setBounds(50, 80, 80, 35);
        frmVentana.add(btn1);
        
        frmVentana.setVisible(true);
    }
    
}
