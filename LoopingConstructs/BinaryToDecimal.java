package com.kodnest.training.LoopingConstructs;
import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binarycode  to find its decimal code");
		int bin= sc.nextInt();
		int dec =0;
		int powf=1;
		while(bin!=0)
		{
			dec=dec+powf*(bin%10);
			powf =powf*2;
			bin =bin/10;
			}
		System.out.println("The binary code is "+dec);

}
}


//int i=0;
//int s=11010;
		//int sum=0;
		//while(s>0){
		//int rem=s%10;
		//sum=sum+rem*(int)Math.pow(2,i);
		//i++;
		//s=s/10;
		//}
		//System.out.println(sum);
	
	