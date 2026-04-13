//Generic 
//if you have run time Error -> 
//can you remove easily ?? 

//we try to convert run time to compile time Error
//so we remove during the compile phase

//reuseability 
//do you have any idea bout getter and satters ??
//with the help getter and setters we can access private member of class
//outside the class 

// import java.util.*;

// class Box{
//     private int a ;
//     public void setData(int a)
//     {
//         this.a = a;
//     }
//     public int getData(){
//         return a ;
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Box box = new Box();
//         box.setData(23);
//         System.out.println("Value of a :" + box.getData());
//     }
// }



//without Generic
//type safety
//without Generic we have type safety
//  import java.util.*;
//  class Box{
//     Object a;

//     void setData(Object a){
//         this.a = a ;
//     }
//     Object getData(){
//         return a ; 
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Box box = new Box();
//         box.setData("Ankit");
//         System.out.println(box.getData());
//         Integer num = (Integer)box.getData(); // we are getting run time Error
//         System.out.println(num);
//     }
// }



//In upper code we are getting run time error so we will convert runtime into compile time error with the help of Generic then we will handle it 
//we can not handle run time error
//with the help of  Generic 

import java.util.*;
 class Box<T>{
    T a;

    void setData(T a){
        this.a = a ;
    }
    T getData(){
        return a ; 
    }
}

class Main{
    public static void main(String[] args){
        Box<String> box = new Box();
        box.setData("Ankit");
        System.out.println(box.getData());

        // Integer num = box.getData();  // Now we will get compile time error. 
        String num  = box.getData();     //to handle it use Generic
        System.out.println(num);
    }
}