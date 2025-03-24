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
//		this used to print formated line on the console
		String name = "Rudresh Tiwari";
		int age = 24;
		System.out.printf("Hello, \nMy name is %s and age %d",name,age);
		System.out.printf("Hello, \nMy name is %s and age %d",name,age);
	}

}
