import java.util.*;

class Demo<T>{
    T a ;
    void set(T a)
    {
        this.a = a ;
    }
    T get()
    {
        return a ;
    }

}

class Main{
    //if we extends-> only allow read Operation
    //if we super ->mainly allow write Operation(both)
    static void reader(Demo<? extends Number>d)
    {
        System.out.println(d.get());
        // d.set(34);  // not allow 
        
    }
    static void writer(Demo<? super Integer>d){
        System.out.println(d.get());
        d.set(34);
        System.out.println(d.get());

    }

    public static void main(String[] args){
        Demo<Integer> d = new Demo<>();
        d.set(23);
        System.out.println("Value of a is: "+d.get());
        reader(d);
        writer(d);
    }
}