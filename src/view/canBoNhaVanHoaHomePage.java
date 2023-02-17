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

public class canBoNhaVanHoaHomePage extends  JDialog{
    private JPanel canBoNhaVanHoaHomePagePanel;
    private JButton btnLogout;
    private JButton btnCoSoVatChat;
    private JButton btnSuKien;
    private JTable tblCoSoVatChat;
    private JButton btnThemCSVC;
    private JButton btnXoaCSVC;
    private JButton btnSuaCSVC;
    private JTable tblSuKien;
    private JButton btnThemSK;
    private JPanel cosovatchatPanel;
    private JPanel suKienPanel;
    private JPanel formThemCSVCPanel;
    private JPanel formThemSKPanel;
    private JTextField txtIDDoDung;
    private JTextField txtTenDoDung;
    private JTextField txtHienTrang;
    private JTextField txtSoLuong;
    private JTextField txtGhiChu;
    private JButton btnDongY1;
    private JButton btnHuy1;
    private JTextField txtIDSua;
    private JTextField txtTenSua;
    private JTextField txtHienTrangSua;
    private JTextField txtSoLuongSua;
    private JTextField txtGhichuSua;
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
    private JTextField txtXoaCSVC;
    private JButton btnDongY4;
    private JButton btnHuy4;
    private JPanel formXoaCSVCPanel;
    private JPanel csvcContentPanel;
    private JPanel csvcControlPanel;
    private JPanel sukienContentPanel;
    private JPanel sukienControlPanel;

    private int selectedIndex;

    boolean check;
    boolean test;

    boolean check1;

    ArrayList<coSoNhaVanHoa> danhSachCoSoNhaVanHoa = new ArrayList<coSoNhaVanHoa>();

    ArrayList<suKienNhaVanHoa> danhSachSuKien =  new ArrayList<suKienNhaVanHoa>();

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
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                danhSachCoSoNhaVanHoa = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();
                coSoVatChatTableModel coSoVatChatTableModel = new coSoVatChatTableModel(danhSachCoSoNhaVanHoa);
                tblCoSoVatChat.setModel(coSoVatChatTableModel);
                tblCoSoVatChat.setAutoCreateRowSorter(true);
            }
        });

        btnSuKien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(suKienPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                danhSachSuKien = canBoNhaVanHoaController.thongKeSuKienNhaVanHoa();
                suKienTableModel suKienTableModel = new suKienTableModel(danhSachSuKien);
                tblSuKien.setModel(suKienTableModel);
                tblSuKien.setAutoCreateRowSorter(true);
            }
        });

        btnThemCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(formThemCSVCPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });

        btnSuaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedIndex = tblCoSoVatChat.getSelectedRow();







            }
        });

        btnXoaCSVC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(formXoaCSVCPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });



        btnThemSK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(formThemSKPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });
        //setVisible(true);

        btnDongY1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idDoDung = txtIDDoDung.getText();
                String tenDoDung = txtTenDoDung.getText();
                String hienTrang = txtHienTrang.getText();
                String soLuong = txtSoLuong.getText();
                String ghiChu = txtGhiChu.getText();
                coSoNhaVanHoa coSoNhaVanHoa = new coSoNhaVanHoa(Integer.parseInt(idDoDung), tenDoDung, hienTrang,
                        Integer.parseInt(soLuong), ghiChu);
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
               test = canBoNhaVanHoaController.themCoSoVatChatNhaVanHoa(coSoNhaVanHoa);
               if(test == true)
               {

                   contentPanel.removeAll();
                   contentPanel.add(cosovatchatPanel);
                   contentPanel.repaint();
                   contentPanel.revalidate();
               }
            }
        });




        btnHuy1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            contentPanel.removeAll();
            contentPanel.add(cosovatchatPanel);
            contentPanel.repaint();
            contentPanel.revalidate();
            }
        });
        btnDongY3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idsuKien = txtIdSuKien.getText();
                String ngayToChuc = txtNgayToChuc.getText();
                String loaiSuKien = txtLoaiSuKien.getText();
                String phiSuDung = txtPhiSuDung.getText();
                String ghiChu = txtGhiChu1.getText();
                suKienNhaVanHoa suKienNhaVanHoa = new suKienNhaVanHoa(Integer.parseInt(idsuKien),
                        Date.valueOf(ngayToChuc), loaiSuKien,
                        Integer.parseInt(phiSuDung), ghiChu);
                canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
                check = canBoNhaVanHoaController.themSuKienNhaVanHoa(suKienNhaVanHoa);
                if(check == true)
                {

                    contentPanel.removeAll();
                    contentPanel.add(suKienPanel);
                    contentPanel.repaint();
                    contentPanel.revalidate();
                }
            }
        });
        btnHuy3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(suKienPanel);
                contentPanel.repaint();
                contentPanel.revalidate();

            }
        });

        btnHuy2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(cosovatchatPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });
        btnHuy4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPanel.removeAll();
                contentPanel.add(cosovatchatPanel);
                contentPanel.repaint();
                contentPanel.revalidate();
            }
        });



            }
    public static void main(String[] args)
    {
        canBoNhaVanHoaHomePage canBoNhaVanHoaHomePage = new canBoNhaVanHoaHomePage(null);
        canBoNhaVanHoaHomePage.setVisible(true);
    }

   private static class coSoVatChatTableModel extends AbstractTableModel
   {

       private final String[] COSOVATCHATTABLECOLUMN = {"IDDodung", "tenDodung", "hientrang", "soluong", "ghichu"};
       private ArrayList<coSoNhaVanHoa> dsCoSoNhaVanHoa;
       public coSoVatChatTableModel(ArrayList<coSoNhaVanHoa> dsCoSoNhaVanHoa){this.dsCoSoNhaVanHoa=dsCoSoNhaVanHoa;}

       @Override
       public String getColumnName(int column) {
           return COSOVATCHATTABLECOLUMN[column];
       }

       @Override
       public Class<?> getColumnClass(int columnIndex) {

           if(getValueAt(0,columnIndex)!=null)
           {
               return getValueAt(0,columnIndex).getClass();
           }else{
               return Object.class;
           }

       }

       @Override
       public int getRowCount() {
           return dsCoSoNhaVanHoa.size();
       }

       @Override
       public boolean isCellEditable(int rowIndex, int columnIndex) {
           return true;
       }

       @Override
       public int getColumnCount() {
           return COSOVATCHATTABLECOLUMN.length;
       }



       @Override
       public Object getValueAt(int rowIndex, int columnIndex) {
           coSoNhaVanHoa b = dsCoSoNhaVanHoa.get(rowIndex);
           return switch (columnIndex) {
               case 0 -> dsCoSoNhaVanHoa.get(rowIndex).getIdDoDung();
               case 1 -> dsCoSoNhaVanHoa.get(rowIndex).getTenDoDung();
               case 2 -> dsCoSoNhaVanHoa.get(rowIndex).getHienTrang();
               case 3 -> dsCoSoNhaVanHoa.get(rowIndex).getSoLuong();
               case 4 -> dsCoSoNhaVanHoa.get(rowIndex).getGhiChu();
               default -> "-";
           };
       }
   }





   private static class suKienTableModel extends AbstractTableModel
   {
       private final String[] SUKIENTABLECOLUMN = {"IDSuKien", "NgayToChuc", "LoaiSuKien", "PhiSuDung", "GhiChu"};
       private ArrayList<suKienNhaVanHoa> skNhaVanHoa;
       public suKienTableModel(ArrayList<suKienNhaVanHoa> skNhaVanHoa){this.skNhaVanHoa=skNhaVanHoa;}

       @Override
       public String getColumnName(int column) {
           return SUKIENTABLECOLUMN[column];
       }

       @Override
       public Class<?> getColumnClass(int columnIndex) {
           if(getValueAt(0,columnIndex)!=null)
           {
               return getValueAt(0,columnIndex).getClass();
           }else{
               return Object.class;
           }
       }

       @Override
       public int getRowCount() {
           return skNhaVanHoa.size();
       }

       @Override
       public int getColumnCount() {
           return SUKIENTABLECOLUMN.length;
       }


       @Override
       public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex) {
               case 0 -> skNhaVanHoa.get(rowIndex).getIdSuKien();
               case 1 -> skNhaVanHoa.get(rowIndex).getNgayToChuc();
               case 2 -> skNhaVanHoa.get(rowIndex).getLoaiSuKien();
               case 3 -> skNhaVanHoa.get(rowIndex).getPhiSuDung();
               case 4 -> skNhaVanHoa.get(rowIndex).getGhiChu();
               default -> "-";
           };
       }
   }
}





