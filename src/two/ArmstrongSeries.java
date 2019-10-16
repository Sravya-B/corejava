package two;

public class ArmstrongSeries {
	 
	public static void main(String[] args) {
		int i;
		
			
		for(i=100;i<1000;i++) {
			 int temp=i;
			 int b=0;
			 int number=temp;
				int sum=0;
			while(temp>0) {
		b=temp%10;
		temp=temp/10;
		sum=sum+(b*b*b);
			}
		
		if(number==sum) {
			System.out.println(number);
		}
	
		}
	}

}
