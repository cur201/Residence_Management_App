package view;

import controller.toTruongController;
import model.nhanKhau;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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


        btnThongKeNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
                toTruongController toTruongController = new toTruongController();
                dsNhanKhau = toTruongController.thongKeNhanKhau();
            }
        });
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main main = new Main(parent);
                main.setVisible(true);
            }
        });
    }
    public static void main(String[] args)
    {
        toTruongHomePage toTruongHomePage = new toTruongHomePage(null);
        toTruongHomePage.setVisible(true);
    }
}
