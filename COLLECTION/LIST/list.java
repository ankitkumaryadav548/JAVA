//Iterable => main interface of java for collection it allows for-each 
// Iterable<T> iterable();

// collection -> add() , remove() , set(), size() , contains();

//list -> this interface maintain order of collection(element)
//maintain insertion order
//allow duplicate
//allow null values
//support indexing


//      Iterable(interface)
//       |
//       |
//     collection(interface)
//     |
//     |
//     list(interface)
//     |
//    ArrayList LinkedList(actual class of list) 

//ArrayList -> actual implementaion  of Dynamic array 
//syntax of ArrayList ->
// List <Integer> list = new ArrayList<>();    //creating object of ArrayList
//ArrayList<Integer> list = new ArrayList<>();

//LinkedList
//stack
//queue
//set 
//hastset
//hashmap



import java.util.*;

class Main{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        //to add element in ArrayList use add method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        System.out.println("Actual list is "+ list);
        //to add element at particular index
        //list.add(index, element)
        //again print the list
        list.add(1,23);
        System.out.println("NOw Actual list is "+ list);
        //to access the element of list use get(index) method 
        System.out.println("element at index 3 is  "+ list.get(3));
        //update the value of list->set(index , value)
        //again print update list
        //this method return previous value and update the new value
        list.set(2,44);
        System.out.println("list after updating : "+ list);
        //remove the element from the list using value
        //list.remove(Integer.valueOf(value))
        list.remove(Integer.valueOf(44));
        System.out.println(list);
        System.out.println(list.remove(2));//remove index and return remove element
        //check the given element is present or not in the list
        //list.contains(element)
        System.out.println(list.contains(10));
        //find the size of list
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // for each loop
        for(int num:list){
            System.out.println(num);
        }
        //sort the list ->collection.sort(list);
        Collections.sort(list);
        System.out.println("sorted list: "+list);
        //reverse the list Collections.reverse(list)
        Collections.reverse(list);
        System.out.println("reverse list: "+list);
        
        //suffle , max , min , frequency(list , element)
        Collections.shuffle(list);
        System.out.println("Suffle list: "+list);
        int n = Collections.max(list);
        System.out.println("Max of list: "+n);
        int m = Collections.min(list);
        System.out.println("Min of list: "+m);
        //frequency means how many time that number is occures in the list 
        int a =Collections.frequency(list,23);
        System.out.println("frequecy of 23 in the list is: "+a);

        //sublist -> it contain sub part of list
        //subList(Startindex , lastindex)
        //it will create sublist of element Startindex to lastindex-1 
        List<Integer>list1 = list.subList(1, 3);
        System.out.println(list1);
        
        //copy the list
        List<Integer>list2 = new ArrayList<>(list);
        System.out.println(list2);

        //lambda Expression


        //replace all element of list by x->x*10 ;
        list.replaceAll(x->x*10);
        System.out.println(list);
        
        //combine two list
        //list and list1
        list.addAll(list1);
        System.out.println(list);

        
    }
}