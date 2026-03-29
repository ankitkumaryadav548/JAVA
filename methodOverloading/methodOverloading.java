//Method OverLoading
//function name should be same

// 1 => change in number of parameter
void add(int a, int b)
{
    
} // signature => add(int , int)
void add(int a, int b,int c)  
{

}// signature => add(int , int , int)
int add(int a, int b,int c,int d)  
{

// }// signature => add(int , int , int , int)

// 2 => change in datatype of parameter

// void add(int a, int b)
{
    
} //signature => add(int , int)
void add(int a , double b)
{

}//signature => add(int , double)  
void add(double a , double b)
{

}//signature => add(double , double)  
double add(double a , double b)
{

}//signature => add(double , double) => get error => not a MethodOverloading 


// implement Method OverLoading for area of different shape

class MethodOverloading {
    void area(int a , int b)
    {
        System.out.println("Area will be: " + (a*b));
    }
    void area(int a , double b)
    {
        System.out.println("Area will be: " + (a*b));
    }
    void area(double a , double b)
    {
        System.out.println("Area will be: " + (a*b));
    }
    void area(double a , int b)
    {
        System.out.println("Area will be: " + (a*b));
    }
    void area(int a , int b, int c)
    {
        System.out.println("Area will be: " + (a*b*c));
    }
    void area(int a , double b, int c)
    {
        System.out.println("Area will be: " + (a*b*c));
    }
    void area(int a , double b , double c)
    {
        System.out.println("Area will be: " + (a*b*c));
    }
    void area(double a , double b , double c)
    {
        System.out.println("Area will be: " + (a*b*c));
    }
}
    class Main{
    public static void main(String[] args){
        MethodOverloading m1 = new MethodOverloading() ;
        m1.area(2,3);
        m1.area(2,3.0);
        m1.area(2.0,3);
        m1.area(2.0, 3.0);
        m1.area(2,3,4);
        m1.area(2,3.0,4);
        m1.area(2,3.0,5.0);
        m1.area(2.0,3.0,4.0);
    }

}
