package studentInformationSystem;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	Course(String name,String code, String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
		
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher=teacher;
			printTeacher();
		}
		else {
			System.out.println("Bu dersin öðretmeni ve bölümü uyuþmuyor.");
		}
		
		
	}
	void printTeacher() {
		teacher.print();
	}
}
