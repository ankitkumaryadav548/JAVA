//HashMap is a class in Java Collection Framework used to store data in Key Value pair
import java.util.*;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        // put()
        map.put(101, "Ankit");
        map.put(102, "Rahul");
        map.put(103, "Aman");

        System.out.println("Original Map : "+ map);        
        // get()
        System.out.println("Value of key 101 : "+ map.get(101));
        // containsKey()
        System.out.println("Contains key 102 : "+ map.containsKey(102));
        // containsValue()
        System.out.println("Contains value Aman : "+ map.containsValue("Aman"));
        // remove()
        map.remove(102);

        System.out.println("After remove : "+ map);
        // size()
        System.out.println("Size : " + map.size());               
    }
}