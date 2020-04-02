package calculadora;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Calculadora01 {

    public static void main(String[] args) {
        JFrame frmVentana = new JFrame("Calculadora");

        // Solamente define anchura y altura del JFrame
        frmVentana.setSize(500, 500);
        // Define en relacion a qué componente se posiciona el JFrame
        // con NULL se coloca al centro del monitor.
        frmVentana.setLocationRelativeTo(null);
        frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmVentana.setLayout(new BorderLayout(20, 20));

        JPanel pnlPantalla = new JPanel(new BorderLayout());
        pnlPantalla.setBorder(new EmptyBorder(10, 10, 10, 10));
        frmVentana.add(pnlPantalla, BorderLayout.PAGE_START);

        JLabel lblPantalla = new JLabel("0", SwingConstants.RIGHT);
        lblPantalla.setFont(new Font("Arial", Font.BOLD, 48));
        lblPantalla.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
        pnlPantalla.add(lblPantalla, BorderLayout.CENTER);

        JPanel pnlCuadricula = new JPanel(new GridLayout(4, 5, 10, 10));
        pnlCuadricula.setBorder(new EmptyBorder(0, 10, 10, 10));
        frmVentana.add(pnlCuadricula, BorderLayout.CENTER);

        // Botones
        JButton btnLimpiar = new JButton("C");
        JButton btnPunto = new JButton(".");
        JButton btnSigno = new JButton("+-");
        JButton btnSuma = new JButton("+");
        JButton btnResta = new JButton("-");
        JButton btnMultiplicacion = new JButton("*");
        JButton btnDivision = new JButton("/");
        JButton btnRetroceso = new JButton("<-");
        JButton btnIgual = new JButton("=");
        final int DIGITOS = 10;
        JButton[] btnNumeros = new JButton[DIGITOS];

        for (int i = 0; i < DIGITOS; i++) {
            btnNumeros[i] = new JButton(String.valueOf(i));
        }

        pnlCuadricula.add(btnNumeros[7]);
        pnlCuadricula.add(btnNumeros[8]);
        pnlCuadricula.add(btnNumeros[9]);
        pnlCuadricula.add(btnSigno);
        pnlCuadricula.add(btnRetroceso);
        pnlCuadricula.add(btnNumeros[4]);
        pnlCuadricula.add(btnNumeros[5]);
        pnlCuadricula.add(btnNumeros[6]);
        pnlCuadricula.add(btnMultiplicacion);
        pnlCuadricula.add(btnDivision);
        pnlCuadricula.add(btnNumeros[1]);
        pnlCuadricula.add(btnNumeros[2]);
        pnlCuadricula.add(btnNumeros[3]);
        pnlCuadricula.add(btnSuma);
        pnlCuadricula.add(btnResta);
        pnlCuadricula.add(btnLimpiar);
        pnlCuadricula.add(btnNumeros[0]);
        pnlCuadricula.add(btnPunto);
        pnlCuadricula.add(btnIgual);

        // Manejo del Look and Feel de los componentes visuales
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculadora01.class.getName()).log(Level.SEVERE, null, ex);
        }

        Font fuenteBotones = new Font("Courier New", Font.BOLD, 28);

        for (Component componente : pnlCuadricula.getComponents()) {
            if (componente instanceof JButton) {
                JButton btn = (JButton) componente;
                btn.setFont(fuenteBotones);
                // Se agrego este estilo para la mayoria de los casos. Se modifican las excepciones
                btn.setBackground(Color.LIGHT_GRAY);
                btn.setForeground(Color.WHITE);
            }
        }

        btnIgual.setBackground(Color.BLUE);
        btnLimpiar.setBackground(Color.RED);
        btnSuma.setBackground(Color.DARK_GRAY);
        btnResta.setBackground(Color.DARK_GRAY);
        btnMultiplicacion.setBackground(Color.DARK_GRAY);
        btnDivision.setBackground(Color.DARK_GRAY);
        btnSigno.setBackground(Color.GRAY);
        btnRetroceso.setBackground(Color.GRAY);

        for (int i = 0; i < DIGITOS; i++) {
            btnNumeros[i].setForeground(Color.BLUE);
        }
        btnPunto.setForeground(Color.BLUE);

        frmVentana.setVisible(true);
    }
}
