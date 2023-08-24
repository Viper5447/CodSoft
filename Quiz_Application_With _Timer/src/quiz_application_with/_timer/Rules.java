
package quiz_application_with._timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brainly 10s ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Algerian", Font.BOLD, 28));
        heading.setForeground(new Color(0,0,0));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
             "<html>"+ 
                "1) Quiz Content: Prepare a set of questions for the quiz. These can cover various topics and difficulty levels." + "<br><br>" +
                "2) Do not unnecessarily attempt and  Set a timer for each question. " + "<br><br>" +
                "3) All the questions are compulsory" + "<br><br>" +
                "4) Scoring: Decide how scoring will work. You can award points based on correctness and speed." + "<br><br>" +
                "5) Players must answer before the timer runs out   " + "<br><br>" +
               
            "<html>"
        );
        add(rules); 
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(32, 212, 206));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(32, 212, 206));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}