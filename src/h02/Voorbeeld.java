package h02;

import java.awt.*;
import java.applet.*;

public class Voorbeeld extends Applet {

    public void init() {
setBackground(Color.magenta);

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue   );
        g.drawString("Welcome to Java11", 50, 50);
    }
}
