import java.util.*;
class WrongPasswordException extends Exception {
    WrongPasswordException(String message) {
        super(message);
    }
}

class WrongUserNameException extends Exception {
    WrongUserNameException(String message) {
        super(message);
    }
}

class Login {
    String userName;
    String password;

    Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    void loginCredential() 
            throws WrongPasswordException, WrongUserNameException {

        if (!userName.equals("Admin")) {
            throw new WrongUserNameException("Enter correct username");
        }

        if (!password.equals("12345")) {
            throw new WrongPasswordException("Enter correct password");
        }

        System.out.println("Login Successful");
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        String password = sc.nextLine();

        Login obj = new Login(userName, password);

        try {
            obj.loginCredential();
        } 
        catch (WrongPasswordException | WrongUserNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

