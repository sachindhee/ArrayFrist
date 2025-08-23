package DSA;

import java.util.Scanner;

public class palidrom {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number");
        int x = sc.nextInt();
        int rev = 0;
        int y = x;

        while(x>0)
        {
            int remainder = x%10;
            rev = (rev*10)+remainder;
            x/=10;
        }
        if (y == rev)
        {
            System.out.println("it is palidrom number");
        }
        else {
            System.out.print(" it is not palidrome number");
        }
    }
}
