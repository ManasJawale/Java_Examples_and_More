package Advanced.Ch_1;

import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(0, 3);
        l2.add(13);
        l2.add(19);
        l2.add(14);
        l2.add(16);
        l2.add(11);
        l2.add(10);
        l1.addAll(l2);
        //l1.clear
        System.out.println(l1.contains(1));
        for(Integer i : l1) {
            System.out.println(i);
        }
        System.out.println(l1.size());
        System.out.println(l1.get(2));
    }
}
