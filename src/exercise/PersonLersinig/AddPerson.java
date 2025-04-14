package exercise.PersonLersinig;
//Create a Person class with fields name and age. Add multiple Person objects to a HashSet, ensuring only unique people (based on name + age) are added.

import java.util.HashSet;
import java.util.Set;

public class AddPerson {

    Set<Person> set = new HashSet<>();
    public void addNewPerson(String name , int age){
        boolean isPresent = false;
        for(Person person : set){
            if(person.getAge() == age || person.getName() == name){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            set.add(new Person(name, age));
        }
    }

    void printSet(){
        for(Person person : set){
            System.out.println("Age is :: "+person.getAge());
            System.out.println("Name is :: "+person.getName());
        }
    }

    public static void main(String[] args) {
        AddPerson addPerson = new AddPerson();
        addPerson.addNewPerson("varun", 10);
        addPerson.addNewPerson("rudra", 20);
        addPerson.addNewPerson("varun", 10);
        addPerson.printSet();


    }
}
