import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColaDeTareas {

	private List<Integer> listaProductos;
    
    
    public ColaDeTareas() {
    	listaProductos = new ArrayList<>();
    }
    
    
    public synchronized void produciendo()
    {
        while (listaProductos.size() == 25)
        {
        	try
            {
        		notify();
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en get -> " + e.getMessage());
            }
        }
        listaProductos.add(new Random().nextInt(301));
        System.out.println("Productor produce: " +  listaProductos.get(listaProductos.size() - 1));
        notify();
        
    }
 
   
    public synchronized void consumiendo() 
    {
        while (listaProductos.size() == 0)  
        {
            try
            {
            	notify();
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en put -> " + e.getMessage());
            }
        }
        System.out.println("Consumidor consume: " + listaProductos.get(0));
        listaProductos.remove(0);
        notify();
    }
    
}
