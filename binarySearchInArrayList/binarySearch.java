//binarySearch in ArrayList ->
//precondition -> list should be sorted
//first take a list then sort the list and apply binarySearch
//collections.sort(listname)
// int index = collections.binarySearch(listName,key)
//if index is positive that means key is present in list return the index of key
//if index is negative(-1) key is not present

import java.util.*;

class Main{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(121);
        list.add(223);
        list.add(34);
        list.add(450);
        list.add(56);
        //another way to add element in list 
        // List<Integer> list = new ArrayList<>(Arrays.asList(12,23,34,45,56));
        System.out.println("list is: "+ list);
        Collections.sort(list);
        System.out.println("Sorted list is: "+ list);
        //binarySearch
        int index = Collections.binarySearch(list, 4);
        if(index>=0)
        {
            System.out.println("Key is found");
        }else
            System.out.println("Key is not present");
    }
}
