package com.inheritance.introduction.employeemanagementsystem;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager("Pratham", 101, 80000, 5);
        Employee e2 = new Developer("Harsh", 102, 60000, "Java");
        Employee e3 = new Intern("Deepika", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
