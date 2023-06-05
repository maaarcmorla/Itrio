package Itrio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bd.Querys;

public class FrameLogin extends JFrame implements MouseListener {
  
  private JTextField DownUsuarioTF;
  private JPasswordField DownContraseñaPF;
  private JLabel DownBoton;
  private ImageIcon DownBotonBG;
  private ImageIcon DownBotonBGI;
  private JLabel Registrarte;
  private ImageIcon RegistrarteNegro;
  private ImageIcon RegistrarteAzul;
  
  public FrameLogin() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");
        

        // ------------ Frame ------------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,700);
        this.setResizable(true);
        this.setLocation(725, 175);
        this.setTitle("Itrio - LogIn");
        this.setIconImage(LogoItrioPq.getImage());
        

        // ------------ Logo Login ------------
        ImageIcon LogoItrio = new ImageIcon("images/logo2.png");

        JLabel LogoUp = new JLabel();
        LogoUp.setIcon(LogoItrio);
        LogoUp.setBounds(0,10,317,150);

        JPanel Up  = new JPanel();
        Up.setBounds(0,0,500,150);
        Up.setBackground(Color.WHITE);
        
        // ------------ Usuario, Contraseña, Boton ------------
        JPanel Down = new JPanel();
        Down.setBounds(-10, 150, 500, 350);
        Down.setBackground(Color.WHITE);

          /// ------------ Usuario ------------
        JLabel DownUsuario = new JLabel();
        ImageIcon DownUsuarioBG = new ImageIcon("images/Nombre.png");
        DownUsuario.setBounds(200,200,334, 58);
        DownUsuario.setIcon(DownUsuarioBG);

        this.DownUsuarioTF = new JTextField();
        this.DownUsuarioTF.setBounds(20,47,305,20);
        this.DownUsuarioTF.setBackground(new Color(0, 0, 0,0));
        this.DownUsuarioTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.DownUsuarioTF.setBorder(null);
        this.DownUsuarioTF.setOpaque(false);

          /// ------------ Contraseña ------------
        JLabel DownContraseña = new JLabel();
        ImageIcon DownContraseñaBG = new ImageIcon("images/Contraseña.png");
        DownContraseña.setBounds(0,0,330, 41);
        DownContraseña.setIcon(DownContraseñaBG);

        this.DownContraseñaPF = new JPasswordField();
        this.DownContraseñaPF.setBounds(20,43,300,20);
        this.DownContraseñaPF.setBackground(new Color(0, 0, 0,0));
        this.DownContraseñaPF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.DownContraseñaPF.setBorder(null);
        this.DownContraseñaPF.setOpaque(false);        

          /// ------------ Boton ------------
        this.DownBoton = new JLabel();
        this.DownBotonBG = new ImageIcon("images/iniciar-sesion-boton.png");
        this.DownBotonBGI = new ImageIcon("images/iniciar-sesion-boton2.png");
        this.DownBoton.setIcon(DownBotonBG);
        this.DownBoton.addMouseListener(this);
        this.DownBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

          /// ------------ Registrarte ------------

        this.Registrarte = new JLabel();
        this.RegistrarteNegro = new ImageIcon("images/registro-negro.png");
        this.RegistrarteAzul = new ImageIcon("images/registro-azul.png");
        this.Registrarte.setIcon(RegistrarteNegro);
        this.Registrarte.addMouseListener(this);
        this.Registrarte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.Registrarte.setBounds(85,450,315,29);
          
        // ------------ Fondo Olas ------------
        JPanel BGO = new JPanel();
        BGO.setBounds(0,465,500,200);
        BGO.setBackground(Color.WHITE);

        JLabel FondoOlas = new JLabel();
        ImageIcon OlasBg = new ImageIcon("images/Olas Vector.png");
        FondoOlas.setBounds(0,0,500,700);
        FondoOlas.setIcon(OlasBg);

        // ------------ Add ------------
        this.add(Up);
        this.add(Registrarte);
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

        String usuario = DownUsuarioTF.getText();
        String passwd = DownContraseñaPF.getText();

        if (usuario.isEmpty() || passwd.isEmpty()){
          JOptionPane.showMessageDialog(this, "Usuario o contraseña vacios");
        }
        else {
          if (Querys.login(usuario, passwd)){
            this.dispose();
            new ItrioBooks();
          }
          else {
            JOptionPane.showMessageDialog(this,"El usuario o la contraseña no son validos...");
            
          }
        }


        
      }
      if (e.getSource()==this.Registrarte) {
        this.dispose();
        new FrameRegistro();
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
      if (e.getSource()==this.Registrarte){
        this.Registrarte.setIcon(this.RegistrarteAzul);
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
      if (e.getSource()==this.Registrarte){
        this.Registrarte.setIcon(this.RegistrarteNegro);
        // No es necesario, pero para tener en cuenta de cara a futuro.
        this.repaint();
      }
    }
}