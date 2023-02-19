package controller;

import model.*;

import java.sql.*;
import java.util.ArrayList;

public class toTruongController {

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");


    public ArrayList<nhanKhau> timKiemThongTin(String category, String keyword)
    {
        ArrayList<nhanKhau> ketQuaTimKiem = new ArrayList<nhanKhau>();
        Statement stmt;
        try
        {
            stmt = connectDB.createStatement();
            String sqlTimKiemThongTin = "SELECT * FROM nhan_khau WHERE " + category + " LIKE " + "\"%" + keyword + "%\"";
            ResultSet tblKetQua = stmt.executeQuery(sqlTimKiemThongTin);

            while(tblKetQua.next())
            {
                int idNhanKhau = tblKetQua.getInt("idNhanKhau");
                String hoTen = tblKetQua.getString("hoTen");
                String bietDanh = tblKetQua.getString("bietDanh");
                int soCMT = tblKetQua.getInt("soCMT");
                Date ngayCapCMT = tblKetQua.getDate("ngayCapCMT");
                String noiCapCMT = tblKetQua.getString("noiCapCMT");
                int namSinh = tblKetQua.getInt("namSinh");
                String gioiTinh = tblKetQua.getString("gioiTinh");
                String noiSinh = tblKetQua.getString("noiSinh");
                String danToc = tblKetQua.getString("danToc");
                String tonGiao = tblKetQua.getString("tonGiao");
                String quocTich = tblKetQua.getString("quocTich");
                String nguyenQuan = tblKetQua.getString("nguyenQuan");
                String noiThuongTru = tblKetQua.getString("noiThuongTru");
                String ngheNghiep = tblKetQua.getString("ngheNghiep");
                String noiLamViec = tblKetQua.getString("noiLamViec");
                Date ngayDangKyThuongTru = tblKetQua.getDate("ngayDangKyThuongTru");
                boolean trangThaiTamTru = tblKetQua.getBoolean("trangThaiTamTru");
                boolean trangThaiTamVang = tblKetQua.getBoolean("trangThaiTamVang");
                String ghiChu = tblKetQua.getString("ghiChu");
                nhanKhau nk = new nhanKhau(idNhanKhau, hoTen, bietDanh, soCMT, ngayCapCMT, noiCapCMT, namSinh,
                        gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, ngheNghiep, noiLamViec,
                        ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu);
                ketQuaTimKiem.add(nk);
            }
            return ketQuaTimKiem;
        }catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<lichSuNhanKhau> lichSuThayDoiNhanKhau(Integer idNhanKhau)
    {
        ArrayList<lichSuNhanKhau> dsLichSuNhanKhau = new ArrayList<lichSuNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectLichSuNhanKhau = "select idNhanKhau, ngayKhai, typeNhanKhau from " +
                    "( " +
                    " select idNguoiDuocSua as idNhanKhau, ngayKhai, 'Sua Nhan Khau' typeNhanKhau " +
                    " from dang_ky_sua_nhan_khau" +
                    " union all" +
                    " select idNguoiBiXoa as idNhanKhau, ngayXoa, 'Xoa Nhan Khau' typeNhanKhau " +
                    " from dang_ky_xoa_nhan_khau" +
                    " union all " +
                    " select idNhanKhau, tuNgay, 'Tam tru' typeNhanKhau " +
                    " from tam_tru " +
                    " union all " +
                    " select idNhanKhau, tuNgay, 'Tam vang' typeNhanKhau" +
                    " from tam_vang " +
                    " ) a " +
                    " where idNhanKhau = " + idNhanKhau +
                    " order by ngayKhai desc, typeNhanKhau asc";
            ResultSet tblNhanKhau = stmt.executeQuery(sqlSelectLichSuNhanKhau);

            while(tblNhanKhau.next())
            {
                int idNhanKhauTruyVan = tblNhanKhau.getInt("idNhanKhau");
                Date ngayThayDoi = tblNhanKhau.getDate("ngayKhai");
                String typeNhanKhau = tblNhanKhau.getString("typeNhanKhau");
                lichSuNhanKhau lsNhanKhau = new lichSuNhanKhau(idNhanKhauTruyVan, ngayThayDoi, typeNhanKhau);
                dsLichSuNhanKhau.add(lsNhanKhau);
            }
            return dsLichSuNhanKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<nhanKhau> thongKeNhanKhau()
    {
        ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectNhanKhau = "SELECT * FROM nhan_khau";
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
                int thanhCong = dangKySuDungNhaVanhoaRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_su_dung_nha_van_hoa WHERE idGiayDangKy = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idSuDungNhaVanHoaRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_su_dung_nha_van_hoa WHERE idGiayDangKy = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idSuDungNhaVanHoaRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetGiayTamVang(boolean accept, tamVang tamVang)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemTamVang = "UPDATE nhan_khau SET trangThaiTamVang = true WHERE (idNhanKhau = ?)";
                PreparedStatement tamVangRecord = connectDB.prepareStatement(sqlInsertInToThemTamVang);
                tamVangRecord.setInt(1, tamVang.getIdNhanKhau());
                int thanhCong = tamVangRecord.executeUpdate();

                String delete = "DELETE FROM tam_vang WHERE idGiayTamVang = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, tamVang.getIdGiayTamVang());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM tam_vang WHERE idGiayTamVang = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, tamVang.getIdGiayTamVang());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetGiayTamTru(boolean accept, tamTru tamTru)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemTamTru = "UPDATE nhan_khau SET trangThaiTamTru = true WHERE (idNhanKhau = ?)";
                PreparedStatement tamTruRecord = connectDB.prepareStatement(sqlInsertInToThemTamTru);
                tamTruRecord.setInt(1, tamTru.getIdNhanKhau());
                int thanhCong = tamTruRecord.executeUpdate();

                String delete = "DELETE FROM tam_tru WHERE idGiayTamTru = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, tamTru.getIdGiayTamTru());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM tam_tru WHERE idGiayTamTru = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, tamTru.getIdGiayTamTru());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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
                int thanhCong = themNhanKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_them_nhan_khau WHERE idGiayDangKyThemNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idThemNhanKhauRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_them_nhan_khau WHERE idGiayDangKyThemNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idThemNhanKhauRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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
                int thanhCong = themHoKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_them_ho_khau WHERE idGiayDangKyThemHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idThemHoKhauRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_them_ho_khau WHERE idGiayDangKyThemHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idThemHoKhauRecord);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetXoaNhanKhau(boolean accept, dangKyXoaNhanKhau xoaNhanKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToXoaNhanKhau = "DELETE FROM nhan_khau WHERE (idNhanKhau = ?);";
                PreparedStatement xoaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaNhanKhau);
                xoaNhanKhauRecord.setInt(1, xoaNhanKhau.getIdNguoiBiXoa());
                int thanhCong = xoaNhanKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_xoa_nhan_khau WHERE idGiayDangKyXoaNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, xoaNhanKhau.getIdGiayDangKyXoaNhanKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_xoa_nhan_khau WHERE idGiayDangKyXoaNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, xoaNhanKhau.getIdGiayDangKyXoaNhanKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetXoaHoKhau(boolean accept, dangKyXoaHoKhau xoaHoKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToXoaHoKhau = "DELETE FROM ho_khau WHERE (idHoKhau = ?);";
                PreparedStatement xoaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaHoKhau);
                xoaHoKhauRecord.setInt(1, xoaHoKhau.getIdHoKhau());
                int thanhCong = xoaHoKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_xoa_ho_khau WHERE idGiayDangKyXoaHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, xoaHoKhau.getIdGiayDangKyXoaHoKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_xoa_ho_khau WHERE idGiayDangKyXoaHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, xoaHoKhau.getIdGiayDangKyXoaHoKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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
                if(suaNhanKhau.getSoCMTMoi() == null)
                {
                    suaNhanKhauRecord.setNull(3, Types.INTEGER);
                }
                else
                {
                    suaNhanKhauRecord.setInt(3, suaNhanKhau.getSoCMTMoi());
                }
                suaNhanKhauRecord.setDate(4, suaNhanKhau.getNgayCapCMT());
                suaNhanKhauRecord.setString(5, suaNhanKhau.getNoiCapCMT());
                if(suaNhanKhau.getNamSinhMoi() == null)
                {
                    suaNhanKhauRecord.setNull(6, Types.INTEGER);
                }
                else
                {
                    suaNhanKhauRecord.setInt(6, suaNhanKhau.getNamSinhMoi());
                }
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
                if(suaNhanKhau.getIdNguoiDuocSua() == null)
                {
                    suaNhanKhauRecord.setNull(20, Types.INTEGER);
                }
                else
                {
                    suaNhanKhauRecord.setInt(20, suaNhanKhau.getIdNguoiDuocSua());
                }
                int thanhCong = suaNhanKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_sua_nhan_khau WHERE idGiayDangKySuaNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, suaNhanKhau.getIdGiayDangKySuaNhanKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_sua_nhan_khau WHERE idGiayDangKySuaNhanKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, suaNhanKhau.getIdGiayDangKySuaNhanKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();
                if(deleteThanhCong == 0)
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

    public boolean pheDuyetSuaHoKhau(boolean accept, dangKySuaHoKhau suaHoKhau)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToSuaHoKhau = "UPDATE ho_khau SET idChuHo = ?, diaChi = ?, " +
                        "ngayLap = ? where idHoKhau = ?";
                PreparedStatement suaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaHoKhau);
                if(suaHoKhau.getIdChuHoMoi() == null)
                {
                    suaHoKhauRecord.setNull(1, Types.INTEGER);
                }
                else
                {
                    suaHoKhauRecord.setInt(1, suaHoKhau.getIdChuHoMoi());
                }
                suaHoKhauRecord.setString(2, suaHoKhau.getDiaChiMoi());
                suaHoKhauRecord.setDate(3, suaHoKhau.getNgayThayDoi());
                if(suaHoKhau.getIdHoKhau() == null)
                {
                    suaHoKhauRecord.setNull(4, Types.INTEGER);
                }
                else
                {
                    suaHoKhauRecord.setInt(4, suaHoKhau.getIdHoKhau());
                }
                int thanhCong = suaHoKhauRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_sua_ho_khau WHERE idGiayDangKySuaHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, suaHoKhau.getIdGiayDangKySuaHoKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_sua_ho_khau WHERE idGiayDangKySuaHoKhau = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, suaHoKhau.getIdGiayDangKySuaHoKhau());
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetThemNhanKhauVaoHo(boolean accept, int idGiayDangKyThemNhanKhauVaoHo)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToThemThanhVienCuaHo = "INSERT INTO thanh_vien_cua_ho  (idNhanKhau, idHoKhau, quanHeVoiChuHo) " +
                        "SELECT idNhanKhauDuocThem, idHoKhauDuocThem, quanHeVoiChuHo" +
                        "FROM dang_ky_them_nhan_khau_vao_ho WHERE idGiayDangKyThemNhanKhauVaoHo = ?";
                PreparedStatement themThanhVienCuaHoRecord = connectDB.prepareStatement(sqlInsertInToThemThanhVienCuaHo);
                themThanhVienCuaHoRecord.setInt(1, idGiayDangKyThemNhanKhauVaoHo);
                int thanhCong = themThanhVienCuaHoRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_them_nhan_khau_vao_ho WHERE idGiayDangKyThemNhanKhauVaoHo = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idGiayDangKyThemNhanKhauVaoHo);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_them_nhan_khau_vao_ho WHERE idGiayDangKyThemNhanKhauVaoHo = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idGiayDangKyThemNhanKhauVaoHo);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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

    public boolean pheDuyetXoaNhanKhauKhoiHo(boolean accept, int idGiayDangKyXoaNhanKhauKhoiHo)
    {
        if(accept == true)
        {
            try{
                String sqlInsertInToXoaThanhVienKhoiHo = "DELETE FROM thanh_vien_cua_ho WHERE (idNhanKhau = ?);";
                PreparedStatement xoaThanhVienKhoiHoRecord = connectDB.prepareStatement(sqlInsertInToXoaThanhVienKhoiHo);
                xoaThanhVienKhoiHoRecord.setInt(1, idGiayDangKyXoaNhanKhauKhoiHo);
                int thanhCong = xoaThanhVienKhoiHoRecord.executeUpdate();

                String delete = "DELETE FROM dang_ky_xoa_nhan_khau_khoi_ho WHERE idGiayDangKyXoaNhanKhauKhoiHo = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idGiayDangKyXoaNhanKhauKhoiHo);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(thanhCong == 0 || deleteThanhCong == 0)
                {
                    return false;
                }
                else{return true;}
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String delete = "DELETE FROM dang_ky_xoa_nhan_khau_khoi_ho WHERE idGiayDangKyXoaNhanKhauKhoiHo = ?";
                PreparedStatement deleteRecord = connectDB.prepareStatement(delete);
                deleteRecord.setInt(1, idGiayDangKyXoaNhanKhauKhoiHo);
                int deleteThanhCong = deleteRecord.executeUpdate();

                if(deleteThanhCong == 0)
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
    public ArrayList<dangKyThemNhanKhau> xemDKThemNhanKhau()
    {
        ArrayList<dangKyThemNhanKhau> dsKetQua = new ArrayList<dangKyThemNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_them_nhan_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyThemNhanKhau = tblKetQua.getInt("idGiayDangKyThemNhanKhau");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                String hoTen = tblKetQua.getString("hoTen");
                String bietDanh = tblKetQua.getString("bietDanh");
                int soCMT = tblKetQua.getInt("soCMT");
                Date ngayCapCMT = tblKetQua.getDate("ngayCapCMT");
                String noiCapCMT = tblKetQua.getString("noiCapCMT");
                int namSinh = tblKetQua.getInt("namSinh");
                String gioiTinh = tblKetQua.getString("gioiTinh");
                String noiSinh = tblKetQua.getString("noiSinh");
                String danToc = tblKetQua.getString("danToc");
                String tonGiao = tblKetQua.getString("tonGiao");
                String quocTich = tblKetQua.getString("quocTich");
                String nguyenQuan = tblKetQua.getString("nguyenQuan");
                String noiThuongTru = tblKetQua.getString("noiThuongTru");
                String ngheNghiep = tblKetQua.getString("ngheNghiep");
                String noiLamViec = tblKetQua.getString("noiLamViec");
                Date ngayDangKyThuongTru = tblKetQua.getDate("ngayDangKyThuongTru");
                boolean trangThaiTamTru = tblKetQua.getBoolean("trangThaiTamTru");
                boolean trangThaiTamVang = tblKetQua.getBoolean("trangThaiTamVang");
                String ghiChu = tblKetQua.getString("ghiChu");
                dangKyThemNhanKhau dk = new dangKyThemNhanKhau(idGiayDangKyThemNhanKhau, idNguoiKhai, ngayKhai, hoTen, bietDanh,
                        soCMT, ngayCapCMT, noiCapCMT, namSinh, gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru,
                        ngheNghiep, noiLamViec, ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKySuaNhanKhau> xemDKSuaNhanKhau()
    {
        ArrayList<dangKySuaNhanKhau> dsKetQua = new ArrayList<dangKySuaNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_sua_nhan_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKySuaNhanKhau = tblKetQua.getInt("idGiayDangKySuaNhanKhau");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                int idNguoiDuocSua = tblKetQua.getInt("idNguoiDuocSua");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                String hoTen = tblKetQua.getString("hoTenMoi");
                String bietDanh = tblKetQua.getString("bietDanhMoi");
                int soCMT = tblKetQua.getInt("soCMTMoi");
                Date ngayCapCMT = tblKetQua.getDate("ngayCapCMT");
                String noiCapCMT = tblKetQua.getString("noiCapCMT");
                int namSinh = tblKetQua.getInt("namSinhMoi");
                String gioiTinh = tblKetQua.getString("gioiTinhMoi");
                String noiSinh = tblKetQua.getString("noiSinhMoi");
                String danToc = tblKetQua.getString("danTocMoi");
                String tonGiao = tblKetQua.getString("tonGiaoMoi");
                String quocTich = tblKetQua.getString("quocTichMoi");
                String nguyenQuan = tblKetQua.getString("nguyenQuanMoi");
                String noiThuongTru = tblKetQua.getString("noiThuongTruMoi");
                String ngheNghiep = tblKetQua.getString("ngheNghiepMoi");
                String noiLamViec = tblKetQua.getString("noiLamViecMoi");
                Date ngayDangKyThuongTru = tblKetQua.getDate("ngayDangKyThuongTruMoi");
                boolean trangThaiTamTru = tblKetQua.getBoolean("tamTruMoi");
                boolean trangThaiTamVang = tblKetQua.getBoolean("tamVangMoi");
                String ghiChu = tblKetQua.getString("ghiChuMoi");
                dangKySuaNhanKhau dk = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau, idNguoiKhai, idNguoiDuocSua, ngayKhai, hoTen, bietDanh,
                        soCMT, ngayCapCMT, noiCapCMT, namSinh, gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru,
                        ngheNghiep, noiLamViec, ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyXoaNhanKhau> xemDKXoaNhanKhau()
    {
        ArrayList<dangKyXoaNhanKhau> dsKetQua = new ArrayList<dangKyXoaNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_xoa_nhan_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyThemNhanKhau = tblKetQua.getInt("idGiayDangKyXoaNhanKhau");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                int idNguoiBiXoa = tblKetQua.getInt("idNguoiBiXoa");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                Date ngayXoa = tblKetQua.getDate("ngayXoa");
                String noiChuyen = tblKetQua.getString("noiChuyen");
                String ghiChu = tblKetQua.getString("ghiChu");
                dangKyXoaNhanKhau dk = new dangKyXoaNhanKhau(idGiayDangKyThemNhanKhau, idNguoiKhai, idNguoiBiXoa, ngayKhai, ngayXoa, noiChuyen, ghiChu);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<tamTru> xemDKTamTru()
    {
        ArrayList<tamTru> dsKetQua = new ArrayList<tamTru>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM tam_tru";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayTamTru = tblKetQua.getInt("idGiayTamTru");
                int idNhanKhau = tblKetQua.getInt("idNhanKhau");
                String noiTamTru = tblKetQua.getString("noiTamTru");
                String noiThuongTru = tblKetQua.getString("noiThuongTru");
                Date tuNgay = tblKetQua.getDate("tuNgay");
                Date denNgay = tblKetQua.getDate("denNgay");
                String lyDo = tblKetQua.getString("lyDo");
                tamTru dk = new tamTru(idGiayTamTru, idNhanKhau, noiTamTru, noiThuongTru, tuNgay, denNgay, lyDo);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<tamVang> xemDKTamVang()
    {
        ArrayList<tamVang> dsKetQua = new ArrayList<tamVang>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM tam_vang";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayTamVang = tblKetQua.getInt("idGiayTamVang");
                int idNhanKhau = tblKetQua.getInt("idNhanKhau");
                String noiThuongTru = tblKetQua.getString("noiThuongTru");
                Date tuNgay = tblKetQua.getDate("tuNgay");
                Date denNgay = tblKetQua.getDate("denNgay");
                String lyDo = tblKetQua.getString("lyDo");
                tamVang dk = new tamVang(idGiayTamVang, idNhanKhau, noiThuongTru, tuNgay, denNgay, lyDo);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyThemHoKhau> xemDKThemHoKhau()
    {
        ArrayList<dangKyThemHoKhau> dsKetQua = new ArrayList<dangKyThemHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_them_ho_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyThemHoKhau = tblKetQua.getInt("idGiayDangKyThemHoKhau");
                int idChuHo = tblKetQua.getInt("idChuHo");
                String maKhuVuc = tblKetQua.getString("maKhuVuc");
                String diaChi = tblKetQua.getString("diaChi");
                Date ngayLap = tblKetQua.getDate("ngayLap");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                dangKyThemHoKhau dk = new dangKyThemHoKhau(idGiayDangKyThemHoKhau, idChuHo, maKhuVuc, diaChi, ngayLap, ngayKhai, idNguoiKhai);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKySuaHoKhau> xemDKSuaHoKhau()
    {
        ArrayList<dangKySuaHoKhau> dsKetQua = new ArrayList<dangKySuaHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_sua_ho_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKySuaHoKhau = tblKetQua.getInt("idGiayDangKySuaHoKhau");
                int idHoKhau = tblKetQua.getInt("idHoKhau");
                int idChuHoMoi = tblKetQua.getInt("idChuHoMoi");
                String diaChiMoi = tblKetQua.getString("diaChiMoi");
                Date ngayThayDoi = tblKetQua.getDate("ngayThayDoi");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                dangKySuaHoKhau dk = new dangKySuaHoKhau(idGiayDangKySuaHoKhau, idHoKhau, idChuHoMoi, diaChiMoi, ngayThayDoi, idNguoiKhai);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyXoaHoKhau> xemDKXoaHoKhau()
    {
        ArrayList<dangKyXoaHoKhau> dsKetQua = new ArrayList<dangKyXoaHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_xoa_ho_khau";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyXoaHoKhau = tblKetQua.getInt("idGiayDangKyXoaHoKhau");
                int idHoKhau = tblKetQua.getInt("idHoKhau");
                String lyDo = tblKetQua.getString("lyDo");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                int idNguoiKhai = tblKetQua.getInt("idNguoiKhai");
                dangKyXoaHoKhau dk = new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau, idHoKhau, lyDo, ngayKhai, idNguoiKhai);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyThemNhanKhauVaoHo> xemDKThemNhanKhauVaoHo()
    {
        ArrayList<dangKyThemNhanKhauVaoHo> dsKetQua = new ArrayList<dangKyThemNhanKhauVaoHo>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_them_nhan_khau_vao_ho";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyThemNhanKhauVaoHo = tblKetQua.getInt("idGiayDangKyThemNhanKhauVaoHo");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                int idNhanKhauDuocThem = tblKetQua.getInt("idNhanKhauDuocThem");
                int idHoKhauDuocThem = tblKetQua.getInt("idHoKhauDuocThem");
                String quanHeVoiChuHo = tblKetQua.getString("quanHeVoiChuHo");
                dangKyThemNhanKhauVaoHo dk = new dangKyThemNhanKhauVaoHo(idGiayDangKyThemNhanKhauVaoHo, ngayKhai, idNhanKhauDuocThem, idHoKhauDuocThem, quanHeVoiChuHo);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyXoaNhanKhauKhoiHo> xemDKXoaNhanKhauKhoiHo()
    {
        ArrayList<dangKyXoaNhanKhauKhoiHo> dsKetQua = new ArrayList<dangKyXoaNhanKhauKhoiHo>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_xoa_nhan_khau_khoi_ho";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKyXoaNhanKhauKhoiHo = tblKetQua.getInt("idGiayDangKyXoaNhanKhauKhoiHo");
                Date ngayKhai = tblKetQua.getDate("ngayKhai");
                int idNhanKhauBiXoa = tblKetQua.getInt("idNhanKhauBiXoa");
                int idHoKhauBiXoa = tblKetQua.getInt("idHoKhauBiXoa");
                dangKyXoaNhanKhauKhoiHo dk = new dangKyXoaNhanKhauKhoiHo(idGiayDangKyXoaNhanKhauKhoiHo, ngayKhai, idNhanKhauBiXoa, idHoKhauBiXoa);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKySuDungNhaVanHoa> xemDKSuDungNhaVanHoa()
    {
        ArrayList<dangKySuDungNhaVanHoa> dsKetQua = new ArrayList<dangKySuDungNhaVanHoa>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelect = "SELECT * FROM dang_ky_su_dung_nha_van_hoa";
            ResultSet tblKetQua = stmt.executeQuery(sqlSelect);

            while(tblKetQua.next())
            {
                int idGiayDangKy = tblKetQua.getInt("idGiayDangKy");
                Date ngayToChuc = tblKetQua.getDate("ngayToChuc");
                String loaiSuKien = tblKetQua.getString("loaiSuKien");
                int phiSuDung = tblKetQua.getInt("phiSuDung");
                String ghiChu = tblKetQua.getString("ghiChu");
                dangKySuDungNhaVanHoa dk = new dangKySuDungNhaVanHoa(idGiayDangKy, ngayToChuc, loaiSuKien, phiSuDung, ghiChu);
                dsKetQua.add(dk);
            }
            return dsKetQua;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
