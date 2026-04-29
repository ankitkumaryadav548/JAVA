//thread can be creted using two way
//1.By Extending Thread Class
//2.By Implementing Runnable Interface

//1.Method to create Thread
import java.util.*;
class Mythread extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
class Main{
    public static void main(String[] args){
        Mythread m1 =  new Mythread();
        m1.run();
    }

}

//2.Method to create Thread

import java.util.*;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

class Main{
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

