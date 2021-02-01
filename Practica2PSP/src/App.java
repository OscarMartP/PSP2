
public class App {

	
   
    
     
    
    public static void main(String[] args) 
    {
    	
    	ColaDeTareas colaDeTareas = new ColaDeTareas();
 
        for(int i = 0; i < 25; i++)
        {
            new Consumidor(colaDeTareas).start();
            new Productor(colaDeTareas).start();
        }
         
       
    }    
}
