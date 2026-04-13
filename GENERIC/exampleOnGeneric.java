//take two value from user and print the sum of both value
//value are Number
//user Generic -> create add methods
//use constructure to Initialize value

//take two variable in Generic class 
//Number => predefine class for Every Number
//this super class for all Numbers

import java.util.*;
class Calculator<T extends Number>
{
    T a;
    T b;
    Calculator(T a , T b){
        this.a =a;
        this.b =b;

    }
    double add(){
        return a.doubleValue()+b.doubleValue() ; 
    }
}

class exampleOnGeneric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        Double x = sc.nextDouble();

        System.out.print("Enter second number: ");
        Double y = sc.nextDouble();

        // Creating object
        Calculator<Double> cal = new Calculator<>(x, y);

        // Printing result
        System.out.println("Sum: " + cal.add());
    }
}