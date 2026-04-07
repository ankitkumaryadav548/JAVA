//create custom Exception -> IllegalException , FailedException
//check the marks of student
//if marks<0 and marks>100
// throw Exception -> IllegalException
// if marks<33
// throw Exception -> FailedException

// take a marks from user
//and use try and catch amd throw and throws and custom Exception and finally
//in finally you have to print marks check successfully

import java.util.*;

import javax.security.auth.login.FailedLoginException;

class IllegalMarksException extends Exception{
    IllegalMarksException(String message){
        super(message);
    }
}
class FailedException extends Exception{
    FailedException(String message){
        super(message);
    }
}

class Main{
    public static void main(String[] args)
    throws IllegalMarksException , FailedLoginException
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try{
            if(marks<0 || marks>100)
            {
                throw new IllegalMarksException("marks is between 0 and 100");
            }
                else if(marks<33){
                    throw new FailedException("failed");
                    
                }
            }catch(IllegalMarksException | FailedException e){
                System.out.println(e.getMessage());
            }finally{
                System.out.println("marks check successfully");   
            }
    }
}

