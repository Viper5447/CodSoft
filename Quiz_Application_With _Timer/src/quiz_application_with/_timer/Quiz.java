package quiz_application_with._timer;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 10;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1510, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1510, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
         
        questions[0][0] = "Which of these is a standard interface for serial data transmission?";
        questions[0][1] = "ASCII";
        questions[0][2] = "RS232C";
        questions[0][3] = "2";
        questions[0][4] = "Centronics";

        questions[1][0] = "Which of the following transmission directions listed is not a legitimate channel?";
        questions[1][1] = "Simplex";
        questions[1][2] = "Half Duplex";
        questions[1][3] = "Full Duplex";
        questions[1][4] = "Double Duplex";

        questions[2][0] = "Parity bits are used for which of the following purposes?";
        questions[2][1] = "Encryption of data";
        questions[2][2] = "To transmit faster";
        questions[2][3] = "To detect errors";
        questions[2][4] = "To identify the user";

        questions[3][0] = "A collection of hyperlinked documents on the internet forms the?";
        questions[3][1] = "World Wide Web (WWW)";
        questions[3][2] = "E-mail system";
        questions[3][3] = "Mailing list";
        questions[3][4] = "Hypertext markup language";

        questions[4][0] = "The location of a resource on the internet is given by its?";
        questions[4][1] = "Protocol";
        questions[4][2] = "URL";
        questions[4][3] = "E-mail address";
        questions[4][4] = "ICQ";

        questions[5][0] = "The term HTTP stands for?";
        questions[5][1] = "Hyper terminal tracing program";
        questions[5][2] = "Hypertext tracing protocol";
        questions[5][3] = "Hypertext transfer protocol";
        questions[5][4] = "Hypertext transfer program";

        questions[6][0] = "A proxy server is used as the computer?";
        questions[6][1] = "with external access";
        questions[6][2] = "acting as a backup";
        questions[6][3] = "performing file handling";
        questions[6][4] = "accessing user permissions";

        questions[7][0] = "Which software prevents the external access to a system?";
        questions[7][1] = "Firewall";
        questions[7][2] = "Gateway";
        questions[7][3] = "Router";
        questions[7][4] = "Virus checker";

        questions[8][0] = "Which one of the following is a valid email address?";
        questions[8][1] = "javat@point.com";
        questions[8][2] = "gmail.com";
        questions[8][3] = "tpoint@.com";
        questions[8][4] = "javatpoint@books";

        questions[9][0] = " Which one of the following is the most common internet protocol?";
        questions[9][1] = "HTML";
        questions[9][2] = "NetBEUI";
        questions[9][3] = "TCP/IP";
        questions[9][4] = "IPX/SPX";

	
        
        answers[0][1] = "RS232C";
        answers[1][1] = "Double Duplex";
        answers[2][1] = "To detect errors";
        answers[3][1] = "World Wide Web (WWW)";
        answers[4][1] = "URL";
        answers[5][1] = "Hypertext transfer protocol";
        answers[6][1] = "with external access";
        answers[7][1] = "Firewall";
        answers[8][1] = "javat@point.com";
        answers[9][1] = "TCP/IP";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(32, 212, 206));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(32, 212, 206));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(32, 212, 206));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 10
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times Up ..!", 1100, 500);
        }
        
        timer--; // 10
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 10;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}
