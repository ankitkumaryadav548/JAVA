//method overriding => in case of inheritance => 
//we implement same function(same signature) in parent class and subclass
// method signature should be same but internal implementation can be different

import java.util.* ;  
class Animal{
    void sound()
    {

        System.out.println("Animal sound ");
    }
}
class Dog extends Animal
{
    void sound()
    {
        super.sound();
    }
    {
        System.out.println("dog barks ") ;
    }
}

class Main{
    public static void main(String[] args){
        Dog d1 = new Dog() ; 
        d1.sound();
    }
} 