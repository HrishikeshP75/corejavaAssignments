package Stringexample;

public class StringUppLOw {

	public static void main(String[] args) {
		
		String str = "Wellcome to Capgemini India";
		
		str = str.toUpperCase();		//new string with upperchar
		System.out.println(str);
		
		
		str = str.toLowerCase();
		System.out.println(str);			//new String with lower char
		
		int len = str.length();
		System.out.println(len);	//gives length of staring
		
		
		//char array[]=s.toCharArray();	//to convert string to array char
	}

}
