
public abstract class Car {
	
	public  abstract void engine();
	
	public abstract void start();
	
	public abstract void gear();
	
	public void getAll() {
		engine();
		start();
		gear();
	}
}