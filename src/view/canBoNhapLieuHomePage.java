package view;

import controller.canBoNhapLieu_controller;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import static constancy.constancy.DEFAULT_ID;

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
    private JTextField txtIDNguoiKhai;
    private JButton btnCancelThemNhanKhau;
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
    private JPanel formSuaNhanKhauPanel;
    private JPanel formXoaNhanKhauPanel;
    private JPanel formThemHoKhauPanel;
    private JPanel formSuaHoKhauPanel;
    private JPanel formXoaHoKhauPanel;
    private JPanel formTamTru;
    private JPanel formTamVang;
    private JPanel formDangKySuDungNhaVanHoa;
    private JTextField txtIDDangKySuaNhanKhau;
    private JTextField txtIDNguoiKhaiSuaNhanKhau;
    private JTextField txtIDNguoiDuocSua;
    private JTextField txtNgayKhaiSuaNhanKhau;
    private JTextField txtHoTenMoi;
    private JTextField txtBietDanhMoi;
    private JTextField txtSoCMTMoi;
    private JTextField txtNgayCapCMTMoi;
    private JTextField txtNoiCapCMTMoi;
    private JTextField txtNamSinhMoi;
    private JTextField txtGioiTinhMoi;
    private JTextField txtNoiSinhMoi;
    private JTextField txtDanTocMoi;
    private JTextField txtTonGiaoMoi;
    private JTextField txtQuocTichMoi;
    private JTextField txtNguyenQuanMoi;
    private JTextField txtNoiThuongTruMoi;
    private JTextField txtNgheNghiepMoi;
    private JTextField txtNoiLamViecMoi;
    private JTextField txtNgayDangKyThuongTruMoi;
    private JTextField txtGhiChuMoi;
    private JButton btnCancelSuaNhanKhau;
    private JButton btnCFSuaNhanKhau;
    private JTextField txtIDDangKyXoaNhanKhau;
    private JTextField txtIDNguoiKhaiXoaNhanKhau;
    private JTextField txtIDNguoiBiXoa;
    private JTextField txtNgayKhaiXoaNhanKhau;
    private JTextField txtNgayXoaNhanKhau;
    private JTextField txtNoiChuyenXoaNhanKhau;
    private JTextField txtGhiChuXoaNhanKhau;
    private JButton btnCancelDKXoaNhanKhau;
    private JButton btnCFDangKyXoaNhanKhau;
    private JTextField txtidDKThemHoKhau;
    private JTextField txtIDChuHoDKThemHoKhau;
    private JTextField txtMaKVDKThemHoKhau;
    private JTextField txtDiaChiDKThemHoKhau;
    private JTextField txtNgayLapDKThemHoKhau;
    private JTextField txtNgayKhaiDKThemHoKhau;
    private JTextField txtIDNguoiKhaiDKThemHoKhau;
    private JButton btnCancelDKThemHoKhau;
    private JButton btnCFThemHoKhau;
    private JTextField txtIDDKSuaHoKhau;
    private JTextField txtIDHoKhauMoi;
    private JTextField txtIDChuHoMoi;
    private JTextField txtDiaChiHoMoi;
    private JTextField txtNgayThayDoiHoMoi;
    private JTextField txtNguoiKhaiHoMoi;
    private JTextField txtIDDKXoaHoKhau;
    private JTextField txtIDHoKhauXoa;
    private JTextField txtLyDoDKXoaHoKhau;
    private JTextField txtNgayDKXoaHoKhau;
    private JTextField txtIDNguoiKhaiDKXoaHoKhau;
    private JTextField txtIDDKTamTru;
    private JTextField txtIDNhanKhauDKTamTru;
    private JTextField txtNoiDKTamTru;
    private JTextField txtNoiThuongTruDKTamTru;
    private JTextField txtTuNgayDKTamTru;
    private JTextField txtDenNgayDKTamTru;
    private JTextField txtLyDoDKTamTru;
    private JTextField txtIDDKTamVang;
    private JTextField txtIDNhanKhauDKTamVang;
    private JTextField txtNoiThuongTruDKTamVang;
    private JTextField txtTuNgayDKTamVang;
    private JTextField txtDenNgayDKTamVang;
    private JTextField txtLyDoDKTamVang;
    private JTextField txtIDDKSuDungNVH;
    private JTextField txtNgayToChucDKSuDungNVH;
    private JTextField txtLoaiSuKienDKSuDungNVH;
    private JTextField txtPhiSuDungDKSuDungNVH;
    private JTextField txtGhiChuDKSuDungNhaVanHoa;
    private JButton btnCFDKSuaHoKhau;
    private JButton btnCancelDKSuaHoKhau;
    private JButton btnCancelDKXoaHoKhau;
    private JButton btnCFDKXoaHoKhau;
    private JButton btnCancelDKTamTru;
    private JButton btnCFDKTamTru;
    private JButton btnCancelDKTamVang;
    private JButton btnCFDKTamVang;
    private JButton btnCanCelDKSuDungNVH;
    private JButton btnCFDKSuDungNhaVanHoa;

    boolean formCheck;

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
        btnDKSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formSuaNhanKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formXoaNhanKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formThemHoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formSuaHoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formXoaHoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formTamTru);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formTamVang);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnDKNhaVanHoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(formDangKySuDungNhaVanHoa);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCancelThemNhanKhau.addActionListener(new ActionListener() {
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
                try{
                    String idNguoiKhai = txtIDNguoiKhai.getText();
                    String ngayKhai = txtNgayKhai.getText();
                    String hoTen = txtHoTen.getText();
                    String bietDanh;
                    if (txtBietDanh.getText() == "Khong")
                    {
                        bietDanh = null;
                    }
                    else{ bietDanh = txtBietDanh.getText();}
                    String soCMT;
                    if(txtSoCMT.getText() == null)
                    {
                        soCMT = "0";
                    }
                    else{ soCMT = txtSoCMT.getText();}
                    String ngayCapCMT;
                    if(txtNgayCapCMT.getText() == "Khong")
                    {
                        ngayCapCMT = "2000-01-01";
                    }
                    else{ ngayCapCMT = txtNgayCapCMT.getText();}
                    String noiCapCMT;
                    if(txtNoiCapCMT.getText() == "Khong")
                    {
                        noiCapCMT = null;
                    }
                    else{noiCapCMT = txtNoiCapCMT.getText();}

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
                    dangKyThemNhanKhau dangKyThemNhanKhau = new dangKyThemNhanKhau(DEFAULT_ID, Integer.parseInt(idNguoiKhai),
                            Date.valueOf(ngayKhai), hoTen, bietDanh, Integer.parseInt(soCMT), Date.valueOf(ngayCapCMT),
                            noiCapCMT, Integer.parseInt(namSinh), gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan,
                            noiThuongTru, ngheNghiep, noilamViec, Date.valueOf(ngayDangKyThuongTruString),
                            false, false, ghiChu);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayThemNhanKhau(dangKyThemNhanKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failes",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception e1)
                {

                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng không để trống. Với những trường không có thông tin, vui lòng điền Khong. Nếu gặp lỗi khác, xin vui lòng kiểm tra lại.",
                            "Try again", JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }

            }
        });
        btnCancelSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCFSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idNguoiKhai = txtIDNguoiKhaiSuaNhanKhau.getText();
                    String idNguoiDuocSua = txtIDNguoiDuocSua.getText();
                    String ngayKhai = txtNgayKhaiSuaNhanKhau.getText();
                    String hoTen = txtHoTenMoi.getText();
                    String bietDanh;
                    if (txtBietDanhMoi.getText() == "Khong")
                    {
                        bietDanh = null;
                    }
                    else{ bietDanh = txtBietDanhMoi.getText();}
                    String soCMT;
                    if(txtSoCMTMoi.getText() == null)
                    {
                        soCMT = "0";
                    }
                    else{ soCMT = txtSoCMTMoi.getText();}
                    String ngayCapCMT;
                    if(txtNgayCapCMTMoi.getText() == "Khong")
                    {
                        ngayCapCMT = "2000-01-01";
                    }
                    else{ ngayCapCMT = txtNgayCapCMTMoi.getText();}
                    String noiCapCMT;
                    if(txtNoiCapCMTMoi.getText() == "Khong")
                    {
                        noiCapCMT = null;
                    }
                    else{noiCapCMT = txtNoiCapCMTMoi.getText();}

                    String namSinh = txtNamSinhMoi.getText();
                    String gioiTinh = txtGioiTinhMoi.getText();
                    String noiSinh = txtNoiSinhMoi.getText();
                    String danToc = txtDanTocMoi.getText();
                    String tonGiao = txtTonGiaoMoi.getText();
                    String quocTich = txtQuocTichMoi.getText();
                    String nguyenQuan = txtNguyenQuanMoi.getText();
                    String noiThuongTru = txtNoiThuongTruMoi.getText();
                    String ngheNghiep = txtNgheNghiepMoi.getText();
                    String noilamViec = txtNoiLamViecMoi.getText();
                    String ngayDangKyThuongTruString = txtNgayDangKyThuongTruMoi.getText();
                    String ghiChu = txtGhiChuMoi.getText();
                    dangKySuaNhanKhau dangKySuaNhanKhau = new dangKySuaNhanKhau(DEFAULT_ID, Integer.parseInt(idNguoiKhai), Integer.parseInt(idNguoiDuocSua), Date.valueOf(ngayKhai), hoTen, bietDanh, Integer.parseInt(soCMT), Date.valueOf(ngayCapCMT), noiCapCMT, Integer.parseInt(namSinh), gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, ngheNghiep, noilamViec, Date.valueOf(ngayDangKyThuongTruString), false, false, ghiChu);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiaySuaNhanKhau(dangKySuaNhanKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception e1)
                {

                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng không để trống. Với những trường không có thông tin, vui lòng điền Khong. Nếu gặp lỗi khác, xin vui lòng kiểm tra lại.",
                            "Try again", JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCFDangKyXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    String idNguoiKhai = txtIDNguoiKhaiXoaNhanKhau.getText();
                    String idNguoiBiXoa = txtIDNguoiBiXoa.getText();
                    String ngayKhaiXoaNhanKhau = txtNgayKhaiXoaNhanKhau.getText();
                    String ngayXoaNhanKhau = txtNgayXoaNhanKhau.getText();
                    String noiChuyenXoaNhanKhau = txtNoiChuyenXoaNhanKhau.getText();
                    String ghiChuXoaNhanKhau = txtGhiChuXoaNhanKhau.getText();
                    dangKyXoaNhanKhau dangKyXoaNhanKhau = new dangKyXoaNhanKhau(DEFAULT_ID, Integer.parseInt(idNguoiKhai), Integer.parseInt(idNguoiBiXoa), Date.valueOf(ngayKhaiXoaNhanKhau), Date.valueOf(ngayXoaNhanKhau), noiChuyenXoaNhanKhau, ghiChuXoaNhanKhau);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayXoaNhanKhau(dangKyXoaNhanKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        btnCFThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String idChuHoDKThemHoKhau = txtIDChuHoDKThemHoKhau.getText();
                    String maKVDKThemHoKhau = txtMaKVDKThemHoKhau.getText();
                    String diaChiDKThemHoKhau = txtDiaChiDKThemHoKhau.getText();
                    String ngayLapDKThemHoKhau = txtNgayLapDKThemHoKhau.getText();
                    String ngayKhaiDKThemHoKhau = txtNgayKhaiDKThemHoKhau.getText();
                    String idNguoiKhaiDKThemHoKhau = txtIDNguoiKhaiDKThemHoKhau.getText();

                    dangKyThemHoKhau dangKyThemHoKhau = new dangKyThemHoKhau(DEFAULT_ID, Integer.parseInt(idChuHoDKThemHoKhau),
                            maKVDKThemHoKhau, diaChiDKThemHoKhau, Date.valueOf(ngayLapDKThemHoKhau),
                            Date.valueOf(ngayKhaiDKThemHoKhau), Integer.parseInt(idNguoiKhaiDKThemHoKhau));
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoSoHoKhau(dangKyThemHoKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        btnCFDKSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String idHoKhauMoi = txtIDHoKhauMoi.getText();
                    String idChuHoMoi = txtIDChuHoMoi.getText();
                    String diaChiHoMoi = txtDiaChiHoMoi.getText();
                    String ngayThayDoiHoMoi = txtNgayThayDoiHoMoi.getText();
                    String idNguoiKhaiHoMoi = txtNguoiKhaiHoMoi.getText();

                    dangKySuaHoKhau dangKySuaHoKhau = new dangKySuaHoKhau(DEFAULT_ID, Integer.parseInt(idHoKhauMoi),
                            Integer.parseInt(idChuHoMoi), diaChiHoMoi, Date.valueOf(ngayThayDoiHoMoi), Integer.parseInt(idNguoiKhaiHoMoi));
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiaySuaHoKhau(dangKySuaHoKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        btnCFDKXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idHoKhauXoa = txtIDHoKhauXoa.getText();
                    String lyDoDKXoaHoKhau = txtLyDoDKXoaHoKhau.getText();
                    String ngayDKXoaHoKhau = txtNgayDKXoaHoKhau.getText();
                    String idNguoiKhaiDKXoaHoKhau = txtIDNguoiKhaiDKXoaHoKhau.getText();

                    dangKyXoaHoKhau dangKyXoaHoKhau = new dangKyXoaHoKhau(DEFAULT_ID, Integer.parseInt(idHoKhauXoa),
                            lyDoDKXoaHoKhau, Date.valueOf(ngayDKXoaHoKhau), Integer.parseInt(idNguoiKhaiDKXoaHoKhau));
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayXoaHoKhau(dangKyXoaHoKhau);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        btnCFDKTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idNhanKhauDKTamTru = txtIDNhanKhauDKTamTru.getText();
                    String noiDKTamTru = txtNoiDKTamTru.getText();
                    String noiThuongTruDKTamTru = txtNoiThuongTruDKTamTru.getText();
                    String tuNgayDKTamTru = txtTuNgayDKTamTru.getText();
                    String denNgayDKTamTru = txtDenNgayDKTamTru.getText();
                    String lyDoDKTamTru = txtLyDoDKTamTru.getText();

                    tamTru tamTru = new tamTru(DEFAULT_ID, Integer.parseInt(idNhanKhauDKTamTru),
                            noiDKTamTru, noiThuongTruDKTamTru, Date.valueOf(tuNgayDKTamTru), Date.valueOf(denNgayDKTamTru), lyDoDKTamTru);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayTamTru(tamTru);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCancelDKTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        btnCFDKTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idNhanKhauDKTamVang = txtIDNhanKhauDKTamVang.getText();
                    String noiThuongTruDKTamVang = txtNoiThuongTruDKTamVang.getText();
                    String tuNgayDKTamVang = txtTuNgayDKTamVang.getText();
                    String denNgayDKTamVang = txtDenNgayDKTamVang.getText();
                    String lyDoDKTamVang = txtLyDoDKTamVang.getText();

                    tamVang tamVang = new tamVang(DEFAULT_ID, Integer.parseInt(idNhanKhauDKTamVang),
                            noiThuongTruDKTamVang, Date.valueOf(tuNgayDKTamVang), Date.valueOf(denNgayDKTamVang), lyDoDKTamVang);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayTamVang(tamVang);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
        btnCanCelDKSuDungNVH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(hoKhauPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        btnCFDKSuDungNhaVanHoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String ngayToChucDKSuDungNVH = txtNgayToChucDKSuDungNVH.getText();
                    String loaiSuKienDKSuDungNVH = txtLoaiSuKienDKSuDungNVH.getText();
                    String phiSuDungDKSuDungNVH = txtPhiSuDungDKSuDungNVH.getText();
                    String ghiChuDKSuDungNVH = txtGhiChuDKSuDungNhaVanHoa.getText();

                    dangKySuDungNhaVanHoa dangKySuDungNhaVanHoa = new dangKySuDungNhaVanHoa(DEFAULT_ID, Date.valueOf(ngayToChucDKSuDungNVH),
                            loaiSuKienDKSuDungNVH, Integer.parseInt(phiSuDungDKSuDungNVH), ghiChuDKSuDungNVH);
                    canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
                    formCheck = canBoNhapLieu_controller.taoGiayDangKySuDungNhaVanHoa(dangKySuDungNhaVanHoa);
                    if(formCheck == true)
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Đăng ký thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(canBoNhapLieuHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args)
    {
        canBoNhapLieuHomePage canBoNhapLieuHomePage = new canBoNhapLieuHomePage(null);
        canBoNhapLieuHomePage.setVisible(true);
    }
}
