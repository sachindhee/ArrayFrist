package ArraySeries;


public class SecondLargest {
    public static void main(String [] args)
    {
        int []arr= {54,53,88,63,64,33};

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

//        for (int i=0;i<arr.length;i++)
//        {
//            for (int j=i+1; j<arr.length;j++)
//            {
//                if(arr[i]> arr[j])
//                {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j]= temp;
//                }
//            }
//        }

        for(int i :  arr)
        {
            System.out.println(i);

            if(i > min)
            {
                max  = min;
                   min = i;
            }
            else {
                if(i > max && i != min)
                {
                    max = i;

                }

            }
        }

        System.out.println("Second largest: "+ max);

    }

}
