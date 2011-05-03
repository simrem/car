package no.citrus.example;

public class Wheel implements WheelInterface{

	private final Tyre tyre;

	public Wheel(Tyre tyre){
		this.tyre = tyre;
		
	}
	
	public boolean spin() {
		return true;
	}

	public Tyre getTyre() {
		
		return tyre;
	}

}
