import javax.swing.*;
import java.awt.*;
public class Level1_pannel extends JPanel {
       int c[]=new int[11];
     int count=0, number=10;  
    boolean ok5[]=new boolean [11];
    int x5[] =new int[11];
    int y5[] =new int[11];
     public Level1_pannel() {
        setBackground(Color.WHITE);
        for(int i = 0 ;i<11;i++)
        {
            x5[i]=0;
            y5[i]=150;
            c[i]=150;
            ok5[i]=true;
        }
    }
     @Override
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman",Font.BOLD, 30));
        g.drawString("LEVEL 1", 10, 30);
         g.setFont(new Font("TimesRoman",Font.BOLD, 20)); 
        g.drawString("Number Of Ball   "+number,200 , 520);
        g.setColor(Color.BLACK);
        g.fillOval(225, 125, 120, 120);
       
        g.fillOval(225+60+x5[count]-12, 125+60+y5[count]+c[count]-12, 24, 24);
        if(c[count]==0)
        {
           
                g.drawLine(225+60,125+60, 225+60+x5[count],125+60+y5[count]);
                count++;
                number--;
        }
        
        for(int i=0;i<=count-1;i++)
        {
            
           g.fillOval(225+60+x5[i]-12, 125+60+y5[i]+c[i]-12, 24, 24);
                g.drawLine(225+60,125+60, 225+60+x5[i],125+60+y5[i]);
     
            
        }
        
      
    }
     void movex(int i)
    {
      
       if(y5[i]==-145||y5[i]==-147||y5[i]==149||y5[i]==147)
        {
            y5[i]-=2;
            x5[i]=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));
        
        }
        else if(y5[i]==-149||y5[i]==150)
        {
            y5[i]-=1;
            x5[i]=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));

        }
        else
        {
        y5[i]-=5;
        x5[i]=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));
        } 
         
       if(y5[i]<=-150)
            ok5[i]=false;
     
    }
    void movey(int i)
    {
       if(y5[i]==145||y5[i]==147||y5[i]==-149||y5[i]==-147)
        {
            y5[i]+=2;
            x5[i]=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));
        
        }
        else if(y5[i]==149||y5[i]==-150)
        {
            y5[i]+=1;
            x5[i]=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));

        }
        else
        {
         y5[i]+=5;
         x5[i]=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y5[i], 2)))));
        }
            
       if(y5[i]>=150)
            ok5[i]=true;
       
    }
    
    void MoveBall()
    {
       
        c[count]-=150;
        if(c[count]<0)
            c[count]=0;
       
      
    }
  boolean testintersect(int x1,int y2,int xball,int yball)
  {
    double length = Math.sqrt((Math.pow((x1-xball), 2))+(Math.pow((y2-yball), 2)));
    
    if(length<=24.0)
        return true;
    else
        return false;
  }
    
}
