import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame {
    //	Jthis this = new Jthis("Calculator");
//    this.setLayout(null);
//    this.setSize(250,400);
    private boolean flag = false ;
    private JLabel display = new JLabel () ;
    private JTextField input = new JTextField("0");

    BDigit B0 = new BDigit (this, "0");
    BDigit B1 = new BDigit(this, "1");
    BDigit B2 = new BDigit(this, "2");
    BDigit B3 = new BDigit(this, "3");
    BDigit B4 = new BDigit(this, "4");
    BDigit B5 = new BDigit(this, "5");
    BDigit B6 = new BDigit(this, "6");
    BDigit B7 = new BDigit(this, "7");
    BDigit B8 = new BDigit(this, "8");
    BDigit B9 = new BDigit(this, "9");

    BOperator JX = new BOperator(this, "*");
    BOperator JD = new BOperator(this, "/");
    BOperator JP = new BOperator(this, "+");
    BOperator JS = new BOperator(this, "-");

    BOperator JE = new BOperator(this, "=");
    JButton JDot = new JButton(".");
    JButton JB = new JButton("<-");
    JButton JPer = new JButton("%");

    JButton JC = new JButton("Clear");


    Calculator ()
    {
        this.setLayout(null);
        this.setSize(250,400);

        display.setBounds(10, 10, 150, 40);
        this.add(display) ;

        input.setBounds(10,50,150,40);
        this.add(input);

        B0.setBounds(50,240,50,30);
        B1.setBounds(0,150,50,30);
        B2.setBounds(50,150,50,30);
        B3.setBounds(100,150,50,30);
        B4.setBounds(0,180,50,30);
        B5.setBounds(50,180,50,30);
        B6.setBounds(100,180,50,30);
        B7.setBounds(0,210,50,30);
        B8.setBounds(50,210,50,30);
        B9.setBounds(100,210,50,30);
        this.add(B0);
        this.add(B1);
        this.add(B2);
        this.add(B3);
        this.add(B4);
        this.add(B5);
        this.add(B6);
        this.add(B7);
        this.add(B8);
        this.add(B9);

        JX.setBounds(0,120,50,30);
        JD.setBounds(50,120,50,30);
        JP.setBounds(100,120,50,30);
        JS.setBounds(0,240,50,30);
        this.add(JX);
        this.add(JD);
        this.add(JP);
        this.add(JS);


        JE.setBounds(100,240,50,30);
        this.add(JE);

        JDot.setBounds(50,270,50,30);
        this.add(JDot);

        JB.setBounds(0,270,50,30);
        this.add(JB);

        JPer.setBounds(100,270,50,30);
        this.add(JPer);

        JDot.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                String in = input.getText();
                in+=".";
                input.setText(in);
            }
        });
        JPer.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                String in = input.getText();
                in+="%";
                input.setText(in);
            }
        });
        JB.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                String in = input.getText();
                in = in.substring(0, in.length() - 1);
                input.setText(in);
            }
        });


        JC.setBounds(40,300,80,30);
        this.add(JC);
        JC.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                //String in = "";
                input.setText("0");
                display.setText("");
            }
        });

    }

    public JLabel getDisplay ()
    {
        return this.display ;
    }
    public JTextField getInput ()
    {
        return this.input ;
    }
    public void setFlag (boolean b)
    {
        this.flag = b ;
    }
    public boolean getFlag () {
        return this.flag ;
    }
}
