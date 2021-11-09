
public class BubbleSort {

	public static void main(String[] args) {
		int array[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			System.out.print("  "+array[i]);
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{						//use swap
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
			
		for(int i=0;i<array.length;i++)
		{ 	
			System.out.println();
			System.out.print("  "+array[i]);
		}
	}

}
