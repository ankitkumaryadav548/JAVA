//implementing queue with the help of LinkedList
//FIFO and LILO
//to create the queue

//Queue<Integer> q = new LinkedList<>();

import java.util.*;;

class Main{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        //to add element in queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        //in case of queue add(value)/ offer(value)(bith are same)
        //offer(value) perform insertion of element safely
        q.offer(60); 
        q.offer(70); 
        System.out.println(q);
        q.remove();  // remove value from starting element from queue 
        q.poll();
        //remove() and poll() method both are same
        //but poll() method provide safety in deletion 
        System.out.println(q);
        
        //size()
        System.out.println("Size of queue is: "+ q.size());
        //contains()
        System.out.println(q.contains(70));
    }
}