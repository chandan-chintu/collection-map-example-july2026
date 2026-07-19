package collection.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> set1 =new HashSet<>();

        set1.add(33);
        set1.add(12);
        set1.add(null);
        set1.add(-56);
        set1.add(33);
        set1.add(9);
        set1.add(24);
        System.out.println("set1 is : "+set1);

        set1.remove(24);
        System.out.println("set1 after remove data : "+set1);

        System.out.println("traverse using foreach loop");
        for(Integer s1 : set1){
            System.out.println(s1);
        }
    }
}
