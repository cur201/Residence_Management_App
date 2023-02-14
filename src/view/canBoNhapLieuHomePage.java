package view;

import controller.canBoNhapLieu_controller;
import model.dangKyThemNhanKhau;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class canBoNhapLieuHomePage extends JDialog{
    private JPanel canBoNhapLieuHomePagePanel;
    private JButton btnLogout;
    private JButton btnHoKhau;
    private JButton btnNhanKhau;
    private JButton btnTamTru;
    private JButton btnTamVang;
    private JButton btnNhaVanHoa;
    private JPanel parentPanel;
    private JPanel hoKhauPanel;
    private JPanel nhanKhauPanel;
    private JPanel tamTruPanel;
    private JPanel tamVangPanel;
    private JPanel nhaVanHoaPanel;
    private JButton btnDKThemNhanKhau;
    private JButton btnDKSuaNhanKhau;
    private JButton btnDKXoaNhanKhau;
    private JButton btnDKThemHoKhau;
    private JButton btnDKSuaHoKhau;
    private JButton btnDKXoaHoKhau;
    private JButton btnDKTamTru;
    private JButton btnDKTamVang;
    private JButton btnDKNhaVanHoa;
    private JPanel formThemNhanKhauPanel;
    private JTextField txtIDDangKy;
    private JTextField txtIDNguoiKhai;
    private JButton btnCancel;
    private JButton btnCFThemNhanKhau;
    private JTextField txtNgayKhai;
    private JTextField txtHoTen;
    private JTextField txtNoiCapCMT;
    private JTextField txtNamSinh;
    private JTextField txtGioiTinh;
    private JTextField txtNoiSinh;
    private JTextField txtDanToc;
    private JTextField txtTonGiao;
    private JTextField txtQuocTich;
    private JTextField txtNguyenQuan;
    private JTextField txtNoiThuongTru;
    private JTextField txtNgheNghiep;
    private JTextField txtNgayDangKyThuongTru;
    private JTextField txtGhiChu;
    private JTextField txtNoiLamViec;
    private JTextField txtBietDanh;
    private JTextField txtSoCMT;
    private JTextField txtNgayCapCMT;

    public canBoNhapLieuHomePage(JFrame parent)
    {
        super(parent);
        setTitle("Can bo nhap lieu Home Page");
        setContentPane(canBoNhapLieuHomePagePanel);
        setMinimumSize(new Dimension(700, 800));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main main = new Main(parent);
                main.setVisible(true);
            }
        });
        btnHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(nhanKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(tamTruPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(tamVangPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnNhaVanHoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(nhaVanHoaPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formThemNhanKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCFThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCFThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idGiayDangKy = txtIDDangKy.getText();
                String idNguoiKhai = txtIDNguoiKhai.getText();
                String ngayKhai = txtNgayKhai.getText();
                String hoTen = txtHoTen.getText();
                String bietDanh = txtBietDanh.getText();
                String soCMT = txtSoCMT.getText();
                String ngayCapCMT = txtNgayCapCMT.getText();
                String noiCapCMT = txtNoiCapCMT.getText();
                String namSinh = txtNamSinh.getText();
                String gioiTinh = txtGioiTinh.getText();
                String noiSinh = txtNoiSinh.getText();
                String danToc = txtDanToc.getText();
                String tonGiao = txtTonGiao.getText();
                String quocTich = txtQuocTich.getText();
                String nguyenQuan = txtNguyenQuan.getText();
                String noiThuongTru = txtNoiThuongTru.getText();
                String ngheNghiep = txtNgheNghiep.getText();
                String noilamViec = txtNoiLamViec.getText();
                String ngayDangKyThuongTruString = txtNgayDangKyThuongTru.getText();
                String ghiChu = txtGhiChu.getText();
                dangKyThemNhanKhau dangKyThemNhanKhau = new dangKyThemNhanKhau(Integer.parseInt(idGiayDangKy), Integer.parseInt(idNguoiKhai), Date.valueOf(ngayKhai), hoTen,
                         bietDanh, Integer.parseInt(soCMT), Date.valueOf(ngayCapCMT), noiCapCMT, Integer.parseInt(namSinh), gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, ngheNghiep,
                        noilamViec, Date.valueOf(ngayDangKyThuongTruString), false, false, ghiChu);
                canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                canBoNhapLieu_controller.taoGiayThemNhanKhau(dangKyThemNhanKhau);

            }
        });

        setVisible(true);
    }
    public static void main(String[] args)
    {
        canBoNhapLieuHomePage canBoNhapLieuHomePage = new canBoNhapLieuHomePage(null);
    }
}
