package view;

import controller.canBoNhaVanHoa_controller;
import model.coSoNhaVanHoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class canBoNhaVanHoaHomePage extends  JDialog{
    private JPanel canBoNhaVanHoaHomePagePanel;
    private JButton btnLogout;
    private JButton btnCoSoVatChat;
    private JButton btnSuKien;
    private JTable cosovatchatTable;
    private JButton btnThemCSVC;
    private JButton btnXoaCSVC;
    private JButton btnSuaCSVC;
    private JTable sukienTable;
    private JButton btnThemSK;
    private JPanel cosovatchatPanel;
    private JPanel sukienPanel;
    private JPanel formThemCSVCPanel;
    private JPanel formThemSKPanel;
    private JTextField txtIDDoDung;
    private JTextField txtTenDoDung;
    private JTextField txtHienTrang;
    private JTextField txtSoLuong;
    private JTextField txtGhiChu;
    private JButton btnDongY1;
    private JButton btnHuy1;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JButton btnDongY2;
    private JButton btnHuy2;
    private JTextField txtIdSuKien;
    private JTextField txtLoaiSuKien;
    private JTextField txtPhiSuDung;
    private JTextField txtGhiChu1;
    private JButton btnDongY3;
    private JButton btnHuy3;
    private JPanel titlePanel;
    private JPanel controlPanel;
    private JPanel contentPanel;
    private JPanel formSuaCSVCPanel;
    private JTextField txtNgayToChuc;

    public canBoNhaVanHoaHomePage(JFrame parent)
    {
        super(parent);
        setTitle("Can bo nha van hoa Home Page");
        setContentPane(canBoNhaVanHoaHomePagePanel);
        setMinimumSize(new Dimension(450, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main m=new Main(parent);
                m.setVisible(true);
            }
        });

        btnCoSoVatChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(cosovatchatPanel);
                contentPanel.repaint();
                contentPanel.revalidate();

            }
        });

        btnSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(sukienPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });

        btnThemCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idDoDung = txtIDDoDung.getText();
                String tenDoDung = txtTenDoDung.getText();
                String hienTrang = txtHienTrang.getText();
                String soLuong = txtSoLuong.getText();
                String ghiChu = txtGhiChu.getText();

                coSoNhaVanHoa coSoNhaVanHoa = new coSoNhaVanHoa(Integer.parseInt(idDoDung), tenDoDung, hienTrang, Integer.parseInt(soLuong), ghiChu);
                canBoNhaVanHoa_controller canBoNhaVanHoa_controller = new canBoNhaVanHoa_controller();
                canBoNhaVanHoa_controller.themCoSoVatChatNhaVanHoa(coSoNhaVanHoa);


                contentPanel.add(cosovatchatPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });

        btnSuaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(formSuaCSVCPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });

        btnXoaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(cosovatchatPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });
        setVisible(true);
    }
    public static void main(String[] args)
    {
        canBoNhaVanHoaHomePage canBoNhaVanHoaHomePage = new canBoNhaVanHoaHomePage(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}





