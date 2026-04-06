import java.util.* ;

class Main{
    public static void main(String[] args){
        try{
            int a = 10/0;
            String str = null;
            System.out.println(str.length());
        }
        catch(ArithmeticException | NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}