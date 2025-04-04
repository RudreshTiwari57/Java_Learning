package java_advance;

//Java enum is a powerful feature that provides type safety, predefined constant values,
//and the ability to include additional functionality like constructors, methods, and fields.
//Let’s take a deep dive into Java Enums.

//------------------------------------------------ 1. Basics of Java Enums
//        In Java, an enum is a special data type used to define a set of named constants.

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
//            Enums are implicitly final and static.
//            They can be used in switch statements.
//            They provide type safety compared to integer constants.


//------------------------------------------------ 2. Adding Fields and Methods to Enums
//Enums can have fields, constructors, and methods.

enum Status {
    SUCCESS(200, "Request Successful"),
    ERROR(500, "Internal Server Error"),
    NOT_FOUND(404, "Resource Not Found");

    private final int code;
    private final String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

public class enums {

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);

        Status status = Status.SUCCESS;
        System.out.println("Code: " + status.getCode() + ", Message: " + status.getMessage());
    }
}
