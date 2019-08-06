import java.util.Scanner;

public class palinD1 {


    public static void main(String[] args) {
        String palinD1, palinD2 = "";

        Scanner in = new Scanner(System.in);


        System.out.println( " masukan kata pertama ");
        palinD1 = in.nextLine();


        int length = palinD1.length();
            for (int i = 0; i < length; i++)
                palinD2 = palinD2 + palinD1.charAt(length - i - 1);


            if ( palinD1.equals(palinD2))
                System.out.println(" ini kata palinDrome");

            else
                System.out.println(" kata ini bukan palin Drome bosku,");

    }

}
