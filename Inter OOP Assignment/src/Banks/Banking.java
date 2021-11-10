package Banks;
public class Banking {

	public static void main(String[] args) {
		
		SavingAct s = new SavingAct();
		CurrentAct c = new CurrentAct();
		s.disp();
		c.disp();
		double totalamt=s.get()+c.get();
		System.out.println("the total money in bank : "+totalamt);

	}

}
