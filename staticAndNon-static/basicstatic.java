import java.util.* ;

// static can access only static 
//non static can access both (static and non-static)
class Demo{
    static int a ;  //static valiable
    int b =4;       //
    static void print()
    {
        System.out.println("Value of a is " + a) ;
        // System.out.println("Value of b is " + b) ;
    }
    void print1()
    {
        System.out.println("Value of a is " + a) ;
        System.out.println("Value of b is " + b) ;

    }
}
class Main{
    public static void main(String[] args){
        Demo d =new Demo();
        d.print();
    }
}

