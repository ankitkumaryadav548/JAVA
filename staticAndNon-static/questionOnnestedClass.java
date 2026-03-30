//nested class question
//outer class => Section
//in section we have
//static sectionName variable
//nested static Inner class => Student
//in Inner class we Student name ,RollNo ,Marks
//method showdetails() ;

//implement nested class and create two Student object 

class Section{
    static String sectionName="324AK" ;
    static class Student{ 
        String name ;
        int RollNo ;
        double Marks ;
        Student(String name , int RollNo, double Marks){
            
            this.name =name ;
            this.RollNo = RollNo ;
            this.Marks = Marks ;
        }
        void showdetails(){
            System.out.println("Name of Student is : " +name);
            System.out.println("RollNo of Student is : " +RollNo);
            System.out.println("Marks of Student is : " +Marks);
            System.out.println("Section Name of Student is : " +sectionName);
        }
    }
}
class Main{
    public static void main(String[] args){
        Section.Student s1 = new Section.Student("Ankit",28,25);
        s1.showdetails();

    }
}