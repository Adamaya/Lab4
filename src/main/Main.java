package main;

import lab04.Person;
import lab04.Student;

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dean", 40, 'm');

        Student student = new Student(p1.getName(), p1.getAge(), p1.getGender(), 1234567890L, 6.5);

    }
}






