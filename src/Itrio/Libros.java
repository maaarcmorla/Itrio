package Itrio;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Libros extends JFrame implements MouseListener {
    
    public Libros(){

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png"); // Logo barra de tareas

        // ------------ Frame ------------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1205,840);
        this.setResizable(true);
        this.setLocation(350, 110);
        this.setTitle("Itrio");
        this.setIconImage(LogoItrioPq.getImage());

        // ------------ Label ------------ 
        ImageIcon ImagePrincipal = new ImageIcon("images/BG-Tabla.png");
       
        JLabel LabelPrincipal = new JLabel();
        LabelPrincipal.setIcon(ImagePrincipal);
        LabelPrincipal.setBounds(0,0,1205,840);
        

        this.add(LabelPrincipal);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
