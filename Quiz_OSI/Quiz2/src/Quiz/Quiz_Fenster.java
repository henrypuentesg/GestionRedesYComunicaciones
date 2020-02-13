//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.StyledDocument;

public class Quiz_Fenster implements ActionListener {
    JTextArea Area;
    JLabel frage;
    JButton[] ant = new JButton[4];
    JFrame w1 = new JFrame();
    JProgressBar b;
    int lösung;
    int richtig = 0;

    public static void main(String[] args) {
        new question_change();
    }

    public Quiz_Fenster() {
        this.w1.setSize(600, 730);
        this.w1.setLocationRelativeTo((Component)null);
        this.w1.setDefaultCloseOperation(3);
        this.w1.setVisible(true);
        this.w1.setLayout((LayoutManager)null);


        //this.w1.getContentPane().setBackground(Color.);

        this.ant[0] = new JButton("   ");
        this.ant[0].setBounds(100, 220, 400, 60);
        this.ant[0].addActionListener(this);

        this.w1.add(this.ant[0]);
        this.ant[1] = new JButton("   ");
        this.ant[1].setBounds(100, 300, 400, 60);
        this.ant[1].addActionListener(this);
        this.w1.add(this.ant[1]);
        this.ant[2] = new JButton("   ");
        this.ant[2].setBounds(100, 380, 400, 60);
        this.ant[2].addActionListener(this);
        this.w1.add(this.ant[2]);
        this.ant[3] = new JButton("   ");
        this.ant[3].setBounds(100, 460, 400, 60);
        this.ant[3].addActionListener(this);
        this.w1.add(this.ant[3]);
        Font fuente = new Font("Calibri", 3, 16);

        this.Area = new JTextArea("Ask");
        Area.setLineWrap(true);
        Area.setAlignmentY(Component.CENTER_ALIGNMENT);

        this.Area.setFont(fuente);
        this.Area.setForeground(Color.black);
        this.Area.setBackground(new Color(237, 239, 244));
        this.Area.setBounds(100, 40, 400, 160);
        this.Area.setLineWrap(true);

        this.w1.add(this.Area);
        this.b = new JProgressBar(0, 100);
        this.b.setBounds(100, 560, 400, 30);
        this.b.setValue(0);
        this.b.setStringPainted(true);
        this.w1.add(this.b);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.ant[0]) {
            if (this.lösung == 1) {
                this.Nachricht("Correcto", "¡Cierto, siga así!");
                this.Prozent();
                question_change.neueFrage();
            } else {
                this.Nachricht("Falso", "No es correcto");
            }
        }

        if (e.getSource() == this.ant[1]) {
            if (this.lösung == 2) {
                this.Nachricht("Correcto", "¡Cierto, siga así!");
                this.Prozent();
                question_change.neueFrage();
            } else {
                this.Nachricht("Falso", "No es correcto");
            }
        }

        if (e.getSource() == this.ant[2]) {
            if (this.lösung == 3) {
                this.Nachricht("Correcto", "¡Cierto, siga así!");
                this.Prozent();
                question_change.neueFrage();
            } else {
                this.Nachricht("Falso", "No es correcto");
            }
        }

        if (e.getSource() == this.ant[3]) {
            if (this.lösung == 4) {
                this.Nachricht("Correcto", "¡Cierto, siga así!");
                this.Prozent();
                question_change.neueFrage();
            } else {
                this.Nachricht("Falso", "No es correcto");
            }
        }

    }

    public void ChangeButtonText(int button, String text) {
        this.ant[button - 1].setText(text);
    }

    public void ChangeLabelText(String text) {
        this.Area.setText(text);
    }

    public void Nachricht(String Aussage, String info) {
        Object[] options = new Object[]{"OK"};
        JOptionPane.showOptionDialog((Component)null, Aussage, info, -1, -1, (Icon)null, options, options[0]);
    }

    public void Prozent() {
        if (this.richtig < 5) {
            ++this.richtig;
            System.out.println(this.richtig);
            this.Prozentrchnung(this.richtig, 6);
        } else {
            this.Nachricht("¡Super!", "¡Enhorabuena!");
            System.exit(0);
        }

    }

    public void Prozentrchnung(int zahl, int gesamt) {
        this.b.setValue(100 / gesamt * zahl);
    }
}

