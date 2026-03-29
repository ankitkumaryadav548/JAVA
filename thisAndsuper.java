// this() and super()
// this used for calling constructure of same class
// super() => used for call constructure of parent class
// constructure chaining

import java.util.* ;
class Student{
    Student()
    {
    this(34,"Ankit") ;
    System.out.println("No paramatrized constructure");
}
Student(int id)
{
    // this(id,"Arun");
    System.out.println("Student id is " + id);
}
Student(int id , String name)
{
    this(id) ;
    System.out.println("Student id is " + id);
    System.out.println("Student name is " + name);
    }
}