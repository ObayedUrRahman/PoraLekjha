import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Test extends JFrame implements ActionListener {
JButton b1;
JTextField display;

 Test(){

     JFrame Frame = new JFrame("Calculator tester");
     Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Frame.setLayout(null);
     Frame.setSize(460,760);
     Frame.setVisible(true);
     JTextField txt1 = new JTextField () ;
     txt1.setBounds(180, 50, 100, 20);
     Frame.add(txt1) ;
 }








    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
