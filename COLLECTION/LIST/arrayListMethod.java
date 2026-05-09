//Following are the method used in ArrayList
// 1.add()
// 2.add(index, element)
// 3.remove()
// 4.set()
// 5.get()
// 6.size()
// 7.contains()
// 8.clear()
// 9.isEmpty()
// 10.indexOf()
// 11.Collections.sort()
// 12.Collections.reverse()

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1.add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List is: "+ list);
        //2.add(index,value)
        list.add(3,55);
        System.out.println("List is: "+ list);
        //3.remove()
        list.remove(2);
        System.out.println("List is: "+ list);
        //4.set()
        list.set(3,87);
        System.out.println("List is: "+ list);
        //5.get()
        System.out.println("List is: "+ list.get(2));
        //6.size()
        int a = list.size();
        System.out.println("Size of list is : "+ a);
        //7.contain()  //output trye or false 
        System.out.println(list.contains(23));
        //8.clear()
        // list.clear();  //remove all element from ArrayList
        System.out.println(list);
        //9.isEmpty()    return true or false 
        System.out.println(list.isEmpty());
        //10.indexOf()  => if index present return index number or not present return -1 
        System.out.println(list.indexOf(12));  
        //11.Collections.sort()
        Collections.sort(list);
        System.out.println("Sorted arrayList: " + list);
        //12.Collections.reverse()
        Collections.reverse(list);
        System.out.println("reverse arrayList: " + list);

    }
}