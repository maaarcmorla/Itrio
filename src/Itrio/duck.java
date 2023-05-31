package Itrio;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class duck extends JFrame {
    public duck() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");

        // Frame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocation(750, 390);
        this.setTitle("Wallkie Duckie :)");
        this.setIconImage(LogoItrioPq.getImage());

        // Panel
        JPanel fondo = new JPanel();
        fondo.setBackground(Color.black);
        fondo.setBounds(0,0,400,400);

        // Label
        ImageIcon patito = new ImageIcon("images/patito.gif");

        JLabel Pato = new JLabel();
        Pato.setIcon(patito);
        Pato.setBounds(80,-20,400,400);
        Pato.setBackground(new Color(0, 0, 0, 0));

        // Add
        this.add(Pato);
        this.add(fondo);
        
        this.setVisible(true);
    }
}
