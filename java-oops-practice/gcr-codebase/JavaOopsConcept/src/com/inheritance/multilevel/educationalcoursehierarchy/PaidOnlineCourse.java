package com.inheritance.multilevel.educationalcoursehierarchy;


public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee  : ₹" + fee);
        System.out.println("Discount   : " + discount + "%");
        System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
    }
}
