import java.util.*;
class Demo<T>{

    T a;
    Demo(T a)
    {
        this.a = a;
    }
    void print()
    {
        System.out.println("value of a:" +a);
    }
}
class Demo1{
    String a;
    Demo1(String a)
    {
        this.a = a;
    }
    void print()
    {
        System.out.println("value of a:" +a);
    }
}

class Main{
    public static void main(String[] args){
        // Demo obj = new Demo(12);
        // obj.print();
        // Demo1 obj1 = new Demo1("Ankit");
        // obj1.print();

        Demo<String> obj = new Demo<>("Ankit");
        Demo<Integer> obj1 = new Demo<>(12);
        obj.print();
        obj1.print();



    }
}