import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StudentGradeCalculator {
    private JTextField txtStname;
    private JTextField txtPhysics;
    private JTextField txtChemistry;
    private JTextField txtMathematics;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JButton CalculateButton;
    private JPanel Main;


    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentGradeCalculator");
        frame.setContentPane(new StudentGradeCalculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentGradeCalculator() {
        CalculateButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {


                int m1, m2, m3, tot;
                double avg;
                m1 = Integer.parseInt(txtPhysics.getText());
                m2 = Integer.parseInt(txtChemistry.getText());
                m3 = Integer.parseInt(txtMathematics.getText());

                tot = m1 + m2 + m3;

                txtTotal.setText(String.valueOf(tot));


                avg = tot / 3;
                txtAverage.setText(String.valueOf(avg));

                if (avg > 40) {

                    txtGrade.setText("Student Pass");
                } else {


                    txtGrade.setText("Student Fail");
                }
            }
        });



    }


    }