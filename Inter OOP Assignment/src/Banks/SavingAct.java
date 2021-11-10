package Banks;
public class SavingAct extends Bank{
	double bal=0;
	double fixdip=0;
	
	public void Act(double bal,double fixdip)
	{
		this.bal=bal;
		this.fixdip=fixdip;
		
	}
	public void disp() {
		System.out.println("Total money in Saving :"+(bal+fixdip));
	}
	public double get() {
		return fixdip+bal;
	}
		
}
