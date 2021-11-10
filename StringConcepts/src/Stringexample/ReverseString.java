package Stringexample;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="Welcome to Capgemini India"; // declare initilization literal String
		String strArray[]= str.split(" "); 	//split String into store in array
		    // System.out.print(strArray[0]); 	//welcome will be printed
		for (String temp: strArray) {		//for each loop 
		System.out.println(temp);
		}
   
		for(int i=0;i<4;i++)
		{
			char s1[]= strArray[i].toCharArray(); //to enter all content from strArray to s1
			for(int j=s1.length-1;j>=0;j--)
			{System.out.print(s1[j]);}
			System.out.print(" ");
		}
	}

}
