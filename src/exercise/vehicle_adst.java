package exercise;

abstract class vehicle{
    abstract void create();
}
class Bike extends vehicle
{
    void create()
    {
        System.out.println("Bike created");
    }
}

class Car extends  vehicle
{
    int numberofwheels()
    {
        return 2;
    }
    void create()
    {
        System.out.println("Car created");
    }
}

class vehicle_factory
{
    static vehicle getvehicle(String type)
    {
        if (type.equalsIgnoreCase("car"))
        {
            return new Car();
        }
        if (type.equalsIgnoreCase("bike"))
        {
            return new Bike();
        }
        return null;
    }
}
public class vehicle_adst {


    public static void main(String[] args) {
        vehicle car = vehicle_factory.getvehicle("CAr");
        vehicle bike = vehicle_factory.getvehicle("Bike");

        if(car != null) car.create();
        if (bike!=null) bike.create();


    }



}
