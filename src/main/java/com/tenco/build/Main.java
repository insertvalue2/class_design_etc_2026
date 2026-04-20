package com.tenco.build;

public class Main {

    public static void main(String[] args) {
        // Student
        // Student student = new Student();
        Student student = new Student.
                Builder("길동")
                .age(10)
                .build();

        Student student2 = new Student.Builder("이순신")
                .build();

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
