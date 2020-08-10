import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class NewGUI implements ActionListener
{ 
    JFrame frm;
    JLabel title, label;
    JButton button;
    int count;
    
    public NewGUI(){
        //FRAME CREATION
        frm = new JFrame("New GUI");
        frm.setLayout(null);
        frm.setSize(800,600);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        //TITLE CREATION
        title=new JLabel("CLICK COUNTER");
        title.setBounds(200,20,550,50); 
        title.setFont(new Font("Serif",Font.PLAIN,50));
        title.setForeground(Color.RED);
        frm.add(title);
        
        
        //BUTTON CREATION
        button = new JButton("Click Here");
        button.setBounds(100,150,100,40);
        frm.add(button);
        button.addActionListener(this);
        
        
        //Label below button 
        label= new JLabel("Total number of Clicks is: 0");
        label.setBounds(100,200,500,30);
        frm.add(label);
        
    }
    
    public void actionPerformed(ActionEvent e)
   {
       count++;
       label.setText("Total number of Clicks is: "+count);
    }
}
        
   