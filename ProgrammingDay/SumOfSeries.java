package ProgrammingDay;
import java.util.Scanner;

public class SumOfSeries {
public static void SumOfSeriesCalculator(int n){
	double  sum =0;
	for (int i=1; i<=n; i++) {
		sum =sum+(1.0/i);
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number to find the sum of series ");
	int n = scan.nextInt();
SumOfSeriesCalculator(n);
scan.close();
}
}

