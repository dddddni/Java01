package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		
		studentKim.studentId = 12345;
		studentKim.setStudentName("kim");
		studentKim.address = "서울";
		
		studentKim.showStudentInfo();
		
		Student studentLee = new Student();
		studentLee.studentId = 54321;
		studentLee.studentName = "Lee";
		studentLee.address = "성남";
		
		studentLee.showStudentInfo();
	}

}
