//Wild Card => unknown types
//Unbounded
//bounded
//1. Lower bounded
//2.Upper bounded

import java.util.*;
class Demo<T>{
    T a;
    void set(T a)
    {
        this.a = a ;
    }
    T get()
    {
        return a;
    }
}
class Main{
    public static void main(String[] arg){
        Demo<Integer> d = new Demo<>();
        d.set(23);
        Demo<String> d1 = new Demo<>();
        d1.set("Ankit");
        //for wild card we use symbol ? 
        Demo <?> d2 = d ;  //this is normal variable 
        System.out.print("value of a is :"+d2.get());
        d2 = d1;
        System.out.print("value of a is :"+d2.get());
        //Unbounded Wild Card 
    }
}


//bounded wild card
//upper bounded

//object class => is parent class of every class of java
                    // Object 
//                 |          |
//             String          Number   ... child class 
//                 |            |
// String , StringBuffer, StringBuilder  Integer , Float , double , Long


// object -> Number -> Integer
            // 
// lower bound -> Integer -> Number
// Upper bound -> Object -> Number 

// object -> Number -> Float
// object -> Number -> double
// object -> Number -> Long

//lower bound

// if go from top to buttom -> this is upper bound -> use extends keyword
// Demo<? extends Number   > d ;  -> upper bound 

// if we go from buttom to upper -> this is lower bound -> use super keyword
//Demo <? super Integer> d ;  -> lower bound 




