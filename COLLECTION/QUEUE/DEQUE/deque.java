//Deque -> it is queue -> in which we can 
//insert and delete from both end 

//to insert the element from front side 
//addFirst(data) , offerFirst(data);

//to insert the element from back side 
//addLast(data) , offerLast(data);

// to delete the front element
// removeFirst() , pollFirst();

//to delete element from back side
// removeLast() , pollLast();

import java.util.*;

class Main{
    public static void main(String[] args){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.offerFirst(70);
        d.addLast(40);
        d.addLast(50);
        d.addLast(60);
        d.offerLast(90);
        System.out.println(d);

        //to remove element
        d.removeFirst();
        d.pollFirst();
        d.removeLast();
        d.pollLast();
        System.out.println("deque after deletion of element :" + d);

    }
}