// Problem Statement

// A company wants to develop an Employee Management System using Java Collections.

// You are given details of employees such as:

// Employee ID
// Employee Name
// Employee Salary

// The company wants all employee records to be stored in a:

// TreeSet

// so that records remain automatically sorted.

// Your task is to create an:

// Employee class 

//  and implement:

// Comparable<Employee>

// to define the sorting logic.

// Sorting Requirements
// Employees should first be sorted by:
// Salary in ascending order
// If two employees have the same salary, then sort them by:
// Employee Name in alphabetical order

import java.util.*;

class Employee implements Comparable<Employee> {

    int Employee_id;
    String Employee_name;
    double Employee_salary;

    // Constructor
    Employee(int Employee_id,
            String Employee_name,
            double Employee_salary) {

        this.Employee_id = Employee_id;
        this.Employee_name = Employee_name;
        this.Employee_salary = Employee_salary;
    }

    @Override
    public int compareTo(Employee e) {

        // Compare salary first
        int result = Double.compare(this.Employee_salary, e.Employee_salary);
               
        // If salary same compare names
        if (result == 0) {

            result = this.Employee_name.compareTo(e.Employee_name);
                    
        }

        return result;
    }

    @Override
    public String toString() {

        return Employee_id + " : "  + Employee_name + " : " + Employee_salary;
                        
    }
}

class Main {
    public static void main(String[] args) {

        TreeSet<Employee> set = new TreeSet<>();

        set.add(new Employee(1, "Ankit", 1000));
        set.add(new Employee(2, "Delip", 1000));
        set.add(new Employee(3, "Gautam", 4000));

        System.out.println(set);
    }
}