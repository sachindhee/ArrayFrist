package String;

public class ListWord {
    public static void main(String [] args)
    {
        String name = "my name  is sachin";
        int end = name.length()-1;
        while (end >= 0 && name.charAt(end) == ' ') {
        end --;

        }

        int start = end;
        while (start >=0 && name.charAt(start) != ' '){
            start--;

        }

        System.out.println(end);
        System.out.println(start);

        int u = end-start;
        System.out.println(u);


    }
}
