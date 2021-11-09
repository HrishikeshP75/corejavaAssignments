import java.util.*;
public class LoginPassWord {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String username="",passwoard="";
		int count = 0;
		
		do {
			System.out.println("Enter user name = ");
			String un = s.next();
			System.out.println("Enter password = ");
			String ps = s.next();
			
			if(ps.equals("Admin"))		//check equal to enter value
			{
				System.out.println("----Wellcome Hrishi ---");
				return;
			}
			else
			{
				System.out.println("Invalid password!! try again ");
				count++;
			}
		
		}while(count<3);
		System.out.println("Contact Admin");

	}

}
