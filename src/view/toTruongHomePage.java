package view;

import controller.databaseConnector;
import controller.toTruongController;
import model.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class toTruongHomePage extends JDialog {
    private JPanel toTruongHomePagePanel;
    private JButton btnLogout;
    private JTextField txtSearchKeyword;
    private JButton btnThongKeNhanKhau;
    private JButton btnLichSu;
    private JButton btnDuyetYeuCau;
    private JComboBox txtType;
    private JButton btnSearch;
    private JPanel parentPanelToTruong;
    private JPanel thongKeNhanKhauPanel;
    private JPanel lichSuThayDoiNhanKhauPanel;
    private JPanel duyetYeuCauPanel;
    private JTable tblThongKeNhanKhau;
    private JButton btnDuyetYeuCauSuKien;
    private JButton btnDuyetYeuCauHoKhau;
    private JButton btnDuyetYeuCauNhanKhau;
    private JPanel duyetYeuCauNhanKhauPanel;
    private JPanel duyetYeuCauHoKhauPanel;
    private JPanel duyetYeuCauSuKienPanel;
    private JTable tblLichSuThayDoiNhanKhau;
    private JTable tblDuyetSuKien;
    private JButton btnDuyetXoaNhanKhau;
    private JButton btnDuyetThemNhanKhau;
    private JButton btnDuyetSuaNhanKhau;
    private JButton btnDuyetXoaHoKhau;
    private JButton btnDuyetThemHoKhau;
    private JButton btnDuyetSuaHoKhau;
    private JPanel duyetXoaNhanKhauPanel;
    private JTable tblDuyetXoaNhanKhau;
    private JPanel duyetThemNhanKhauPanel;
    private JTable tblDuyetThemNhanKhau;
    private JPanel duyetSuaNhanKhauPanel;
    private JTable tblDuyetSuaNhanKhau;
    private JPanel duyetXoaHoKhauPanel;
    private JTable tblDuyetXoaHoKhau;
    private JPanel duyetThemHoKhauPanel;
    private JTable tblDuyetThemHoKhau;
    private JPanel duyetSuaHoKhauPanel;
    private JTable tblDuyetSuaHoKhau;
    private JButton btnDuyetYeuCauTamVang;
    private JButton btnDuyetYeuCauTamTru;
    private JPanel duyetTamTruPanel;
    private JTable tblDuyetTamTru;
    private JPanel duyetTamVangPanel;
    private JTable tblDuyetTamVang;
    private JButton btnTuChoiTamVang;
    private JButton btnXacNhanTamVang;
    private JButton btnXacNhanTamTru;
    private JButton btnTuChoiTamTru;
    private JButton btnTuChoiSuaHoKhau;
    private JButton btnXacNhanSuaHoKhau;
    private JButton btnTuChoiThemHoKhau;
    private JButton btnXacNhanThemHoKhau;
    private JButton btnTuChoiXoaHoKhau;
    private JButton btnXacNhanXoaHoKhau;
    private JButton btnTuChoiSuaNhanKhau;
    private JButton btnXacNhanSuaNhanKhau;
    private JButton btnTuChoiThemNhanKhau;
    private JButton btnXacNhanThemNhanKhau;
    private JButton btnXacNhanXoaNhanKhau;
    private JButton btnTuChoiXoaNhanKhau;
    private JButton btnXacNhanYeuCauSuKien;
    private JButton btnTuChoiYeuCauSuKien;

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");
    ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
    ArrayList<dangKySuDungNhaVanHoa> dsDangKySuDungNhaVanHoa = new ArrayList<>();
    ArrayList<tamVang> dsTamVang = new ArrayList<>();
    ArrayList<tamTru> dsTamTru = new ArrayList<>();
    ArrayList<dangKyThemNhanKhau> dsDangKyThemNhanKhau = new ArrayList<>();
    ArrayList<dangKySuaNhanKhau> dsDangKySuaNhanKhau = new ArrayList<>();
    ArrayList<dangKyXoaNhanKhau> dsDangKyXoaNhanKhau = new ArrayList<>();
    ArrayList<dangKyThemHoKhau> dsDangKyThemHoKhau = new ArrayList<>();
    ArrayList<dangKySuaHoKhau> dsDangKySuaHoKhau = new ArrayList<>();
    ArrayList<dangKyXoaHoKhau> dsDangKyXoaHoKhau = new ArrayList<>();
    boolean thongKeNhanKhauCheck;

    public toTruongHomePage(JFrame parent)
    {
        super(parent);
        setTitle("To truong Home Page");
        setContentPane(toTruongHomePagePanel);
        setModal(true);
        setMinimumSize(new Dimension(550, 450));
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
//
        btnLichSu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(lichSuThayDoiNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();
            }
        });
        btnDuyetYeuCau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetYeuCauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();
            }
        });

        btnDuyetYeuCauHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetYeuCauHoKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();
            }
        });
        btnDuyetYeuCauNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetYeuCauNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();
            }
        });


        //setVisible(true);


        btnDuyetYeuCauSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetYeuCauSuKienPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKySuDungNhaVanHoa = toTruongController.thongKeSuKien();
                duyetSuKienTableModel duyetSuKienTableModel = new duyetSuKienTableModel(dsDangKySuDungNhaVanHoa);
                tblDuyetSuKien.setModel(duyetSuKienTableModel);
                tblDuyetSuKien.setAutoCreateRowSorter(true);
            }
        });
        btnThongKeNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(thongKeNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsNhanKhau = toTruongController.thongKeNhanKhau();
                nhanKhauTableModel nhanKhauTableModel = new nhanKhauTableModel(dsNhanKhau);
                tblThongKeNhanKhau.setModel(nhanKhauTableModel);
                tblThongKeNhanKhau.setAutoCreateRowSorter(true);

            }
        });
        btnDuyetYeuCauTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetTamVangPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsTamVang = toTruongController.thongKeTamVang();
                duyetTamVangTableModel duyetTamVangTableModel = new duyetTamVangTableModel(dsTamVang);
                tblDuyetTamVang.setModel(duyetTamVangTableModel);
                tblDuyetTamVang.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetYeuCauTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetTamTruPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsTamTru = toTruongController.thongKeTamTru();
                duyetTamTruTableModel duyetTamTruTableModel = new duyetTamTruTableModel(dsTamTru);
                tblDuyetTamTru.setModel(duyetTamTruTableModel);
                tblDuyetTamTru.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetThemNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKyThemNhanKhau = toTruongController.thongKeThemNhanKhau();
                duyetThemNhanKhauTableModel duyetThemNhanKhauTableModel = new duyetThemNhanKhauTableModel(dsDangKyThemNhanKhau);
                tblDuyetThemNhanKhau.setModel(duyetThemNhanKhauTableModel);
                tblDuyetThemNhanKhau.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetSuaNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKySuaNhanKhau = toTruongController.thongKeSuaNhanKhau();
                duyetSuaNhanKhauTableModel duyetSuaNhanKhauTableModel = new duyetSuaNhanKhauTableModel(dsDangKySuaNhanKhau);
                tblDuyetSuaNhanKhau.setModel(duyetSuaNhanKhauTableModel);
                tblDuyetSuaNhanKhau.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetXoaNhanKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKyXoaNhanKhau = toTruongController.thongKeXoaNhanKhau();
                duyetXoaNhanKhauTableModel duyetXoaNhanKhauTableModel = new duyetXoaNhanKhauTableModel(dsDangKyXoaNhanKhau);
                tblDuyetXoaNhanKhau.setModel(duyetXoaNhanKhauTableModel);
                tblDuyetXoaNhanKhau.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetThemHoKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKyThemHoKhau = toTruongController.thongKeThemHoKhau();
                duyetThemHoKhauTableModel duyetThemHoKhauTableModel = new duyetThemHoKhauTableModel(dsDangKyThemHoKhau);
                tblDuyetThemHoKhau.setModel(duyetThemHoKhauTableModel);
                tblDuyetThemHoKhau.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetThemHoKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKySuaHoKhau = toTruongController.thongKeSuaHoKhau();
                duyetSuaHoKhauTableModel duyetSuaHoKhauTableModel = new duyetSuaHoKhauTableModel(dsDangKySuaHoKhau);
                tblDuyetSuaHoKhau.setModel(duyetSuaHoKhauTableModel);
                tblDuyetSuaHoKhau.setAutoCreateRowSorter(true);
            }
        });
        btnDuyetXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanelToTruong.removeAll();
                parentPanelToTruong.add(duyetXoaHoKhauPanel);
                parentPanelToTruong.repaint();
                parentPanelToTruong.revalidate();

                toTruongController toTruongController = new toTruongController();
                dsDangKyXoaHoKhau = toTruongController.thongKeXoaHoKhau();
                duyetXoaHoKhauTableModel duyetXoaHoKhauTableModel = new duyetXoaHoKhauTableModel(dsDangKyXoaHoKhau);
                tblDuyetXoaHoKhau.setModel(duyetXoaHoKhauTableModel);
                tblDuyetXoaHoKhau.setAutoCreateRowSorter(true);
            }
        });

        tblDuyetThemNhanKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRow = tblDuyetThemNhanKhau.getSelectedRow();
                // Lấy giá trị tại cột ID của dòng được chọn
                int id = (int) tblDuyetThemNhanKhau.getValueAt(selectedRow, 0);
                // Gọi phương thức và truyền giá trị ID vào
                btnXacNhanThemNhanKhau.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetThemNhanKhau(true, id);
                    }
                });
                btnTuChoiThemNhanKhau.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetThemNhanKhau(false, id);
                    }
                });
            }
        });
        tblDuyetSuaNhanKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetSuaNhanKhau.getSelectedRow();

                if (selectedRowIndex >= 0) {

                     int idGiayDangKySuaNhanKhau = Integer.parseInt(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 0).toString());
                     int idNguoiKhai = Integer.parseInt(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 1).toString());
                     int idNguoiDuocSua = Integer.parseInt(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 2).toString());
                     String ngayKhai = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 3).toString();
                     String hoTenMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 4).toString();
                     String bietDanhMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 5).toString();
                     int soCMTMoi = Integer.parseInt(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 6).toString());
                     String ngayCapCMT = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 7).toString();
                     String noiCapCMT = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 8).toString();
                     int namSinhMoi = Integer.parseInt(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 9).toString());
                     String gioiTinhMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 10).toString();
                     String noiSinhMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 11).toString();
                     String danTocMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 12).toString();
                     String tonGiaoMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 13).toString();
                     String quocTichMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 14).toString();
                     String nguyenQuanMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 15).toString();
                     String noiThuongTruMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 16).toString();
                     String ngheNghiepMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 17).toString();
                     String noiLamViecMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 18).toString();
                     String ngayDangKyThuongTruMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 19).toString();
                     boolean tamTruMoi = Boolean.parseBoolean(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 20).toString());
                     boolean tamVangMoi = Boolean.parseBoolean(tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 21).toString());
                     String ghiChuMoi = tblDuyetSuaNhanKhau.getValueAt(selectedRowIndex, 22).toString();

                    dangKySuaNhanKhau dangKySuaNhanKhau = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau, idNguoiKhai, idNguoiDuocSua, Date.valueOf(ngayKhai), hoTenMoi, bietDanhMoi, soCMTMoi,
                            Date.valueOf(ngayCapCMT), noiCapCMT, namSinhMoi, gioiTinhMoi,noiSinhMoi, danTocMoi, tonGiaoMoi, quocTichMoi, nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi,
                            noiLamViecMoi, Date.valueOf(ngayDangKyThuongTruMoi), tamTruMoi,tamVangMoi,ghiChuMoi);

                    btnXacNhanSuaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetSuaNhanKhau(true, dangKySuaNhanKhau);
                        }
                    });
                    btnTuChoiSuaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetSuaNhanKhau(false, dangKySuaNhanKhau);
                        }
                    });
                }

            }
        });
        tblDuyetXoaNhanKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetXoaNhanKhau.getSelectedRow();

                if (selectedRowIndex >= 0) {

                     int idGiayDangKyXoaNhanKhau = Integer.parseInt(tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 0).toString());
                     int idNguoiKhai = Integer.parseInt(tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 1).toString());
                     int idNguoiBiXoa = Integer.parseInt(tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 2).toString());
                     String ngayKhai = tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 3).toString();
                     String ngayXoa = tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 4).toString();
                     String noiChuyen = tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 5).toString();
                     String ghiChu = tblDuyetXoaNhanKhau.getValueAt(selectedRowIndex, 7).toString();


                    dangKyXoaNhanKhau dangKyXoaNhanKhau = new dangKyXoaNhanKhau(idGiayDangKyXoaNhanKhau, idNguoiKhai, idNguoiBiXoa, Date.valueOf(ngayKhai),
                            Date.valueOf(ngayXoa), noiChuyen, ghiChu);

                    btnXacNhanXoaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetXoaNhanKhau(true, dangKyXoaNhanKhau);
                        }
                    });
                    btnTuChoiXoaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetXoaNhanKhau(false, dangKyXoaNhanKhau);
                        }
                    });
                }

            }
        });

        tblDuyetThemHoKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRow = tblDuyetThemHoKhau.getSelectedRow();
                // Lấy giá trị tại cột ID của dòng được chọn
                int id = (int) tblDuyetThemHoKhau.getValueAt(selectedRow, 0);
                // Gọi phương thức và truyền giá trị ID vào
                btnXacNhanThemHoKhau.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetThemHoKhau(true, id);
                    }
                });
                btnTuChoiThemHoKhau.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetThemHoKhau(false, id);
                    }
                });
            }
        });
        tblDuyetSuaHoKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetSuaHoKhau.getSelectedRow();

                if (selectedRowIndex >= 0) {

                    int idGiayDangKySuaHoKhau = Integer.parseInt(tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 0).toString());
                    int idHoKhau = Integer.parseInt(tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 1).toString());
                    int idChuHoMoi = Integer.parseInt(tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 2).toString());
                    String diaChiMoi = tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 3).toString();
                    String ngayThayDoi = tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 4).toString();
                    int idNguoiKhai = Integer.parseInt(tblDuyetSuaHoKhau.getValueAt(selectedRowIndex, 5).toString());


                    dangKySuaHoKhau dangKySuaHoKhau = new dangKySuaHoKhau(idGiayDangKySuaHoKhau, idHoKhau, idChuHoMoi,diaChiMoi, Date.valueOf(ngayThayDoi), idNguoiKhai);

                    btnXacNhanSuaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetSuaHoKhau(true, dangKySuaHoKhau);
                        }
                    });
                    btnTuChoiSuaNhanKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetSuaHoKhau(false, dangKySuaHoKhau);
                        }
                    });
                }

            }
        });
        tblDuyetXoaHoKhau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetXoaHoKhau.getSelectedRow();

                if (selectedRowIndex >= 0) {

                    int idGiayDangKyXoaHoKhau = Integer.parseInt(tblDuyetXoaHoKhau.getValueAt(selectedRowIndex, 0).toString());
                    int idHoKhau = Integer.parseInt(tblDuyetXoaHoKhau.getValueAt(selectedRowIndex, 1).toString());
                    String lyDo = tblDuyetXoaHoKhau.getValueAt(selectedRowIndex, 2).toString();
                    String ngayKhai = tblDuyetXoaHoKhau.getValueAt(selectedRowIndex, 3).toString();
                    int idNguoiKhai = Integer.parseInt(tblDuyetXoaHoKhau.getValueAt(selectedRowIndex, 4).toString());


                    dangKyXoaHoKhau dangKyXoaHoKhau = new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau, idHoKhau, lyDo, Date.valueOf(ngayKhai), idNguoiKhai);

                    btnXacNhanXoaHoKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetXoaHoKhau(true, dangKyXoaHoKhau);
                        }
                    });
                    btnTuChoiXoaHoKhau.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetXoaHoKhau(false, dangKyXoaHoKhau);
                        }
                    });
                }

            }
        });

        tblDuyetTamTru.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetTamTru.getSelectedRow();

                if (selectedRowIndex >= 0) {

                    int idGiayTamTru = Integer.parseInt(tblDuyetTamTru.getValueAt(selectedRowIndex, 0).toString());
                    int idNhanKhau = Integer.parseInt(tblDuyetTamTru.getValueAt(selectedRowIndex, 1).toString());
                    String noiTamTru = tblDuyetTamTru.getValueAt(selectedRowIndex, 2).toString();
                    String noiThuongTru = tblDuyetTamTru.getValueAt(selectedRowIndex, 3).toString();
                    String tuNgay = tblDuyetTamTru.getValueAt(selectedRowIndex, 4).toString();
                    String denNgay = tblDuyetTamTru.getValueAt(selectedRowIndex, 5).toString();
                    String lyDo = tblDuyetTamTru.getValueAt(selectedRowIndex, 6).toString();


                    tamTru tamTru = new tamTru(idGiayTamTru, idNhanKhau, noiTamTru,noiThuongTru, Date.valueOf(tuNgay), Date.valueOf(denNgay),lyDo);

                    btnDuyetYeuCauTamTru.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetGiayTamTru(true, tamTru);
                        }
                    });
                    btnTuChoiTamTru.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetGiayTamTru(false, tamTru);
                        }
                    });
                }

            }
        });
        tblDuyetTamVang.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRowIndex = tblDuyetTamVang.getSelectedRow();

                if (selectedRowIndex >= 0) {

                    int idGiayTamVang = Integer.parseInt(tblDuyetTamVang.getValueAt(selectedRowIndex, 0).toString());
                    int idNhanKhau = Integer.parseInt(tblDuyetTamVang.getValueAt(selectedRowIndex, 1).toString());
                    String noiThuongTru = tblDuyetTamVang.getValueAt(selectedRowIndex, 2).toString();
                    String tuNgay = tblDuyetTamVang.getValueAt(selectedRowIndex, 3).toString();
                    String denNgay = tblDuyetTamVang.getValueAt(selectedRowIndex, 4).toString();
                    String lyDo = tblDuyetTamVang.getValueAt(selectedRowIndex, 5).toString();


                    tamVang tamVang = new tamVang(idGiayTamVang, idNhanKhau,noiThuongTru, Date.valueOf(tuNgay), Date.valueOf(denNgay),lyDo);

                    btnDuyetYeuCauTamVang.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetGiayTamVang(true, tamVang);
                        }
                    });
                    btnTuChoiTamVang.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            toTruongController toTruongController = new toTruongController();

                            toTruongController.pheDuyetGiayTamVang(false, tamVang);
                        }
                    });
                }

            }
        });
        tblDuyetSuKien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Lấy vị trí dòng được chọn
                int selectedRow = tblDuyetSuKien.getSelectedRow();
                // Lấy giá trị tại cột ID của dòng được chọn
                int id = (int) tblDuyetSuKien.getValueAt(selectedRow, 0);
                // Gọi phương thức và truyền giá trị ID vào
                btnDuyetYeuCauSuKien.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetNhaVanHoa(true, id);
                    }
                });
                btnTuChoiYeuCauSuKien.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        toTruongController toTruongController = new toTruongController();

                        toTruongController.pheDuyetNhaVanHoa(false, id);
                    }
                });
            }
        });


    }

    
    public static void main(String[] args)
    {
        toTruongHomePage toTruongHomePage = new toTruongHomePage(null);
        toTruongHomePage.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    private static class nhanKhauTableModel extends AbstractTableModel{

        private final String[] NHANKHAUTABLECOLUMNS = {"ID", "Ho Ten", "Biet Danh","So CCCD","Ngay cap CCCD", "Nam sinh","Gioi tinh","Noi sinh","Dan toc",
                                                        "Ton Giao","Quoc tich","Nguyen Quan","Noi Thuong Chu","Nghe Nghiep","Noi lam viec",
                                                        "Ngay DK Thuong Chu","Trang Thai Tam Tru","Trang Thai Tam Vang", "Ghi Chu"};
        private List<nhanKhau> nhanKhauList;

        public nhanKhauTableModel(ArrayList<nhanKhau> nhanKhauList)
        {
            this.nhanKhauList = nhanKhauList;
        }

        @Override
        public int getRowCount() {
            return nhanKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return NHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> nhanKhauList.get(rowIndex).getIdNhanKhau();
                case 1 -> nhanKhauList.get(rowIndex).getHoTen();
                case 2 -> nhanKhauList.get(rowIndex).getBietDanh();
                case 3 -> nhanKhauList.get(rowIndex).getSoCMT();
                case 4 -> nhanKhauList.get(rowIndex).getNgayCapCMT();
                case 5 -> nhanKhauList.get(rowIndex).getNamSinh();
                case 6 -> nhanKhauList.get(rowIndex).getGioiTinh();
                case 7 -> nhanKhauList.get(rowIndex).getNoiSinh();
                case 8 -> nhanKhauList.get(rowIndex).getDanToc();
                case 9 -> nhanKhauList.get(rowIndex).getTonGiao();
                case 10 -> nhanKhauList.get(rowIndex).getQuocTich();
                case 11 -> nhanKhauList.get(rowIndex).getNguyenQuan();
                case 12 -> nhanKhauList.get(rowIndex).getNoiThuongTru();
                case 13 -> nhanKhauList.get(rowIndex).getNgheNghiep();
                case 14 -> nhanKhauList.get(rowIndex).getNoiLamViec();
                case 15 -> nhanKhauList.get(rowIndex).getNgayDangKyThuongTru();
                case 16 -> nhanKhauList.get(rowIndex).getTrangThaiTamTru();
                case 17 -> nhanKhauList.get(rowIndex).getTrangThaiTamVang();
                case 18 -> nhanKhauList.get(rowIndex).getGhiChu();


                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return NHANKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }

    private static class duyetSuKienTableModel extends AbstractTableModel{

        private final String[] DUYETSUKIENTABLECOLUMNS = {"ID", "Ngày tổ chức", "Loại sự kiện", "Phí sử dụng", "Ghi chú"};
        private List<dangKySuDungNhaVanHoa> dangKySuDungNhaVanHoaList;

        public duyetSuKienTableModel(ArrayList<dangKySuDungNhaVanHoa> dangKySuDungNhaVanHoaList)
        {
            this.dangKySuDungNhaVanHoaList = dangKySuDungNhaVanHoaList;
        }

        @Override
        public int getRowCount() {
            return dangKySuDungNhaVanHoaList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETSUKIENTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKySuDungNhaVanHoaList.get(rowIndex).getIdGiayDangKy();
                case 1 -> dangKySuDungNhaVanHoaList.get(rowIndex).getNgayToChuc();
                case 2 -> dangKySuDungNhaVanHoaList.get(rowIndex).getLoaiSuKien();
                case 3 -> dangKySuDungNhaVanHoaList.get(rowIndex).getPhiSuDung();
                case 4 -> dangKySuDungNhaVanHoaList.get(rowIndex).getGhiChu();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETSUKIENTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetTamVangTableModel extends AbstractTableModel{

        private final String[] DUYETTAMVANGTABLECOLUMNS = {"ID", "ID Nhan Khau", "Noi thuong tru", "Tu ngay", "Den ngay", "Ly do"};
        private List<tamVang> tamVangList;

        public duyetTamVangTableModel(ArrayList<tamVang> tamVangList)
        {
            this.tamVangList = tamVangList;
        }

        @Override
        public int getRowCount() {
            return tamVangList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETTAMVANGTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> tamVangList.get(rowIndex).getIdGiayTamVang();
                case 1 -> tamVangList.get(rowIndex).getIdNhanKhau();
                case 2 -> tamVangList.get(rowIndex).getNoiThuongTru();
                case 3 -> tamVangList.get(rowIndex).getTuNgay();
                case 4 -> tamVangList.get(rowIndex).getDenNgay();
                case 5 -> tamVangList.get(rowIndex).getLyDo();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETTAMVANGTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetTamTruTableModel extends AbstractTableModel{

        private final String[] DUYETTAMTRUTABLECOLUMNS = {"ID", "ID Nhan Khau", "Noi thuong tru", "Tu ngay", "Den ngay", "Ly do"};
        private List<tamTru> tamTruList;

        public duyetTamTruTableModel(ArrayList<tamTru> tamTruList)
        {
            this.tamTruList = tamTruList;
        }

        @Override
        public int getRowCount() {
            return tamTruList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETTAMTRUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> tamTruList.get(rowIndex).getIdGiayTamTru();
                case 1 -> tamTruList.get(rowIndex).getIdNhanKhau();
                case 2 -> tamTruList.get(rowIndex).getNoiTamTru();
                case 3 -> tamTruList.get(rowIndex).getNoiThuongTru();
                case 4 -> tamTruList.get(rowIndex).getTuNgay();
                case 5 -> tamTruList.get(rowIndex).getDenNgay();
                case 6 -> tamTruList.get(rowIndex).getLyDo();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETTAMTRUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }

    private static class duyetThemNhanKhauTableModel extends AbstractTableModel{

        private final String[] DUYETTHEMNHANKHAUTABLECOLUMNS = {"ID", "ID Nguoi Khai", "Ngay khai", "Ho Ten", "Biet Danh","So CCCD","Ngay cap CCCD", "Nam sinh","Gioi tinh","Noi sinh","Dan toc",
                "Ton Giao","Quoc tich","Nguyen Quan","Noi Thuong Chu","Nghe Nghiep","Noi lam viec",
                "Ngay DK Thuong Chu","Trang Thai Tam Tru","Trang Thai Tam Vang", "Ghi Chu"};
        private List<dangKyThemNhanKhau> dangKyThemNhanKhauList;

        public duyetThemNhanKhauTableModel(ArrayList<dangKyThemNhanKhau> dangKyThemNhanKhauList)
        {
            this.dangKyThemNhanKhauList = dangKyThemNhanKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKyThemNhanKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETTHEMNHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKyThemNhanKhauList.get(rowIndex).getIdGiayDangKyThemNhanKhau();
                case 1 -> dangKyThemNhanKhauList.get(rowIndex).getIdNguoiKhai();
                case 2 -> dangKyThemNhanKhauList.get(rowIndex).getNgayKhai();
                case 3 -> dangKyThemNhanKhauList.get(rowIndex).getHoTen();
                case 4 -> dangKyThemNhanKhauList.get(rowIndex).getBietDanh();
                case 5 -> dangKyThemNhanKhauList.get(rowIndex).getSoCMT();
                case 6 -> dangKyThemNhanKhauList.get(rowIndex).getNgayCapCMT();
                case 7 -> dangKyThemNhanKhauList.get(rowIndex).getNamSinh();
                case 8 -> dangKyThemNhanKhauList.get(rowIndex).getGioiTinh();
                case 9 -> dangKyThemNhanKhauList.get(rowIndex).getNoiSinh();
                case 10 -> dangKyThemNhanKhauList.get(rowIndex).getDanToc();
                case 11 -> dangKyThemNhanKhauList.get(rowIndex).getTonGiao();
                case 12 -> dangKyThemNhanKhauList.get(rowIndex).getQuocTich();
                case 13 -> dangKyThemNhanKhauList.get(rowIndex).getNguyenQuan();
                case 14 -> dangKyThemNhanKhauList.get(rowIndex).getNoiThuongTru();
                case 15 -> dangKyThemNhanKhauList.get(rowIndex).getNgheNghiep();
                case 16 -> dangKyThemNhanKhauList.get(rowIndex).getNoiLamViec();
                case 17 -> dangKyThemNhanKhauList.get(rowIndex).getNgayDangKyThuongTru();
                case 18 -> dangKyThemNhanKhauList.get(rowIndex).isTrangThaiTamTru();
                case 19 -> dangKyThemNhanKhauList.get(rowIndex).isTrangThaiTamVang();
                case 20 -> dangKyThemNhanKhauList.get(rowIndex).getGhiChu();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETTHEMNHANKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetSuaNhanKhauTableModel extends AbstractTableModel{

        private final String[] DUYETSUANHANKHAUTABLECOLUMNS = {"ID", "ID Nguoi Khai", "Ngay khai", "Ho Ten", "Biet Danh","So CCCD","Ngay cap CCCD", "Nam sinh","Gioi tinh","Noi sinh","Dan toc",
                "Ton Giao","Quoc tich","Nguyen Quan","Noi Thuong Chu","Nghe Nghiep","Noi lam viec",
                "Ngay DK Thuong Chu","Trang Thai Tam Tru","Trang Thai Tam Vang", "Ghi Chu"};
        private List<dangKySuaNhanKhau> dangKySuaNhanKhauList;

        public duyetSuaNhanKhauTableModel(ArrayList<dangKySuaNhanKhau> dangKySuaNhanKhauList)
        {
            this.dangKySuaNhanKhauList = dangKySuaNhanKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKySuaNhanKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETSUANHANKHAUTABLECOLUMNS.length;
        }
//Moi
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKySuaNhanKhauList.get(rowIndex).getIdGiayDangKySuaNhanKhau();
                case 1 -> dangKySuaNhanKhauList.get(rowIndex).getIdNguoiKhai();
                case 2 -> dangKySuaNhanKhauList.get(rowIndex).getNgayKhai();
                case 3 -> dangKySuaNhanKhauList.get(rowIndex).getHoTenMoi();
                case 4 -> dangKySuaNhanKhauList.get(rowIndex).getBietDanhMoi();
                case 5 -> dangKySuaNhanKhauList.get(rowIndex).getSoCMTMoi();
                case 6 -> dangKySuaNhanKhauList.get(rowIndex).getNgayCapCMT();
                case 7 -> dangKySuaNhanKhauList.get(rowIndex).getNamSinhMoi();
                case 8 -> dangKySuaNhanKhauList.get(rowIndex).getGioiTinhMoi();
                case 9 -> dangKySuaNhanKhauList.get(rowIndex).getNoiSinhMoi();
                case 10 -> dangKySuaNhanKhauList.get(rowIndex).getDanTocMoi();
                case 11 -> dangKySuaNhanKhauList.get(rowIndex).getTonGiaoMoi();
                case 12 -> dangKySuaNhanKhauList.get(rowIndex).getQuocTichMoi();
                case 13 -> dangKySuaNhanKhauList.get(rowIndex).getNguyenQuanMoi();
                case 14 -> dangKySuaNhanKhauList.get(rowIndex).getNoiThuongTruMoi();
                case 15 -> dangKySuaNhanKhauList.get(rowIndex).getNgheNghiepMoi();
                case 16 -> dangKySuaNhanKhauList.get(rowIndex).getNoiLamViecMoi();
                case 17 -> dangKySuaNhanKhauList.get(rowIndex).getNgayDangKyThuongTruMoi();
                case 18 -> dangKySuaNhanKhauList.get(rowIndex).isTamTruMoi();
                case 19 -> dangKySuaNhanKhauList.get(rowIndex).isTamVangMoi();
                case 20 -> dangKySuaNhanKhauList.get(rowIndex).getGhiChuMoi();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETSUANHANKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetXoaNhanKhauTableModel extends AbstractTableModel{

        private final String[] DUYETXOANHANKHAUTABLECOLUMNS = {"ID", "ID Nguoi Khai", "Ngay khai", "Id Nguoi Bi Xoa", "Ngay Xoa","Noi Chuyen", "Ghi Chu"};
        private List<dangKyXoaNhanKhau> dangKyXoaNhanKhauList;

        public duyetXoaNhanKhauTableModel(ArrayList<dangKyXoaNhanKhau> dangKyXoaNhanKhauList)
        {
            this.dangKyXoaNhanKhauList = dangKyXoaNhanKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKyXoaNhanKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETXOANHANKHAUTABLECOLUMNS.length;
        }
//Moi
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKyXoaNhanKhauList.get(rowIndex).getIdGiayDangKyXoaNhanKhau();
                case 1 -> dangKyXoaNhanKhauList.get(rowIndex).getIdNguoiKhai();
                case 2 -> dangKyXoaNhanKhauList.get(rowIndex).getNgayKhai();
                case 3 -> dangKyXoaNhanKhauList.get(rowIndex).getIdNguoiBiXoa();
                case 4 -> dangKyXoaNhanKhauList.get(rowIndex).getNgayXoa();
                case 5 -> dangKyXoaNhanKhauList.get(rowIndex).getNoiChuyen();
                case 6 -> dangKyXoaNhanKhauList.get(rowIndex).getGhiChu();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETXOANHANKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }

    private static class duyetThemHoKhauTableModel extends AbstractTableModel{

        private final String[] DUYETTHEMNHOKHAUTABLECOLUMNS = {"ID", "ID Chu ho", "Ma khu vuc", "Dia chi","Ngay Lap", "Ngay Khai"};
        private List<dangKyThemHoKhau> dangKyThemHoKhauList;

        public duyetThemHoKhauTableModel(ArrayList<dangKyThemHoKhau> dangKyThemHoKhauList)
        {
            this.dangKyThemHoKhauList = dangKyThemHoKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKyThemHoKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETTHEMNHOKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKyThemHoKhauList.get(rowIndex).getIdGiayDangKyThemHoKhau();
                case 1 -> dangKyThemHoKhauList.get(rowIndex).getIdChuHo();
                case 2 -> dangKyThemHoKhauList.get(rowIndex).getMaKhuVuc();
                case 3 -> dangKyThemHoKhauList.get(rowIndex).getDiaChi();
                case 4 -> dangKyThemHoKhauList.get(rowIndex).getNgayLap();
                case 5 -> dangKyThemHoKhauList.get(rowIndex).getNgayKhai();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETTHEMNHOKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetSuaHoKhauTableModel extends AbstractTableModel{

        private final String[] DUYETTHEMNSUAKHAUTABLECOLUMNS = {"ID", "ID Ho khau", "Id chu ho moi", "Dia chi","Ngay Thay Doi", "Id Nguoi Khai"};
        private List<dangKySuaHoKhau> dangKySuaHoKhauList;

        public duyetSuaHoKhauTableModel(ArrayList<dangKySuaHoKhau> dangKySuaHoKhauList)
        {
            this.dangKySuaHoKhauList = dangKySuaHoKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKySuaHoKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETTHEMNSUAKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKySuaHoKhauList.get(rowIndex).getIdGiayDangKySuaHoKhau();
                case 1 -> dangKySuaHoKhauList.get(rowIndex).getIdHoKhau();
                case 2 -> dangKySuaHoKhauList.get(rowIndex).getIdChuHoMoi();
                case 3 -> dangKySuaHoKhauList.get(rowIndex).getDiaChiMoi();
                case 4 -> dangKySuaHoKhauList.get(rowIndex).getNgayThayDoi();
                case 5 -> dangKySuaHoKhauList.get(rowIndex).getIdNguoiKhai();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETTHEMNSUAKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
    private static class duyetXoaHoKhauTableModel extends AbstractTableModel{

        private final String[] DUYETXOAHOKHAUTABLECOLUMNS = {"ID", "ID Ho khau", "Id chu ho moi", "Dia chi","Ngay Thay Doi", "Id Nguoi Khai"};
        private List<dangKyXoaHoKhau> dangKyXoaHoKhauList;

        public duyetXoaHoKhauTableModel(ArrayList<dangKyXoaHoKhau> dangKyXoaHoKhauList)
        {
            this.dangKyXoaHoKhauList = dangKyXoaHoKhauList;
        }

        @Override
        public int getRowCount() {
            return dangKyXoaHoKhauList.size();
        }

        @Override
        public int getColumnCount() {
            return DUYETXOAHOKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> dangKyXoaHoKhauList.get(rowIndex).getIdGiayDangKyXoaHoKhau();
                case 1 -> dangKyXoaHoKhauList.get(rowIndex).getIdHoKhau();
                case 2 -> dangKyXoaHoKhauList.get(rowIndex).getLyDo();
                case 3 -> dangKyXoaHoKhauList.get(rowIndex).getNgayKhai();
                case 4 -> dangKyXoaHoKhauList.get(rowIndex).getIdNguoiKhai();

                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column){
            return DUYETXOAHOKHAUTABLECOLUMNS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex){
            if (getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
}
