package view;

import controller.accountController;
import model.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static constancy.constancy.*;

public class Main extends JDialog{
    private JTextField loginUserName;
    private JButton btnLogin;
    private JButton btnSignUp;
    private JPasswordField loginPassword;
    private JPanel loginPanel;

    user user;

    public Main(JFrame parent)
    {
        super(parent);
        setTitle("Main");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = loginUserName.getText();
                String password = String.valueOf(loginPassword.getPassword());
                accountController accountController = new accountController();
                user = accountController.login(userName, password);
                if(user!=null)
                {
                    String role = user.getRole();
                    //System.out.println(role);
                    if(role.equals(TO_TRUONG))
                    {
                        dispose();
                        toTruongHomePage toTruongHomePage = new toTruongHomePage(parent);
                        toTruongHomePage.setVisible(true);
                    }
                    if(role.equals(CAN_BO_NHA_VAN_HOA))
                    {
                        dispose();
                        canBoNhaVanHoaHomePage canBoNhaVanHoaHomePage = new canBoNhaVanHoaHomePage(parent);
                        canBoNhaVanHoaHomePage.setVisible(true);
                    }
                    if(role.equals(CAN_BO_NHAP_LIEU))
                    {
                        dispose();
                        canBoNhapLieuHomePage canBoNhapLieuHomePage = new canBoNhapLieuHomePage(parent);
                        canBoNhapLieuHomePage.setVisible(true);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(Main.this,
                            "User Name or Password InvaLid, please try again!",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SignUp signUp = new SignUp(parent);
                signUp.setVisible(true);
            }
        });


        setVisible(true);
    }

    public static void main(String[] args)
    {
        Main login = new Main(null);
        accountController accountController = new accountController();
        user user = login.user;
        if(user!=null)
        {
            System.out.println("Login Successful of: " + user.getUserName() +
                    " with " + user.getRole() + " role and ID is: "+user.getIdUser());
        }
        else
        {
            System.out.println("Authentication Canceled");
        }
    }
}
