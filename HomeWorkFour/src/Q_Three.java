import java.util.Scanner;

public class Q_Three {
    public static void main ( String[] args ) {

        Scanner in =new Scanner ( System.in );
        String   letters ="Mississippi";

        System.out.println ("the Function replace al 'i' with '!' ");

        letters= letters.replace ( "i","!" );
        System.out.println ("the with letters after replace is : " + letters +"\n");

        System.out.println ("the Function replace al 's' with '$' ");

        letters = letters.replace ( "s","$" );
        System.out.println ("the with letters after replace is : "+ letters);
    }
}
