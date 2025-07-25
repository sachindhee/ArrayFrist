package DSA;

public class ArrayQueastion1 {

    public static void main(String[] args) {
        int [] arr = {1,24,43,3,2,4,6};
        int max = arr[0];
        for(int x : arr)
        {
            if(x>max)
            {
                max = x;
            }
        }

        System.out.println(max);
    }
}
