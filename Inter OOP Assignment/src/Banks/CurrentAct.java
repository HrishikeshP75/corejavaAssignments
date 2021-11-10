package Banks;

public class CurrentAct extends Bank{
	double bal;
	double cc;
	
	public void Act(double bal ,double cc) {
		this.bal=bal;
		this.cc=cc;
	}
	public void disp() {
		System.out.println("Total money in current : "+(bal+cc));
	}
	public double get() {
		return bal+cc;
	}
}