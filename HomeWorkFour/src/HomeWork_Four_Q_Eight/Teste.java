package HomeWork_Four_Q_Eight;

import javax.swing.*;
import javax.swing.JFrame;

public class Teste {
    public static void main ( String[] args ) {

        JFrame myf =new JFrame ();
        myf.setSize ( 500,500 );
        myf.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
        myf.setVisible ( true );
        MyFrem  frem =new MyFrem ();

        myf.add(frem);
    }
}
