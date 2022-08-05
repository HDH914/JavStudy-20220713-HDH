package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Samsung[] samsungs = new Samsung[3];
		samsungs[0] = new Samsung(1);
		samsungs[1] = new Samsung(2);
		samsungs[2] = new Samsung(3);
		
		
		LG[] lgs = new LG[3];
		lgs[0] = new LG(1);
		lgs[1] = new LG(2);
		lgs[2] = new LG(3);
		
		System.out.println("삼성공장가동");
		for(int i = 0; i < samsungs.length; i++) {			
			samsungs[i].start();
		}
		System.out.println();
		System.out.println("삼성공장중지");
		for(int i = 0; i < samsungs.length; i++) {			
			samsungs[i].stop();
		}
		System.out.println();
		System.out.println("LG공장가동");
		for(int i = 0; i < lgs.length; i++) {			
			lgs[i].start();
		}
		System.out.println();
		System.out.println("LG공장중지");
		for(int i = 0; i < lgs.length; i++) {			
			lgs[i].stop();
		}
		
		
		
	}

	

}
