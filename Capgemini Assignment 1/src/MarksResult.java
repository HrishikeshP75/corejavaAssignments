import java.util.Scanner;
public class MarksResult {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the following mks - ");
		System.out.print("Enter mks English = ");
		int eng=s.nextInt();
		System.out.print("Enter mks Marathi = ");
		int mata=s.nextInt();
		System.out.print("Enter mks Hindi = ");
		int hid=s.nextInt();
		
		passresult(eng,mata,hid);

	}
	public static void passresult(int eng,int mata,int hid)
	{
		if(eng>60 && mata>60 && hid>60)
		{
			System.out.print("Result is Pass");
		}
		else if((eng>60 && mata>60) || (eng>60 && hid>60) || (mata>60 && hid>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Result is fail");
		}
		
	}

}
