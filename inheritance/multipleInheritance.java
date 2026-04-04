// Employee management (multilevel inheritance):
// create a class person with name and age.
// create employee class extending person with employeeid and salary. create manager class
// extending employee with bonus
// parent class ->person
// child class ->employee
// subchild->manager
// person->employee->manager

import java.util.*;
class Person{
    String name ;
    int age;
    Person(String name,int age){
    this.name = name;
    this.age = age;
    }


}
class Employee extends Person{
    int employeeId;
   double salary;
   Employee(int employeeId, double salary , String name, int age){
    super(name,age);
    this.employeeId=employeeId;
    this.salary = salary;

   }


}
class Manager extends Employee{
    double bonus;
    Manager(double bonus,int employeeId,double salary,String name, int age){
        super(employeeId,salary,name,age);
        this.bonus = bonus;

    }



}
class Main{
    public static void main(String[] args) {
        Manager m1 = new Manager(10000, 05, 6000, "Diya", 19);
        
        System.out.println("bonus is: "+m1.bonus);
        System.out.println("employeeId is: "+m1.employeeId);
        System.out.println("salary is: "+m1.salary);
        System.out.println("name is: "+m1.name);
        System.out.println("age is: "+m1.age);

        
    }
}


