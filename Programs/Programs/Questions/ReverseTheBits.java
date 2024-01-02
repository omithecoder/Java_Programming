package Programs.Questions;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import java.lang.String;

public class ReverseTheBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        convertBin(num);
    }

    static String convertBin(long num) {
        int[] rem;
        int i=0;
        while(num>=2)
        {
            rem[i]=num%2;
            num=num/2;
        }
    }


}
