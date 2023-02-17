package controller;

import model.coSoNhaVanHoa;
import model.nhanKhau;
import model.suKienNhaVanHoa;

import java.sql.*;
import java.util.ArrayList;

public class canBoNhaVanHoa_controller {
    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");

    public ArrayList<coSoNhaVanHoa> thongKeCoSoVatChatNhaVanHoa()
    {
        ArrayList<coSoNhaVanHoa> dsCoSoVatChat = new ArrayList<coSoNhaVanHoa>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectCoSoVatChat = "SELECT * FROM co_so_nha_van_hoa ";
            ResultSet tblCoSoVatChat = stmt.executeQuery(sqlSelectCoSoVatChat);

            while(tblCoSoVatChat.next())
            {
                int idDoDungNhaVanHoa = tblCoSoVatChat.getInt("idDoDung");
                String tenCoSoVatChat = tblCoSoVatChat.getString("tenDoDung");
                String hienTrangCoSoVatChat = tblCoSoVatChat.getString("hienTrang");
                int soLuongCoSoVatChat = tblCoSoVatChat.getInt("soLuong");
                String ghiChuCoSoVatChat = tblCoSoVatChat.getString("ghiChu");
                coSoNhaVanHoa coSo = new coSoNhaVanHoa(idDoDungNhaVanHoa, tenCoSoVatChat, hienTrangCoSoVatChat, soLuongCoSoVatChat,
                        ghiChuCoSoVatChat);
                dsCoSoVatChat.add(coSo);
            }
            return dsCoSoVatChat;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean themCoSoVatChatNhaVanHoa(coSoNhaVanHoa coSoNhaVanHoa){
        try{        String sqlInsertInToThemCSVC = "INSERT INTO co_so_nha_van_hoa  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement themCSVCRecord = connectDB.prepareStatement(sqlInsertInToThemCSVC);
            themCSVCRecord.setInt(1, coSoNhaVanHoa.getIdDoDung());
            themCSVCRecord.setString(2, coSoNhaVanHoa.getTenDoDung());
            themCSVCRecord.setString(3, coSoNhaVanHoa.getHienTrang());
            if(coSoNhaVanHoa.getSoLuong() == null){
                themCSVCRecord.setNull(4, Types.INTEGER);
            }
            else{
                themCSVCRecord.setInt(4, coSoNhaVanHoa.getSoLuong());
            }
            themCSVCRecord.setString(5, coSoNhaVanHoa.getGhiChu());
            int thanhCong = themCSVCRecord.executeUpdate();
            if(thanhCong == 0){
                return false;
            }
            else{
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }}

    public boolean themSuKienNhaVanHoa(suKienNhaVanHoa suKienNhaVanHoa)
    {
        try{
            String sqlInsertInToThemSuKienNhaVanHoa = "INSERT INTO su_kien_nha_van_hoa  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement themSuKienNhaVanHoaRecord = connectDB.prepareStatement(sqlInsertInToThemSuKienNhaVanHoa);
            themSuKienNhaVanHoaRecord.setInt(1, suKienNhaVanHoa.getIdSuKien());
            themSuKienNhaVanHoaRecord.setDate(2, suKienNhaVanHoa.getNgayToChuc());
            themSuKienNhaVanHoaRecord.setString(3, suKienNhaVanHoa.getLoaiSuKien());
            themSuKienNhaVanHoaRecord.setInt(4, suKienNhaVanHoa.getPhiSuDung());
            themSuKienNhaVanHoaRecord.setString(5, suKienNhaVanHoa.getGhiChu());

            int thanhCong = themSuKienNhaVanHoaRecord.executeUpdate();
            if(thanhCong == 0){
                return false;
            }
            else{
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<suKienNhaVanHoa> thongKeSuKienNhaVanHoa()
    {    ArrayList<suKienNhaVanHoa> dsSuKienNhaVanHoa = new ArrayList<suKienNhaVanHoa>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectCoSoVatChat = "SELECT * FROM su_kien_nha_van_hoa";
            ResultSet tblSuKien = stmt.executeQuery(sqlSelectCoSoVatChat);

            while(tblSuKien.next())
            {
                Integer idSuKien = tblSuKien.getInt("idSuKien");
                Date ngayToChuc = tblSuKien.getDate("ngayToChuc");
                String loaiSuKien = tblSuKien.getString("loaiSuKien");
                Integer phiSuDung = tblSuKien.getInt("phiSuDung");
                String ghiChuSuKien = tblSuKien.getString("ghiChu");
                suKienNhaVanHoa suKien = new suKienNhaVanHoa(idSuKien, ngayToChuc, loaiSuKien, phiSuDung, ghiChuSuKien);
                dsSuKienNhaVanHoa.add(suKien);
            }
            return dsSuKienNhaVanHoa;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean suaCoSoVatChatNhaVanHoa(coSoNhaVanHoa coSoNhaVanHoa)
    {
        try{
            String sqlInsertInToSuaCoSoNhaVanHoa = "UPDATE residence_management.co_so_nha_van_hoa SET tenDoDung = ?, hienTrang = ?, soLuong = ?, ghiChu = ? WHERE (idDoDung = ?);";
            PreparedStatement suaCoSoNhaVanHoaRecord = connectDB.prepareStatement(sqlInsertInToSuaCoSoNhaVanHoa);
            suaCoSoNhaVanHoaRecord.setString(1, coSoNhaVanHoa.getTenDoDung());
            suaCoSoNhaVanHoaRecord.setString(2, coSoNhaVanHoa.getHienTrang());
            suaCoSoNhaVanHoaRecord.setInt(3, coSoNhaVanHoa.getSoLuong());
            suaCoSoNhaVanHoaRecord.setString(4, coSoNhaVanHoa.getGhiChu());
            suaCoSoNhaVanHoaRecord.setInt(5, coSoNhaVanHoa.getIdDoDung());

            boolean thanhCong = suaCoSoNhaVanHoaRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean xoaCoSoVatChatNhaVanHoa(int idCoSoCanXoa)
    {
        try{
            String sqlInsertInToXoaCoSoNhaVanHoa = "DELETE FROM co_so_nha_van_hoa WHERE idDoDung = " + idCoSoCanXoa + ";";
            PreparedStatement xoaCoSoNhaVanHoaRecord = connectDB.prepareStatement(sqlInsertInToXoaCoSoNhaVanHoa);
            boolean thanhCong = xoaCoSoNhaVanHoaRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
