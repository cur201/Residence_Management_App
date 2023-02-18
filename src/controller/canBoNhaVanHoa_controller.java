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
            String sqlSelectCoSoVatChat = "SELECT * FROM co_so_nha_van_hoa";
            ResultSet tblCoSoVatChat = stmt.executeQuery(sqlSelectCoSoVatChat);

            while(tblCoSoVatChat.next())
            {
                Integer idDoDungNhaVanHoa = tblCoSoVatChat.getInt("idDoDung");
                String tenCoSoVatChat = tblCoSoVatChat.getString("tenDoDung");
                String hienTrangCoSoVatChat = tblCoSoVatChat.getString("hienTrang");
                Integer soLuongCoSoVatChat = tblCoSoVatChat.getInt("soLuong");
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

    public boolean themSuKienNhaVanHoa(suKienNhaVanHoa suKienNhaVanHoa)
    {
        try{
            String sqlInsertInToThemSuKienNhaVanHoa = "INSERT INTO su_kien_nha_van_hoa (ngayToChuc, loaiSuKien, phiSuDung, ghiChu) VALUES (?, ?, ?, ?)";
            PreparedStatement themSuKienNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToThemSuKienNhaVanHoa);
            themSuKienNhaVanhoaRecord.setDate(1, suKienNhaVanHoa.getNgayToChuc());
            themSuKienNhaVanhoaRecord.setString(2, suKienNhaVanHoa.getLoaiSuKien());
            if(suKienNhaVanHoa.getPhiSuDung() == null)
            {
                themSuKienNhaVanhoaRecord.setNull(3, Types.INTEGER);
            }
            else
            {
                themSuKienNhaVanhoaRecord.setInt(3, suKienNhaVanHoa.getPhiSuDung());
            }

            themSuKienNhaVanhoaRecord.setString(4, suKienNhaVanHoa.getGhiChu());

            int thanhCong = themSuKienNhaVanhoaRecord.executeUpdate();
            if (thanhCong == 0)
            {
                return false;
            }
            else{return true;}
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
            if(coSoNhaVanHoa.getSoLuong() == null)
            {
                suaCoSoNhaVanhoaRecord.setNull(3, Types.INTEGER);
            }
            else
            {
                suaCoSoNhaVanhoaRecord.setInt(3, coSoNhaVanHoa.getSoLuong());
            }

            suaCoSoNhaVanhoaRecord.setString(4, coSoNhaVanHoa.getGhiChu());
            suaCoSoNhaVanhoaRecord.setInt(5, coSoNhaVanHoa.getIdDoDung());

            int thanhCong = suaCoSoNhaVanhoaRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else{return true;}
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean xoaCoSoVatChatNhaVanHoa(int idCoSoCanXoa)
    {
        try{
            String sqlInsertInToXoaCoSoNhaVanHoa = "DELETE FROM co_so_nha_van_hoa WHERE idDoDung = " + idCoSoCanXoa + ";";
            PreparedStatement xoaCoSoNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToXoaCoSoNhaVanHoa);
            int thanhCong = xoaCoSoNhaVanhoaRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else{return true;}
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean themCoSoVatChatNhaVanHoa(coSoNhaVanHoa coSoNhaVanHoa)
    {
        try{
            String sqlInsertInToThemCSVC = "INSERT INTO co_so_nha_van_hoa (tenDoDung, hienTrang, soLuong, ghiChu) VALUES (?, ?, ?, ?)";
            PreparedStatement themCSVCRecord = connectDB.prepareStatement(sqlInsertInToThemCSVC);
            themCSVCRecord.setString(1, coSoNhaVanHoa.getTenDoDung());
            themCSVCRecord.setString(2, coSoNhaVanHoa.getHienTrang());
            if(coSoNhaVanHoa.getSoLuong() == null)
            {
                themCSVCRecord.setNull(3, Types.INTEGER);
            }
            else
            {
                themCSVCRecord.setInt(3, coSoNhaVanHoa.getSoLuong());
            }

            themCSVCRecord.setString(4, coSoNhaVanHoa.getGhiChu());

            int thanhCong = themCSVCRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return  false;
            }
            else
            {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<suKienNhaVanHoa> thongKeSuKienNhaVanHoa()
    {
        ArrayList<suKienNhaVanHoa> dsSuKienNhaVanHoa = new ArrayList<suKienNhaVanHoa>();
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
                suKienNhaVanHoa suKien = new suKienNhaVanHoa(idSuKien, ngayToChuc, loaiSuKien, phiSuDung,
                        ghiChuSuKien);
                dsSuKienNhaVanHoa.add(suKien);
            }
            return dsSuKienNhaVanHoa;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean xoaSuKienNhaVanHoa(int idSuKienCanXoa)
    {
        try{
            String sqlInsertInToXoaSuKienNhaVanHoa = "DELETE FROM su_kien_nha_van_hoa WHERE idSuKien = " + idSuKienCanXoa + ";";
            PreparedStatement xoaSuKienNhaVanHoaRecord = connectDB.prepareStatement(sqlInsertInToXoaSuKienNhaVanHoa);
            int thanhCong = xoaSuKienNhaVanHoaRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else{return true;}
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

}
