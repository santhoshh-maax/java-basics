package day8;

public class employee {
			int empid = 1234;
			String empname = "santhosh";
			static String companyname = "GOV TECH";
			
			void display(int id, String name) {
				System.out.println("employeeid: "+id+"\temployeename: "+name+" \tcompanyname: "+companyname);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee.companyname="ST engineering"; // changing company name with ST engineering
		employee e = new employee();
		e.display(e.empid,e.empname);
		e.display(9870,"shubin");
		e.display(3456,"jb");
		e.display(9567,"Rx");
		e.display(2020,"vishnu");
		
		

	}

}
