 abstract class Employee{			//emp class
  abstract public void salary();
   
}


class Manager extends Employee{      //manager class
	int sal,incent;
	public Manager(int sal,int incent)
	{
		this.sal=sal;
		this.incent=incent;
	}
	public void Salary() {
		System.out.println("Manager salaray = "+(sal+incent));
	}
	public int get() {
		return sal+incent;
	}
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}
}


 class Labour extends Employee{ 		//class labour
	int ot;
	int labsal;
	public Labour(int labsal,int ot) {
		this.labsal=labsal;
		this.ot=ot;
	}
	public void Salaray() {
		System.out.println ("Labour slaray = "+(labsal+ot));
		
	}
	public int get() {
		return labsal+ot;
	}
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}
}



public class OrgApp1 {

	public static void main(String[] args) {
		
		Manager m= new Manager(5000,1000);
		Labour l = new Labour(150,40);
		m.salary();
		l.salary();
		int totalsal=m.get()+l.get();
		System.out.println("Total salaray of all employees = "+totalsal);
		

	}

}
