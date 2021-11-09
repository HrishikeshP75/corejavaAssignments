//import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		int array[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		//System.out.print("Enter the number to search = ");
		//int num= s.nextInt();
		int num=19;
	
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
			  System.out.println("number is present "+"  at index "+"  "+i);	
			}
			
		}

	}

}
