package salaryCalculator2;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.id=1;
		emp.employeeName="Kemal";
		emp.hireYear=2000;
		emp.workHours=45;
		emp.salary=1985;
        emp.toStrings();

        
        System.out.print(emp);
	}

}
