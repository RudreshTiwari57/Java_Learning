package java_print;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;



public class data_types {

	public static void main(String[] args) {
		
//	there are 2 data types in java:
//		1. Primitive Data Types
//		2. Non-Primitive Data Types
//		------------------------------------- 1. Primitive Data Types
//		Primitive data type directly stores value and with the fixed size
//				-------------------------------------------------------------------------------------------------------------
//				|	Data Type   | 	Size	|		Example				|			Description								|
//				-------------------------------------------------------------------------------------------------------------
//				|	byte		| 1 byte	|	byte a = 100;			|	-128 to 127 is the storage range				|
//				|	short		| 2 bytes	|	short b = 32000;		|	-32,768 to 32,767 								|
//				|	int			| 4 bytes	|	int c = 123456;			|	Most commonly used integer type					|
//				|	long		| 8 bytes	|	long d = 123456789L;	|	Bade numbers ke liye (L as postfix is important)|
//				|	float		| 4 bytes	|	float e = 12.34f;		|	Decimal numbers ke liye (f lagana zaroori hai)	|
//				|	double		| 8 bytes	|	double f = 12.3456789;	|	Precise decimal numbers ke liye					|
//				|	char		| 2 bytes	|	char g = 'A';			|	Single character store karta hai				|
//				|	boolean		| 1 bit		|	boolean h = true;		|	Sirf true ya false store karta hai				|
//				-------------------------------------------------------------------------------------------------------------
		
//		------------------------------------- a. int
//		 All the numerical values in java are know as integer denoted by int but they don't store any decimal values.
		
		int i = 10;
		System.out.printf("%d\n",i);
		
//		------------------------------------- b. float
//		All the decimal values are store in java a float 
		
		float j = 10.10f;
		System.out.printf("%.2f\n", j);
		
//		-------------------------------------- c. long
		long k =  1234567654321432498l;
		System.out.printf("%d\n", k);
		
//		--------------------------------------- d. double
		double f = 12345.12345;
		System.out.printf("%.5f\n", f);
		
//		--------------------------------------- e. char
		char a = 'A';
		System.out.printf("%c\n", a);
		
//		----------------------------------------f. boolean
		boolean s = true;
		System.out.printf("%b\n",s);
		
		
//		------------------------------------- 2. Non-primitive Data Types
//		In Java, non-primitive data types (also called reference types) refer to objects and store memory addresses rather than the
//		actual data. Unlike primitive types (int, char, double, etc.), non-primitive types are created by the programmer and can hold 
//		multiple values.


//		Types of Non-Primitive Data Types in Java
//		------------------------------------ a. String (Immutable sequence of characters)
//		Example:

		String name = "Rudresh";
		System.out.println(name.toUpperCase()); // Output: RUDRESH



//		---------------------------------------- b. Arrays (Fixed-size collection of elements of the same type)
//		Example:

		int[] numbers = {10, 20, 30, 40};
		System.out.println(numbers[2]); // Output: 30


//		------------------------------------------------ c. Collections (List, Set, Map, Queue)
//		Collections in Java provide dynamic data structures.
//
//				List (Ordered, allows duplicates)

		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Alice");


//				Set (Unordered, no duplicates)

		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Alice");
		uniqueNames.add("Bob");
		uniqueNames.add("Alice");
		System.out.println(uniqueNames); // Output: [Alice, Bob]

//				Map (Key-Value Pair)

		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Alice");
		students.put(2, "Bob");
		System.out.println(students.get(1)); // Output: Alice


	}

}
