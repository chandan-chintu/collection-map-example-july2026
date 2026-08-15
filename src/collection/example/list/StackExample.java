package collection.example.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stck1 = new Stack<>();
        //add dummy lines
        stck1.push("Guava");
        stck1.push("Mango");
        stck1.push("Orange");
        stck1.push(null);
        stck1.push("Orange");
        stck1.push("Grapes");
        System.out.println("stck1 is : "+stck1);

        stck1.pop();
        System.out.println("stck1 after 1st pop :"+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop :"+stck1);
        stck1.pop();
        System.out.println("stck1 after 3rd pop :"+stck1);

        System.out.println("traversing the stck1 using foreach loop");
        for(String s1 : stck1){
            System.out.println(s1);
        }
    }
}
