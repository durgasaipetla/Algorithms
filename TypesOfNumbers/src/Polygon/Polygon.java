package Polygon;
import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the no of sides of a polygon");
int n = scan.nextInt();
identifyPolygon(n);
}

	public  static void identifyPolygon(int n) {
		switch (n){
		case '3':
			System.out.println("triangle");
			break;
		
	    case 4:
		    System.out.println("Quadrilateral");
		break;
        case 5:
    	    System.out.println("pentagon");
	    break;
	    case 6:
		    System.out.println("Hexagon");
		break;
		default:
			System.out.println("polygon");
		}
	}
	}

