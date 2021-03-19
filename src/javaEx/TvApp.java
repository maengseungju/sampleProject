package javaEx;

public class TvApp {
	public static void main(String[] args) {
		Tv tv = new Tv(7, 20, false);
		tv.status();
		
		tv.power(true);    // tv 전원을 켬
		tv.volume(120);    // tv 볼륨 지정한 값으로 설정
		tv.status();
		
		tv.volume(false);  // tv 볼륨 다운
		tv.status();
		
		tv.channel(17);     // tv 채널 지정한 값으로 설정
		tv.status();
		
		tv.channel(true);  // tv 채널 업
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}
}