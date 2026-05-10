//MultiLevel sorting 
//Example Logic
// Sort by:
// rollNo
// If rollNo same, then sort by name    


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

        // First compare roll numbers
        if(this.rollNo != s.rollNo) {

            return this.rollNo - s.rollNo;
        }

        // If roll numbers are same
        // compare names
        return this.name.compareTo(s.name);
    }


    // toString() for printing object
    @Override
    public String toString() {

        return rollNo + " : " + name;
    }
}

public class Main {

    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();


        set.add(new Student(3, "Ankit")); // => shorted form creating object and adding both together
        //Student s1 = new Student(3, "Ankit"); => creating object
        //set.add(s1);                  => adding element
        set.add(new Student(1, "Rahul"));
        set.add(new Student(3, "Aman"));
        set.add(new Student(2, "Neha"));
        set.add(new Student(1, "Simran"));


        System.out.println(set);
    }
}