package com.inheritance.multilevel.educationalcoursehierarchy;

public class CourseTest {

    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);
        Course c2 = new OnlineCourse("Spring Boot", 60, "Udemy", true);
        Course c3 = new PaidOnlineCourse(
                "Advanced Java",
                80,
                "Coursera",
                true,
                5000,
                20
        );

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
