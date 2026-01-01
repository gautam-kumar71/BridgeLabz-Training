package com.inheritance.hierarchial.schoolsystem;


public class SchoolTest {

    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Amit", 15, "10th");
        Staff st = new Staff("Ramesh", 35, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}
