import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;



public class MyFrame extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    JTextField display;


    MyFrame()
    {
        JFrame Frame = new JFrame("Calculator");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(null);
        Frame.setSize(460,760);
        Frame.setVisible(true);


        JTextField display= new JTextField();
        display.setBounds(0, 0, 460, 410);
        Frame.add(display) ;

        b1= new JButton("1");
        b1.setBounds(0,650,100,80);
        b1.addActionListener(this);
        Frame.add(b1);
        b2= new JButton("2");
        b2.setBounds(100,650,100,80);
        b1.addActionListener(this);
        Frame.add(b2);
        b3= new JButton("3");
        b3.setBounds(200,650,100,80);
        b3.addActionListener(this);
        Frame.add(b3);
        b4= new JButton("4");
        b4.setBounds(0,570,100,80);
        b4.addActionListener(this);
        Frame.add(b4);
        b5= new JButton("5");
        b5.setBounds(100,570,100,80);
        b5.addActionListener(this);
        Frame.add(b5);
        b6= new JButton("6");
        b6.setBounds(200,570,100,80);
        b6.addActionListener(this);
        Frame.add(b6);
        b7= new JButton("7");
        b7.setBounds(0,490,100,80);
        b7.addActionListener(this);
        Frame.add(b7);
        b8= new JButton("8");
        b8.setBounds(100,490,100,80);
        b8.addActionListener(this);
        Frame.add(b8);
        b9= new JButton("9");
        b9.setBounds(200,490,100,80);
        b9.addActionListener(this);
        Frame.add(b9);
        b10= new JButton("C");
        b10.setBounds(0,410,100,80);
        b10.addActionListener(this);
        Frame.add(b10);
        b11= new JButton("0");
        b11.setBounds(100,410,100,80);
        b11.addActionListener(this);
        Frame.add(b11);
        b12= new JButton("<-");
        b12.setBounds(200,410,100,80);
        b12.addActionListener(this);
        Frame.add(b12);
        b13= new JButton("+");
        b13.setBounds(300,650,150,80);
        b13.addActionListener(this);
        Frame.add(b13);
        b15= new JButton("−");
        b15.setBounds(300,570,150,80);
        b15.addActionListener(this);
        Frame.add(b15);
        b16= new JButton("X");
        b16.setBounds(300,490,150,80);
        b16.addActionListener(this);
        Frame.add(b16);
        b17= new JButton("÷");
        b17.setBounds(300,410,150,80);
        b17.addActionListener(this);
        Frame.add(b17);
        b17.setBackground(new Color(173, 216, 230));
        b15.setBackground(new Color(173, 216, 230));
        b16.setBackground(new Color(173, 216, 230));
        b13.setBackground(new Color(173, 216, 230));
        b10.setBackground(new Color(238, 75, 43));
        b12.setBackground(new Color(238, 75, 43));
        Font labelFont = new Font("Oswald", Font.BOLD, 18);
        JButton[] allButtons = {
                b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,
        };
        for (JButton button : allButtons) {
            button.setFont(labelFont);
        }


        Frame.add(display);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== b1){
            //display.setText("you are gay.");
        }
    }
}
