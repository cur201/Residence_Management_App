package view;

import controller.canBoNhaVanHoa_controller;
import model.coSoNhaVanHoa;
import model.suKienNhaVanHoa;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import static constancy.constancy.DEFAULT_ID;

public class canBoNhaVanHoaHomePage extends  JDialog{
    private JPanel canBoNhaVanHoaHomePagePanel;
    private JButton thoátButton;
    private JButton btnCSVC;
    private JButton btnSuKien;
    private JPanel rootPanel;
    private JPanel csvcPanel;
    private JTable tblCSVC;
    private JButton btnThemCSVC;
    private JButton btnXoaCSVC;
    private JButton btnSuaCSVC;
    private JScrollPane csvcContentPanel;
    private JPanel csvcControlPanel;
    private JPanel themCSVSFormPanel;
    private JTextField txtTenCSVCMoi;
    private JTextField txtHienTrangCSVCMoi;
    private JTextField txtSoLuongCSVCMoi;
    private JTextField txtGhiChuCSVCMoi;
    private JButton btnCFThemCSVC;
    private JButton btnHuyThemCSVC;
    private JPanel suKienPanel;
    private JTable tblSuKien;
    private JButton btnThemSuKien;
    private JButton btnXoaSuKien;
    private JPanel themSuKienFormPanel;
    private JPanel suKienConTentPanel;
    private JPanel suKienControlPanel;
    private JTextField txtNgayToChucThemSuKien;
    private JTextField txtLoaiSuKienThemSuKien;
    private JTextField txtPhiSuDungThemSuKien;
    private JTextField txtGhiChuThemSuKien;
    private JButton txtCFThemSuKien;
    private JButton btnCancelThemSuKien;
    private JPanel suaCSVCPanel;
    private JButton btnCFSuaCSVC;
    private JButton btnCancelSuaCSVC;
    private JTextField txtIDDoDungSuaCSVC;
    private JTextField txtTenDoDungSuaCSVC;
    private JTextField txtHienTrangSuaCSVC;
    private JTextField txtSoLuongSuaCSVC;
    private JTextField txtGhiChuSuaCSVC;
    private JPanel cfXoaCSVCPanel;
    private JButton btnCancelXoaCSVC;
    private JButton btnCFXoaCSVC;
    private JLabel txtConfirmXoaCSVCMessage;
    private JPanel cfXoaSuKienPanel;
    private JButton btnCancelXoaSuKien;
    private JButton btnCFXoaSuKien;
    private JLabel txtConfirmXoaSuKienMessage;

    private Integer selectedIndex;

    ArrayList<coSoNhaVanHoa> coSoNhaVanHoas = new ArrayList<coSoNhaVanHoa>();
    boolean check;
    ArrayList<suKienNhaVanHoa> suKienNhaVanHoas = new ArrayList<suKienNhaVanHoa>();

    public canBoNhaVanHoaHomePage(JFrame parent)
    {
        super(parent);
        setTitle("Can bo nha van hoa Home Page");
        setContentPane(canBoNhaVanHoaHomePagePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(csvcPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                coSoNhaVanHoas = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();
                csvcTabelModel csvcTabelModel = new csvcTabelModel(coSoNhaVanHoas);
                tblCSVC.setModel(csvcTabelModel);
                tblCSVC.setAutoCreateRowSorter(true);
            }
        });
        btnThemCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(themCSVSFormPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });
        btnCFThemCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenCSVCMoi = txtTenCSVCMoi.getText();
                String hienTrangCSVCMoi = txtHienTrangCSVCMoi.getText();
                String soLuongCSVCMoi = txtSoLuongCSVCMoi.getText();
                String ghiChuCSVCMoi = txtGhiChuCSVCMoi.getText();
                coSoNhaVanHoa coSoNhaVanHoa = new coSoNhaVanHoa(DEFAULT_ID, tenCSVCMoi, hienTrangCSVCMoi, Integer.parseInt(soLuongCSVCMoi), ghiChuCSVCMoi);
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.themCoSoVatChatNhaVanHoa(coSoNhaVanHoa);
                if(check == true)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Thêm thành công",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    rootPanel.removeAll();
                    rootPanel.add(csvcPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                    coSoNhaVanHoas = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();
                    csvcTabelModel csvcTabelModel = new csvcTabelModel(coSoNhaVanHoas);
                    tblCSVC.setModel(csvcTabelModel);
                    tblCSVC.setAutoCreateRowSorter(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng thử lại",
                            "Failes",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnHuyThemCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(csvcPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });

        btnSuaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblCSVC.getSelectedRow();
                if(coSoNhaVanHoas.size() == 0)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Chưa có cơ sở vật chất. Vui lòng nhập thêm.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng chọn cơ sở vật chất.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    setCSVCEditData(coSoNhaVanHoas.get(selectedIndex));
                    rootPanel.removeAll();
                    rootPanel.add(suaCSVCPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                }
            }
        });
        btnCancelSuaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(csvcPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });
        btnCFSuaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idDoDungSuaCSVC = txtIDDoDungSuaCSVC.getText();
                String tenDoDungSuaCSVC = txtTenDoDungSuaCSVC.getText();
                String hienTrangSuaCSVC = txtHienTrangSuaCSVC.getText();
                String soLuongSuaCSVC = txtSoLuongSuaCSVC.getText();
                String ghiChuSuaCSVC = txtGhiChuSuaCSVC.getText();
                coSoNhaVanHoa coSo = new coSoNhaVanHoa(Integer.parseInt(idDoDungSuaCSVC), tenDoDungSuaCSVC, hienTrangSuaCSVC, Integer.parseInt(soLuongSuaCSVC), ghiChuSuaCSVC);
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.suaCoSoVatChatNhaVanHoa(coSo);
                if(check == true)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Sửa thành công",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    rootPanel.removeAll();
                    rootPanel.add(csvcPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                    coSoNhaVanHoas = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();
                    csvcTabelModel csvcTabelModel = new csvcTabelModel(coSoNhaVanHoas);
                    tblCSVC.setModel(csvcTabelModel);
                    tblCSVC.setAutoCreateRowSorter(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnXoaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblCSVC.getSelectedRow();
                if(coSoNhaVanHoas.size() == 0)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Chưa có cơ sở vật chất. Vui lòng nhập thêm.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng chọn cơ sở vật chất.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    txtConfirmXoaCSVCMessage.setText("Xác nhận xóa cơ sở vật chất \"" + coSoNhaVanHoas.get(selectedIndex).getTenDoDung() + "\"?");
                    rootPanel.removeAll();
                    rootPanel.add(cfXoaCSVCPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                }
            }
        });
        btnCancelXoaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(csvcPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });
        btnCFXoaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idDoCanXoa = coSoNhaVanHoas.get(selectedIndex).getIdDoDung();
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.xoaCoSoVatChatNhaVanHoa(idDoCanXoa);
                if(check == true)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Xóa thành công",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    rootPanel.removeAll();
                    rootPanel.add(csvcPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                    coSoNhaVanHoas = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();
                    csvcTabelModel csvcTabelModel = new csvcTabelModel(coSoNhaVanHoas);
                    tblCSVC.setModel(csvcTabelModel);
                    tblCSVC.setAutoCreateRowSorter(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        btnSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(suKienPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                suKienNhaVanHoas = canBoNhaVanHoaController.thongKeSuKienNhaVanHoa();
                suKienTableModel suKienTableModel = new suKienTableModel(suKienNhaVanHoas);
                tblSuKien.setModel(suKienTableModel);
                tblSuKien.setAutoCreateRowSorter(true);
            }
        });

        btnThemSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(themSuKienFormPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });

        btnCancelThemSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(suKienPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });

        txtCFThemSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ngayToChucThemSuKien = txtNgayToChucThemSuKien.getText();
                String loaiSuKienThemSuKien = txtLoaiSuKienThemSuKien.getText();
                String phiSuDungThemSuKien = txtPhiSuDungThemSuKien.getText();
                String ghiChuThemSuKien = txtGhiChuThemSuKien.getText();
                suKienNhaVanHoa suKienNhaVanHoa = new suKienNhaVanHoa(DEFAULT_ID, Date.valueOf(ngayToChucThemSuKien), loaiSuKienThemSuKien,
                        Integer.parseInt(phiSuDungThemSuKien), ghiChuThemSuKien);
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.themSuKienNhaVanHoa(suKienNhaVanHoa);
                if(check == true)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Them thành công",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    rootPanel.removeAll();
                    rootPanel.add(suKienPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                    suKienNhaVanHoas = canBoNhaVanHoaController.thongKeSuKienNhaVanHoa();
                    suKienTableModel suKienTableModel = new suKienTableModel(suKienNhaVanHoas);
                    tblSuKien.setModel(suKienTableModel);
                    tblSuKien.setAutoCreateRowSorter(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnXoaSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblSuKien.getSelectedRow();
                if(suKienNhaVanHoas.size() == 0)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Chưa có sự kiện. Vui lòng nhập thêm.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else if(selectedIndex == -1)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng chọn sự kiện.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    txtConfirmXoaSuKienMessage.setText("Xác nhận xóa sự kiện \"" + suKienNhaVanHoas.get(selectedIndex).getLoaiSuKien() + "\"?");
                    rootPanel.removeAll();
                    rootPanel.add(cfXoaSuKienPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                }
            }
        });
        btnCancelXoaSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.removeAll();
                rootPanel.add(suKienPanel);
                rootPanel.repaint();
                rootPanel.revalidate();
            }
        });

        btnCFXoaSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSuKienCanXoa = suKienNhaVanHoas.get(selectedIndex).getIdSuKien();
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.xoaSuKienNhaVanHoa(idSuKienCanXoa);
                if(check == true)
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Xóa thành công",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    rootPanel.removeAll();
                    rootPanel.add(suKienPanel);
                    rootPanel.repaint();
                    rootPanel.revalidate();
                    suKienNhaVanHoas = canBoNhaVanHoaController.thongKeSuKienNhaVanHoa();
                    suKienTableModel suKienTableModel = new suKienTableModel(suKienNhaVanHoas);
                    tblSuKien.setModel(suKienTableModel);
                    tblSuKien.setAutoCreateRowSorter(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(canBoNhaVanHoaHomePage.this,
                            "Vui lòng thử lại",
                            "Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        canBoNhaVanHoaHomePage canBoNhaVanHoaHomePage = new canBoNhaVanHoaHomePage(null);
        canBoNhaVanHoaHomePage.setVisible(true);
    }

    private static class csvcTabelModel extends AbstractTableModel
    {

        private final String[] CSVCTABLECOLUMNS = {"ID DO DUNG", "TEN DO DUNG", "HIEN TRANG", "SO LUONG", "GHI CHU"};
        private ArrayList<coSoNhaVanHoa> coSoNhaVanHoas;

        public csvcTabelModel(ArrayList<coSoNhaVanHoa> coSoNhaVanHoas) {
            this.coSoNhaVanHoas = coSoNhaVanHoas;
        }

        @Override
        public int getRowCount() {
            return coSoNhaVanHoas.size();
        }

        @Override
        public int getColumnCount() {
            return CSVCTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> coSoNhaVanHoas.get(rowIndex).getIdDoDung();
                        case 1 -> coSoNhaVanHoas.get(rowIndex).getTenDoDung();
                        case 2 -> coSoNhaVanHoas.get(rowIndex).getHienTrang();
                        case 3 -> coSoNhaVanHoas.get(rowIndex).getSoLuong();
                        case 4 -> coSoNhaVanHoas.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
        }

        @Override
        public String getColumnName(int column) {
            return CSVCTABLECOLUMNS[column];
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
    }

    private static class suKienTableModel extends AbstractTableModel
    {

        private final String[] SUKIENTABLECOLUMNS = {"ID su kien", "Ngay to chuc", "Loai su kien", "Phi su dung", "Ghi chu"};
        private ArrayList<suKienNhaVanHoa> suKienNhaVanHoas;

        public suKienTableModel(ArrayList<suKienNhaVanHoa> suKienNhaVanHoas) {
            this.suKienNhaVanHoas = suKienNhaVanHoas;
        }

        @Override
        public int getRowCount() {
            return suKienNhaVanHoas.size();
        }

        @Override
        public int getColumnCount() {
            return SUKIENTABLECOLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex)
                    {
                        case 0 -> suKienNhaVanHoas.get(rowIndex).getIdSuKien();
                        case 1 -> suKienNhaVanHoas.get(rowIndex).getNgayToChuc();
                        case 2 -> suKienNhaVanHoas.get(rowIndex).getLoaiSuKien();
                        case 3 -> suKienNhaVanHoas.get(rowIndex).getPhiSuDung();
                        case 4 -> suKienNhaVanHoas.get(rowIndex).getGhiChu();
                        default -> "-";
                    };
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
    }
    public void setCSVCEditData(coSoNhaVanHoa coSo)
    {
        txtIDDoDungSuaCSVC.setText(Integer.toString(coSo.getIdDoDung()));
        txtIDDoDungSuaCSVC.setEditable(false);
        txtTenDoDungSuaCSVC.setText(coSo.getTenDoDung());
        txtHienTrangSuaCSVC.setText(coSo.getHienTrang());
        txtSoLuongSuaCSVC.setText(Integer.toString(coSo.getSoLuong()));
        txtGhiChuSuaCSVC.setText(coSo.getGhiChu());
    }
}
