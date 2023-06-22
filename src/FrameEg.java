
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
public class FrameEg implements ActionListener{
    public int count = 0;
    public JLabel label;
    public JFrame frame;
    public JPanel panel;
    public JButton button;

    public FrameEg(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click");
        button.addActionListener(this);
        label = new JLabel("Number of Clicks " +count);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Graphical User Interface");
        //frame.setSize(300, 100);
        frame.pack();
        frame.setVisible(true);


        
    }
    public static void main(String [] args){
        FrameEg frameEg = new FrameEg();
        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of counts "+count);
        
    }
   
        
 
   
    
}
