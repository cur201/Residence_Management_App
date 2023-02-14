package view;

import controller.accountController;
import model.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JDialog{
    private JPanel signUpPanel;
    private JTextField signUpUserName;
    private JPasswordField signUpPassword;
    private JButton btnSignUp;
    private JRadioButton btnSignUpToTruong;
    private JRadioButton btnSignUpCanBoNhapLieu;
    private JRadioButton btnSignUpCanBoNhaVanHoa;

    public boolean signUpCheck;

    public SignUp() {}
    public SignUp(JFrame parent)
    {
        super(parent);
        setTitle("Sign Up");
        setContentPane(signUpPanel);
        setMinimumSize(new Dimension(700, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String userName = signUpUserName.getText();
            String password = String.valueOf(signUpPassword.getPassword());
            //TODO: MUST TO SPECIFY ROLE IN RADIO BUTTON. DO IT LATER.
                String role = null;
            if(btnSignUpToTruong.isSelected())
            {
                role = "toTruong";
            }
            else if(btnSignUpCanBoNhapLieu.isSelected())
            {
                role = "canBoNhapLieu";
            }
            else if(btnSignUpCanBoNhaVanHoa.isSelected())
            {
                role = "canBoNhaVanhoa";
            }
            accountController accountController = new accountController();
            signUpCheck = accountController.createAccount(userName, password, role);
            if(signUpCheck==true)
            {
                JOptionPane.showMessageDialog(SignUp.this,
                        "Sign Up SuccessFull",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(SignUp.this,
                        "Something wrong, please try again!",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
            }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args)
    {
        SignUp signUp = new SignUp(null);
        accountController accountController = new accountController();
        boolean signUpCheck = signUp.signUpCheck;
        if(signUpCheck==true)
        {
            System.out.println("SignUp Successful");
        }
        else
        {
            System.out.println("Authentication Canceled");
        }
    }
}
