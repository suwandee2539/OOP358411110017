package lab6;

import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String myMsg = "I am work at RUTS 2018";
        StringBuffer strBur = new StringBuffer(myMsg);

        System.out.println(strBur);
        System.out.println(strBur.reverse());
        strBur.append(" Happy New Year, 2019");
        System.out.println(strBur);

        //StringTokenizer
        StringTokenizer token = new StringTokenizer(strBur.toString());

        System.out.println(token);
        System.out.println(token.countTokens());

        //cutting words from String
        while (token.hasMoreElements()){
            System.out.println(token.nextToken());
        }
    }//main
}//class
