package Programs.Questions;

import java.util.Arrays;

public class SecondLargest_Smallest {
    public static void main(String[] args) {
        String a = "leetcode";
        String b = "leeto";
        int i=0;
        int j=0;
        int count=-1;
        while(i<a.length())
        {
            if(a.charAt(i) == b.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j=0;
                i++;
            }

            if(j==b.length())
            {
                count = i-b.length();
                break;
            }

        }


            System.out.println(count);





    }
}
