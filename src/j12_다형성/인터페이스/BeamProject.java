package j12_다형성.인터페이스;

public class BeamProject implements VGA{

	@Override
	public void connect() {
		System.out.println("VGA 케이블을 통해 빔프로젝트를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("연결 해제");
	}

}
