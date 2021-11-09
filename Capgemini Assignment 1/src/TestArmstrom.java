
public class TestArmstrom {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int temp=num;
		int count=0;
		int num2=num;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		while(num>0)
		{	
			
			int rem=num%10;		//last digit each iteration---
			sum=sum+cube(rem,count);
			num/=10;
			
		}
		if(sum==num2)
		{
			System.out.println("THIS IS ARMSTROM NUMBER");
		}
		else
		{
			System.out.println("THIS IS NOT ARMSTROM NUMBER");
		}

	}
	public static int cube(int num,int count)
	{
		int res=1;
		while(count>0)
		{
			res=res*num;
			count--;
			
		}
		return res;
	}

}
