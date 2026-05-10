//Comparable can define ONLY ONE sorting logic at a time.
//if we are combing two sorting logic then it is called MultiLevel sorting 
//Limitation of Comparable
//Comparable does't allow Multiple independent sorting choices/Method 
//Multiple sorting method is allow in Comparator 
import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {

    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // compareTo() defines sorting logic
    @Override
    public int compareTo(Student s) {

        // Ascending order sorting by roll number

        // this.rollNo -> current object
        // s.rollNo -> compared object

        return this.rollNo - s.rollNo;
    }


    // toString() used to print object properly
    @Override
    public String toString() {

        return rollNo + " : " + name;
    }
}

class Main {

    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Student> set = new TreeSet<>();

        // Adding Student objects
        set.add(new Student(3, "Ankit")); //creating object and adding element both
        //Student s1 = new Student(3, "Ankit"); => creating object
        //set.add(s1);                  => adding element
        set.add(new Student(1, "Rahul"));
        set.add(new Student(5, "Aman"));
        set.add(new Student(2, "Neha"));
        set.add(new Student(4, "Simran"));

        // Printing TreeSet
        System.out.println(set);
    }
}