package studentInformationSystem;

public class Main {

	public static void main(String[] args) {
	
		Teacher t1=new Teacher("Bahadýr Açýkgöz", "05387640345", "TRKC");
	
		Teacher t2=new Teacher("Selçuk Ayrýlmaz", "05328761245", "MTMTK");
		
		Teacher t3=new Teacher("Nesrin Toksöz", "05369118765", "SSYL");
		
		
		Course turkce=new Course("Türkçe", "101", "TRKC");
		//turkce.addTeacher(t1);
		Course matematik=new Course("Matematik","102","MTMTK");
		Course sosyal=new Course("Sosyal", "103","SSYL");
		
		Student s1=new Student("Ümit Serbest", "1198", "A1", turkce,matematik ,sosyal);
		s1.addBulkExamNote(15, 40, 30);
		s1.printNote();
		s1.isPass();
	
		
		
		
		
		
		
	}

}
