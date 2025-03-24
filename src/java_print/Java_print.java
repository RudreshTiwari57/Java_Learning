package java_print;

public class Java_print {
	public static void main(String[] args)
	{
//		----------------------------using print
//		this don't add new line character at the end of the line
		
		System.out.print("hello ");
		System.out.print("World !");
		
//		----------------------------using println
//		this add new line character at the end of the line
		
		System.out.println("hello ");
		System.out.println("World !");
//		----------------------------using printf
//		this used to print formated line on the console and don't add new line at the end

//				-------------------------------------------------------------------------------------------------------------
//				| Format Specifier	|		Description						|		Example									|
//				-------------------------------------------------------------------------------------------------------------
//				|	%d				|	Integer (decimal)					|	System.out.printf("Age: %d", 25);			|
//				|	%f				|	Floating-point number				|	System.out.printf("Price: %.2f", 99.99);	|
//				|	%s				|	String								|	System.out.printf("Name: %s", "Rudresh");	|
//				|	%c				|	Character							|	System.out.printf("Grade: %c", 'A');		|
//				|	%b				|	Boolean								|	System.out.printf("Status: %b", true);		|
//				|	%x				|	Hexadecimal (integer)				|	System.out.printf("Hex: %x", 255);			|
//				|	%o				|	Octal (integer)						|	System.out.printf("Octal: %o", 8);			|
//				|	%e				|	Scientific notation (exponential)	|	System.out.printf("Value: %e", 1234.567);	|
//				-------------------------------------------------------------------------------------------------------------
		
		
		String name = "Rudresh Tiwari";
		int age = 24;
		System.out.printf("Hello, \nMy name is %s and age %d",name,age);
		
	}

}
