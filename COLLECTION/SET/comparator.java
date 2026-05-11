// Comparator is an interface used for:
// Custom Sorting
// It allows us to sort objects in different ways.
// Why Comparator Needed?
// Suppose you have a Student class.
// You may want sorting:
// by roll number
// by name
// by marks
// by age
// But:
// Comparable allows only ONE default sorting
// So Java provides:
// Comparator
// for multiple/custom sorting logics.


import java.util.*;
// Student class
class Student {

    int rollNo;
    String name;
    // Constructor
    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;
    }

    // toString() for printing object
    @Override
    public String toString() {

        return rollNo + " : " + name;
    }
}

// Comparator Class
// Sorting by Name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        // Compare names alphabetically

        return s1.name.compareTo(s2.name);
    }
}

class Main {
    public static void main(String[] args) {

        TreeSet<Student> set =
                new TreeSet<>(new NameComparator());
        set.add(new Student(3, "Ankit"));
        set.add(new Student(1, "Rahul"));
        set.add(new Student(5, "Aman"));
        set.add(new Student(2, "Neha"));
        set.add(new Student(4, "Simran"));
        System.out.println(set);
    }
}

