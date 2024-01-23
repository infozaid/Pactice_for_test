
public class Jaguar extends Mercedez {
	
	private Mercedez mercedez;

	public void setMercedez(Mercedez mercedez) {
		this.mercedez = mercedez;
	}

	public void gear() {
		mercedez.gear();
		System.out.println("ist gear is automatic");
	}

}
