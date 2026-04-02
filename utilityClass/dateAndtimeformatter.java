//time formatter for date and time together

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main{
        public static void main(String[] args){
            LocalDateTime datetime = LocalDateTime.now();
            DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy" );
            System.out.println("current date and time " + datetime.format(f1)); 

            DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss" );
            System.out.println("current date and time " + datetime.format(f2)); 

            DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM-dd-yyyy mm:ss:HH" );
            System.out.println("current date and time " + datetime.format(f3)); 

            DateTimeFormatter f4 = DateTimeFormatter.ofPattern("yyyy-mm-dd ss:mm:HH" );
            System.out.println("current date and time " + datetime.format(f4)); 
        }
}
