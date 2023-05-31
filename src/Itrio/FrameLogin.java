package Itrio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameLogin extends JFrame implements MouseListener {
    
  private JLabel DownBoton;
  private ImageIcon DownBotonBG;
  private ImageIcon DownBotonBGI;
  
  public FrameLogin() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");
        

        // Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,700);
        this.setResizable(false);
        this.setLocation(725, 175);
        this.setTitle("Itrio - LogIn");
        this.setIconImage(LogoItrioPq.getImage());
        

        // Logo Login
        ImageIcon LogoItrio = new ImageIcon("images/logo2.png");

        JLabel LogoUp = new JLabel();
        LogoUp.setIcon(LogoItrio);
        LogoUp.setBounds(0,10,317,150);

        JPanel Up  = new JPanel();
        Up.setBounds(0,0,500,150);
        Up.setBackground(Color.WHITE);
        
        // Usuario, Contraseña, Boton
        JPanel Down = new JPanel();
        Down.setBounds(-10, 150, 500, 350);
        Down.setBackground(Color.WHITE);

          /// Usuario
        JLabel DownUsuario = new JLabel();
        ImageIcon DownUsuarioBG = new ImageIcon("images/Nombre.png");
        DownUsuario.setBounds(200,200,334, 58);
        DownUsuario.setIcon(DownUsuarioBG);

        JTextField DownUsuarioTF = new JTextField();
        DownUsuarioTF.setBounds(20,47,305,20);
        DownUsuarioTF.setBackground(new Color(0, 0, 0,0));
        DownUsuarioTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        DownUsuarioTF.setBorder(null);
        DownUsuarioTF.setOpaque(false);

          /// Contraseña
        JLabel DownContraseña = new JLabel();
        ImageIcon DownContraseñaBG = new ImageIcon("images/Contraseña.png");
        DownContraseña.setBounds(0,0,330, 41);
        DownContraseña.setIcon(DownContraseñaBG);

        JPasswordField DownContraseñaPF = new JPasswordField();
        DownContraseñaPF.setBounds(20,43,300,20);
        DownContraseñaPF.setBackground(new Color(0, 0, 0,0));
        DownContraseñaPF.setFont(new Font("Monstserrat",Font.BOLD,12));
        DownContraseñaPF.setBorder(null);
        DownContraseñaPF.setOpaque(false);        

          /// Boton
        this.DownBoton = new JLabel();
        this.DownBotonBG = new ImageIcon("images/iniciar-sesion-boton.png");
        this.DownBotonBGI = new ImageIcon("images/iniciar-sesion-boton2.png");
        this.DownBoton.setIcon(DownBotonBG);
        this.DownBoton.addMouseListener(this);
        this.DownBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Fondo Olas
        JPanel BGO = new JPanel();
        BGO.setBounds(0,465,500,200);
        BGO.setBackground(Color.WHITE);

        JLabel FondoOlas = new JLabel();
        ImageIcon OlasBg = new ImageIcon("images/Olas Vector.png");
        FondoOlas.setBounds(0,0,500,700);
        FondoOlas.setIcon(OlasBg);

        // Add
        this.add(Up);
        this.add(Down);
        this.add(BGO);

        Up.add(LogoUp);

        Down.add(DownUsuario);
        DownUsuario.add(DownUsuarioTF);
        Down.add(DownContraseña);
        DownContraseña.add(DownContraseñaPF);
        Down.add(DownBoton);

        BGO.add(FondoOlas);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
      if (e.getSource()==this.DownBoton){
        this.dispose();
        new ItrioBooks();
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
      if (e.getSource()==this.DownBoton){
        this.DownBoton.setIcon(this.DownBotonBGI);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      if (e.getSource()==this.DownBoton){
        this.DownBoton.setIcon(this.DownBotonBG);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
    }
}