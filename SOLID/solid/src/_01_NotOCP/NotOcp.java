package _01_NotOCP;

class SoundPlayer {
	void playWav() {
		System.out.println("play  wav");
	}
	
	void playMp3() {
		System.out.println("play  mp3");
	}
	void playFlac() {
		System.out.println("play  flac");
	}
	// 클래스의 메소드가 바뀜 클래스가 바뀐것
	// OCP 의 원칙 변경되거나 바뀌면 안좋다
	// 수정에 대해 닫혀있어야함 
}


public class NotOcp {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		sp.playWav();
		sp.playMp3();
		sp.playFlac();
	}

}
