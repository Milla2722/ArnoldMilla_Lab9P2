import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class adminFecha extends Thread{
    private JLabel fecha;

    public JLabel getFecha() {
        return fecha;
    }

    public void setFecha(JLabel fecha) {
        this.fecha = fecha;
    }

    
    
    public adminFecha(JLabel fecha) {
        this.fecha = fecha;
    }
    
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("dd//MM//YYYY");
            fecha.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
}
