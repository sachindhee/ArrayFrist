package DSA;

public class CountEvenOdd {
    public static void main(String[] args) {
        int [] arr = {1,24,43,3,2,4,6};
        int even = 0;
        int odd=0;
        for (int x:arr)
        {
            if (x%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("event : " + even);
        System.out.println("odd : "+odd);
    }
}
