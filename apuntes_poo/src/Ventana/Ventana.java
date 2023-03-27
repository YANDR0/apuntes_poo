package Ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Ventana extends JFrame {

    private JButton ok = new JButton("Ok");
    private JButton cancel = new JButton("NO");

    public Ventana(){
        super("Mi primera funa");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        //setUndecorated(true);
        initComponents();
        setVisible(true);

    }

    private void initComponents(){
        Container c = getContentPane();
        c.setBackground(new Color(0, 100, 120));
        //c.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 5));
        ok.setBounds(50, 100, 100, 40);
        cancel.setBounds(200, 100, 100, 40);
        c.add(this.ok);
        c.add(this.cancel);
    }

    public static void main(String[] args){
        /*
        JFrame frame = new JFrame("Mi primer anexo");
        frame.setSize(400, 300);
        //frame.setLocation(300,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        */
        Ventana ventana = new Ventana();
    }
}
