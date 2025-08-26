package DSA;

import java.util.HashMap;
import java.util.Map;

public class arrayFrqueny {

    public static void main(String [] args)
    {
        int []arr = {1,2,3,3,2,2,4,5,7,4,3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.getOrDefault(x,1)+1);
            }
            else
            {
                map.put(x,1);

            }
        }

        System.out.println(map);

    }


}
