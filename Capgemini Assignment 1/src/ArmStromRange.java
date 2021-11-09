public class ArmStromRange {

	public static void main(String[] args) {
		int n1=100,n2=999;
	
		while(n1<n2)
		{
			int count=0;
			int num1=n1;
			int num2=n1;
			int temp=n1;
			int sum=0;
		while(num1>0)
		{
			count++;
			num1/=10;
		}
		while(num2>0)
		{	
			
			int rem=num2%10;		//last digit each iteration---
			sum=sum+cube(rem,count);
			num2/=10;
			
		}
		if(sum==temp)
		{
			System.out.println(temp);
		}
		
		
		n1++;
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

