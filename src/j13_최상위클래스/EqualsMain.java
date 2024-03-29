package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "김준일");
		Student s2 = new Student(20220001, "김준일");
		Student s3 = new Student(20220002, "김준이");
		Student s4 = new Student(20220002, "김준일");
		
		System.out.println(s1 == s2);		//주소값 비교
		System.out.println(s1.equals(s2));	//객체값 비교
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.getClass() == s2.getClass());
		// =
		System.out.println(s1 instanceof Student);
		
		System.out.println(s1.getClass() == Student.class);  //이걸 사용
		System.out.println(s2.getClass());
		System.out.println(s3.getClass());
		

		
	}

}
