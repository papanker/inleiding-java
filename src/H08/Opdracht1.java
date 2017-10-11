package H08;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

public class Opdracht1 extends Applet {
 Button reset;
    Button knop;
String schermtekst;
TextField tekstvak;
    public void init(){
tekstvak = new TextField("", 30);

        knop = new Button();
        knop.setLabel("OK");
        reset = new Button();
        reset.setLabel("RESET");
        Listener L = new Listener();
        Listener2 L2 = new Listener2();
        knop.addActionListener(L);
        reset.addActionListener(L2);
        add(reset);
       add(tekstvak);
        add(knop);
    }
    public void paint (Graphics g){
g.drawString(schermtekst,50,70);
    }
    class Listener2 implements ActionListener{
public void actionPerformed (ActionEvent e) {
tekstvak.setText("");
repaint();
}

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

schermtekst = tekstvak.getText();
            repaint();
        }
    }
}
