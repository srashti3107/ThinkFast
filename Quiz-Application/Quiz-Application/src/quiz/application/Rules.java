package quiz.application;

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
        setTitle("THINKFAST QUIZ");
        
        JLabel heading = new JLabel("Welcome " + name + " to ThinkFast Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
//        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 750, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Only registered participants are eligible to participate in the quiz."+"<br><br>"+
                "2. The ThinkFast Quiz consists of multiple-choice questions."+"<br><br>"+
                "3. Each question is presented with a set of options, and participants must select the correct answer."+"<br><br>"+
                "4. Each question is associated with a specific time limit within which participants must provide their answers."+"<br><br>"+ 
                "5. Participants may have access to lifelines or hints that can be used only once to aid in answering one question."+"<br><br>"+
                "6. The time limit is clearly displayed for each question."+"<br><br>"+
                "7. Points are awarded for each correct answer."+"<br><br>"+
                "8. Incorrect answers do not earn any points."+"<br><br>"+
                "9. Any attempt to manipulate the quiz or engage in dishonest behavior may result in disqualification."+"<br><br>"+

            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
//        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
//        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.black);
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
