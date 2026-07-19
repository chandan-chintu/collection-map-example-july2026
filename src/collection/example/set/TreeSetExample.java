package collection.example.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 =new TreeSet<>();

        set1.add(33);
        set1.add(12);
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
