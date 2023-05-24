import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.Normalizer;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameRegistro extends JFrame implements MouseListener{
    
    private JLabel RegisterBoton;
    private ImageIcon RegisterBotonI; 
    private ImageIcon RegisterBotonI2;

    public FrameRegistro() {

        ImageIcon LogoItrioPq = new ImageIcon("images/logo1.png");

        // Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600,700);
        this.setResizable(false);
        this.setLocation(725, 125);
        this.setTitle("Itrio - Registro");
        this.setIconImage(LogoItrioPq.getImage());

        // Label Registro 
        ImageIcon LabelRegistroIcon = new ImageIcon("images/Register.png");
       
        JLabel LabelRegistro = new JLabel();
        LabelRegistro.setIcon(LabelRegistroIcon);
        LabelRegistro.setBounds(-10,0,600,700);

        // TextField-PasswordField
        /// Nombre
        JTextField NombreTF = new JTextField();
        NombreTF.setBounds(115,178,165,20);
        NombreTF.setBackground(new Color(0, 0, 0,0));
        NombreTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        NombreTF.setBorder(null);
        NombreTF.setOpaque(false);

        /// Apellido
        JTextField ApellidoTF = new JTextField();
        ApellidoTF.setBounds(300,178,165,20);
        ApellidoTF.setBackground(new Color(0, 0, 0,0));
        ApellidoTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        ApellidoTF.setBorder(null);
        ApellidoTF.setOpaque(false);

        /// Nombre de Usuario
        JTextField UsuarioTF = new JTextField();
        UsuarioTF.setBounds(142,268,300,20);
        UsuarioTF.setBackground(new Color(0, 0, 0,0));
        UsuarioTF.setFont(new Font("Monstserrat",Font.BOLD,12));
        UsuarioTF.setBorder(null);
        UsuarioTF.setOpaque(false);

        /// Contraseña
        JPasswordField ContraseñaPF = new JPasswordField();
        ContraseñaPF.setBounds(142,337,300,20);
        ContraseñaPF.setBackground(new Color(0, 0, 0,0));
        ContraseñaPF.setFont(new Font("Monstserrat",Font.BOLD,12));
        ContraseñaPF.setBorder(null);
        ContraseñaPF.setOpaque(false); 

        /// Boton
        this.RegisterBoton = new JLabel();
        this.RegisterBotonI = new ImageIcon("images/RegistrarNegro.png");
        this.RegisterBotonI2 = new ImageIcon("images/RegistrarBlanco.png");
        this.RegisterBoton.setIcon(RegisterBotonI);
        this.RegisterBoton.setBounds(170,350,400,200);
        this.RegisterBoton.addMouseListener(this);
        this.RegisterBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Add
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
