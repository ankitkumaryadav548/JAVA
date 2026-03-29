// import java.util.* ;

// // static can access only static 
// //non static can access both (static and non-static)
// class Demo{
//     static int a ;  //static valiable
//     int b =4;       //
//     static void print()  //static Method 
//     {
//         System.out.println("Value of a is " + a) ;
//         // System.out.println("Value of b is " + b) ; // b can't be access 
//     }
//     void print1()    // non-static Method 
//     {
//         System.out.println("Value of a is " + a) ;
//         System.out.println("Value of b is " + b) ;

//     }
// }
// class Main{
//     public static void main(String[] args){
//         Demo d =new Demo();
//         d.print();
//     }
// }


//Another example of static and non-static 
import java.util.* ;

class student{
    static int age =20 ;
    String name ="Ankit" ;
    
    static void display()
    {
        System.out.println("age of student is :" + age) ;
        // System.out.println("name of student is : " + name) ;
    }
    void display1()
    {
        System.out.println("age of student is :" + age) ;
        System.out.println("name of student is : " + name) ;  
    }
}  



class Main{
    public static void main(String[] args){
        student s1 =new student() ;
        s1.display();
        
    }
}
