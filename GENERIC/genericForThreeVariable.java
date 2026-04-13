//we are taking three variable of any data types

import java.util.*;

class Demo<K,U,V>{
    K a;
    U b;
    V c;

    Demo(K a , U b,V c){
        this.a = a;
        this.b = b;
        this.c = c ;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class Main{
    public static void main(String[] args){
        Demo<Integer,String,Double> obj = new Demo<>(2, "Ankit",4.5);
        obj.print();
        Demo <Double,String,Character> obj1 = new Demo(2.5, "dgfag",'A');
        obj1.print();
    }
}