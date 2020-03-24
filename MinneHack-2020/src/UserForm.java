import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm {
    private JPanel UserForm;
    private JTextField AgeField;
    private JLabel NameTitle;
    private JTextField EmailField;
    private JLabel AgeTitle;
    private JLabel EmailTitle;
    private JLabel Title;
    private JTextField NameField;
    private JButton Submit;
    private JLabel TitleDescription;

    private JPanel MainPanel;


    public UserForm() {

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String entName = NameField.getText();
                String entEmail = EmailField.getText();
                int entAge = Integer.parseInt(AgeField.getText());

                User curUser = new User (entName, entAge, entEmail);


                // Clears Current panel
                UserForm.setVisible(false);

                /* THIS IS WHERE I STOPPED CODING,

                    I figured out how to get the data from the JFrame, and create a user from it.
                    I currently just S.O.U.T. the info, but I would have liked to send it to a new page
                    like MainPanel and then essentially re-create the while loop inside of a button action event like this one.

                    Reality is you could for sure figure this out, I have just been watching many youtube videos.  The MainPanel
                    stuff is set up, but isn't necessarily right.  I can't figure out how to connect it. 

                */

                System.out.println(curUser.getName() + " " + curUser.getEmail() + " " + curUser.getAge());


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sign Up");
        frame.setContentPane(new UserForm().UserForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
