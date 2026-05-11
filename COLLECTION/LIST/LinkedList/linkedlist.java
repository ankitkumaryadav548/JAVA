//to create LinkedList
//LinkedList<Integer> list = new LinkedList<>();

import java.util.*;

class Main{
    public static void main(String[] args){
        //create the LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        //insert the element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //to find the size of LinkedList
        //LinkedListname.size();
        System.out.println("No. of element in Linkedlist :" + list.size());
        //to delete the data from LinkedList
        // we have remove method => remove(index)
        System.out.println(list.remove(1));
        //we can remove/ delete value
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
        
        //contains =>it will check given element is present or not (retur true/false)
        System.out.println(list.contains(34));
        

    }
}