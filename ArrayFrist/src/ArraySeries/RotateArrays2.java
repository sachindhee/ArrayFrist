package ArraySeries;

public class RotateArrays2 {
    public static void main(String [] args)
    {
        int arr[]  = {10,20,30,40,50};
         int k =3;
         int n = arr.length;
          int rotate[] = new int[n];
          for(int i=0; i<n; i++)
          {

              rotate[(i+k) % n] = arr[i];

          }
          for (int i : rotate)
          {
              System.out.println(i);
          }
    }

}
