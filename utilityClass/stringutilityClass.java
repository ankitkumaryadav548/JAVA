//String Utility class
class Stringutility{
    private Stringutility()
    {

    }
    static void printName(String name){
        System.out.println(name);
    }
    static void reverse(String name)
    {
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);
    }
    
}
class Main{
    public static void main(String[] args){
        Stringutility.printName("Ankit");
        Stringutility.reverse("Ankit");
        
    }
}