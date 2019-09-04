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
        setGender(gender);
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("my name is " + getName());
        response.append("I am a " + (String.valueOf(getGender()).equalsIgnoreCase(Character.toString('m')) ? "male" : "female"));
        response.append(getGender());
        return response.toString();
    }
}

/* strings are immutable by default*/
