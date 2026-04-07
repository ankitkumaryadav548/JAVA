//write code to create RuntimeException to check length of password
//password should be String
//password length should be greater than 10
//name of passwordCheckException

import java.util.*;

class passwordCheckException extends RuntimeException{
    passwordCheckException(String password){
        super(password);
    }
}
class Main{
    public static void main(String[] args){
        String password = "sjhvkjskvtg";
        try{
            if(password.length()>10){
                throw new passwordCheckException("password is greater than 10");
            }
            }catch(passwordCheckException p){
                System.out.println(p.getMessage());
            }   

    }
}