//custom exception => Exception created by user
//marks can not negative
//withdraw the money amount > balance =>
//checked Custom Exception => during compile time
//created by user

// class MarksNeagtive extends Exception{

// }

// uncheked Custom Exception => exception created by Developer or logic of program that will runtime  custom Exception
// class DivideByzero extends RuntimeException{

// }

// import java.util.*;

// class DivideByzeroException extends RuntimeException {
//     DivideByzeroException(String message) {
//         super(message);
//     }
// }

// class Main {
//     public static void main(String[]args){
//         int a =5;
//         int b = 0; 
//         try{
//         if(b==0){
//            throw new DivideByzeroException("we can not divide any number by zero");
//        }
//        System.out.println(a/b);
//         }catch(DivideByzeroException e)
//         {
//             System.out.println(e.getMessage());
//         }finally{
//             System.out.print("continue executing code");
//         }   
//     }
// }

//example of checked customException(compile time)

import java.util.*;


class MarksCanNotBeNegativeException extends Exception{
    MarksCanNotBeNegativeException(String message){
        super(message);
    }
}

class Main{
    public static void main(String[] args){
        int marks = -5;

        try{
            if(marks<0){
                throw new MarksCanNotBeNegativeException("Marks can not be nagative");
            }
        }catch(MarksCanNotBeNegativeException m){
            System.out.println(m.getMessage());
        }
    }
}


