// import java.util.* ;
// //Non-static nested class 
// class outer{
//     int a =20;
//     static int b =40 ;
//     class Inner{
//         void print()
//         {
//             System.out.println("inner class method");
//             System.out.println("value of a is:"+ a);
//             System.out.println("value of b is:"+ b);
//         }
//     }
// }
// class Main{
//     public static void main(String[] args){
//         outer o = new outer() ;
//         outer.Inner obj = o.new Inner() ;
//         obj.print();
//     }
// }

//static class inside any class => nested class
//static nested class 
class Outer{
    int a =5;
    static int b =40 ;
    static class Inner{
    void display(){
        // System.out.println("value of a is:"+ a);
        System.out.println("value of b is:"+ b);
    }
    }     
}
class Main {
    public static void main(String[] args) {

        // Creating object of static nested class
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}