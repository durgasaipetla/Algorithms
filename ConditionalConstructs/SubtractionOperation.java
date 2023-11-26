package ConditionalConstructs;
import java.util.*;

public class SubtractionOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number ");
		int a = scan.nextInt();
		System.out.println("enter second number ");
		int b = scan.nextInt();

		if (a > b) {
			System.out.println(b - a);
		} else {
			System.out.println(a - b);
		}
		scan.close();

	}

}
