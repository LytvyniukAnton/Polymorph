package Polymorph;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array = {emp1, emp2, emp3};

        for (Employee emp: array) {
            emp.work();
        }
    }
}

abstract class Employee{
    abstract void work();
}

class Teacher extends Employee{
    public void work(){
        System.out.println("Teacher works");
    }
}

class Driver extends Employee{
    public void work(){
        System.out.println("Driver works");
    }
}

class Doctor extends Employee{
    public void work(){
        System.out.println("Doctor works");
    }
}