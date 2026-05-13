//HashSet -> used hashTable + closed Hashing
// liner probing
// quadatric probing
//double probing 
//element in a random order
//LinkedHashSet -> element inside set will same order of insertion
//hashTable + linklist = open Hashing

import java.util.*;

class Main{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(12);    //element will be in any order 
        set.add(15);
        set.add(14);
        set.add(657);
        set.add(122);
        set.add(345);
        System.out.println(set);
    }
}