//Utility class => in Utility class every method is static
//we don't create the object of Utility class
//that why constructure will be private 
//we can access method with the help of class name 
//example of Utility class
//math Utility
//String Utility
//date and Time Utility

class Mathutility{
    private Mathutility()
    {

    }
    static void add(int a, int b)
    {
        System.out.println("Sum of a and b will be : " +(a+b)) ;
    }
    static void mul(int a, int b)
    {
        System.out.println("Multiply of a and b will be : " +(a*b)) ;
    }
    static void max(int a, int b)
    {
        if(a>b){
            System.out.println("Maximum is: " +a);
        }
        else {
            System.out.println("Maximum is :" +b) ;
        }
    }
}

class Main{
    public static void main(String[] args){
        Mathutility.add(3,4);
        Mathutility.mul(3,4);
        Mathutility.max(3,4);
    }

}
