import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BDigit extends JButton {

    Calculator calculator ;
    BDigit (Calculator cal, String title)
    {
        super (title) ;
        this.calculator = cal ;
        this.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                click () ;
            }
        });
    }

    public void click ()
    {
        JTextField input = this.calculator.getInput() ;
        String str = input.getText() ;
        if (str.equals("0") || this.calculator.getFlag())
            str = this.getText() ;
        else
            str = str + this.getText() ;
        input.setText(str);
        this.calculator.setFlag(false);
        //System.out.println("Hello");
    }

}
