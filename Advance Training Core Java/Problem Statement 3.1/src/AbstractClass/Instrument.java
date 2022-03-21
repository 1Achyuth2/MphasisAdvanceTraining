package AbstractClass;

public abstract class Instrument {
	public abstract void play();
}
class Piano extends Instrument {
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");
	}
}
class Flute extends Instrument {
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends Instrument {
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");

	}

}