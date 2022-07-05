
import javax.swing.*;
import java.awt.*;
public class Level4_pannel extends JPanel {
   int y=150,c[]=new int[7];
      int x=0;
     int x1=150,y1=0,y2=-150,x3=-150,y3=0,count=0;
     int x2=0,number=6;
            boolean ok=true,ok1=true,ok2=true,ok3=true;
    boolean ok5[]=new boolean [7];
    int x5[] =new int[7];
    int y5[] =new int[7];
     public Level4_pannel() {
        setBackground(Color.WHITE);
        for(int i = 0 ;i<7;i++)
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
        g.drawString("LEVEL 4", 10, 30);
         g.setFont(new Font("TimesRoman",Font.BOLD, 20)); 
        g.drawString("Number Of Ball   "+number,200 , 520);
        g.setColor(Color.BLACK);
        g.fillOval(225, 125, 120, 120);
          g.setColor(Color.BLACK);
        g.drawLine(225+60,125+60, 225+60+x,125+60+y);
        g.fillOval(225+60+x-12, 125+60+y-12, 24, 24);
        g.drawLine(225+60,125+60, 225+60+x1,125+60+y1);
        g.fillOval(225+60+x1-12, 125+60+y1-12, 24, 24);
        g.drawLine(225+60,125+60, 225+60+x2,125+60+y2);
        g.fillOval(225+60+x2-12, 125+60+y2-12, 24, 24);
        g.drawLine(225+60,125+60, 225+60+x3,125+60+y3);
        g.fillOval(225+60+x3-12, 125+60+y3-12, 24, 24);
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
     void movex()
    {
        if(y1==-145||y1==-147||y1==149||y1==147)
        {
            y1-=2;
            x1=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));
        
        }
        else if(y1==-149||y1==150)
        {
            y1-=1;
            x1=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));

        }
        else
        {

       
        y1-=5;
        
        x1=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));
        } 
        if(y1<=-150)
            ok1=false;
    }
    void movey()
    {
        if(y1==145||y1==147||y1==-149||y1==-147)
        {
            y1+=2;
            x1=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));
        
        }
        else if(y1==149||y1==-150)
        {
            y1+=1;
            x1=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));

        }
        else
        {
        y1+=5;
        x1=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y1, 2)))));
        }
        if(y1>=150)
            ok1=true;
    }
    void movex2()
    {
       if(y2==-145||y2==-147||y2==149||y2==147)
        {
            y2-=2;
            x2=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));
        
        }
        else if(y2==-149||y2==150)
        {
            y2-=1;
            x2=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));

        }
        else
        {

        y2-=5;
        x2=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));
        } 
        if(y2<=-150)
            ok2=true;
    }
    void movey2()
    {
        if(y2==145||y2==147||y2==-149||y2==-147)
        {
            y2+=2;
            x2=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));
        
        }
        else if(y2==149||y2==-150)
        {
            y2+=1;
            x2=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));

        }
        else
        {
        y2+=5;
        x2=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y2, 2)))));
        }
        if(y2>=150)
            ok2=false;
    }
    void movex3()
    {
       if(y3==-145||y3==-147||y3==149||y3==147)
        {
            y3-=2;
            x3=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));
        
        }
        else if(y3==-149||y3==150)
        {
            y3-=1;
            x3=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));

        }
        else
        {

        y3-=5;
        x3=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));
        } 
        if(y3<=-150)
            ok3=true;
    }
    void movey3()
    {
       if(y3==145||y3==147||y3==-149||y3==-147)
        {
            y3+=2;
            x3=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));
        
        }
        else if(y3==149||y3==-150)
        {
            y3+=1;
            x3=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));

        }
        else
        {
        y3+=5;
        x3=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y3, 2)))));
        }      
        if(y3>=150)
            ok3=false;
    }
    void move1()
    {
        if(y==-145||y==-147||y==149||y==147)
        {
            y-=2;
            x=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));
        
        }
        else if(y==-149||y==150)
        {
            y-=1;
            x=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));

        }
        else
        {
        y-=5;
        x=((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));
        } 
        
        if(y==-150)
            ok=false;
    }
    void move2()
    {
        if(y==145||y==147||y==-149||y==-147)
        {
            y+=2;
            x=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));
        
        }
        else if(y==149||y==-150)
        {
            y+=1;
            x=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));

        }
        else
        {
        y+=5;
        x=-((int)Math.round( Math.sqrt((Math.pow(150, 2))-(Math.pow(y, 2)))));
        }
        
        if(y==150)
            ok=true;
    }
     void movex5(int i)
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
    void movey5(int i)
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
