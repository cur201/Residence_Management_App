package controller;

import model.*;

import java.sql.*;
import java.util.ArrayList;

public class toTruongController {

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");

    public boolean thayDoiCaHo()
    {
        return false;
    }

    ArrayList<nhanKhau> timKiemThongTin(String category, String keyword)
    {
        ArrayList<nhanKhau> ketQuaTimKiem = new ArrayList<nhanKhau>();
        return ketQuaTimKiem;
    }

    public void lichSuThayDoiNhanKhau()
    {

    }

    public ArrayList<nhanKhau> thongKeNhanKhau(String category, String categoryValue)
    {
        ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectNhanKhau = "SELECT * FROM nhan_khau WHERE " + category + " LIKE " + "\"%" + categoryValue + "%\"";
            ResultSet tblNhanKhau = stmt.executeQuery(sqlSelectNhanKhau);

            while(tblNhanKhau.next())
            {
                int idNhanKhau = tblNhanKhau.getInt("idNhanKhau");
                String hoTen = tblNhanKhau.getString("hoTen");
                String bietDanh = tblNhanKhau.getString("bietDanh");
                int soCMT = tblNhanKhau.getInt("soCMT");
                Date ngayCapCMT = tblNhanKhau.getDate("ngayCapCMT");
                String noiCapCMT = tblNhanKhau.getString("noiCapCMT");
                int namSinh = tblNhanKhau.getInt("namSinh");
                String gioiTinh = tblNhanKhau.getString("gioiTinh");
                String noiSinh = tblNhanKhau.getString("noiSinh");
                String danToc = tblNhanKhau.getString("danToc");
                String tonGiao = tblNhanKhau.getString("tonGiao");
                String quocTich = tblNhanKhau.getString("quocTich");
                String nguyenQuan = tblNhanKhau.getString("nguyenQuan");
                String noiThuongTru = tblNhanKhau.getString("noiThuongTru");
                String ngheNghiep = tblNhanKhau.getString("ngheNghiep");
                String noiLamViec = tblNhanKhau.getString("noiLamViec");
                Date ngayDangKyThuongTru = tblNhanKhau.getDate("ngayDangKyThuongTru");
                boolean trangThaiTamTru = tblNhanKhau.getBoolean("trangThaiTamTru");
                boolean trangThaiTamVang = tblNhanKhau.getBoolean("trangThaiTamVang");
                String ghiChu = tblNhanKhau.getString("ghiChu");
                nhanKhau nk = new nhanKhau(idNhanKhau, hoTen, bietDanh, soCMT, ngayCapCMT, noiCapCMT, namSinh,
                        gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, ngheNghiep, noiLamViec,
                        ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu);
                dsNhanKhau.add(nk);
            }
            return dsNhanKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean pheDuyetNhaVanHoa(boolean accept, int idSuDungNhaVanHoaRecord)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemSuKienNhaVanHoa = "INSERT INTO su_kien_nha_van_hoa  (ngayToChuc, loaiSuKien, phiSuDung, ghiChu) " +
                        "SELECT  ngayToChuc, loaiSuKien, phiSuDung, ghiChu " +
                        "FROM dang_ky_su_dung_nha_van_hoa WHERE idGiayDangKy = " + idSuDungNhaVanHoaRecord;
                PreparedStatement dangKySuDungNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToThemSuKienNhaVanHoa);
                boolean thanhCong = dangKySuDungNhaVanhoaRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetGiayTamVang(boolean accept, tamVang tamVang)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemTamVang = "UPDATE nhan_khau SET trangThaiTamVang = true WHERE (idNhanKhau = ?)";
                PreparedStatement tamVangRecord = connectDB.prepareStatement(sqlInsertInToThemTamVang);
                tamVangRecord.setInt(1, tamVang.getIdNhanKhau());
                boolean thanhCong = tamVangRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetGiayTamTru(boolean accept, tamTru tamTru)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemTamTru = "UPDATE nhan_khau SET trangThaiTamTru = true WHERE (idNhanKhau = ?)";
                PreparedStatement tamTruRecord = connectDB.prepareStatement(sqlInsertInToThemTamTru);
                tamTruRecord.setInt(1, tamTru.getIdNhanKhau());
                boolean thanhCong = tamTruRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetThemNhanKhau(boolean accept, int idThemNhanKhauRecord)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemNhanKhau = "INSERT INTO nhan_khau (hoTen, namSinh, gioiTinh, noiSinh, danToc, " +
                        "tonGiao, quocTich, nguyenQuan, noiThuongTru, ngayDangKyThuongTru)" +
                        " SELECT hoTen, namSinh, gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru," +
                        " ngayDangKyThuongTru FROM dang_ky_them_nhan_khau where idGiayDangKyThemNhanKhau = ?;";
                PreparedStatement themNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToThemNhanKhau);
                themNhanKhauRecord.setInt(1, idThemNhanKhauRecord);
                boolean thanhCong = themNhanKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetThemHoKhau(boolean accept, int idThemHoKhauRecord)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemHoKhau = "INSERT INTO ho_khau  (idChuHo, maKhuVuc, diaChi, ngayLap) " +
                        "SELECT idChuHo, maKhuVuc, diaChi, ngayLap" +
                        "FROM dang_ky_them_ho_khau WHERE idGiayDangKyThemHoKhau = ?";
                PreparedStatement themHoKhauRecord = connectDB.prepareStatement(sqlInsertInToThemHoKhau);
                themHoKhauRecord.setInt(1, idThemHoKhauRecord);
                boolean thanhCong = themHoKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetXoaNhanKhau(boolean accept, dangKyXoaNhanKhau xoaNhanKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToXoaNhanKhau = "DELETE FROM nhan_khau WHERE (idNhanKhau = ?);";
                PreparedStatement xoaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaNhanKhau);
                xoaNhanKhauRecord.setInt(1, xoaNhanKhau.getIdNguoiBiXoa());

                boolean thanhCong = xoaNhanKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetXoaHoKhau(boolean accept, dangKyXoaHoKhau xoaHoKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToXoaHoKhau = "DELETE FROM ho_khau WHERE (idHoKhau = ?);";
                PreparedStatement xoaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaHoKhau);
                xoaHoKhauRecord.setInt(1, xoaHoKhau.getIdHoKhau());


                boolean thanhCong = xoaHoKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetSuaNhanKhau(boolean accept, dangKySuaNhanKhau suaNhanKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToSuaNhanKhau = "UPDATE nhan_khau  SET hoTen = ?, bietDanh = ?, soCMT = ?, " +
                        "ngayCapCMT = ?, noiCapCMT = ?, namSinh = ?, gioiTinh = ?, noiSinh = ?, danToc = ?, tonGiao = ?, " +
                        "quocTich = ?, nguyenQuan = ?, noiThuongTru = ?, ngheNghiep = ?, noiLamViec = ?, " +
                        "ngayDangKyThuongTru = ?, trangThaiTamTru = ?, trangThaiTamVang = ?, ghiChu = ?" +
                        "WHERE idNhanKhau = ?";
                PreparedStatement suaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaNhanKhau);
                suaNhanKhauRecord.setString(1, suaNhanKhau.getHoTenMoi());
                suaNhanKhauRecord.setString(2, suaNhanKhau.getBietDanhMoi());
                suaNhanKhauRecord.setInt(3, suaNhanKhau.getSoCMTMoi());
                suaNhanKhauRecord.setDate(4, suaNhanKhau.getNgayCapCMT());
                suaNhanKhauRecord.setString(5, suaNhanKhau.getNoiCapCMT());
                suaNhanKhauRecord.setInt(6, suaNhanKhau.getNamSinhMoi());
                suaNhanKhauRecord.setString(7, suaNhanKhau.getGioiTinhMoi());
                suaNhanKhauRecord.setString(8, suaNhanKhau.getNoiSinhMoi());
                suaNhanKhauRecord.setString(9, suaNhanKhau.getDanTocMoi());
                suaNhanKhauRecord.setString(10, suaNhanKhau.getTonGiaoMoi());
                suaNhanKhauRecord.setString(11, suaNhanKhau.getQuocTichMoi());
                suaNhanKhauRecord.setString(12, suaNhanKhau.getNguyenQuanMoi());
                suaNhanKhauRecord.setString(13, suaNhanKhau.getNoiThuongTruMoi());
                suaNhanKhauRecord.setString(14, suaNhanKhau.getNgheNghiepMoi());
                suaNhanKhauRecord.setString(15, suaNhanKhau.getNoiLamViecMoi());
                suaNhanKhauRecord.setDate(16, suaNhanKhau.getNgayDangKyThuongTruMoi());
                suaNhanKhauRecord.setBoolean(17, suaNhanKhau.isTamTruMoi());
                suaNhanKhauRecord.setBoolean(18, suaNhanKhau.isTamVangMoi());
                suaNhanKhauRecord.setString(19, suaNhanKhau.getGhiChuMoi());
                suaNhanKhauRecord.setInt(20, suaNhanKhau.getIdNguoiDuocSua());

                boolean thanhCong = suaNhanKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean pheDuyetSuaHoKhau(boolean accept, dangKySuaHoKhau suaHoKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToSuaHoKhau = "UPDATE ho_khau SET idChuHo = ?, diaChi = ?, " +
                        "ngayLap = ? where idHoKhau = ?";
                PreparedStatement suaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaHoKhau);
                suaHoKhauRecord.setInt(1, suaHoKhau.getIdChuHoMoi());
                suaHoKhauRecord.setString(2, suaHoKhau.getDiaChiMoi());
                suaHoKhauRecord.setDate(3, suaHoKhau.getNgayThayDoi());
                suaHoKhauRecord.setInt(4, suaHoKhau.getIdHoKhau());



                boolean thanhCong = suaHoKhauRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
