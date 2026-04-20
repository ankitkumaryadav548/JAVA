//Map -> it is not part of Collections
//Map is different interface
//Map<Key , value>
// list = 10,20,10,40,20 -> stire frequecny of each element
// key   value
// 10     2
// 20     2
// 40     1

//Map<Integer, Integer> map = new HashMap<>();
// Student name , roll no -> we want to roll no to name 
//key-> roll no 
//value -> name

import java.util.*;

class Map{
    public static void main(String[] args){   // use Map or HashMap
        HashMap<Integer, String> Student = new HashMap<>() ;   
        //in map we have put method in place of add method
        Student.put(1, "Ankit");
        Student.put(2, "Gautam");
        Student.put(3, "Nilu");
        Student.put(4, "Ashwani");
        System.out.println(Student);
        
    }
}
