//TreeSet -> element will be in sorted order
//if set sorted what is best case Time complexity for insertion?
// 12 23 34 45 56 67 
//insertion O(log(n)) 
//searching take O(log(n))


import java.util.*;

class Main{
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        set.add(12);    //element will be in any order 
        set.add(15);
        set.add(14);
        set.add(657);
        set.add(122);
        set.add(345);
        System.out.println(set);
    }
}