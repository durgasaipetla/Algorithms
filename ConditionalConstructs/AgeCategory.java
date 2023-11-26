package ConditionalConstructs;
import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter age to know the category");
			int age = scan.nextInt();
			ageCategory(age);
	}
			public static void ageCategory(int age) {
			if ( age>=0&& age<=12) 
			{
				System.out.println("Child");
			}
			else if ( age>=13&& age<=19) {
				System.out.println("Teen");
			}
			else if ( age>=20&& age<=59) {
				System.out.println("Adult");
			}
			else if (age>=60 && age<=90){
				System.out.println("Senior citizen");
			}
			else {
				System.out.println("Wow Have a day ");
			}
			
	}

}
