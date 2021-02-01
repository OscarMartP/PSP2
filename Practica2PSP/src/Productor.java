

public class Productor extends Thread{
	
	
    private final ColaDeTareas colaDeTareas;
    
    
    public Productor(ColaDeTareas colaDeTareas) {
		super();
		this.colaDeTareas = colaDeTareas;
	}
    
    public void run() 
    {
    	colaDeTareas.produciendo();
    }
}
