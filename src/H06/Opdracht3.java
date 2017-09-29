package H06;
import java.awt.*;
import java.applet.*;
public class Opdracht3 extends Applet
{
    int a;
    int b;
    int c;
    int total;
    public void init()
    {
        a=2147483647;
        b=1;
        c=2;
        total = a*b*c;
    }
    public void paint(Graphics g)
    {
        g.drawString("het antwoord is: "+total, 20, 50);
    }
}