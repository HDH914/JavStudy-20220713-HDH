package j09_클래스2;

public class Student {
	private String studentName;
	private int studentYear;
	private String studentAdrress;
	private String studnetPhone;
	
	//기본 생성자
	public Student() {
		System.out.println("학생 객체(인스턴스를) 생성할 때 호출됨.(NO)");
	}
기
	//전체 생성자
	public Student(String studentName, int studentYear, String studentAdrress, String studentPhone) {
		System.out.println("학생 객체(인스턴스)를 생성할 때 호출됨.(ALL)");
		this.studentName = studentName;
		this.studentYear = studentYear;
		this.studentAdrress = studentAdrress;
		this.studnetPhone = studentPhone;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public String getStudentAdrress() {
		return studentAdrress;
	}

	public void setStudentAdrress(String studentAdrress) {
		this.studentAdrress = studentAdrress;
	}

	public String getStudnetPhone() {
		return studnetPhone;
	}

	public void setStudnetPhone(String studnetPhone) {
		this.studnetPhone = studnetPhone;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentYear=" + studentYear + ", studentAdrress="
				+ studentAdrress + ", studnetPhone=" + studnetPhone + "]";
	}
	
	
	
}
