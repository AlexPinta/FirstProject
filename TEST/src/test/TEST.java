package test;

import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;



public class TEST {
    
    public static void main(String[] args) {
        
        JFrame Frame = new JFrame("Good start");   
        JButton Button_OK = new JButton("OK");
        FlowLayout FL = new FlowLayout(FlowLayout.LEFT);
        
        Frame.setSize(300, 300);
        Frame.setLayout(FL);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.add(Button_OK);
        
        //Button_OK.setSize(10, 10);
        Button_OK.setVisible(true);
        
        
                
        /*int number = 25;
        number = number >> 1;
        System.out.println(number);
        */        
    }
    
    public static int goodJob(){
        return 0;
    
    }
   
    
}
