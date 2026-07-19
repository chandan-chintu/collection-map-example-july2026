package map.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new TreeMap<>();

        map1.put(107, "Guava");
        map1.put(104,"Mango");
        map1.put(101,"Grapes");
        map1.put(106,"Grapes");
        map1.put(108,"Orange");
        map1.put(109,"Orange");
        map1.put(109,"Pineapple"); // old value for key 109 will be removed and new value will be added


        System.out.println("map1 is : "+map1);

        map1.remove(106);
        System.out.println("map1 after removing 106 key : "+map1);

        System.out.println("traversing using foreach loop");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"------"+m1.getValue());
        }

    }
}
