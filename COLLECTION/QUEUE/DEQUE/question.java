// we have 1 to 10 No  ->  

// you have  to print -> 
// 10 8 6 4 2 1 3 5 7 9 

// 2 4 6 8 10 1 3 5 7 9 

// 10 8 6 4 2 9 7 5 3 1 

// use Deque print this output 

import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Deque<Integer>dq=new LinkedList<>();
        // 10 8 6 4 2 1 3 5 7 9 
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                dq.addLast(i);
            }
            else{
                dq.addFirst(i);
            }
        }
        System.out.println(dq); 
        
        
        // 2 4 6 8 10 1 3 5 7 9   
        // 1 to 10  ->  
        // 1 -> odd no  -> 1 from back side 11-1 =10  -> 10-> 1 
        // 2 -> even no skip 
        // 3 -> odd no -> insert 3 from back side 11-3=8 from front side 
        // 8 10 1 3   
        // 4 -> even no -> skip 
        // 5 -> odd   insert 5 from back side 11-5-6 from front side 
        // 6 8 10 1 3 5 
        // 10   -> 
        Deque<Integer>dq1=new LinkedList<>();
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                dq1.addLast(i);
                dq.addFirst(11-i);
                
                
            }
        }
        System.out.println(dq1);
    }
}