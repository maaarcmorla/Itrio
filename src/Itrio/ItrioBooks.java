package Itrio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.jar.JarEntry;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ItrioBooks extends JFrame implements MouseListener {
  
  private JLabel LogoutBoton;
  private ImageIcon LogoutBotonI;
  private ImageIcon LogoutBotonI2;
  private JLabel UsuarioBoton;
  private ImageIcon UsuarioBotonI;
  private ImageIcon UsuarioBotonI2;
  private JLabel SettingsBoton;
  private ImageIcon SettingsBotonI;
  private ImageIcon SettingsBotonI2;
  private JLabel sobreItrio;
  private ImageIcon sobreItrio1;
  

  public ItrioBooks() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");
        

        // Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1205,840);
        this.setResizable(false);
        this.setLocation(350, 110);
        this.setTitle("Itrio");
        this.setIconImage(LogoItrioPq.getImage());

        // Label
        ImageIcon LprincipalIcon = new ImageIcon("images/BPrincipal.png");
       
        JLabel Lprincipal = new JLabel();
        Lprincipal.setIcon(LprincipalIcon);
        Lprincipal.setBounds(-10,0,1200,803);

        // Boton Logout
        this.LogoutBoton = new JLabel();
        this.LogoutBotonI = new ImageIcon("images/logout.png");
        this.LogoutBotonI2 = new ImageIcon("images/logout.gif");
        this.LogoutBoton.setIcon(LogoutBotonI);
        this.LogoutBoton.addMouseListener(this);
        this.LogoutBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.LogoutBoton.setBounds(50,30,50,50);

        // Boton Usuario
        this.UsuarioBoton = new JLabel();
        this.UsuarioBotonI = new ImageIcon("images/Icono-Usuario-Azul.png");
        this.UsuarioBotonI2 = new ImageIcon("images/Icono-Usuario-Blanco.png");
        this.UsuarioBoton.setIcon(UsuarioBotonI);
        this.UsuarioBoton.addMouseListener(this);
        this.UsuarioBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.UsuarioBoton.setBounds(1025,30,55,63);

        // Boton Settings
        this.SettingsBoton = new JLabel();
        this.SettingsBotonI = new ImageIcon("images/Icono-Settings-A.png");
        this.SettingsBotonI2 = new ImageIcon("images/Icono-Settings-B.png");
        this.SettingsBoton.setIcon(SettingsBotonI);
        this.SettingsBoton.addMouseListener(this);
        this.SettingsBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.SettingsBoton.setBounds(1100,26,55,63);

        // Panel - Scroll Pane
        JPanel Libros = new JPanel();
        Libros.setPreferredSize(new Dimension(1100,590));
        Libros.setBackground(new Color(0,0,0,0));
        Libros.setOpaque(true);

        JScrollPane scrollPane = new JScrollPane(Libros, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(30,143,1120,590);
        scrollPane.setPreferredSize(new Dimension(1120,580));
        scrollPane.setBackground(new Color(0,0,0,0));
        scrollPane.setBorder(null);
        scrollPane.setOpaque(true);

        // Boton Sobre Itrio
        this.sobreItrio = new JLabel();
        this.sobreItrio1 = new ImageIcon("images/BP.bga.png");
        this.sobreItrio.setIcon(sobreItrio1);
        this.sobreItrio.addMouseListener(this);
        this.sobreItrio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.sobreItrio.setBounds(-10,775,1205,30);

        // Add
        this.add(scrollPane);
        this.add(LogoutBoton);
        this.add(UsuarioBoton);
        this.add(SettingsBoton);
        this.add(sobreItrio);
        this.add(Lprincipal);
       
        this.setVisible(true);

    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
      if (e.getSource()==this.LogoutBoton){
        this.dispose();
        new FrameLogin();
      }

      if (e.getSource()==this.sobreItrio){
        new duck();
      }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      if (e.getSource()==this.LogoutBoton){
        this.LogoutBoton.setIcon(this.LogoutBotonI2);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
      if (e.getSource()==this.UsuarioBoton){
        this.UsuarioBoton.setIcon(this.UsuarioBotonI2);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
      if (e.getSource()==this.SettingsBoton){
        this.SettingsBoton.setIcon(this.SettingsBotonI2);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      if (e.getSource()==this.LogoutBoton){
        this.LogoutBoton.setIcon(this.LogoutBotonI);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
      if (e.getSource()==this.UsuarioBoton){
        this.UsuarioBoton.setIcon(this.UsuarioBotonI);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
      if (e.getSource()==this.SettingsBoton){
        this.SettingsBoton.setIcon(this.SettingsBotonI);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
    }
}