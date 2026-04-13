//we are taking two variable of any data types

import java.util.*;

class Demo<K,V>{
    K a;
    V b;
    Demo(K a , V b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}
class Main{
    public static void main(String[] args){
        Demo<Integer,String> obj = new Demo<>(2, "Ankit");
        obj.print();
        Demo <Double,String> obj1 = new Demo(2.5, "dgfag");
        obj1.print();
    }
}