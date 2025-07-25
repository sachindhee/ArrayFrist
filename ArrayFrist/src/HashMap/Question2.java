package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {

        String name = "I love you i miss you";

        String []arr = name.split(" ");

        HashMap<String , Integer> map = new HashMap<>();

        for (String x : arr)
        {
            if (map.containsKey(x))
            {
                map.put(x,map.get(x)+1);
            }
            else
            {
                map.put(x,1);
            }
        }

        for (Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


    }

}
