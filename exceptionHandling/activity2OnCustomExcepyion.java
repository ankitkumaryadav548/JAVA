import java.util.* ;

class WrongPasswordException extends Exception{
    WrongPasswordException(String password){
        super(password) ;
    }
   
}

class WrongUserNameException extends Exception{
    WrongUserNameException(String UserName){
        super(UserName);
    }

}

class Login{
    String UserName;
    String password ;
    Login(String UserName , String password){
        this.UserName = UserName;
        this.password = password ;
    }

    void LoginCredinal()
        throws WrongPasswordException, WrongUserNameException

    {
        try{
            if(!password.equals("12345")){
                throw new WrongPasswordException("Enter correct password");
            }else if(UserName.equals("Admin")){
                throw new WrongUserNameException("Enter correct password");
            }
            
    }
    

    }

}
class Main{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String UserName = sc.nextLine();
    String password = sc.nextLine();

    Login obj = new Login(UserName, password);
    try{
        obj.LoginCredinal();

    }catch(WrongPasswordException | WrongUserNameException e){
                System.out.println(e.getMessage());
)
)       
    
    
    
    

    }  
}


