import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Hello {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("My First GUI");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,300);

        JLabel l1 = new JLabel ("Number 1: ") ;
        l1.setBounds(50, 50, 120, 20);
        frame.add(l1) ;

        JTextField txt1 = new JTextField () ;
        txt1.setBounds(180, 50, 100, 20);
        frame.add(txt1) ;

        JLabel l2 = new JLabel ("Number 2: ") ;
        l2.setBounds(50, 80, 120, 20);
        frame.add(l2) ;

        JTextField txt2 = new JTextField () ;
        txt2.setBounds(180, 80, 100, 20);
        frame.add(txt2) ;

        JButton b1 = new JButton("Add");
        b1.setBounds(180, 120, 80, 40);
        frame.add(b1) ;

        b1.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        frame.setVisible(true);
        //frame.setvi

//	    MyLinkedList al=new MyLinkedList ();//creating arraylist
//	    al.getList().add("Ravi");//adding object in arraylist
//	    al.addLL("Vijay");
//	    al.addLL("Ravi");
//	    al.addLL("Ajay");
//
//	    al.add("Hello");
//
//	    System.out.println(al.getList());
    }

}
