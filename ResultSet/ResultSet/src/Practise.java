import javax.swing.*;

public class Practise {
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("Practise"); 
        frame.setLayout(null);
        JButton button1=new JButton("CLick Me");   
        JButton button2=new JButton("CLick Me2");   
        JButton button3=new JButton("CLick Me3");
        button1.setBounds(50, 50, 100, 100);
        button2.setBounds(200, 50, 100, 100);
        button3.setBounds(350, 350, 100, 100);

        frame.add(button1);   
        frame.add(button2);   
        frame.add(button3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}