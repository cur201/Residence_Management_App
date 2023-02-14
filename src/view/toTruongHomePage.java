package view;

import javax.swing.*;
import java.awt.*;

public class toTruongHomePage extends JDialog {
    private JPanel toTruongHomePagePanel;
    private JButton btnLogout;
    private JTextField txtSearchKeyword;
    private JButton btnThongKeNhanKhau;
    private JButton btnLichSu;
    private JButton btnDuyetYeuCau;
    private JComboBox txtType;
    private JButton btnSearch;
    private JList list1;

    public toTruongHomePage(JFrame parent)
    {
        super(parent);
        setTitle("To truong Home Page");
        setContentPane(toTruongHomePagePanel);
        setModal(true);
        setMinimumSize(new Dimension(550, 450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        toTruongHomePage toTruongHomePage = new toTruongHomePage(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
