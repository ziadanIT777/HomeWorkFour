import java.util.Scanner;
import java.awt.Rectangle;

public class Q_one {
   public static void main ( String[] args ) {
       Scanner in =new Scanner ( System.in );
       Rectangle rect=new Rectangle (20,30);
       System.out.println ("enter the width Rectangle");
       rect.width= in.nextInt ();
       System.out.println ("enter the height Rectangle");
       rect.height=in.nextInt ();
       System.out.println (" perimeter ="+  ( rect.getWidth () + rect.getHeight () ) *2 );

   }
}
