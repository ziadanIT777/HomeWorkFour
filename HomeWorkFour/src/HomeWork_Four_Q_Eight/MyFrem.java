package HomeWork_Four_Q_Eight;

import javax.swing.*;
import java.awt.*;

public class MyFrem {
    public class Myfrem extends JComponent{
        public void paintComponent ( Graphics2D g){
            Graphics2D g2 = (Graphics2D ) g;
            Rectangle R=new Rectangle ();

            g2.setColor ( Color.blue );
            g2.fillRect ( 50,40,130,70 );
            g2.setColor ( Color.red );
            g2.drawString ( "Zeidan_Taleb",130,70 );
        }
    }
}
