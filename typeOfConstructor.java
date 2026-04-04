// import java.util.* ;
// class typeOfConstructor {
//     //1.by default 2.No argumnet 3.parameterised 4.copy Constructor
//     //count no. of Constructor
    public static int count;
    int a;
    int b;

    // no argumnet
    typeOfConstructor()
    {
        count++ ;
    }
    // parameterised constructure
    typeOfConstructor(int a, int b)
    {
        this.a = a;
        this.b = b ;
    }
    // copy parameter
    typeOfConstructor(typeOfConstructor obj2)
    {
        a = obj2.a ; 
        b = obj2.b ; 
    }
}

class Main{
    public static void main(String[] args){
        typeOfConstructor obj1 = new typeOfConstructor();
        System.out.println(typeOfConstructor.count) ;
        typeOfConstructor obj2 = new typeOfConstructor(3,4);
        System.out.println(typeOfConstructor.count) ;
        typeOfConstructor obj3 = new typeOfConstructor(obj1);
        System.out.println(typeOfConstructor.count) ;

    }
}
