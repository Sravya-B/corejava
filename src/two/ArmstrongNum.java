package two;

import java.util.Scanner;

public class ArmstrongNum {
	int num;
	int a,b;
	
void checkNum(int num) {
	int realValue=num;
	while(num>0) {
		a=num%10;
		num=num/10;
		b=b+(a*a*a);
	//System.out.println(realValue);	
	}
	if(b==realValue) {
		System.out.println("It is an armstrong number");
	}
	else {
		System.out.println("It is not an armstrong number");
	}
}
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	ArmstrongNum arm=new ArmstrongNum();
	System.out.println("Enter the number ");
	arm.checkNum(scan.nextInt());
}
}
