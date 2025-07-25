package HashMap;

import java.util.HashMap;

public class UsingForLoop {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Rekha");
        map.put(102,"rohit");
        map.put(103,"aman");

        for (Integer key : map.keySet())
        {
            System.out.println("key : "+key);
        }

    }
}
