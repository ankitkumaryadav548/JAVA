//take a list from user
//first largest , second element
//first smallest , second smallest
// [12,56,23,45,12,67,90]
//1st largest = 90
//2nd largest = 67
//3rd largest = 
// 4th largest = 

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List <Integer> list = new ArrayList<>();
        System.out.println("Enter the no of element");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int data = sc.nextInt();
            list.add(data);

        }
        System.out.println(list);
        int firstLargest = Collections.max(list);
        System.out.println("maximum element is :"+ firstLargest);
        int firstsmallest = Collections.min(list);
        System.out.println("maximum element is :"+ firstsmallest);
        
        Collections.sort(list);

        System.out.println("second largest is : " +list.get(n-2));
        System.out.println("second smallest is : " +list.get(1));

    }
}