package practice;

public class infoemp {

	public static void main(String[] args) {
		
		Emp mohit=new Emp();
		mohit.empName = "Mohit";
		mohit.empID = 112;
		Emp.empCEOname = "Rahul";
		
		
		Emp kishor=new Emp();
		kishor.empName = "Kishor";
		kishor.empID = 113;
		Emp.empCEOname = "Rahul";
		
		Emp anand=new Emp();
		anand.empName = "Annad";
		anand.empID = 114;
		Emp.empCEOname = "Rahul";
		
		Emp ketan=new Emp();
		ketan.empName = "Ketan";
		ketan.empID = 115;
		Emp.empCEOname = "Kunal";
		
		mohit.empInfo();
		kishor.empInfo();
		anand.empInfo();
		ketan.empInfo();
		
	}
}
