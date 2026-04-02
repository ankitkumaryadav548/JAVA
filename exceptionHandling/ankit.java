// 2.NullPointerException

import java.util.*;
class ankit{
    public static void main(String[] args){
        String name= " ";
        System.out.println("size of name is : " + name.length());

        String str = "Ankit";
        System.out.println("Size od str is : " + str.length());
        
        String str1 = null ;
        try{
            System.out.println("Size od str1 is : " + str1.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException :") ;
            System.out.println("getting : " + e.getMessage()) ;

        }


    }
}