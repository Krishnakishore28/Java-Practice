package live;

import music.Playable;
import music.string.Veena;

public class Test {
	public static void main(String args[]) {
		Playable veena=new Veena();
		Playable saxophone=new music.wind.Saxophone();
		veena.play();
		saxophone.play();
	}

}
