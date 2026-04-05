// //another exmaple

// import java.util.* ;
// interface Calculator {
//     int add(int a ,int b);
// }
// class Main{
//     public static void main(String[] args){
//         // Calculator c = new Calculator() {     //Anonymmous method
//         //     public void add(int a,int b){
//         //         System.out.println("Sum of two number os : " + (a+b));
//         //     }
//         // };
//         //
//         // Calculator c=(a,b)-> System.out.println("Sum of two number is : " + (a+b));              //  lambda method 1.way to declare 
//         // c.add(3,4);

//         // Calculator c = (a,b)-> a+b ;    //Another way to declare lambda 
//         // System.out.println(c.add(3,4));

//         Calculator c = (a,b)-> {return a+b ;}  ;   //Another way to declare lambda 
//         System.out.println(c.add(13,24));
//     }
// }


// Another example of lambda expression

// import java.util.*;

// interface Animal {
//         void sound();
// }

// class Main{
//     public static void main(String[] args){
//         Animal a1 = ()->  
//         System.out.println("Dog barks");
//         a1.sound();
//     }
// }

//another example

import java.util.* ;

interface lambda {
    void multiply(int a, int b);
    
}

class Main{
    public static void main(String[] atgs){
        lambda l1 =(int a ,int b)->
        System.out.println("Multiple of two numbers is: "+(a*b));
        l1.multiply(4,5);
    }
}