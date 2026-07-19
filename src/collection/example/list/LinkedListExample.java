package collection.example.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // declaring list
        List<Integer> list1 = new LinkedList<>(); // {12,-10,0,null,77,12,22,33,33....}

        // add data
        list1.add(34);
        list1.add(-78);
        //list1.add(null);
        list1.add(0);
        list1.add(77);
        list1.add(12);
        list1.add(3);
        list1.add(56);
        list1.add(77);
        //list1.add(null);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(2);
        System.out.println("list1 after removing 2nd index data : "+list1);

        // size
        System.out.println("list1 size is : "+list1.size());

        // search
        System.out.println("list1 3rd index data : "+list1.get(3));
        System.out.println("list1 5th index data : "+list1.get(5));

        // sort
        Collections.sort(list1); // sorts list in ascending order
        System.out.println("list1 in ascending order : "+list1);
        Collections.sort(list1, Collections.reverseOrder()); // sorts list in descending order
        System.out.println("list1 in descending order : "+list1);

        // traverse
        System.out.println("traverse list using foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
