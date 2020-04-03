package actionlistener;

import javax.swing.*;

public class Main {

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
