// type of Exception handling
//1.try block 
//2.catch
//3.finally
//4.throw
//5.throws


//try => in which we are gettng Exception write inside try block 
// try{

// }

// catch=> exception in try block handle inside catch block
// catch(ExpceptionType e)
// {

// }

//finally => always execute inside programe
// finally{

// }

// throw => we will explicitily write any message => by thow 
// throw new ArithmeticException("device by zero or second no. is zero");

// throws => it will tell the method that which type of Exception we can get in code 

// void show() throws IOexception , ClassNotFoundException , ArrayIndexOutBoundsException {

// }

//custom Exception => we create our own Exception 


//assertion 



import java.util.* ;
class Main{
    public static void main(String[] args){
        int marks =-5 ;
       
        try{
            if(marks < 0){

                throw new IllegalArgumentException("Marks can not be negative") ;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        
    }
}
}





