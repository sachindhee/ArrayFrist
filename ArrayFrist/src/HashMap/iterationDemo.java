package HashMap;


import java.util.HashMap;
import java.util.Map;

public class iterationDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Rekha");
        map.put(102,"rohit");
        map.put(103,"aman");

        for (Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println("RollNo :"+entry.getKey()+" Name "+entry.getValue());
        }



    }
}
