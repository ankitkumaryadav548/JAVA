// Exception => abnormal behavior of programming ducring ececution
// compile time and Runtime

//1.unchecked Exception => Runtime Exception
//Arithimetic Exception

import java.util.*;
class Main{
    public static void main(String[] args){
        int a= 4;
        int b = 0;
        try{
        System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticExceptionOccur");
        }
    }
}

//2.NullPointerException




