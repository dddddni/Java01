package ch09;

public class Student {
	
	public String studentName;
	public int studentId;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score)
	{
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubeject(String name, int score)
	{
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo()
	{
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "입니다." );
	}
	
	
}
