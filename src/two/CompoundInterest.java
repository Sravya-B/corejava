package two;

import java.util.Scanner;

public class CompoundInterest {
	double p;
	int n;
	double r;
	int t;
	//double simple;
	public void simpleInterest(double p,int t,double r) {
		double simple=(p*t*r)/100;
		System.out.println("Simple interest is " +simple);
	}
	public CompoundInterest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompoundInterest(double p, int n, double r, int t) {
		super();
		this.p = p;
		this.n = n;
		this.r = r;
		this.t = t;
	}
	public void compoundInterest() {
		double comp=p*Math.pow(1+(r/n), n*t);
		System.out.println("Compound interest is "+comp);
	}
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	CompoundInterest cmd=new CompoundInterest();
	System.out.println("Enter p,t,r values respectively :");
	cmd.simpleInterest(scan.nextInt(),scan.nextInt(),scan.nextInt());
	CompoundInterest cmd1=new CompoundInterest(10000,2,3,5);
	cmd1.compoundInterest();
}
}
