package exercise;

//Write a program to categorize a person’s age into:
//            Child (0-12)
//            Teenager (13-19)
//            Adult (20-59)
//            Senior (60+)


import java.util.Scanner;

public class persons_age_conditions {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int age_of_person = scanner.nextInt();
        if (age_of_person >= 0 && age_of_person<=12)
        {
            System.out.println("Child");
        }
        else if(age_of_person >= 13 && age_of_person<=19)
        {
            System.out.println("Teenager");
        }
        else if(age_of_person >= 20 && age_of_person<=59)
        {
            System.out.println("Adult");
        }
        else if(age_of_person >= 60)
        {
            System.out.println("Senior");
        }
    }

}
