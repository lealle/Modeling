package _02_OCP;

public class OcpRun {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
//		Playinterface pi = new Wav();
//		sp.setPlay(pi);
		sp.setPlay(new Wav()); // 한줄로
		sp.play();
		
		sp.setPlay(new Mp3());
		sp.play();
		
		sp.setPlay(new Flac());
		sp.play();
		
	}

}
