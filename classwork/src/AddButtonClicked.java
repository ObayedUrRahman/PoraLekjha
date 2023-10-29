import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AddButtonClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // write codes here
        //int a = Integer.parseInt(txt1.getText()) ;
        //int b = Integer.parseInt(txt2.getText()) ;

        //txt3.setText(a+b+"");
        JOptionPane.showMessageDialog(null, "Add Button Clicked");
    }
}
