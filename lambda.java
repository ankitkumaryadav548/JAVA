//another exmaple

import java.util.* ;
interface Calculator {
    int add(int a ,int b);
}
class Main{
    public static void main(String[] args){
        // Calculator c = new Calculator() {     //Anonymmous method
        //     public void add(int a,int b){
        //         System.out.println("Sum of two number os : " + (a+b));
        //     }
        // };
        //
        // Calculator c=(a,b)-> System.out.println("Sum of two number is : " + (a+b));              //  lambda method 1.way to declare 
        // c.add(3,4);

        // Calculator c = (a,b)-> a+b ;    //Another way to declare lambda 
        // System.out.println(c.add(3,4));

        Calculator c = (a,b)-> {return a+b ;}  ;   //Another way to declare lambda 
        System.out.println(c.add(13,24));




    }
}