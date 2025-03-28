package exercise;


//------------------------------------ Palindrome Checker
//Write a method to check whether a string is a palindrome (reads the same forward and backward).
//
//
//                boolean isPalindrome(String str)
//
//
//                Example Input: "racecar"
//                Expected Output: true

public class palindrome_string {

    void ispalindrome(String my_string)
    {
        String rev_my_string = "";
        for(int i = my_string.length()-1;i>=0;i--)
        {
            rev_my_string += my_string.charAt(i);
        }
        if(my_string.equals(rev_my_string))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        palindrome_string pal = new palindrome_string();
        pal.ispalindrome("racecar");

    }
}
