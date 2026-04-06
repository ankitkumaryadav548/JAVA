//write new program with method markschecker
//if marks less than zero throw IllegalArgumentException

//marks > 100 throw ArithmeticException
//otherwise print marks ;
//use only one catch block 

//use try and catch block handle it
//use finally block to print markschecker Successfully ;

import java.util.*;

class Main{
     static void markschecker(int marks){
    if(marks<0){
        throw new IllegalArgumentException("marks can not be zero");
    }
    else if(marks>100){
        throw new ArithmeticException("marks can not be greater than 100");
    }
    else{
        System.out.println("marks: "+marks);
    }

    
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt(); 

        try {
            markschecker(marks);
        } 
        catch (IllegalArgumentException | ArithmeticException e ) {
            System.out.println(e.getMessage());
        } 
        // catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // } 
        finally {
            System.out.println("markschecker Successfully");
        }
    }
}



        
     