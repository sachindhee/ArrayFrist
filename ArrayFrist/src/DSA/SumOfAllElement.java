package DSA;

public class SumOfAllElement {
    public static void main(String[] args) {
        int [] arr = {1,24,43,3,2,4,6};

        int sum = 0;
        for (int x : arr)
        {
            sum+=x;
        }

        System.out.println("Sum of all element : "+sum);

    }
}
