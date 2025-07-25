package HashMap;

import java.util.HashMap;

public class UsingForLoopKeyValue {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Rekha");
        map.put(102,"rohit");
        map.put(103,"aman");
        for (String value : map.values())
        {
            System.out.println("Value : "+value);
        }
    }
}
