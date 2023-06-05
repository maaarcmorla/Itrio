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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bd.Querys;

public class FrameRegistro extends JFrame implements MouseListener {
    
    private JLabel RegisterBoton;
    private ImageIcon RegisterBotonI; 
    private ImageIcon RegisterBotonI2;
    private JTextField NombreTF;
    private JTextField ApellidoTF;
    private JTextField UsuarioTF;
    private JPasswordField ContraseñaPF;

    public FrameRegistro() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");

        // ------------ Frame ------------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600,700);
        this.setResizable(false);
        this.setLocation(660, 170);
        this.setTitle("Itrio - Registro");
        this.setIconImage(LogoItrioPq.getImage());

        // ------------ Label Registro ------------
        ImageIcon LabelRegistroIcon = new ImageIcon("images/Register.png");
       
        JLabel LabelRegistro = new JLabel();
        LabelRegistro.setIcon(LabelRegistroIcon);
        LabelRegistro.setBounds(-10,0,600,700);

        // ------------ TextField-PasswordField ------------
        /// ------------ Nombre ------------
        this.NombreTF = new JTextField();
        this.NombreTF.setBounds(115,178,165,20);
        this.NombreTF.setBackground(new Color(0, 0, 0,0));
        this.NombreTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.NombreTF.setBorder(null);
        this.NombreTF.setOpaque(false);

        /// ------------ Apellido ------------
        this.ApellidoTF = new JTextField();
        this.ApellidoTF.setBounds(300,178,165,20);
        this.ApellidoTF.setBackground(new Color(0, 0, 0,0));
        this.ApellidoTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.ApellidoTF.setBorder(null);
        this.ApellidoTF.setOpaque(false);

        /// ------------ Nombre de Usuario ------------
        this.UsuarioTF = new JTextField();
        this.UsuarioTF.setBounds(142,268,300,20);
        this.UsuarioTF.setBackground(new Color(0, 0, 0,0));
        this.UsuarioTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.UsuarioTF.setBorder(null);
        this.UsuarioTF.setOpaque(false);

        /// ------------ Contraseña ------------
        this.ContraseñaPF = new JPasswordField();
        this.ContraseñaPF.setBounds(142,337,300,20);
        this.ContraseñaPF.setBackground(new Color(0, 0, 0,0));
        this.ContraseñaPF.setFont(new Font("Monstserrat",Font.BOLD,12));
        this.ContraseñaPF.setBorder(null);
        this.ContraseñaPF.setOpaque(false); 

        /// ------------ Boton ------------
        this.RegisterBoton = new JLabel();
        this.RegisterBotonI = new ImageIcon("images/RegistrarNegro.png");
        this.RegisterBotonI2 = new ImageIcon("images/RegistrarBlanco.png");
        this.RegisterBoton.setIcon(RegisterBotonI);
        this.RegisterBoton.setBounds(170,350,400,200);
        this.RegisterBoton.addMouseListener(this);
        this.RegisterBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // ------------ Add ------------
        this.add(NombreTF);
        this.add(ApellidoTF);
        this.add(UsuarioTF);
        this.add(ContraseñaPF);
        this.add(RegisterBoton);
        this.add(LabelRegistro);
    
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==this.RegisterBoton){

            String nombre = NombreTF.getText();
            String apellidos = ApellidoTF.getText();
            String usuario = UsuarioTF.getText();
            String passwd = ContraseñaPF.getText();

            if (nombre.length()==0){
                JOptionPane.showMessageDialog(this,"No puede dejar el nombre en blanco");
              }
              else if (apellidos.length()==0){
                JOptionPane.showMessageDialog(this,"No puede dejar el apellido en blanco");
              }
              else if (usuario.length()==0){
                JOptionPane.showMessageDialog(this,"No puede dejar el usuario en blanco");
              }
              else if (passwd.length()==0){
                JOptionPane.showMessageDialog(this,"No puede dejar la contraseña en blanco");
              }
              else{
                if (Querys.insert(nombre, apellidos, usuario, passwd)){
                    JOptionPane.showMessageDialog(this, "Usuario creado correctamente!");
                }

                this.dispose();
                new ItrioBooks();
              }
            
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
        if (e.getSource()==this.RegisterBoton){
            this.RegisterBoton.setIcon(this.RegisterBotonI2);
            // No es necesario, pero para tener en cuenta de cara a futuro.
            this.repaint();
          }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==this.RegisterBoton){
            this.RegisterBoton.setIcon(this.RegisterBotonI);
            // No es necesario, pero para tener en cuenta de cara a futuro.
            this.repaint();
          }
    }
    
        
}
