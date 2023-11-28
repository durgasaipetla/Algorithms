package ProgrammingDay;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
Scanner scan =new Scanner (System.in);
System.out.println("enter the any product code ie....P01,P02,P03,P04,P05");
String productCode= scan.next();
getProduct(productCode);
}


public static void getProduct(String productCode) {
	if (productCode.equals("P01")){
		System.out.println("Coco-cola");
	}
	else if (productCode.equals("P02")) {
		System.out.println("Sprite");
	}
	else if (productCode.equals("P03")){
		System.out.println("Mountain");
	}
	else if (productCode.equals("P04")) {
		System.out.println("Thumsup");
	}
	else if (productCode.equals("P05")) {
		System.out.println("Slice");
	}
	else   {
		System.out.println("GO AND DRINK MILK");
	}
	
}
}
