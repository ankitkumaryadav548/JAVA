//nested class
//1.non-static
//2.static nested class
//3.local inner class
//4.anonymous nested class

//local inner class 
//outer class => method of outer
//inner class => method of inner class

class Outer{
    void show(){
        class Inner{
            int a =4 ;
            void print(){
                System.out.print("Value of a is :" + a);
        }
     }
     Inner obj = new Inner();
     obj.print();
    }
}
class Main{
    public static void main(String[] args){
        Outer o = new Outer();
        o.show(); 
    }
}