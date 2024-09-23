package Logical_Programs;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
			count++;
			break;
		}
		}
		if(count==0) {
			System.out.println("Given Number is Prime Number");
		}else {
			System.out.println("Given Number is not Prime Number");
		}
		

		
		}
		
}
	

