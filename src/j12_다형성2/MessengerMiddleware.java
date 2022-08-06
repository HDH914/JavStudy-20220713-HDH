package j12_다형성2;

public class MessengerMiddleware {

	private Messenger messenger;
	
	public MessengerMiddleware(Messenger messenger) {
		super();
		this.messenger = messenger;
	}
	
	public void sendMessenger() {
		messenger.send();
	}
	
	public void receiveMessenger() {
		messenger.receive();
	}
	
	public void runAddOns() {
		System.out.println("추가 기능 실행");
		
		if(messenger instanceof KakaoTalk) {
			KakaoTalk kakaoTalk = (KakaoTalk)messenger;
			kakaoTalk.sendPresent();
		} else if(messenger instanceof FacebookMessenger) {
			FacebookMessenger facebookMessenger = (FacebookMessenger)messenger;
			facebookMessenger.call();
		} else {
			System.out.println("다운캐스팅 불가능");
		}
	}
	
	
}
