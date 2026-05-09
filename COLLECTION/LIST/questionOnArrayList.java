//ArrayList<Integer>
//ArrayList<String>
//ArrayList<Float>
//ArrayList<Double>

//at the place  of Integer Float Double can we take user defined datatypes
//ArrayList<student> student1 = new ArrayList<>();

import java.util.ArrayList;

class student{
    String name ;
    int rollNo;

    student(String name, int rollNo)
    {
        this.name = name ;
        this.rollNo = rollNo;
    }

}

class Main{
    public static void main(String[] args){
        ArrayList<student> student1 = new ArrayList<>() ;
        // listname.add(value);
        //student is class so first we create object of student then insert that object inside student
        student1.add(new student("Ankit",20));
        student1.add(new student("Harry",21));
        student1.add(new student("ABC",22));

        // for each loop 
        for(student s:student1)
        {
            System.out.println("Student name is " + s.name+ "rollNo is :" + s.rollNo);
            
        }
    }
}