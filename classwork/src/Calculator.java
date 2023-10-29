import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JLabel l1, l2, l3 ;
    private JTextField txt1, txt2, txt3 ;
    private JButton add, sub ;

    Calculator ()
    {
        super ("Calculator") ;
        l1 = new JLabel ("Number 1: ") ;
        l1.setBounds(50, 50, 120, 20);
        txt1 = new JTextField () ;
        txt1.setBounds(180, 50, 100, 20);

        l2 = new JLabel ("Number 2: ") ;
        l2.setBounds(50, 80, 120, 20);
        txt2 = new JTextField () ;
        txt2.setBounds(180, 80, 100, 20);

        l3 = new JLabel ("Sum: ") ;
        l3.setBounds(50, 120, 120, 20);
        txt3 = new JTextField () ;
        txt3.setBounds(180, 120, 100, 20);

        add = new JButton("Add");
        add.setBounds(180, 160, 80, 40);
        add.addActionListener(this);

        sub = new JButton("Subtract");
        sub.setBounds(280, 160, 120, 40);
        sub.addActionListener(this);

        this.setLayout(null);
        this.add(l1) ;
        this.add(txt1) ;
        this.add(l2) ;
        this.add(txt2) ;

        this.add(l3) ;
        this.add(txt3) ;

        this.add(add) ;
        this.add(sub) ;
        this.setSize(500, 500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//    	 write codes here
        if (e.getSource() == add)
        {
            int a = Integer.parseInt(txt1.getText()) ;
            int b = Integer.parseInt(txt2.getText()) ;

            txt3.setText(a+b+"");
        }
        else if (e.getSource() == sub)
        {
            int a = Integer.parseInt(txt1.getText()) ;
            int b = Integer.parseInt(txt2.getText()) ;

            txt3.setText(a-b+"");
        }
    }
}
