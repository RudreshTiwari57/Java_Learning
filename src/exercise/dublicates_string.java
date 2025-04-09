package exercise;

public class dublicates_string {

    static String remove_dublicates(String my_sting)
    {
        String my_new_string = "";
        for(int i = 0;i<my_sting.length();i++)
        {
            if(my_new_string.indexOf(my_sting.charAt(i))==-1)
            {
                my_new_string += my_sting.charAt(i);
            }
        }
        return my_new_string;
    }
    public static void main(String[] args) {
        String my_string = "rruuddaa";
        System.out.println(dublicates_string.remove_dublicates(my_string));

    }
}
