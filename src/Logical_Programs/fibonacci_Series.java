package Logical_Programs;

public class fibonacci_Series {

	public static void main(String[] args) {
	int num=10;
	int num1=0;
	int num2=1;
	int sum=0;
	for(int i=1;i<=num;i++) {
	System.out.print(num1+" ");
	sum=num1+num2;
	num1=num2;
	num2=sum;
}
	}
	
}