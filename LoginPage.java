import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton SignUpButton = new JButton("SignUp");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    JLabel userIDLabel = new JLabel("UserID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);  // Corrected this line

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        SignUpButton.setBounds(225,200,100,25);

        messageLabel.setBounds(125,250,200,35);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(SignUpButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        loginButton.addActionListener(this);
        SignUpButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add your action handling code here
    }

    public static void main(String[] args) {
        HashMap<String, String> loginInfo = new HashMap<>();
        loginInfo.put("user", "password"); // Sample login info
        new LoginPage(loginInfo);
    }
}
