
public class Consumidor extends Thread {

	private final ColaDeTareas colaDeTareas;
    

	public Consumidor(ColaDeTareas colaDeTareas) {
		super();
		this.colaDeTareas = colaDeTareas;
	}



	public void run() 
    {
    	colaDeTareas.consumiendo();
    }
}
