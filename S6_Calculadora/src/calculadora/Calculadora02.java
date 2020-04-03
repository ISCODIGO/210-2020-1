package calculadora;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

public class Calculadora02 {

    // Definir los componentes en la clase
    private JFrame frmVentana;
    private JPanel pnlPantalla;
    private JPanel pnlCuadricula;
    private JLabel lblPantalla;
    private JButton btnLimpiar;
    private JButton btnPunto;
    private JButton btnSigno;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplicacion;
    private JButton btnDivision;
    private JButton btnRetroceso;
    private JButton btnIgual;    
    private JButton[] btnNumeros;
    private Font fntLabel;
    private Font fntBotones;
    
    // Constantes del JFrame
    private final int DIGITOS = 10;
    private final int ESPACIO_INTERIOR = 10;
    private final int ESPACIO_EXTERIOR = 20;
    private final int ANCHO = 500;
    private final int ALTO = 500;
    private final int FONT_SIZE_LABEL = 48;
    private final int FONT_SIZE_BUTTON = 28;
    
    public Calculadora02() {       
        iniciarComponentes();
        agregarComponentes();
        establecerVisualizacion();
    }
    
    private void iniciarComponentes() {
        fntLabel = new Font("Arial", Font.BOLD, FONT_SIZE_LABEL);
        fntBotones = new Font("Courier New", Font.BOLD, FONT_SIZE_BUTTON);
        
        // frmVentana
        frmVentana = new JFrame("Calculadora");
        frmVentana.setLayout(new BorderLayout(ESPACIO_INTERIOR, 
                ESPACIO_INTERIOR));
        frmVentana.setLocationRelativeTo(null);        
        frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // pnlPantalla
        pnlPantalla = new JPanel(new BorderLayout(ESPACIO_INTERIOR, 
                ESPACIO_INTERIOR));
        
        
        // lblPantalla
        lblPantalla = new JLabel("0", SwingConstants.RIGHT);                
        
        // pnlCuadricula
        pnlCuadricula = new JPanel(new GridLayout(4, 5, ESPACIO_INTERIOR, 
                ESPACIO_INTERIOR));        
        
        // Varios botones
        btnLimpiar = new JButton("C");
        btnPunto = new JButton(".");
        btnSigno = new JButton("+-");
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplicacion = new JButton("*");
        btnDivision = new JButton("/");
        btnRetroceso = new JButton("<-");
        btnIgual = new JButton("=");
        
        btnNumeros = new JButton[DIGITOS];

        for (int i = 0; i < DIGITOS; i++) {
            btnNumeros[i] = new JButton(String.valueOf(i));            
        }
    }
    
    private void agregarComponentes() {
        frmVentana.add(pnlPantalla, BorderLayout.PAGE_START);
        frmVentana.add(pnlCuadricula, BorderLayout.CENTER);
        pnlPantalla.add(lblPantalla, BorderLayout.CENTER);
        
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
    }
    
    private void establecerVisualizacion() {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculadora01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pnlPantalla.setBorder(new EmptyBorder(ESPACIO_EXTERIOR, ESPACIO_EXTERIOR, 
                ESPACIO_EXTERIOR, ESPACIO_EXTERIOR));
        
        pnlCuadricula.setBorder(new EmptyBorder(ESPACIO_EXTERIOR, 
                ESPACIO_EXTERIOR, ESPACIO_EXTERIOR, ESPACIO_EXTERIOR));

        lblPantalla.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
        lblPantalla.setFont(fntLabel);
        
        // Recorrido de todos los JButton dentro del JPanel
        for (Component componente : pnlCuadricula.getComponents()) {
            if (componente instanceof JButton) {
                JButton btn = (JButton) componente;
                btn.setFont(fntBotones);
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
    }
    
    public void mostrar() {
        frmVentana.setSize(ANCHO, ALTO);
        frmVentana.setVisible(true);
    }
}
