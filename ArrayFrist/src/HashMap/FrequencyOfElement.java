package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {

        int [] arr= {1,2,2,3,1,4,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: arr)
        {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);

            }else {
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
