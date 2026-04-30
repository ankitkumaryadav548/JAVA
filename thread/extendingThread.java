import java.util.*;

class Mythread extends Thread{
    private String threadName ;

    Mythread(String name){
        this.threadName = name ;
    }
    public void run(){
        System.out.println("Thread is running" + threadName);
        try{
            for(int i=4;i>=0;i--){
                System.out.println("Thread :"+ threadName);
                Thread.sleep(50);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Thread: " + threadName);
        }
    }
}
class Main{
    public static void main(String[] args){
        Mythread m1 = new Mythread("JavaThread-1");
        m1.start();
        Mythread m2 = new Mythread("JavaThread-2");
        m2.start();
        
    }
}