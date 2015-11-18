
package pkglogica;
import javax.swing.JProgressBar;

/**
 *
 * @author GustavoF
 */
public class  clsCargar extends Thread {
    JProgressBar progreso;

    public clsCargar(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }
    @Override
    public void run(){
    for(int i=1;i<=100;i++){
        progreso.setValue(i);
        pausa(100);
    }
    }
    public void pausa(int mlSeg){
        try{
        Thread.sleep(mlSeg);
        
        }catch(Exception e){
                }
        }
    
    
}
