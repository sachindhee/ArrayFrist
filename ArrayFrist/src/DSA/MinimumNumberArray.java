package DSA;

public class MinimumNumberArray {
    public static void main(String[] args) {
        int [] arr = {1,24,43,3,2,4,6};
        int min = arr[0];
        for (int x : arr)
        {
            if (x<min)
            {
                min =x;
            }
        }
        System.out.print(min);
    }
}
