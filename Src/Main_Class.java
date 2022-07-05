
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_Class extends JFrame implements ActionListener{
     JButton Startplay = new JButton("Start Play");
     JButton cancel = new JButton("Cancel");
     JLabel p = new JLabel(new ImageIcon("image/AA1.png"));
     JPanel main = new JPanel();
     JPanel r = new JPanel();
     Color butt = new Color(77, 210, 255);
    public Main_Class() {
        
        cancel.setBackground(butt);
        Startplay.setBackground(butt);
        r.add(cancel);
        r.add(Startplay);
        main.setLayout(new BorderLayout());
        main.add(r, BorderLayout.SOUTH);
        main.add(p, BorderLayout.CENTER);
        main.setBackground(Color.WHITE);
        r.setBackground(Color.WHITE);
      
        add(main);
       cancel.addActionListener(this);
       Startplay.addActionListener(this);
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AA Game");
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== cancel)
        {
            this.dispose();
        }
        else if(e.getSource()==Startplay) 
        {
            new Level1_class().setVisible(true);
            this.dispose();
        }
    }
   
       
    
}
