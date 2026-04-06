//time formatter
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Main{
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("current time is HH:mm:ss " + time.format(f1));
        
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("mm:HH:ss");
        System.out.println("current time is HH:mm:ss " + time.format(f2));
        
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("ss:mm:HH");
        System.out.println("current time is HH:mm:ss " + time.format(f3));
    }
}