package HashMap;

import java.util.HashMap;

public class HashMapBasic {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"sachin");
        map.put(102,"aman");
        map.put(103,"karan");

        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.remove(103));
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("karan"));
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(103,"sachin"));



    }
}
