package Programs.String;

public class StringBuilder {
    public static void main(String[] args) {
        String str ="a";
        for(int i=1;i<5;i++)
        {
            str = str + (char) ('a' + i);
        }

        System.out.println(str);
    }
}
