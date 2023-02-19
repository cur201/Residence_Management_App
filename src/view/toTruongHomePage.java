package view;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import controller.toTruongController;
import model.*;

public class toTruongHomePage extends JDialog {
    private JPanel toTruongHomePagePanel;
    private JPanel toTruongContentPanel;
    private JPanel toTruongControlPanel;
    private JPanel thongKeNhanKhauPanel;
    private JPanel lichSuNhanKhauPanel;
    private JPanel toTruongTitlePanel;
    private JPanel toTruongSearchBarContent;
    private JPanel lichSuNhanKhauChonIDPanel;
    private JPanel lichSuNhanKhauKetQuaPanel;
    private JTextField txtKeyword;
    private JComboBox boxTypeTimKiem;
    private JButton btnTimKiem;
    private JTextField txtIDLichSuNhanKhau;
    private JButton btnTimKiemLichSuNhanKhau;
    private JTable tblDanhSachNhanKhau;
    private JTable tblDSLichSuNhanKhau;
    private JButton btnCancelLichSuNhanKhau;
    private JButton btnCancelThongKeNhanKhau;
    private JPanel duyetYeuCauPanel;
    private JButton btnDuyetGiayToNhanKhau;
    private JButton btnDuyetGiayToHoKhau;
    private JButton btnDuyetGiayToSuKien;
    private JPanel duyetGiayToNhanKhauPanel;
    private JPanel duyetGiayToHoKhauPanel;
    private JPanel duyetGiayToNhaVanHoaPanel;
    private JButton btnDKThemNhanKhau;
    private JButton btnDKSuaNhanKhau;
    private JButton btnDKXoaNhanKhau;
    private JButton btnDKTamTru;
    private JButton btnDKTamVang;
    private JButton btnCancelDuyetGiayToNhanKhau;
    private JButton btnDKThemHoKhau;
    private JButton btnDKSuaHoKhau;
    private JButton btnDKXoaHoKhau;
    private JButton btnDKThemNhanKhauVaoHo;
    private JButton btnDKXoaNhanKhauKhoiHo;
    private JButton btnDKSuKienNhaVanHoa;
    private JPanel duyetDKThemNhanKhauPanel;
    private JTable tblDSDKThemNhanKhau;
    private JButton btnPheDuyetThemNhanKhau;
    private JButton btnTuChoiPheDuyetThemNhanKhau;
    private JButton btnCancelDuyetThemNhanKhau;
    private JButton btnLSNhanKhau;
    private JButton btnDuyetYeuCau;
    private JPanel toTruongContentDefaultPanel;
    private JButton btnCancelDuyetGiayToHoKhau;
    private JButton btnCancelDKSuKienNhaVanHoa;
    private JButton btnLogout;
    private JButton btnThongKeNhanKhau;
    private JPanel duyetDKSuaNhanKhauPanel;
    private JPanel duyetDKXoaNhanKhauPanel;
    private JPanel duyetDKTamTruPanel;
    private JPanel duyetDKTamVangPanel;
    private JPanel duyetDKThemHoKhauPanel;
    private JPanel duyetDKSuaHoKhauPanel;
    private JPanel duyetDKXoaHoKhauPanel;
    private JPanel duyetDKThemNhanKhauVaoHoPanel;
    private JPanel duyetDKXoaNhanKhauKhoiHoPanel;
    private JPanel duyetDKSuDungNhaVanHoaPanel;
    private JTable tblDSDKSuaNhanKhau;
    private JButton btnPheDuyetSuaNhanKhau;
    private JButton btnTuChoiPheDuyetSuaNhanKhau;
    private JButton btnCancelDuyetSuaNhanKhau;
    private JTable tblDSDKXoaNhanKhau;
    private JButton btnPheDuyetXoaNhanKhau;
    private JButton btnTuChoiPheDuyetXoaNhanKhau;
    private JButton btnCancelDuyetXoaNhanKhau;
    private JTable tblDSDKTamTru;
    private JButton btnPheDuyetTamTru;
    private JButton btnTuChoiPheDuyetTamTru;
    private JButton btnCancelDuyetTamTru;
    private JTable tblDSDKTamVang;
    private JButton btnPheDuyetTamVang;
    private JButton btnTuChoiPheDuyetTamVang;
    private JButton btnCancelDuyetTamVang;
    private JTable tblDSDKThemHoKhau;
    private JButton btnPheDuyetThemHoKhau;
    private JButton btnTuChoiPheDuyetThemHoKhau;
    private JButton btnCancelDuyetThemHoKhau;
    private JTable tblDSDKSuaHoKhau;
    private JButton btnPheDuyetSuaHoKhau;
    private JButton btnTuChoiPheDuyetSuaHoKhau;
    private JButton btnCancelDuyetSuaHoKhau;
    private JTable tblDSDKTXoaHoKhau;
    private JButton btnPheDuyetXoaHoKhau;
    private JButton btnTuChoiPheDuyetXoaHoKhau;
    private JButton btnCancelDuyetXoaHoKhau;
    private JTable tblDSDKThemNhanKhauVaoHo;
    private JButton btnPheDuyetThemNhanKhauVaoHo;
    private JButton btnTuChoiPheDuyetThemNhanKhauVaoHo;
    private JButton btnCancelDuyetThemNhanKhauVaoHo;
    private JTable tblDSDKXoaNhanKhauKhoiHo;
    private JButton btnPheDuyetXoaNhanKhauKhoiHo;
    private JButton btnTuChoiPheDuyetXoaNhanKhauKhoiHo;
    private JButton btnCancelDuyetXoaNhanKhauKhoiHo;
    private JTable tblDSDKTSuKienNhaVanHoa;
    private JButton btnPheDuyetSuKien;
    private JButton btnTuChoiPheDuyetSuKien;
    private JButton btnCancelDuyetSuKien;
    private JButton btnCancelLichSuNhanKhauChonID;
    private JButton btnCancelDuyetYeuCau;

    ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
    ArrayList<dangKyThemNhanKhau> dsDangKyThemNhanKhau = new ArrayList<dangKyThemNhanKhau>();
    ArrayList<dangKySuaNhanKhau> dsdangKySuaNhanKhau = new ArrayList<dangKySuaNhanKhau>();
    ArrayList<dangKyXoaNhanKhau> dsdangKyXoaNhanKhau = new ArrayList<dangKyXoaNhanKhau>();
    ArrayList<tamTru> dstamTru = new ArrayList<tamTru>();
    ArrayList<tamVang> dstamVang = new ArrayList<tamVang>();
    ArrayList<dangKyThemHoKhau> dsdangKyThemHoKhau = new ArrayList<dangKyThemHoKhau>();
    ArrayList<dangKySuaHoKhau> dsdangKySuaHoKhau = new ArrayList<dangKySuaHoKhau>();
    ArrayList<dangKyXoaHoKhau> dsdangKyXoaHoKhau = new ArrayList<dangKyXoaHoKhau>();
    ArrayList<dangKyThemNhanKhauVaoHo> dsdangKyThemNhanKhauVaoHo = new ArrayList<dangKyThemNhanKhauVaoHo>();
    ArrayList<dangKyXoaNhanKhauKhoiHo> dsdangKyXoaNhanKhauKhoiHo = new ArrayList<dangKyXoaNhanKhauKhoiHo>();
    ArrayList<dangKySuDungNhaVanHoa> dsdangKySuDungNhaVanHoa = new ArrayList<dangKySuDungNhaVanHoa>();
    ArrayList<lichSuNhanKhau> dsLichSuNhanKhau = new ArrayList<lichSuNhanKhau>();


    Integer selectedIndex;
    boolean check;

    toTruongController toTruongController = new toTruongController();

    public toTruongHomePage(JFrame parent)
    {
        super(parent);
        setTitle("To truong Home Page");
        setContentPane(toTruongHomePagePanel);
        setModal(true);
        setMinimumSize(new Dimension(650, 450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        toTruongContentPanel.removeAll();
        toTruongContentPanel.add(toTruongContentDefaultPanel);
        toTruongContentPanel.repaint();
        toTruongContentPanel.revalidate();

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main main = new Main(parent);
                main.setVisible(true);
            }
        });

        btnThongKeNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(thongKeNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
                dsNhanKhau = toTruongController.thongKeNhanKhau();
                nhanKhauTableModel nhanKhauTableModel = new nhanKhauTableModel(dsNhanKhau);
                tblDanhSachNhanKhau.setModel(nhanKhauTableModel);
                tblDanhSachNhanKhau.setAutoCreateRowSorter(true);
            }
        });
        btnCancelThongKeNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(toTruongContentDefaultPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnLSNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(lichSuNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnCancelLichSuNhanKhauChonID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(toTruongContentDefaultPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnTimKiemLichSuNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idLichSuNhanKhau = txtIDLichSuNhanKhau.getText();
                dsLichSuNhanKhau = toTruongController.lichSuThayDoiNhanKhau(Integer.parseInt(idLichSuNhanKhau));
                lichSuNhanKhauTableModel lichSuNhanKhauTableModel = new lichSuNhanKhauTableModel(dsLichSuNhanKhau);
                tblDSLichSuNhanKhau.setModel(lichSuNhanKhauTableModel);
                tblDSLichSuNhanKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(lichSuNhanKhauKetQuaPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnCancelLichSuNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(lichSuNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDuyetYeuCau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetYeuCauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });


        btnDuyetGiayToNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDuyetGiayToHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDuyetGiayToSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhaVanHoaPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnCancelDuyetYeuCau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(toTruongContentDefaultPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });


        btnDKThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsDangKyThemNhanKhau = toTruongController.xemDKThemNhanKhau();
                dkThemNhanKhauTableModel themNhanKhauTableModel = new dkThemNhanKhauTableModel(dsDangKyThemNhanKhau);
                tblDSDKThemNhanKhau.setModel(themNhanKhauTableModel);
                tblDSDKThemNhanKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKThemNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDKSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKySuaNhanKhau = toTruongController.xemDKSuaNhanKhau();
                dkSuaNhanKhauTableModel suaNhanKhauTableModel = new dkSuaNhanKhauTableModel(dsdangKySuaNhanKhau);
                tblDSDKSuaNhanKhau.setModel(suaNhanKhauTableModel);
                tblDSDKSuaNhanKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKSuaNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDKXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKyXoaNhanKhau = toTruongController.xemDKXoaNhanKhau();
                dkXoaNhanKhauTableModel xoaNhanKhauTableModel = new dkXoaNhanKhauTableModel(dsdangKyXoaNhanKhau);
                tblDSDKXoaNhanKhau.setModel(xoaNhanKhauTableModel);
                tblDSDKXoaNhanKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKXoaNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDKTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dstamTru = toTruongController.xemDKTamTru();
                dkTamTruTableModel tamTruTableModel = new dkTamTruTableModel(dstamTru);
                tblDSDKTamTru.setModel(tamTruTableModel);
                tblDSDKTamTru.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKTamTruPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnDKTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dstamVang = toTruongController.xemDKTamVang();
                dkTamVangTableModel tamVangTableModel = new dkTamVangTableModel(dstamVang);
                tblDSDKTamVang.setModel(tamVangTableModel);
                tblDSDKTamVang.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKTamVangPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });

        btnCancelDuyetGiayToNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetYeuCauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKyThemHoKhau = toTruongController.xemDKThemHoKhau();
                dkThemHoKhauTableModel themHoKhauTableModel = new dkThemHoKhauTableModel(dsdangKyThemHoKhau);
                tblDSDKThemHoKhau.setModel(themHoKhauTableModel);
                tblDSDKThemHoKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKThemHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKySuaHoKhau = toTruongController.xemDKSuaHoKhau();
                dkSuaHoKhauTableModel suaHoKhauTableModel = new dkSuaHoKhauTableModel(dsdangKySuaHoKhau);
                tblDSDKSuaHoKhau.setModel(suaHoKhauTableModel);
                tblDSDKSuaHoKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKSuaHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKyXoaHoKhau = toTruongController.xemDKXoaHoKhau();
                dkXoaHoKhauTableModel xoaHoKhauTableModel = new dkXoaHoKhauTableModel(dsdangKyXoaHoKhau);
                tblDSDKTXoaHoKhau.setModel(xoaHoKhauTableModel);
                tblDSDKTXoaHoKhau.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKXoaHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKThemNhanKhauVaoHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKyThemNhanKhauVaoHo = toTruongController.xemDKThemNhanKhauVaoHo();
                dkThemNhanKhauVaoHoTableModel themNhanKhauVaoHoTableModel = new dkThemNhanKhauVaoHoTableModel(dsdangKyThemNhanKhauVaoHo);
                tblDSDKThemNhanKhauVaoHo.setModel(themNhanKhauVaoHoTableModel);
                tblDSDKThemNhanKhauVaoHo.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKThemNhanKhauVaoHoPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKXoaNhanKhauKhoiHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKyXoaNhanKhauKhoiHo = toTruongController.xemDKXoaNhanKhauKhoiHo();
                dkXoaNhanKhauKhoiHoTableModel xoaNhanKhauKhoiHoTableModel = new dkXoaNhanKhauKhoiHoTableModel(dsdangKyXoaNhanKhauKhoiHo);
                tblDSDKXoaNhanKhauKhoiHo.setModel(xoaNhanKhauKhoiHoTableModel);
                tblDSDKXoaNhanKhauKhoiHo.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKXoaNhanKhauKhoiHoPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnCancelDuyetGiayToHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetYeuCauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnDKSuKienNhaVanHoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsdangKySuDungNhaVanHoa = toTruongController.xemDKSuDungNhaVanHoa();
                dkSuKienTableModel suKienTableModel = new dkSuKienTableModel(dsdangKySuDungNhaVanHoa);
                tblDSDKTSuKienNhaVanHoa.setModel(suKienTableModel);
                tblDSDKTSuKienNhaVanHoa.setAutoCreateRowSorter(true);
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetDKSuDungNhaVanHoaPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnCancelDKSuKienNhaVanHoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetYeuCauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKThemNhanKhau.getSelectedRow();
                if(dsDangKyThemNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsDangKyThemNhanKhau.get(selectedIndex).getIdGiayDangKyThemNhanKhau();
                    check = toTruongController.pheDuyetThemNhanKhau(true, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        });
        btnTuChoiPheDuyetThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKThemNhanKhau.getSelectedRow();
                if(dsDangKyThemNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsDangKyThemNhanKhau.get(selectedIndex).getIdGiayDangKyThemNhanKhau();
                    check = toTruongController.pheDuyetThemNhanKhau(false, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Từ chối phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetThemNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKSuaNhanKhau.getSelectedRow();
                if(dsdangKySuaNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKySuaNhanKhau = dsdangKySuaNhanKhau.get(selectedIndex).getIdGiayDangKySuaNhanKhau();
                    int idNguoiKhai = dsdangKySuaNhanKhau.get(selectedIndex).getIdNguoiKhai();
                    int idNguoiDuocSua = dsdangKySuaNhanKhau.get(selectedIndex).getIdNguoiDuocSua();
                    Date ngayKhai = dsdangKySuaNhanKhau.get(selectedIndex).getNgayKhai();
                    String hoTenMoi = dsdangKySuaNhanKhau.get(selectedIndex).getHoTenMoi();
                    String bietDanhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getBietDanhMoi();
                    int soCMTMoi = dsdangKySuaNhanKhau.get(selectedIndex).getSoCMTMoi();
                    Date ngayCapCMT = dsdangKySuaNhanKhau.get(selectedIndex).getNgayCapCMT();
                    String noiCapCMT = dsdangKySuaNhanKhau.get(selectedIndex).getNoiCapCMT();
                    int namSinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNamSinhMoi();
                    String gioiTinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getGioiTinhMoi();
                    String noiSinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiSinhMoi();
                    String danTocMoi = dsdangKySuaNhanKhau.get(selectedIndex).getDanTocMoi();
                    String tonGiaoMoi = dsdangKySuaNhanKhau.get(selectedIndex).getTonGiaoMoi();
                    String quocTichMoi = dsdangKySuaNhanKhau.get(selectedIndex).getQuocTichMoi();
                    String nguyenQuanMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNguyenQuanMoi();
                    String noiThuongTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiThuongTruMoi();
                    String ngheNghiepMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNgheNghiepMoi();
                    String noiLamViecMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiLamViecMoi();
                    Date ngayDangKyThuongTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNgayDangKyThuongTruMoi();
                    boolean tamTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).isTamTruMoi();
                    boolean tamVangMoi = dsdangKySuaNhanKhau.get(selectedIndex).isTamVangMoi();
                    String ghiChuMoi = dsdangKySuaNhanKhau.get(selectedIndex).getGhiChuMoi();
                    dangKySuaNhanKhau dk = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau, idNguoiKhai, idNguoiDuocSua, ngayKhai,
                            hoTenMoi, bietDanhMoi, soCMTMoi, ngayCapCMT, noiCapCMT, namSinhMoi, gioiTinhMoi, noiSinhMoi, danTocMoi, tonGiaoMoi,
                            quocTichMoi, nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi, noiLamViecMoi, ngayDangKyThuongTruMoi, tamTruMoi, tamVangMoi, ghiChuMoi);
                    check = toTruongController.pheDuyetSuaNhanKhau(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKSuaNhanKhau.getSelectedRow();
                if(dsdangKySuaNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKySuaNhanKhau = dsdangKySuaNhanKhau.get(selectedIndex).getIdGiayDangKySuaNhanKhau();
                    int idNguoiKhai = dsdangKySuaNhanKhau.get(selectedIndex).getIdNguoiKhai();
                    int idNguoiDuocSua = dsdangKySuaNhanKhau.get(selectedIndex).getIdNguoiDuocSua();
                    Date ngayKhai = dsdangKySuaNhanKhau.get(selectedIndex).getNgayKhai();
                    String hoTenMoi = dsdangKySuaNhanKhau.get(selectedIndex).getHoTenMoi();
                    String bietDanhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getBietDanhMoi();
                    int soCMTMoi = dsdangKySuaNhanKhau.get(selectedIndex).getSoCMTMoi();
                    Date ngayCapCMT = dsdangKySuaNhanKhau.get(selectedIndex).getNgayCapCMT();
                    String noiCapCMT = dsdangKySuaNhanKhau.get(selectedIndex).getNoiCapCMT();
                    int namSinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNamSinhMoi();
                    String gioiTinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getGioiTinhMoi();
                    String noiSinhMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiSinhMoi();
                    String danTocMoi = dsdangKySuaNhanKhau.get(selectedIndex).getDanTocMoi();
                    String tonGiaoMoi = dsdangKySuaNhanKhau.get(selectedIndex).getTonGiaoMoi();
                    String quocTichMoi = dsdangKySuaNhanKhau.get(selectedIndex).getQuocTichMoi();
                    String nguyenQuanMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNguyenQuanMoi();
                    String noiThuongTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiThuongTruMoi();
                    String ngheNghiepMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNgheNghiepMoi();
                    String noiLamViecMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNoiLamViecMoi();
                    Date ngayDangKyThuongTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).getNgayDangKyThuongTruMoi();
                    boolean tamTruMoi = dsdangKySuaNhanKhau.get(selectedIndex).isTamTruMoi();
                    boolean tamVangMoi = dsdangKySuaNhanKhau.get(selectedIndex).isTamVangMoi();
                    String ghiChuMoi = dsdangKySuaNhanKhau.get(selectedIndex).getGhiChuMoi();
                    dangKySuaNhanKhau dk = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau, idNguoiKhai, idNguoiDuocSua, ngayKhai,
                            hoTenMoi, bietDanhMoi, soCMTMoi, ngayCapCMT, noiCapCMT, namSinhMoi, gioiTinhMoi, noiSinhMoi, danTocMoi, tonGiaoMoi,
                            quocTichMoi, nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi, noiLamViecMoi, ngayDangKyThuongTruMoi, tamTruMoi, tamVangMoi, ghiChuMoi);
                    check = toTruongController.pheDuyetSuaNhanKhau(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Từ chối phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetSuaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKXoaNhanKhau.getSelectedRow();
                if(dsdangKyXoaNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKyXoaNhanKhau = dsdangKyXoaNhanKhau.get(selectedIndex).getIdGiayDangKyXoaNhanKhau();
                    int idNguoiKhai = dsdangKyXoaNhanKhau.get(selectedIndex).getIdNguoiKhai();
                    int idNguoiBiXoa = dsdangKyXoaNhanKhau.get(selectedIndex).getIdNguoiBiXoa();
                    Date ngayKhai = dsdangKyXoaNhanKhau.get(selectedIndex).getNgayKhai();
                    Date ngayXoa = dsdangKyXoaNhanKhau.get(selectedIndex).getNgayXoa();
                    String noiChuyen = dsdangKyXoaNhanKhau.get(selectedIndex).getNoiChuyen();
                    String ghiChu = dsdangKyXoaNhanKhau.get(selectedIndex).getGhiChu();
                    dangKyXoaNhanKhau dk= new dangKyXoaNhanKhau(idGiayDangKyXoaNhanKhau, idNguoiKhai, idNguoiBiXoa, ngayKhai, ngayXoa, noiChuyen, ghiChu);
                    check = toTruongController.pheDuyetXoaNhanKhau(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKXoaNhanKhau.getSelectedRow();
                if(dsdangKyXoaNhanKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKyXoaNhanKhau = dsdangKyXoaNhanKhau.get(selectedIndex).getIdGiayDangKyXoaNhanKhau();
                    int idNguoiKhai = dsdangKyXoaNhanKhau.get(selectedIndex).getIdNguoiKhai();
                    int idNguoiBiXoa = dsdangKyXoaNhanKhau.get(selectedIndex).getIdNguoiBiXoa();
                    Date ngayKhai = dsdangKyXoaNhanKhau.get(selectedIndex).getNgayKhai();
                    Date ngayXoa = dsdangKyXoaNhanKhau.get(selectedIndex).getNgayXoa();
                    String noiChuyen = dsdangKyXoaNhanKhau.get(selectedIndex).getNoiChuyen();
                    String ghiChu = dsdangKyXoaNhanKhau.get(selectedIndex).getGhiChu();
                    dangKyXoaNhanKhau dk= new dangKyXoaNhanKhau(idGiayDangKyXoaNhanKhau, idNguoiKhai, idNguoiBiXoa, ngayKhai, ngayXoa, noiChuyen, ghiChu);
                    check = toTruongController.pheDuyetXoaNhanKhau(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetXoaNhanKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTamTru.getSelectedRow();
                if(dstamTru.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayTamTru = dstamTru.get(selectedIndex).getIdGiayTamTru();
                    int idNhanKhau = dstamTru.get(selectedIndex).getIdNhanKhau();
                    String noiTamTru = dstamTru.get(selectedIndex).getNoiTamTru();
                    String noiThuongTru = dstamTru.get(selectedIndex).getNoiThuongTru();
                    Date tuNgay = dstamTru.get(selectedIndex).getTuNgay();
                    Date denNgay = dstamTru.get(selectedIndex).getDenNgay();
                    String lyDo = dstamTru.get(selectedIndex).getLyDo();
                    tamTru dk= new tamTru(idGiayTamTru, idNhanKhau, noiTamTru, noiThuongTru, tuNgay, denNgay, lyDo);
                    check = toTruongController.pheDuyetGiayTamTru(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTamTru.getSelectedRow();
                if(dstamTru.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayTamTru = dstamTru.get(selectedIndex).getIdGiayTamTru();
                    int idNhanKhau = dstamTru.get(selectedIndex).getIdNhanKhau();
                    String noiTamTru = dstamTru.get(selectedIndex).getNoiTamTru();
                    String noiThuongTru = dstamTru.get(selectedIndex).getNoiThuongTru();
                    Date tuNgay = dstamTru.get(selectedIndex).getTuNgay();
                    Date denNgay = dstamTru.get(selectedIndex).getDenNgay();
                    String lyDo = dstamTru.get(selectedIndex).getLyDo();
                    tamTru dk= new tamTru(idGiayTamTru, idNhanKhau, noiTamTru, noiThuongTru, tuNgay, denNgay, lyDo);
                    check = toTruongController.pheDuyetGiayTamTru(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetTamTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTamVang.getSelectedRow();
                if(dstamVang.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayTamVang = dstamVang.get(selectedIndex).getIdGiayTamVang();
                    int idNhanKhau = dstamVang.get(selectedIndex).getIdNhanKhau();
                    String noiThuongTru = dstamVang.get(selectedIndex).getNoiThuongTru();
                    Date tuNgay = dstamVang.get(selectedIndex).getTuNgay();
                    Date denNgay = dstamVang.get(selectedIndex).getDenNgay();
                    String lyDo = dstamVang.get(selectedIndex).getLyDo();
                    tamVang dk= new tamVang(idGiayTamVang, idNhanKhau, noiThuongTru, tuNgay, denNgay, lyDo);
                    check = toTruongController.pheDuyetGiayTamVang(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTamVang.getSelectedRow();
                if(dstamVang.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayTamVang = dstamVang.get(selectedIndex).getIdGiayTamVang();
                    int idNhanKhau = dstamVang.get(selectedIndex).getIdNhanKhau();
                    String noiThuongTru = dstamVang.get(selectedIndex).getNoiThuongTru();
                    Date tuNgay = dstamVang.get(selectedIndex).getTuNgay();
                    Date denNgay = dstamVang.get(selectedIndex).getDenNgay();
                    String lyDo = dstamVang.get(selectedIndex).getLyDo();
                    tamVang dk= new tamVang(idGiayTamVang, idNhanKhau, noiThuongTru, tuNgay, denNgay, lyDo);
                    check = toTruongController.pheDuyetGiayTamVang(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetTamVang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    selectedIndex = tblDSDKThemHoKhau.getSelectedRow();
                    if(dsdangKyThemHoKhau.size() == 0)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Chưa có đơn đăng ký.",
                                "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(selectedIndex == -1)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng chọn đơn đăng ký.",
                                "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        int confirm = dsdangKyThemHoKhau.get(selectedIndex).getIdGiayDangKyThemHoKhau();
                        check = toTruongController.pheDuyetThemHoKhau(true, confirm);
                        if(check == true)
                        {
                            JOptionPane.showMessageDialog(toTruongHomePage.this,
                                    "Thêm thành công",
                                    "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                            toTruongContentPanel.removeAll();
                            toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                            toTruongContentPanel.repaint();
                            toTruongContentPanel.revalidate();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(toTruongHomePage.this,
                                    "Vui lòng thử lại",
                                    "Failed",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        });
        btnTuChoiPheDuyetThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKThemHoKhau.getSelectedRow();
                if(dsdangKyThemHoKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKyThemHoKhau.get(selectedIndex).getIdGiayDangKyThemHoKhau();
                    check = toTruongController.pheDuyetThemHoKhau(false, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetThemHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKSuaHoKhau.getSelectedRow();
                if(dsdangKySuaHoKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKySuaHoKhau = dsdangKySuaHoKhau.get(selectedIndex).getIdGiayDangKySuaHoKhau();
                    int idHoKhau = dsdangKySuaHoKhau.get(selectedIndex).getIdHoKhau();
                    int idChuHoMoi = dsdangKySuaHoKhau.get(selectedIndex).getIdChuHoMoi();
                    String diaChiMoi = dsdangKySuaHoKhau.get(selectedIndex).getDiaChiMoi();
                    Date ngayThayDoi = dsdangKySuaHoKhau.get(selectedIndex).getNgayThayDoi();
                    int idNguoiKhai = dsdangKySuaHoKhau.get(selectedIndex).getIdNguoiKhai();

                    dangKySuaHoKhau dk = new dangKySuaHoKhau(idGiayDangKySuaHoKhau, idHoKhau, idChuHoMoi, diaChiMoi,
                            ngayThayDoi, idNguoiKhai);
                    check = toTruongController.pheDuyetSuaHoKhau(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKSuaHoKhau.getSelectedRow();
                if(dsdangKySuaHoKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKySuaHoKhau = dsdangKySuaHoKhau.get(selectedIndex).getIdGiayDangKySuaHoKhau();
                    int idHoKhau = dsdangKySuaHoKhau.get(selectedIndex).getIdHoKhau();
                    int idChuHoMoi = dsdangKySuaHoKhau.get(selectedIndex).getIdChuHoMoi();
                    String diaChiMoi = dsdangKySuaHoKhau.get(selectedIndex).getDiaChiMoi();
                    Date ngayThayDoi = dsdangKySuaHoKhau.get(selectedIndex).getNgayThayDoi();
                    int idNguoiKhai = dsdangKySuaHoKhau.get(selectedIndex).getIdNguoiKhai();

                    dangKySuaHoKhau dk = new dangKySuaHoKhau(idGiayDangKySuaHoKhau, idHoKhau, idChuHoMoi, diaChiMoi,
                            ngayThayDoi, idNguoiKhai);
                    check = toTruongController.pheDuyetSuaHoKhau(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetSuaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTXoaHoKhau.getSelectedRow();
                if(dsdangKyXoaHoKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKyXoaHoKhau = dsdangKyXoaHoKhau.get(selectedIndex).getIdGiayDangKyXoaHoKhau();
                    int idHoKhau = dsdangKyXoaHoKhau.get(selectedIndex).getIdHoKhau();
                    String lyDo = dsdangKyXoaHoKhau.get(selectedIndex).getLyDo();
                    Date ngayKhai = dsdangKyXoaHoKhau.get(selectedIndex).getNgayKhai();
                    int idNguoiKhai = dsdangKyXoaHoKhau.get(selectedIndex).getIdNguoiKhai();
                    dangKyXoaHoKhau dk= new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau, idHoKhau, lyDo, ngayKhai, idNguoiKhai);
                    check = toTruongController.pheDuyetXoaHoKhau(true, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTXoaHoKhau.getSelectedRow();
                if(dsdangKyXoaHoKhau.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int idGiayDangKyXoaHoKhau = dsdangKyXoaHoKhau.get(selectedIndex).getIdGiayDangKyXoaHoKhau();
                    int idHoKhau = dsdangKyXoaHoKhau.get(selectedIndex).getIdHoKhau();
                    String lyDo = dsdangKyXoaHoKhau.get(selectedIndex).getLyDo();
                    Date ngayKhai = dsdangKyXoaHoKhau.get(selectedIndex).getNgayKhai();
                    int idNguoiKhai = dsdangKyXoaHoKhau.get(selectedIndex).getIdNguoiKhai();
                    dangKyXoaHoKhau dk= new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau, idHoKhau, lyDo, ngayKhai, idNguoiKhai);
                    check = toTruongController.pheDuyetXoaHoKhau(false, dk);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Phê duyệt thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToNhanKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetXoaHoKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetThemNhanKhauVaoHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKThemNhanKhauVaoHo.getSelectedRow();
                if(dsdangKyThemNhanKhauVaoHo.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKyThemNhanKhauVaoHo.get(selectedIndex).getId();
                    check = toTruongController.pheDuyetThemNhanKhauVaoHo(true, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetThemNhanKhauVaoHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKThemNhanKhauVaoHo.getSelectedRow();
                if(dsdangKyThemNhanKhauVaoHo.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKyThemNhanKhauVaoHo.get(selectedIndex).getId();
                    check = toTruongController.pheDuyetThemNhanKhauVaoHo(false, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetThemNhanKhauVaoHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetXoaNhanKhauKhoiHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKXoaNhanKhauKhoiHo.getSelectedRow();
                if(dsdangKyXoaNhanKhauKhoiHo.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKyXoaNhanKhauKhoiHo.get(selectedIndex).getId();
                    check = toTruongController.pheDuyetXoaNhanKhauKhoiHo(true, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetXoaNhanKhauKhoiHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKXoaNhanKhauKhoiHo.getSelectedRow();
                if(dsdangKyXoaNhanKhauKhoiHo.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKyXoaNhanKhauKhoiHo.get(selectedIndex).getId();
                    check = toTruongController.pheDuyetXoaNhanKhauKhoiHo(false, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetXoaNhanKhauKhoiHo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToHoKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnPheDuyetSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTSuKienNhaVanHoa.getSelectedRow();
                if(dsdangKySuDungNhaVanHoa.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKySuDungNhaVanHoa.get(selectedIndex).getIdGiayDangKy();
                    check = toTruongController.pheDuyetNhaVanHoa(true, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetDKSuDungNhaVanHoaPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnTuChoiPheDuyetSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblDSDKTSuKienNhaVanHoa.getSelectedRow();
                if(dsdangKySuDungNhaVanHoa.size() == 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Chưa có đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Vui lòng chọn đơn đăng ký.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int confirm = dsdangKySuDungNhaVanHoa.get(selectedIndex).getIdGiayDangKy();
                    check = toTruongController.pheDuyetNhaVanHoa(false, confirm);
                    if(check == true)
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Thêm thành công",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        toTruongContentPanel.removeAll();
                        toTruongContentPanel.add(duyetDKSuDungNhaVanHoaPanel);
                        toTruongContentPanel.repaint();
                        toTruongContentPanel.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(toTruongHomePage.this,
                                "Vui lòng thử lại",
                                "Failed",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnCancelDuyetSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(duyetGiayToNhaVanHoaPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
            }
        });
        btnTimKiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String category = boxTypeTimKiem.getSelectedItem().toString();
                String keyword = txtKeyword.getText();
                toTruongContentPanel.removeAll();
                toTruongContentPanel.add(thongKeNhanKhauPanel);
                toTruongContentPanel.repaint();
                toTruongContentPanel.revalidate();
                dsNhanKhau = toTruongController.timKiemThongTin(category, keyword);
                if(dsNhanKhau.size() <= 0)
                {
                    JOptionPane.showMessageDialog(toTruongHomePage.this,
                            "Danh sách trống",
                            "Try again",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    nhanKhauTableModel nhanKhauTableModel = new nhanKhauTableModel(dsNhanKhau);
                    tblDanhSachNhanKhau.setModel(nhanKhauTableModel);
                    tblDanhSachNhanKhau.setAutoCreateRowSorter(true);
                }

            }
        });
    }
    public static void main(String[] args)
    {
        toTruongHomePage toTruongHomePage = new toTruongHomePage(null);

        toTruongHomePage.setVisible(true);
    }
    private static class nhanKhauTableModel extends AbstractTableModel
    {

        private final String[] NHANKHAUTABLECOLUMNS = {"ID nhan khau", "Ho ten", "Biet danh", "So cmt", "Ngay cap cmt", "Noi cap cmt", "Nam sinh",
        "Gioi tinh", "Noi sinh", "Dan toc", "Ton giao", "Quoc tich", "Nguyen quan", "Noi thuong tru", "Nghe nghiep", "Noi lam viec",
        "Ngay dang ky thuong tru", "Trang thai tam tru", "Trang thai tam vang", "Ghi chu"};
        private ArrayList<nhanKhau> dsNhanKhau;

        public nhanKhauTableModel(ArrayList<nhanKhau> dsNhanKhau) {
            this.dsNhanKhau = dsNhanKhau;
        }

        @Override
        public String getColumnName(int column) {
            return NHANKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsNhanKhau.size();
        }

        @Override
        public int getColumnCount() {
            return NHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsNhanKhau.get(rowIndex).getIdNhanKhau();
                        case 1 -> dsNhanKhau.get(rowIndex).getHoTen();
                        case 2 -> dsNhanKhau.get(rowIndex).getBietDanh();
                        case 3 -> dsNhanKhau.get(rowIndex).getSoCMT();
                        case 4 -> dsNhanKhau.get(rowIndex).getNgayCapCMT();
                        case 5 -> dsNhanKhau.get(rowIndex).getNoiCapCMT();
                        case 6 -> dsNhanKhau.get(rowIndex).getNamSinh();
                        case 7 -> dsNhanKhau.get(rowIndex).getGioiTinh();
                        case 8 -> dsNhanKhau.get(rowIndex).getNoiSinh();
                        case 9 -> dsNhanKhau.get(rowIndex).getDanToc();
                        case 10 -> dsNhanKhau.get(rowIndex).getTonGiao();
                        case 11 -> dsNhanKhau.get(rowIndex).getQuocTich();
                        case 12 -> dsNhanKhau.get(rowIndex).getNguyenQuan();
                        case 13 -> dsNhanKhau.get(rowIndex).getNoiThuongTru();
                        case 14 -> dsNhanKhau.get(rowIndex).getNgheNghiep();
                        case 15 -> dsNhanKhau.get(rowIndex).getNoiLamViec();
                        case 16 -> dsNhanKhau.get(rowIndex).getNgayDangKyThuongTru();
                        case 17 -> dsNhanKhau.get(rowIndex).isTrangThaiTamTru();
                        case 18 -> dsNhanKhau.get(rowIndex).isTrangThaiTamVang();
                        case 19 -> dsNhanKhau.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
        }
    }
    private static class dkThemNhanKhauTableModel extends AbstractTableModel
    {

        private final String[] THEMNHANKHAUTABLECOLUMNS = {"ID giay dang ky", "ID nguoi khai", "Ngay khai", "Ho ten", "Biet danh", "So cmt", "Ngay cap cmt", "Noi cap cmt", "Nam sinh",
                "Gioi tinh", "Noi sinh", "Dan toc", "Ton giao", "Quoc tich", "Nguyen quan", "Noi thuong tru", "Nghe nghiep", "Noi lam viec",
                "Ngay dang ky thuong tru", "Trang thai tam tru", "Trang thai tam vang", "Ghi chu"};
        private ArrayList<dangKyThemNhanKhau> dsThemNhanKhau;

        public dkThemNhanKhauTableModel(ArrayList<dangKyThemNhanKhau> dsThemNhanKhau) {
            this.dsThemNhanKhau = dsThemNhanKhau;
        }

        @Override
        public String getColumnName(int column) {
            return THEMNHANKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsThemNhanKhau.size();
        }

        @Override
        public int getColumnCount() {
            return THEMNHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsThemNhanKhau.get(rowIndex).getIdGiayDangKyThemNhanKhau();
                        case 1 -> dsThemNhanKhau.get(rowIndex).getIdNguoiKhai();
                        case 2 -> dsThemNhanKhau.get(rowIndex).getNgayKhai();
                        case 3 -> dsThemNhanKhau.get(rowIndex).getHoTen();
                        case 4 -> dsThemNhanKhau.get(rowIndex).getBietDanh();
                        case 5 -> dsThemNhanKhau.get(rowIndex).getSoCMT();
                        case 6 -> dsThemNhanKhau.get(rowIndex).getNgayCapCMT();
                        case 7 -> dsThemNhanKhau.get(rowIndex).getNoiCapCMT();
                        case 8 -> dsThemNhanKhau.get(rowIndex).getNamSinh();
                        case 9 -> dsThemNhanKhau.get(rowIndex).getGioiTinh();
                        case 10 -> dsThemNhanKhau.get(rowIndex).getNoiSinh();
                        case 11 -> dsThemNhanKhau.get(rowIndex).getDanToc();
                        case 12 -> dsThemNhanKhau.get(rowIndex).getTonGiao();
                        case 13 -> dsThemNhanKhau.get(rowIndex).getQuocTich();
                        case 14 -> dsThemNhanKhau.get(rowIndex).getNguyenQuan();
                        case 15 -> dsThemNhanKhau.get(rowIndex).getNoiThuongTru();
                        case 16 -> dsThemNhanKhau.get(rowIndex).getNgheNghiep();
                        case 17 -> dsThemNhanKhau.get(rowIndex).getNoiLamViec();
                        case 18 -> dsThemNhanKhau.get(rowIndex).getNgayDangKyThuongTru();
                        case 19 -> dsThemNhanKhau.get(rowIndex).isTrangThaiTamTru();
                        case 20 -> dsThemNhanKhau.get(rowIndex).isTrangThaiTamVang();
                        case 21 -> dsThemNhanKhau.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
        }
    }
    private static class dkSuaNhanKhauTableModel extends AbstractTableModel
    {

        private final String[] SUANHANKHAUTABLECOLUMNS = {"ID giay dang ky", "ID nguoi khai", "ID nguoi duoc sua", "Ngay khai", "Ho ten", "Biet danh", "So cmt", "Ngay cap cmt", "Noi cap cmt", "Nam sinh",
                "Gioi tinh", "Noi sinh", "Dan toc", "Ton giao", "Quoc tich", "Nguyen quan", "Noi thuong tru", "Nghe nghiep", "Noi lam viec",
                "Ngay dang ky thuong tru", "Trang thai tam tru", "Trang thai tam vang", "Ghi chu"};
        private ArrayList<dangKySuaNhanKhau> dsSuaNhanKhau;

        public dkSuaNhanKhauTableModel(ArrayList<dangKySuaNhanKhau> dsSuaNhanKhau) {
            this.dsSuaNhanKhau = dsSuaNhanKhau;
        }

        @Override
        public String getColumnName(int column) {
            return SUANHANKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }


        @Override
        public int getRowCount() {
            return dsSuaNhanKhau.size();
        }

        @Override
        public int getColumnCount() {
            return SUANHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsSuaNhanKhau.get(rowIndex).getIdGiayDangKySuaNhanKhau();
                        case 1 -> dsSuaNhanKhau.get(rowIndex).getIdNguoiKhai();
                        case 2 -> dsSuaNhanKhau.get(rowIndex).getIdNguoiDuocSua();
                        case 3 -> dsSuaNhanKhau.get(rowIndex).getNgayKhai();
                        case 4 -> dsSuaNhanKhau.get(rowIndex).getHoTenMoi();
                        case 5 -> dsSuaNhanKhau.get(rowIndex).getBietDanhMoi();
                        case 6 -> dsSuaNhanKhau.get(rowIndex).getSoCMTMoi();
                        case 7 -> dsSuaNhanKhau.get(rowIndex).getNgayCapCMT();
                        case 8 -> dsSuaNhanKhau.get(rowIndex).getNoiCapCMT();
                        case 9 -> dsSuaNhanKhau.get(rowIndex).getNamSinhMoi();
                        case 10 -> dsSuaNhanKhau.get(rowIndex).getGioiTinhMoi();
                        case 11 -> dsSuaNhanKhau.get(rowIndex).getNoiSinhMoi();
                        case 12 -> dsSuaNhanKhau.get(rowIndex).getDanTocMoi();
                        case 13 -> dsSuaNhanKhau.get(rowIndex).getTonGiaoMoi();
                        case 14 -> dsSuaNhanKhau.get(rowIndex).getQuocTichMoi();
                        case 15 -> dsSuaNhanKhau.get(rowIndex).getNguyenQuanMoi();
                        case 16 -> dsSuaNhanKhau.get(rowIndex).getNoiThuongTruMoi();
                        case 17 -> dsSuaNhanKhau.get(rowIndex).getNgheNghiepMoi();
                        case 18 -> dsSuaNhanKhau.get(rowIndex).getNoiLamViecMoi();
                        case 19 -> dsSuaNhanKhau.get(rowIndex).getNgayDangKyThuongTruMoi();
                        case 20 -> dsSuaNhanKhau.get(rowIndex).isTamTruMoi();
                        case 21 -> dsSuaNhanKhau.get(rowIndex).isTamVangMoi();
                        case 22 -> dsSuaNhanKhau.get(rowIndex).getGhiChuMoi();
                        default -> "-";
                    };
        }
    }
    private static class dkXoaNhanKhauTableModel extends AbstractTableModel
    {

        private final String[] XOANHANKHAUTABLECOLUMNS = {"ID giay dang ky", "ID nguoi khai", "ID nguoi bi xoa", "Ngay khai", "Ngay xoa", "Noi chuyen", "Ghi chu"};
        private ArrayList<dangKyXoaNhanKhau> dsXoaNhanKhau;

        public dkXoaNhanKhauTableModel(ArrayList<dangKyXoaNhanKhau> dsXoaNhanKhau) {
            this.dsXoaNhanKhau = dsXoaNhanKhau;
        }

        @Override
        public String getColumnName(int column) {
            return XOANHANKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsXoaNhanKhau.size();
        }

        @Override
        public int getColumnCount() {
            return XOANHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsXoaNhanKhau.get(rowIndex).getIdGiayDangKyXoaNhanKhau();
                        case 1 -> dsXoaNhanKhau.get(rowIndex).getIdNguoiKhai();
                        case 2 -> dsXoaNhanKhau.get(rowIndex).getIdNguoiBiXoa();
                        case 3 -> dsXoaNhanKhau.get(rowIndex).getNgayKhai();
                        case 4 -> dsXoaNhanKhau.get(rowIndex).getNgayXoa();
                        case 5 -> dsXoaNhanKhau.get(rowIndex).getNoiChuyen();
                        case 6 -> dsXoaNhanKhau.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
        }
    }
    private static class dkTamTruTableModel extends AbstractTableModel
    {

        private final String[] TAMTRUTABLECOLUMNS = {"ID giay tam tru", "ID nhan khau", "Noi tam tru", "Noi thuong tru", "Tu ngay", "Den ngay", "Ly do"};
        private ArrayList<tamTru> dsTamTru;

        public dkTamTruTableModel(ArrayList<tamTru> dsTamTru) {
            this.dsTamTru = dsTamTru;
        }

        @Override
        public String getColumnName(int column) {
            return TAMTRUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsTamTru.size();
        }

        @Override
        public int getColumnCount() {
            return TAMTRUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsTamTru.get(rowIndex).getIdGiayTamTru();
                        case 1 -> dsTamTru.get(rowIndex).getIdNhanKhau();
                        case 2 -> dsTamTru.get(rowIndex).getNoiTamTru();
                        case 3 -> dsTamTru.get(rowIndex).getNoiThuongTru();
                        case 4 -> dsTamTru.get(rowIndex).getTuNgay();
                        case 5 -> dsTamTru.get(rowIndex).getDenNgay();
                        case 6 -> dsTamTru.get(rowIndex).getLyDo();
                        default -> "-";
                    };
        }
    }
    private static class dkTamVangTableModel extends AbstractTableModel
    {

        private final String[] TAMVANGTABLECOLUMNS = {"ID giay tam vang", "ID nhan khau", "Noi thuong tru", "Tu ngay", "Den ngay", "Ly do"};
        private ArrayList<tamVang> dsTamVang;

        public dkTamVangTableModel(ArrayList<tamVang> dsTamVang) {
            this.dsTamVang = dsTamVang;
        }

        @Override
        public String getColumnName(int column) {
            return TAMVANGTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsTamVang.size();
        }

        @Override
        public int getColumnCount() {
            return TAMVANGTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsTamVang.get(rowIndex).getIdGiayTamVang();
                        case 1 -> dsTamVang.get(rowIndex).getIdNhanKhau();
                        case 2 -> dsTamVang.get(rowIndex).getNoiThuongTru();
                        case 3 -> dsTamVang.get(rowIndex).getTuNgay();
                        case 4 -> dsTamVang.get(rowIndex).getDenNgay();
                        case 5 -> dsTamVang.get(rowIndex).getLyDo();
                        default -> "-";
                    };
        }
    }
    private static class dkThemHoKhauTableModel extends AbstractTableModel
    {

        private final String[] THEMHOKHAUTABLECOLUMNS = {"ID giay dang ky", "ID chu ho", "Ma khu vuc", "Dia chi", "Ngay lap", "Ngay khai", "ID nguoi khai"};
        private ArrayList<dangKyThemHoKhau> dsThemHoKhau;

        public dkThemHoKhauTableModel(ArrayList<dangKyThemHoKhau> dsThemHoKhau) {
            this.dsThemHoKhau = dsThemHoKhau;
        }

        @Override
        public String getColumnName(int column) {
            return THEMHOKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsThemHoKhau.size();
        }

        @Override
        public int getColumnCount() {
            return THEMHOKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsThemHoKhau.get(rowIndex).getIdGiayDangKyThemHoKhau();
                        case 1 -> dsThemHoKhau.get(rowIndex).getIdChuHo();
                        case 2 -> dsThemHoKhau.get(rowIndex).getMaKhuVuc();
                        case 3 -> dsThemHoKhau.get(rowIndex).getDiaChi();
                        case 4 -> dsThemHoKhau.get(rowIndex).getNgayLap();
                        case 5 -> dsThemHoKhau.get(rowIndex).getNgayKhai();
                        case 6 -> dsThemHoKhau.get(rowIndex).getIdNguoiKhai();
                        default -> "-";
                    };
        }
    }
    private static class dkSuaHoKhauTableModel extends AbstractTableModel
    {

        private final String[] SUAHOKHAUTABLECOLUMNS = {"ID giay dang ky", "ID Ho khau", "ID chu ho", "Dia chi", "Ngay thay doi", "ID nguoi khai"};
        private ArrayList<dangKySuaHoKhau> dsSuaHoKhau;

        public dkSuaHoKhauTableModel(ArrayList<dangKySuaHoKhau> dsSuaHoKhau) {
            this.dsSuaHoKhau = dsSuaHoKhau;
        }

        @Override
        public String getColumnName(int column) {
            return SUAHOKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsSuaHoKhau.size();
        }

        @Override
        public int getColumnCount() {
            return SUAHOKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsSuaHoKhau.get(rowIndex).getIdGiayDangKySuaHoKhau();
                        case 1 -> dsSuaHoKhau.get(rowIndex).getIdHoKhau();
                        case 2 -> dsSuaHoKhau.get(rowIndex).getIdChuHoMoi();
                        case 3 -> dsSuaHoKhau.get(rowIndex).getDiaChiMoi();
                        case 4 -> dsSuaHoKhau.get(rowIndex).getNgayThayDoi();
                        case 5 -> dsSuaHoKhau.get(rowIndex).getIdNguoiKhai();
                        default -> "-";
                    };
        }
    }
    private static class dkXoaHoKhauTableModel extends AbstractTableModel
    {

        private final String[] XOAHOKHAUTABLECOLUMNS = {"ID giay dang ky", "ID Ho khau", "Ly do", "Ngay khai", "ID nguoi khai"};
        private ArrayList<dangKyXoaHoKhau> dsXoaHoKhau;

        public dkXoaHoKhauTableModel(ArrayList<dangKyXoaHoKhau> dsXoaHoKhau) {
            this.dsXoaHoKhau = dsXoaHoKhau;
        }

        @Override
        public String getColumnName(int column) {
            return XOAHOKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsXoaHoKhau.size();
        }

        @Override
        public int getColumnCount() {
            return XOAHOKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsXoaHoKhau.get(rowIndex).getIdGiayDangKyXoaHoKhau();
                        case 1 -> dsXoaHoKhau.get(rowIndex).getIdHoKhau();
                        case 2 -> dsXoaHoKhau.get(rowIndex).getLyDo();
                        case 3 -> dsXoaHoKhau.get(rowIndex).getNgayKhai();
                        case 4 -> dsXoaHoKhau.get(rowIndex).getIdNguoiKhai();
                        default -> "-";
                    };
        }
    }
    private static class dkThemNhanKhauVaoHoTableModel extends AbstractTableModel
    {

        private final String[] THEMNHANKHAUVAOHOTABLECOLUMNS = {"ID giay dang ky", "Ngay khai", "ID nhan khau duoc them", "ID ho khau duoc them", "Quan he voi chu ho"};
        private ArrayList<dangKyThemNhanKhauVaoHo> dsThemNhanKhauVaoHo;

        public dkThemNhanKhauVaoHoTableModel(ArrayList<dangKyThemNhanKhauVaoHo> dsThemNhanKhauVaoHo) {
            this.dsThemNhanKhauVaoHo = dsThemNhanKhauVaoHo;
        }

        @Override
        public String getColumnName(int column) {
            return THEMNHANKHAUVAOHOTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsThemNhanKhauVaoHo.size();
        }

        @Override
        public int getColumnCount() {
            return THEMNHANKHAUVAOHOTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsThemNhanKhauVaoHo.get(rowIndex).getId();
                        case 1 -> dsThemNhanKhauVaoHo.get(rowIndex).getNgayKhai();
                        case 2 -> dsThemNhanKhauVaoHo.get(rowIndex).getIdNhanKhauDuocThem();
                        case 3 -> dsThemNhanKhauVaoHo.get(rowIndex).getIdHoKhauDuocThem();
                        case 4 -> dsThemNhanKhauVaoHo.get(rowIndex).getQuanHeVoiChuHo();
                        default -> "-";
                    };
        }
    }
    private static class dkXoaNhanKhauKhoiHoTableModel extends AbstractTableModel
    {

        private final String[] XOANHANKHAUKHOIHOTABLECOLUMNS = {"ID giay dang ky", "Ngay khai", "ID nhan khau duoc them", "ID ho khau duoc them"};
        private ArrayList<dangKyXoaNhanKhauKhoiHo> dsXoaNhanKhauKhoiHo;

        public dkXoaNhanKhauKhoiHoTableModel(ArrayList<dangKyXoaNhanKhauKhoiHo> dsXoaNhanKhauKhoiHo) {
            this.dsXoaNhanKhauKhoiHo = dsXoaNhanKhauKhoiHo;
        }

        @Override
        public String getColumnName(int column) {
            return XOANHANKHAUKHOIHOTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsXoaNhanKhauKhoiHo.size();
        }

        @Override
        public int getColumnCount() {
            return XOANHANKHAUKHOIHOTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsXoaNhanKhauKhoiHo.get(rowIndex).getId();
                        case 1 -> dsXoaNhanKhauKhoiHo.get(rowIndex).getNgayKhai();
                        case 2 -> dsXoaNhanKhauKhoiHo.get(rowIndex).getIdNhanKhauBiXoa();
                        case 3 -> dsXoaNhanKhauKhoiHo.get(rowIndex).getIdHoKhauBiXoa();
                        default -> "-";
                    };
        }
    }
    private static class dkSuKienTableModel extends AbstractTableModel
    {

        private final String[] SUKIENTABLECOLUMNS = {"ID giay dang ky", "Ngay to chuc", "Loai su kien", "Phi su dung", "Ghi chu"};
        private ArrayList<dangKySuDungNhaVanHoa> dsDangKy;

        public dkSuKienTableModel(ArrayList<dangKySuDungNhaVanHoa> dsDangKy) {
            this.dsDangKy = dsDangKy;
        }

        @Override
        public String getColumnName(int column) {
            return SUKIENTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsDangKy.size();
        }

        @Override
        public int getColumnCount() {
            return SUKIENTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsDangKy.get(rowIndex).getIdGiayDangKy();
                        case 1 -> dsDangKy.get(rowIndex).getNgayToChuc();
                        case 2 -> dsDangKy.get(rowIndex).getLoaiSuKien();
                        case 3 -> dsDangKy.get(rowIndex).getPhiSuDung();
                        case 4 -> dsDangKy.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
        }
    }

    private static class lichSuNhanKhauTableModel extends AbstractTableModel
    {

        private final String[] LICHSUNHANKHAUTABLECOLUMNS = {"Id nhan khau", "Ngay thay doi", "Loai thay doi"};
        private ArrayList<lichSuNhanKhau> dsLichSuNhanKhau;

        public lichSuNhanKhauTableModel(ArrayList<lichSuNhanKhau> dsLichSuNhanKhau) {
            this.dsLichSuNhanKhau = dsLichSuNhanKhau;
        }

        @Override
        public String getColumnName(int column) {
            return LICHSUNHANKHAUTABLECOLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null)
            {
                return getValueAt(0, columnIndex).getClass();
            }
            else
            {
                return Object.class;
            }
        }

        @Override
        public int getRowCount() {
            return dsLichSuNhanKhau.size();
        }

        @Override
        public int getColumnCount() {
            return LICHSUNHANKHAUTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> dsLichSuNhanKhau.get(rowIndex).getIdNhanKhau();
                        case 1 -> dsLichSuNhanKhau.get(rowIndex).getNgayThayDoi();
                        case 2 -> dsLichSuNhanKhau.get(rowIndex).getLoaiThayDoi();
                        default -> "-";
                    };
        }
    }
}
