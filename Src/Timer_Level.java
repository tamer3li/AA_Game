
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Timer_Level implements ActionListener{

    int Level_number ;
    

    public Timer_Level(int x) {
        Level_number = x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(Level_number==2)
        {
            Level1_class.t.stop();
            new Level2_class().setVisible(true);
           
        }
    }
    
}
