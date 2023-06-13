package Itrio;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ItrioBooks extends JFrame implements MouseListener {
  
  private JLabel LogoutBoton;
  private ImageIcon LogoutBotonI;
  private ImageIcon LogoutBotonI2;
  private JLabel TablaCompleta;
  private ImageIcon TablaCompletaBG;
  private ImageIcon TablaCompletaBGI;
  private JLabel sobreItrio;
  private ImageIcon sobreItrio1;
  private JLabel Libro1;
  private JLabel Libro2;
  private JLabel Libro3;
  private JLabel Libro4;
  private JLabel Libro5;
  private JLabel Libro6;
  private JLabel Libro7;
  private JLabel Libro8;
  private JLabel Libro9;
  private JLabel Libro10;
  private JLabel Libro11;
  private JLabel Libro12;
  private JLabel Libro13;
  private JLabel Libro14;
  private ImageIcon Nineteen;
  private ImageIcon LaLuna;
  private ImageIcon Visitante;
  private ImageIcon FallInLove;
  private ImageIcon ColdLake;
  private ImageIcon Dragon;
  private ImageIcon Road;
  private ImageIcon Heart;
  private ImageIcon DonQuijote;
  private ImageIcon Insomnia;
  private ImageIcon MobyDick;
  private ImageIcon Momo;
  private ImageIcon Gatos;
  private ImageIcon AbuelaLoca;

  public ItrioBooks() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");  // Logo barra de tareas
        

        // ------------ Frame ------------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1205,840);
        this.setResizable(true);
        this.setLocation(350, 110);
        this.setTitle("Itrio");
        this.setIconImage(LogoItrioPq.getImage());

        // ------------ Label ------------ 
        ImageIcon LprincipalIcon = new ImageIcon("images/BPrincipal.png");
       
        JLabel Lprincipal = new JLabel();
        Lprincipal.setIcon(LprincipalIcon);
        Lprincipal.setBounds(-10,0,1200,803);

        // ------------ Boton Logout ------------
        this.LogoutBoton = new JLabel();
        this.LogoutBotonI = new ImageIcon("images/logout.png");
        this.LogoutBotonI2 = new ImageIcon("images/logout.gif");
        this.LogoutBoton.setIcon(LogoutBotonI);
        this.LogoutBoton.addMouseListener(this);
        this.LogoutBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.LogoutBoton.setBounds(50,30,50,50);

        // ------------ Panel - Scroll Pane ------------
        
        JPanel Libro = new JPanel(null);
        Libro.setPreferredSize(new Dimension(1100, 590));
        Libro.setBackground(new Color(0,0,0,0));
        Libro.setOpaque(true);


        this.Nineteen = new ImageIcon("images/imagesSP/libros-foto.png");
        this.Libro1 = new JLabel(Nineteen);
        this.Libro1.setBounds(30,30,200,300);
        this.Libro1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        this.LaLuna = new ImageIcon("images/imagesSP/libros-foto-_10_.png");
        this.Libro2 = new JLabel(LaLuna);
        this.Libro2.setBounds(245,30,200,300);
        this.Libro2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Visitante = new ImageIcon("images/imagesSP/libros-foto-_2_.png");
        this.Libro3 = new JLabel(Visitante);
        this.Libro3.setBounds(460,30,200,300);
        this.Libro3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.FallInLove = new ImageIcon("images/imagesSP/libros-foto-_3_.png");
        this.Libro4 = new JLabel(FallInLove);
        this.Libro4.setBounds(675,30,200,300);
        this.Libro4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        this.ColdLake = new ImageIcon("images/imagesSP/libros-foto-_4_.png");
        this.Libro5 = new JLabel(ColdLake);
        this.Libro5.setBounds(890,30,200,300);
        this.Libro5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Dragon = new ImageIcon("images/imagesSP/libros-foto-_5_.png");
        this.Libro6 = new JLabel(Dragon);
        this.Libro6.setBounds(30,350,200,300);
        this.Libro6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Road = new ImageIcon("images/imagesSP/libros-foto-_6_.png");
        this.Libro7 = new JLabel(Road);
        this.Libro7.setBounds(245,350,200,300);
        this.Libro7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Heart = new ImageIcon("images/imagesSP/libros-foto-_7_.png");
        this.Libro8 = new JLabel(Heart);
        this.Libro8.setBounds(460,350,200,300);
        this.Libro8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.DonQuijote = new ImageIcon("images/imagesSP/libros-foto-_8_.png");
        this.Libro9 = new JLabel(DonQuijote);
        this.Libro9.setBounds(675,350,200,300);
        this.Libro9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Insomnia = new ImageIcon("images/imagesSP/libros-foto-_9_.png");
        this.Libro10 = new JLabel(Insomnia);
        this.Libro10.setBounds(890,350,200,300);
        this.Libro10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.MobyDick = new ImageIcon("images/imagesSP/libros-foto-_1_.png");
        this.Libro11 = new JLabel(MobyDick);
        this.Libro11.setBounds(675,665,200,300);
        this.Libro11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Momo = new ImageIcon("images/imagesSP/libros-foto-_11_.png");
        this.Libro12 = new JLabel(Momo);
        this.Libro12.setBounds(30,670,200,300);
        this.Libro12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.Gatos = new ImageIcon("images/imagesSP/libros-foto-_12_.png");
        this.Libro13 = new JLabel(Gatos);
        this.Libro13.setBounds(245,670,200,300);
        this.Libro13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.AbuelaLoca = new ImageIcon("images/imagesSP/libros-foto-_13_.png");
        this.Libro14 = new JLabel(AbuelaLoca);
        this.Libro14.setBounds(460,670,200,300);
        this.Libro14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JScrollPane scrollPane = new JScrollPane(Libro, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(30,143,1120,590);
        scrollPane.setPreferredSize(new Dimension(1100,590));
        scrollPane.setBackground(new Color(0,0,0,0));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
          JScrollBar vertical = scrollPane.getVerticalScrollBar();
          vertical.setValue(vertical.getMaximum());
          Libro.setPreferredSize(new Dimension(680,1200));
        scrollPane.setBorder(null);
        scrollPane.setOpaque(true);

        // ------------ Boton Tabla Completa ------------
        this.TablaCompleta = new JLabel();
        this.TablaCompletaBG = new ImageIcon("images/tablaCompleta.png");
        this.TablaCompletaBGI = new ImageIcon("images/tablaCompletaBG.png");
        this.TablaCompleta.setIcon(TablaCompletaBG);
        this.TablaCompleta.addMouseListener(this);
        this.TablaCompleta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.TablaCompleta.setBounds(495,739,200,30);

        // ------------ Boton Sobre Itrio ------------
        this.sobreItrio = new JLabel();
        this.sobreItrio1 = new ImageIcon("images/BP.bga.png");
        this.sobreItrio.setIcon(sobreItrio1);
        this.sobreItrio.addMouseListener(this);
        this.sobreItrio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.sobreItrio.setBounds(-10,775,1205,30);

        // ------------ Add ------------        
        this.add(scrollPane);

        Libro.add(Libro1);
        Libro.add(Libro2);
        Libro.add(Libro3);
        Libro.add(Libro4);
        Libro.add(Libro5);
        Libro.add(Libro6);
        Libro.add(Libro7);
        Libro.add(Libro8);
        Libro.add(Libro9);
        Libro.add(Libro10);
        Libro.add(Libro11);
        Libro.add(Libro12);
        Libro.add(Libro13);
        Libro.add(Libro14);

        this.add(LogoutBoton);
        this.add(sobreItrio);
        this.add(TablaCompleta);
        this.add(Lprincipal);
        
       
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
      if (e.getSource()==this.LogoutBoton){
        this.dispose();
        new FrameLogin();
      }
      if (e.getSource()==this.TablaCompleta){
        this.dispose();
        new Libros();
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
        this.repaint();
      }
      if (e.getSource()==this.TablaCompleta){
        this.TablaCompleta.setIcon(this.TablaCompletaBGI);
        this.repaint();
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      if (e.getSource()==this.LogoutBoton){
        this.LogoutBoton.setIcon(this.LogoutBotonI);
        this.repaint();
      }
      if (e.getSource()==this.TablaCompleta){
        this.TablaCompleta.setIcon(this.TablaCompletaBG);
        this.repaint();
      }
    }
}