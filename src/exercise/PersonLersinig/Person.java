package exercise.PersonLersinig;

import lombok.Data;

//@Data
public class Person {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
