//Calendar

import java.util.Calendar;


class Main{
    public static void main(String[] args){
        Calendar c1= Calendar.getInstance();
        //Date d1 = new Date(); 
        System.out.println("current time " + c1.getTime());

        //find the curent year
        System.out.println("current year " + c1.get(Calendar.YEAR));
        
        //find th current month  => MOnth start from 0
        System.out.println("current month " + (c1.get(Calendar.MONTH)+1));

        //current date
        System.out.println("current date " + (c1.get(Calendar.DATE)));
        
        //curent hour
        System.out.println("current hour " + (c1.get(Calendar.HOUR)));

        
    }
}