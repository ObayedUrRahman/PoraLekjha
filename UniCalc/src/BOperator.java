import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BOperator extends JButton{
    Calculator calculator ;
    BOperator (Calculator cal, String title)
    {
        super (title);
        this.calculator = cal ;
        this.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                click () ;
            }
        });
    }
    public void click ()
    {
        JLabel display = this.calculator.getDisplay() ;
        JTextField input = this.calculator.getInput() ;

        if (display.getText().equals(""))
        {
            //System.out.println("Dear");
            display.setText(input.getText() + this.getText()) ;
        }
        else if(this.calculator.getFlag())
            display.setText(input.getText() + this.getText()) ;
        else
        {
//			System.out.println("Hello");
            String dt = display.getText() ;
            String op = dt.substring(dt.length()-1) ;
            int n1 = Integer.parseInt(dt.substring(0, dt.length()-1)) ;
            int n2 = Integer.parseInt(input.getText()) ;
            int result = 0 ;
            if (op.equals("+"))
                result = n1+n2 ;
            else if (op.equals("-"))
                result = n1 - n2 ;
            else if (op.equals("*"))
                result = n1 * n2 ;
            else if (op.equals("/"))
                result = n1 / n2 ;

            if (this.getText().equals("="))
                display.setText(display.getText() + input.getText() + this.getText());
            else
                display.setText(result + this.getText());

            input.setText(result + "");
        }

        this.calculator.setFlag(true);

        //		System.out.println("Hello");
    }
}
