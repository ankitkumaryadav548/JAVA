//implementing queue with the help of LinkedList
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
        System.out.println(q);
    }
}