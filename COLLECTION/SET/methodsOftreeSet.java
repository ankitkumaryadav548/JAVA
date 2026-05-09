import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add() -> insert elements
    
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        // Duplicate value will not be added
        set.add(20);

        System.out.println("Initial TreeSet : " + set);
      
        // size() -> total elements
      
        System.out.println("\nSize : " + set.size());


        // contains() -> search element
   
        System.out.println("\nContains 30 ? " + set.contains(30));
        System.out.println("Contains 100 ? " + set.contains(100));

    
        // first() -> smallest element
      
        System.out.println("\nFirst Element : " + set.first());


        // last() -> largest element
     
        System.out.println("Last Element : " + set.last());

        // higher() -> strictly greater element
        System.out.println("\nHigher than 30 : " + set.higher(30));

        // lower() -> strictly smaller element
        System.out.println("Lower than 30 : " + set.lower(30));


        // ceiling() -> greater or equal
        System.out.println("\nCeiling of 30 : " + set.ceiling(30));

        // if exact element not present
        System.out.println("Ceiling of 35 : " + set.ceiling(35));

        // floor() -> smaller or equal
        System.out.println("\nFloor of 30 : " + set.floor(30));

        // if exact element not present
        System.out.println("Floor of 35 : " + set.floor(35));

        // headSet() -> elements smaller than given value
        System.out.println("\nHeadSet(30) : " + set.headSet(30));

        // tailSet() -> elements greater than or equal
        System.out.println("TailSet(30) : " + set.tailSet(30));

        // subSet(start,end)
        // start included
        // end excluded
        System.out.println("SubSet(20,50) : " + set.subSet(20, 50));

        // descendingSet() -> reverse order
        System.out.println("\nDescending Set : " + set.descendingSet());

        // iterator() -> traversal
        System.out.println("\nTraversal using Iterator : ");

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // descendingIterator()
        // reverse traversal
        System.out.println("\nReverse Traversal : ");

        Iterator<Integer> dit = set.descendingIterator();

        while(dit.hasNext()) {
            System.out.println(dit.next());
        }


        // pollFirst()
        // remove smallest element
        System.out.println("\nPoll First : " + set.pollFirst());
        System.out.println("After pollFirst : " + set);


        // pollLast()
        // remove largest element
        System.out.println("\nPoll Last : " + set.pollLast());
        System.out.println("After pollLast : " + set);



        // remove()
        // remove specific element
        
        set.remove(30);
        System.out.println("\nAfter removing 30 : " + set);



        // isEmpty()
        System.out.println("\nIs Empty ? " + set.isEmpty());


        // clear()
        // remove all elements
        set.clear();
        System.out.println("\nAfter clear() : " + set);

        // check empty again
        System.out.println("Is Empty Now ? " + set.isEmpty());
    }
}