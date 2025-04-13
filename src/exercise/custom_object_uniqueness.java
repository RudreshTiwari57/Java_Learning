package exercise;
//Create a Person class with fields name and age. Add multiple Person objects to a HashSet, ensuring only unique people (based on name + age) are added.

import java.util.HashMap;
import java.util.HashSet;

class Person
{
    private HashSet<HashMap<String,String>> my_class_details = new HashSet<>();
    void insert_person_details(String name, String age)
    {
        boolean status = true;
        for(HashMap<String,String> my_hashmap:my_class_details)
        {
            if(my_hashmap.get("name")==name || my_hashmap.get("age") ==age)
            {
                status = false;
            }
        }
        if(status)
        {
            HashMap<String,String> new_map = new HashMap<>();
            new_map.put("name",name);
            new_map.put("age",age);
            my_class_details.add(new_map);
        }
    }
    void display()
    {
        for(HashMap<String,String> my_hashmap:my_class_details)
        {
            System.out.println("name : "+my_hashmap.get("name")+", age : "+ my_hashmap.get("age"));

        }
    }
}
public class custom_object_uniqueness {
    public static void main(String[] args) {
        Person person = new Person();
        person.insert_person_details("rudresh","23");
        person.insert_person_details("ritu","24");
        person.insert_person_details("tiwari","25");
        person.insert_person_details("rudresh","23");
        person.display();

    }
}
