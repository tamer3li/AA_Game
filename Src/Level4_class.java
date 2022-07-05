
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;


public class Level4_class extends JFrame implements ActionListener,KeyListener{

     Level4_pannel f = new Level4_pannel();
     static  boolean run_ball=true;
     static Timer timer,t;
    public Level4_class() {
        
         add(f);
        addKeyListener(this);
         timer = new Timer(10,this);
            t = new Timer(2000,this);
      
        timer.start();
        
        
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AA Game");
        setResizable(false);
        
    }
    void move_rotate()
    {
           if(f.ok1)
        {
            f.movex();
           
        }
        else
        {
            f.movey();
            
        }

       if(f.ok)
        {
            f.move1();
           
        }
        else
        {
            f.move2();
            
        }
        if(f.ok2)
        {
            f.movey2();
           
        }
        else
        {
            f.movex2();
            
        }
         if(f.ok3)
        {
            f.movey3();
           
        }
        else
        {
            f.movex3();
            
        }
      
         f.repaint();
         if(f.c[f.count]==0)
         {
           
            if(f.ok5[f.count])
              {  
               f.movex5(f.count);
           
              }
              else
              {
               f.movey5(f.count);
            
              }  
              
         }
     
         
        for(int i = 0;i<=f.count-1;i++)
        {
             
         
           if(f.ok5[i])
              {  
               f.movex5(i);
           
              }
              else
              {
               f.movey5(i);
            
              }
        }
         
          f.repaint();
       
    }
    void check_intersect()
    {
       if(f.c[f.count]==0)
        {
        if(f.testintersect(225+60+f.x, 125+60+f.y, 225+60+f.x5[f.count],125+60+f.y5[f.count] ))
        timer.stop();
        else if((f.testintersect(225+60+f.x1, 125+60+f.y1, 225+60+f.x5[f.count],125+60+f.y5[f.count] )))
        timer.stop();
        else if((f.testintersect(225+60+f.x2, 125+60+f.y2, 225+60+f.x5[f.count],125+60+f.y5[f.count] )))
       timer.stop();
        else if((f.testintersect(225+60+f.x3, 125+60+f.y3, 225+60+f.x5[f.count],125+60+f.y5[f.count] )))
       timer.stop();
        
        for(int i=0;i<=f.count-1;i++)
        {
           if(f.testintersect(225+60+f.x5[i], 125+60+f.y5[i], 225+60+f.x5[f.count],125+60+f.y5[f.count] ))
       timer.stop();
        }
    }
        for(int i=0;i<=f.count-1;i++)
        {
        if(f.testintersect(225+60+f.x, 125+60+f.y, 225+60+f.x5[i],125+60+f.y5[i] ))
         timer.stop();
        else if((f.testintersect(225+60+f.x1, 125+60+f.y1, 225+60+f.x5[i],125+60+f.y5[i] )))
        timer.stop();
        else if((f.testintersect(225+60+f.x2, 125+60+f.y2, 225+60+f.x5[i],125+60+f.y5[i] )))
        timer.stop();
        else if((f.testintersect(225+60+f.x3, 125+60+f.y3, 225+60+f.x5[i],125+60+f.y5[i] )))
        timer.stop();
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
            t.start();
            
        }
        else if(f.number==0)
        {
            timer.stop();
            f.setBackground(Color.GREEN);
            run_ball=false;
        }
   }
   
    

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==timer)
        {
        move_rotate();
        check_intersect();
        }
        else if(e.getSource()==t)
        {
             run_ball = true;
            t.stop();
            new Level4_class().setVisible(true);
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
