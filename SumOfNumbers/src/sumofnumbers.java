import java.util.Scanner;

public class sumofnumbers {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the n");
		    int n = scan.nextInt();
		    int sum=0;
		    for(int i=0; i<=n; i++) {
		    	sum= sum+i;
		    }
		    System.out.println(sum);
			}

	}

