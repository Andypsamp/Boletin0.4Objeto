
package proyecto0.pkg4semáforo;

public class Proyecto04semáforo {

    public static void main(String[] args) {
      //instancio objeto tipo semaforo
        Semaforo sema1= new Semaforo();
        String valor=sema1.dameColor();
        System.out.println("Color antes de darle un valor"+valor);
        sema1.ponColor("verde");
        valor=sema1.dameColor();
        System.out.println("color:"+valor);
        //los dos pasos anteriores resumidos en uno
        System.out.println("color:"+sema1.dameColor());
        
    }
    
}
