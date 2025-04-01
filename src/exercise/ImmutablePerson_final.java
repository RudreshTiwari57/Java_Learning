package exercise;


//Write a final class called ImmutablePerson with:
//        A final String variable name.
//        A constructor that initializes name.
//        A getter method to retrieve name.
//        Try modifying name after object creation. What happens?


final class ImmutablePerson{
    final private String Name;
    ImmutablePerson(String name)
    {
        this.Name = name;
    }
    public String getname()
    {
        return this.Name;
    }


}
public class ImmutablePerson_final {
    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("Rudresh Tiwari");
        System.out.println(immutablePerson.getname());
    }
}
