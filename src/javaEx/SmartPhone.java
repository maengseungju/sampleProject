package javaEx;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("앱".equals(str)) {
			App();
		} else {
			super.execute(str);
		}

	}

	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	public void App() {
		System.out.println("앱실행");
	}

	public void call() {
		System.out.println("밀어서 통화시작");
	}
}
