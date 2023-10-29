//import required classes and packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

//create LoginFrame class to create login form
//class extends JFrame to create a window where our component add
//class implements ActionListener to perform an action on button click
class LoginFrame extends JFrame implements ActionListener {

    //initialize button, panel, label, and text field
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;

    //creating constructor of LoginFrame() class
    LoginFrame() {

        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");

        //create text field to get username from the user
        textField1 = new JTextField(15);

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");

        //create text field to get password from the user
        textField2 = new JPasswordField(15);

        //create submit button
        b1 = new JButton("SUBMIT");

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel); //set username label to panel
        newPanel.add(textField1); //set text field to panel
        newPanel.add(passLabel); //set password label to panel
        newPanel.add(textField2); //set text field to panel
        newPanel.add(b1); //set button to panel

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //add action listener to button
        b1.addActionListener(this);

        //set the title of the frame
        setTitle("LOGIN FORM");
    }

    //overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {

        //get the username and password from the text fields
        String userName = textField1.getText();
        String password = textField2.getText();

        try {
            //create a file reader object to read the login.txt file
            FileReader fr = new FileReader("login.txt");
            //create a buffered reader object to read the file line by line
            BufferedReader br = new BufferedReader(fr);
            //initialize a string variable to store each line of the file
            String line;
            //initialize a boolean variable to indicate if the login is successful or not
            boolean loginSuccess = false;
            //loop through the file until the end or until the login is successful
            while ((line = br.readLine()) != null && !loginSuccess) {
                //split the line by comma to get the username and password pair
                String[] pair = line.split(",");
                //check if the pair matches with the user input
                if (pair[0].equals(userName) && pair[1].equals(password)) {
                    //if yes, set the login success flag to true and break the loop
                    loginSuccess = true;
                    break;
                }
            }
            //close the buffered reader and file reader objects
            br.close();
            fr.close();

            //check if the login success flag is true or not
            if (loginSuccess) {
                //if yes, show a message dialog that says "Login Successful"
                JOptionPane.showMessageDialog(this, "Login Successful");
                //create a new frame object to display the welcome page
                WelcomeFrame welcomeFrame = new WelcomeFrame();
                welcomeFrame.setSize(300, 100); //set the size of the frame
                welcomeFrame.setVisible(true);  //set the visibility of the frame
                welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set the default close operation of the frame

                JLabel label = new JLabel("Welcome " + userName);  //create a label that says "Welcome" followed by the username
                JPanel panel = new JPanel();  //create a panel to add the label
                panel.add(label);  //add the label to the panel

                welcomeFrame.add(panel);  //add the panel to the frame

            } else {
                //if no, show a message dialog that says "Invalid Username or Password"
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        } catch (IOException ex) {
            //handle any IO exception that may occur while reading or writing the file
            ex.printStackTrace();
        }
    }
}

//create WelcomeFrame class to display the welcome page
//class extends JFrame to create a window where our component add
class WelcomeFrame extends JFrame {

    //creating constructor of WelcomeFrame() class
    WelcomeFrame() {
        //set the title of the frame
        setTitle("WELCOME PAGE");
    }
}

//create LoginDemo class to create and display the login form
public class Main {
    public static void main(String[] args) {
        try {
            //create a file writer object to write the login.txt file
            FileWriter fw = new FileWriter("login.txt");
            //create a buffered writer object to write the file line by line
            BufferedWriter bw = new BufferedWriter(fw);
            //write some username and password pairs to the file separated by comma
            bw.write("admin,admin123\n");
            bw.write("user,user123\n");
            bw.write("guest,guest123\n");
            //close the buffered writer and file writer objects
            bw.close();
            fw.close();

        } catch (IOException ex) {
            //handle any IO exception that may occur while reading or writing the file
            ex.printStackTrace();
        }

        //create a frame object to display the login form
        LoginFrame frame = new LoginFrame();
        frame.setSize(300, 100);  //set the size of the frame
        frame.setVisible(true);  //set the visibility of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set the default close operation of the frame
    }
}