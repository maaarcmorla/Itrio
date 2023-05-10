import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Itrio extends JFrame implements MouseListener {
  
  private JLabel sobreItrio;
  private ImageIcon sobreItrio1;

  public Itrio() {

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

        // Boton
        this.sobreItrio = new JLabel();
        this.sobreItrio1 = new ImageIcon("images/BP.bga.png");
        this.sobreItrio.setIcon(sobreItrio1);
        this.sobreItrio.addMouseListener(this);
        this.sobreItrio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.sobreItrio.setBounds(-10,775,1205,30);


        // OptionPane(Duck)
        // JOptionPane.pato(null, )

        // Add
        this.add(sobreItrio);
        this.add(Lprincipal);
       
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}