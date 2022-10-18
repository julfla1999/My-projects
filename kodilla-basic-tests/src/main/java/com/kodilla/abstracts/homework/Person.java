package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Person jon = new Person("Jon", 35, new Vet());
        System.out.println("This is " + jon.firstName + ". His responsibilities as a vet are: " );
        jon.job.showResponsibilities();

        Person anna = new Person("Anna", 40, new Teacher());
        System.out.println("This is " + anna.firstName + ". Her responsibilities as a teacher are: ");
        anna.job.showResponsibilities();

        Person matt = new Person("Matt", 28, new Firefighter());
        System.out.println("This is " + matt.firstName + ". His responsibilities as a firefighter are: ");
        matt.job.showResponsibilities();
    }


}
