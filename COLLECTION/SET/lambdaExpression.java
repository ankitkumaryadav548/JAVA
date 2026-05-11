//lambda expression
//Lambda expression is a shorter way to write

import java.util.*;

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo ;
        this.name = name ;
    }
    @Override
    public String toString(){
        return rollNo + " : " + name ;
    }
}
class Main{
    public static void main(String[] args){
        TreeSet<Student> set = new TreeSet<>((s1,s2)->
    s1.name.compareTo(s2.name)) ;

    set.add(new Student(1, "Ankit"));
    set.add(new Student(2, "Delip"));
    set.add(new Student(4, "Gautam"));
    set.add(new Student(3, "Anshu"));
    System.out.println(set);
    }
}