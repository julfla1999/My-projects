package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Harry", new Teacher("Dumbledore")));
        students.add(new Student("Ron", null));
        students.add(new Student("Draco", new Teacher("Snape")));
        students.add(new Student("Hermione", new Teacher("McGonagall")));
        students.add(new Student("Luna", null));


        for(Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String name = optionalTeacher.orElse(new Teacher("undefined")).getName();
            System.out.println("Student: " + student.getName() + " , teacher: " + name);
        }

    }
}
