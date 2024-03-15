
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class adminHora extends Thread{
    private JLabel hora;
    
    public adminHora(JLabel hora) {
        this.hora = hora;
    }        

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    
    
    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
}
