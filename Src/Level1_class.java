
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Level1_class extends JFrame implements ActionListener,KeyListener{

     Level1_pannel f = new Level1_pannel();
     static  boolean run_ball=true;
     static Timer timer,t,t2;
    public Level1_class() {
        
         add(f);
        addKeyListener(this);
         timer = new Timer(50,this);
        timer.start();
           t = new Timer(2000,this);
          t2 = new Timer(2000,this);
      
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AA Game");
        setResizable(false);
        
    }
   
    void move_rotate()
    {
           if(f.c[f.count]==0)
         {
           
            if(f.ok5[f.count])
              {  
               f.movex(f.count);
           
              }
              else
              {
               f.movey(f.count);
            
              }  
              
         }
     
         
        for(int i = 0;i<=f.count-1;i++)
        {
             
         
           if(f.ok5[i])
              {  
               f.movex(i);
           
              }
              else
              {
               f.movey(i);
            
              }
        }
         
          f.repaint();
      
    }
    void check_intersect()
    {
          if(f.c[f.count]==0)
        {
       
        for(int i=0;i<=f.count-1;i++)
        {
           if(f.testintersect(225+60+f.x5[i], 125+60+f.y5[i], 225+60+f.x5[f.count],125+60+f.y5[f.count] ))
       timer.stop();
        }
    }
        for(int i=0;i<=f.count-1;i++)
        {
            for(int j=0;j<=f.count-1;j++)
            {
                if(i==j)
                    continue;
             if((f.testintersect(225+60+f.x5[j], 125+60+f.y5[j], 225+60+f.x5[i],125+60+f.y5[i] )))
                 timer.stop();
             }
                
        }
        if(!timer.isRunning())
        {
            f.setBackground(Color.RED);
            run_ball=false;
            t2.start();
            
        }
        else if(f.number==0)
        {
            timer.stop();
            f.setBackground(Color.GREEN);
            run_ball=false;
             t.start();
        }
      
      
         
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== timer)
        {
        move_rotate();
        check_intersect();
        }
        else if(e.getSource()==t)
        {
            t.stop();
            new Level2_class().setVisible(true);
            this.dispose();
        }
         else if(e.getSource()==t2)
        {
            t2.stop();
            run_ball = true;
            new Level1_class().setVisible(true);
            this.dispose();
        }
       
     }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
         if(e.getKeyCode()== KeyEvent.VK_SPACE&&run_ball )
        {
         
        
               f.MoveBall();
              f.repaint(); 
       
         }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
