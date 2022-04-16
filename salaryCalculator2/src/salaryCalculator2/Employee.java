package salaryCalculator2;

public class Employee {
	int id;
	String employeeName;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee() {}
	public Employee(int id, String employeeName, double salary, int workHours, int hireYear) {
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	double tax() {
		if(this.salary>1000) {
			return this.salary * 0.03;
		}
		else {
			return 0;
		}
	}
	
	
	double bonus() {
		
		if(this.workHours>40) {
			int totalBonus=(this.workHours-40)*30;
				return totalBonus;
			}
		
		
			return 0;
		
	}
	
	
	
	double raiseSalary() {
		double tempSalary=this.salary;
		int totalYear=2021-this.hireYear;
		if(totalYear<10) {
			return tempSalary*0.05;
		}
		else if(totalYear>9 && totalYear<20) {
			return tempSalary*0.10;
		}
		else if(totalYear>19) {
			return tempSalary*0.15;
		}
		else return 0;
	}
	
	
	public void toStrings() {
		System.out.print("---------------------------");
		System.out.print("Adý: "+ this.employeeName);
		System.out.print("Maaþý: "+ this.salary);
		System.out.print("Ýþe baþlama tarihi: "+ this.hireYear);
		System.out.print("Çalýþma saati: "+ this.workHours);
		System.out.println("Vergi Miktari: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Zammi : " + raiseSalary());
        System.out.println("Bonus ve Vergi ile Maas Miktari: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maas: " + (this.salary + raiseSalary()));
	}
	
}
