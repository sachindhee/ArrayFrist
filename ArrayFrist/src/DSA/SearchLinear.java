package DSA;

import java.util.Scanner;

public class SearchLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = {1,24,43,3,2,4,6};
        int  target = sc.nextInt();
        boolean found = false;
        for(int x: arr)
        {
            if (x==target)
            {
                found = true;
                break;
            }

        }
        if (found)
        {
            System.out.println("found");
        }
     else
        {
            System.out.println(" not found");
        }

    }
}
