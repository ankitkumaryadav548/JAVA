// object => is a parent of all class
import java.util.* ;
class object{

}

class Main{
    public static void main(String[] args){
        Object obj = new Object() ;
        System.out.print(obj.getClass());
        object obj1 = new object();
        System.out.print(obj1.getClass());


    }
}