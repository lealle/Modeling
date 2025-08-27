package _02_OCP;

public class SoundPlayer {
	private Playinterface playInter;

	public Playinterface getPlay() {
		return playInter;
	}

	public void setPlay(Playinterface play) {
		this.playInter = play;
	}
	
	public void play() {
		this.playInter.play();
	}
}
