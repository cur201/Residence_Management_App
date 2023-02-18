package view;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    private JTextField nhậpThôngTinTìmTextField;
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
}
