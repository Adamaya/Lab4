package lab04;

public class Person {
    private String name;
    private int age;
    private char gender;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public Person(String name,int age,char gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }
}
class Main{
    public static void main(String[] args) {
        Person p1=new Person("Dean", 40, 'm');

    }
}
