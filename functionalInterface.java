//Functional Interface
//It is type of Interface => allow one abstract method
//interface as 100 Expression
//we don't allow normal method in interface
//




// interface functionalInteface {     // functionalInteface
//     void show();

// }

// interface Animal {     //not functionalInteface because of two mthod 
//     void run();
//     void sound();
// }
// interface Demo {             //Anonymous class 
//     void show();
//     default void print()
//     {
//         System.out.println("Functional Interface method");
//     }

// }

//lambda Expression => to reduce the code of abstract method of Functional Interface

import java.util.* ;

interface Demo {
    void show();
}

class Main{
    public static void main(String[] args){
        // Demo d = new Demo() {
        //     public void show()      Anonymous class 
        //     {
        //         System.out.println("Anonymmous class") ;
        //     }
        // };
        // -> lambda operator
        Demo d = ()-> System.out.println("Anonympus class") ;  // lambda 
        d.show();
    }
}

//