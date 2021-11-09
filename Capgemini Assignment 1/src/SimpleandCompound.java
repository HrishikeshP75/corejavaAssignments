import java.util.Scanner;
public class SimpleandCompound {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principle Amount = ");
		int pr= s.nextInt();
		System.out.println("Rate of Intrest = ");
		int rt= s.nextInt();
		System.out.println("Duration months = ");
		int time= s.nextInt();
		
		double simple = simpleintrest(pr,rt,time);			//method call stat.
		double compound = compoundinterest(pr,rt,time);
		System.out.println("SIMPLE INTREST IS = "+simple);
		System.out.println("COMPOUND INTREST IS = "+compound);
	}
	public static double simpleintrest(int pr,int rt,int time)
	{
		double si=(pr*rt*time)/100;
		return si; 
	}
	public static double compoundinterest(int pr,int rt,int time)
	{
		double cp= (pr*rt*time)/100;
		return cp;
	}
	
	

}
