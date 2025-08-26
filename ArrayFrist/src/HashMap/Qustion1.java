package HashMap;

import java.util.HashMap;

public class Qustion1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        int count  = 0;
        map.put(101,"karan");
        map.put(102,"aman");
        map.put(103,"sachin");
        map.put(104,"rekha");
        map.put(101,"rohit");

        System.out.println(map);

        if (map.containsKey(102)){
            map.put(103,map.get("sachin")+"shqarma");
        }

        System.out.println(map);
        System.out.println(map.get("sachin"));

    }

}
