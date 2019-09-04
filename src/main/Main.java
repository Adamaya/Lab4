package main;

import lab04.Person;
import lab04.Student;

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dean", 40, 'm');

        Student student = new Student(p1.getName(), p1.getAge(), p1.getGender(), 1234567890L, 6.5);
        System.out.println(student.toString());
//        Person person = new Person("abc", 12, 'm');
//        Student student = new Student("nbek0", 67, 'f', 123L, 0.0);
        //dynamic binding dispatch
    }
}






