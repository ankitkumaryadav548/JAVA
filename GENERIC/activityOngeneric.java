// // Description:
// You are developing a student management system where different types of data 
// such as student names (String), marks (Integer), and CGPA (Double) 
// need to be stored and retrieved. Initially, 
// the system was designed using an Object type, 
// which led to type casting issues and reduced code clarity.

// Task:
// Design a generic class that can store and return any type of student data.
// Requirements:
// The class should accept any data type.
// Provide methods to set and get the data.
// Avoid explicit type casting.

// Generic class
class StudentData<T> {
    private T data;

    // Method to set data
    public void setData(T data) {
        this.data = data;
    }

    // Method to get data
    public T getData() {
        return data;
    }
}

// Main class to test
class activityOngeneric {
    public static void main(String[] args) {
        
        // For student name (String)
        StudentData<String> name = new StudentData<>();
        name.setData("Ankit");
        System.out.println("Name: " + name.getData());

        // For marks (Integer)
        StudentData<Integer> marks = new StudentData<>();
        marks.setData(85);
        System.out.println("Marks: " + marks.getData());

        // For CGPA (Double)
        StudentData<Double> cgpa = new StudentData<>();
        cgpa.setData(8.7);
        System.out.println("CGPA: " + cgpa.getData());
    }
}