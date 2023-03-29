package Ventana;

import inter.CanvasUser;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private static final Color  WINDOW_COLOR = new Color(0, 120, 140);
    private static final Font   BUTTON_FONT  = new Font("Calibri", Font.PLAIN, 20);
    private static final Cursor HAND_CURSOR  = new Cursor(Cursor.HAND_CURSOR);

    private JButton okBtn = new JButton("Ok");
    private JButton cancelBtn = new JButton("Cancel");

    public Ventana() {
        super("Mi primer ventana");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        //setUndecorated(true);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        //c.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 5));
        c.setLayout(null);
        okBtn.setBounds(50, 100, 100, 40);
        okBtn.setMnemonic('O');
        okBtn.setToolTipText("Guardar");
        okBtn.setFont(BUTTON_FONT);
        okBtn.setCursor(HAND_CURSOR);
        okBtn.setActionCommand("Ok");
        cancelBtn.setBounds(200, 100, 100, 40);
        cancelBtn.setMnemonic('C');
        cancelBtn.setToolTipText("Cancelar");
        cancelBtn.setFont(BUTTON_FONT);
        cancelBtn.setCursor(HAND_CURSOR);
        cancelBtn.setActionCommand("Cancel");

        // OkListener okListener = new OkListener();
        ActionListener buttonListener1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                if(cmd.equals("Ok")) System.out.println("Se presionó el botón Ok");
                else System.out.println("Se presionó el botón Cancel");
            }
        };

        ActionListener buttonListener2 = e -> System.out.println("Se presionó el botón Ok");
        okBtn.addActionListener(buttonListener2);
        cancelBtn.addActionListener(e -> System.out.println("Se presionó el botón Cancel"));


        /*
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se presionó el botón Ok");
            }
        });


        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se presionó el botón Cancel");
            }
        });
         */

        c.add(okBtn);
        c.add(cancelBtn);
    }

    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame("Mi primer ventana");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/
        Ventana ventana = new Ventana();
    }



}
