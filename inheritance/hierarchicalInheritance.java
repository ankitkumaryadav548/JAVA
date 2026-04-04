
// hierarchical inheritance ->
// onr parent class->
// two child at same level
// A parent class
// B,C as a chils class
import java.util.*;
class A{
    void test_A(){
        System.out.println("class A");
    }

}
class B extends A{
    void test_B()
    {
        System.out.println("class B");

    }

}
class C extends A{
    void test_C(){
        System.out.println("class C");

    }

}
class Main{
    public static void main(String[] args) {
        B b1 = new B();
        b1.test_B();
        b1.test_A();
        C c1 = new C();
        c1.test_C();
        c1.test_A();

    }
}