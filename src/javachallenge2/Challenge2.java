package javachallenge2;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;
public class Challenge2 extends Applet {
    String text;
    Button OK;
    TextField tekstvak;
    Label label;
    int screeny, screenx;
int newyork;
int tokyo;
int londen;
int sydney;
    public void init(){
        screenx = 800;
        screeny = 600;
        setSize(screenx,screeny);
        label = new Label("Voer een uur in");
        tekstvak = new TextField("", 30);
        OK = new Button();
        OK.setLabel("Kies een tijd");
        add(label);
        add(tekstvak);
        Listener L = new Listener();
        OK.addActionListener(L);
        add(OK);

    }
public void paint(Graphics g){

        if(tokyo > 30 || sydney > 32 || londen > 22 || newyork > 17){
            g.drawString("Onjuiste invoer", 350, 130);
            repaint();
        }
        else{
            if(tokyo <0){
                tokyo = tokyo + 24;
            }
            if (sydney <0){
                sydney = sydney + 24;
            }
            if(londen <0){

                londen = londen + 24;
            }
            if(newyork <0){
                newyork = newyork +24;
            }
            if(tokyo >24){
                tokyo = tokyo - 24;
            }
            if (sydney >24){
                sydney = sydney - 24;
            }
            if(londen >24){

                londen = londen - 24;
            }
            if(newyork >24){
                newyork = newyork -24;
            }
        }
    g.drawString("sydney: "+sydney  + ":00", 350, 50 );
    g.drawString("Tokyo: "+tokyo + ":00", 350, 70 );
    g.drawString("Londen: "+londen + ":00", 350, 90 );
    g.drawString("New york: "+newyork + ":00", 350, 110);
}
    private class Listener implements ActionListener{
        public void actionPerformed( ActionEvent e){
            text = tekstvak.getText();
            tokyo = Integer.parseInt(text);
            tokyo = tokyo +7;
            text = tekstvak.getText();
            sydney = Integer.parseInt(text);
            sydney = sydney +9;
            text = tekstvak.getText();
            londen = Integer.parseInt(text);
            londen = londen -1;
            text = tekstvak.getText();
            newyork = Integer.parseInt(text);
            newyork = newyork -6;
            repaint();
        }
    }
}




