import java.util.*;
public class TaxPay {

	public static void main(String[] args) {
		double tax=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Income = ");
		double sal=s.nextDouble();
		
		if(sal>0 && sal<180000)
		{
			System.out.println("NO TAX for Slab A");
		}
		else if(sal>180000 && sal<300000)
		{
			tax = sal*0.10;
			System.out.println("Slab B's Payable amount is = "+tax);
			
		}
		else if(sal>300000 && sal<500000)
		{
			tax = sal*(0.20);
			System.out.println("Slab C payable amount is = "+tax);
		}
		else if(sal>500000 && sal<1000000)
		{
			tax = sal*(0.30);
			System.out.println("Slab D payable amount is = "+tax);
	
		}
			
		

	}

}
