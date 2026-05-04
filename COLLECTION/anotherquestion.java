import java.util.*;

class Emp {
    String name;
    int salary;

    Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class employee {
    public static void main(String[] args) {
        ArrayList<Emp> emplist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        emplist.add(new Emp("Arun", 45000));
        emplist.add(new Emp("shivam", 78000));
        emplist.add(new Emp("sai", 34000));
        int maximum = emplist.get(0).salary;
        int minimum = emplist.get(0).salary;
        int sum = 0;
        for (Emp e : emplist) {
            sum += e.salary;
            if (e.salary > maximum) {
                maximum = e.salary;
            }
            if (e.salary < minimum) {
                minimum = e.salary;

            }
        }
        System.out.println("differnce of maximum and minimum salary " + (maximum - minimum));
        System.out.println(sum);
    }
}