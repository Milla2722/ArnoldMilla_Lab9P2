
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class adminBarra extends Thread{
    private JProgressBar barra;
    private int progreso = 0;

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
    
    
    @Override 
    public void run(){
        while(true){
            while(progreso < 1000){
                for (int cont = 0; cont < 1000; cont++) {          
                if(progreso < 1000){
                    progreso ++;
                    barra.setValue(cont);
                }  
                try {
                Thread.sleep(10);
                } catch (InterruptedException ex) {
                Logger.getLogger(adminBarra.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            
            }        
        }
    }
}
