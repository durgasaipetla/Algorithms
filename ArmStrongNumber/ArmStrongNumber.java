package ArmStrongNumber;

public class ArmStrongNumber {
public int armStrongChecker(int n) {
	int count =0;
	int org =n;
	while(n>0) {
	n=n/10;
	count++;
	}
	int arm=0;
	while(org>0) {
	int rem=org%10;
	arm = arm+(int)Math.pow(rem,count);
	org =org/10;
	}
	
	return arm;
}
}
