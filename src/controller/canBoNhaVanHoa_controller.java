package controller;

import model.coSoNhaVanHoa;
import model.nhanKhau;
import model.suKienNhaVanHoa;

import java.sql.*;
import java.util.ArrayList;

public class canBoNhaVanHoa_controller {
    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");

    public ArrayList<coSoNhaVanHoa> thongKeCoSoVatChatNhaVanHoa(String category, String categoryValue)
    {
        ArrayList<coSoNhaVanHoa> dsCoSoVatChat = new ArrayList<coSoNhaVanHoa>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectCoSoVatChat = "SELECT * FROM co_so_nha_van_hoa WHERE " + category + " LIKE " + "\"%" + categoryValue + "%\"";
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
            boolean thanhCong = themCSVCRecord.execute();
            return thanhCong;
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

            boolean thanhCong = themSuKienNhaVanHoaRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean suaCoSoVatChatNhaVanHoa(coSoNhaVanHoa coSoNhaVanHoa)
    {
        try{
            String sqlInsertInToSuaCoSoNhaVanHoa = "UPDATE residence_management.co_so_nha_van_hoa SET tenDoDung = ?, hienTrang = ?, soLuong = ?, ghiChu = ? WHERE (idDoDung = ?);";
            PreparedStatement suaCoSoNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToSuaCoSoNhaVanHoa);
            suaCoSoNhaVanhoaRecord.setString(1, coSoNhaVanHoa.getTenDoDung());
            suaCoSoNhaVanhoaRecord.setString(2, coSoNhaVanHoa.getHienTrang());
            suaCoSoNhaVanhoaRecord.setInt(3, coSoNhaVanHoa.getSoLuong());
            suaCoSoNhaVanhoaRecord.setString(4, coSoNhaVanHoa.getGhiChu());
            suaCoSoNhaVanhoaRecord.setInt(5, coSoNhaVanHoa.getIdDoDung());

            boolean thanhCong = suaCoSoNhaVanhoaRecord.execute();
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
