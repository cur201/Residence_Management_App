package controller;

import model.*;

import java.sql.*;

public class canBoNhapLieu_controller {

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");
    public boolean taoGiayTamVang(tamVang tamVang) {

        try{
            String sqlInsertInToTamVang = "INSERT INTO tam_vang  VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement tamVangRecord = connectDB.prepareStatement(sqlInsertInToTamVang);
            tamVangRecord.setInt(1, tamVang.getIdGiayTamVang());
            tamVangRecord.setInt(2, tamVang.getIdNhanKhau());
            tamVangRecord.setString(3, tamVang.getNoiThuongTru());
            tamVangRecord.setDate(4, tamVang.getTuNgay());
            tamVangRecord.setDate(5, tamVang.getDenNgay());
            tamVangRecord.setString(6, tamVang.getLyDo());

            boolean thanhCong = tamVangRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayTamTru(tamTru tamTru) {

        try{
            String sqlInsertInToTamTru = "INSERT INTO tam_tru  VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement tamTruRecord = connectDB.prepareStatement(sqlInsertInToTamTru);
            tamTruRecord.setInt(1, tamTru.getIdGiayTamTru());
            tamTruRecord.setInt(2, tamTru.getIdNhanKhau());
            tamTruRecord.setString(3, tamTru.getNoiTamTru());
            tamTruRecord.setString(4, tamTru.getNoiThuongTru());
            tamTruRecord.setDate(5, tamTru.getTuNgay());
            tamTruRecord.setDate(6, tamTru.getDenNgay());
            tamTruRecord.setString(7, tamTru.getLyDo());

            boolean thanhCong = tamTruRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayDangKySuDungNhaVanHoa(dangKySuDungNhaVanHoa dangKySuDungNhaVanHoa)
    {
        try{
            String sqlInsertInToDangKySuDungNhaVanHoa = "INSERT INTO dang_ky_su_dung_nha_van_hoa  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement dangKySuDungNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToDangKySuDungNhaVanHoa);
            dangKySuDungNhaVanhoaRecord.setInt(1, dangKySuDungNhaVanHoa.getIdGiayDangKy());
            dangKySuDungNhaVanhoaRecord.setDate(2, dangKySuDungNhaVanHoa.getNgayToChuc());
            dangKySuDungNhaVanhoaRecord.setString(3, dangKySuDungNhaVanHoa.getLoaiSuKien());
            dangKySuDungNhaVanhoaRecord.setInt(4, dangKySuDungNhaVanHoa.getPhiSuDung());
            dangKySuDungNhaVanhoaRecord.setString(5, dangKySuDungNhaVanHoa.getGhiChu());

            boolean thanhCong = dangKySuDungNhaVanhoaRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayThemNhanKhau(dangKyThemNhanKhau dangKyThemNhanKhau)
    {
        try{
            String sqlInsertInToThemNhanKhau = "INSERT INTO dang_ky_them_nhan_khau VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
                    "?, ?, ?, ?, ?, ?)";
            PreparedStatement themNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToThemNhanKhau);
            themNhanKhauRecord.setInt(1, dangKyThemNhanKhau.getIdGiayDangKyThemNhanKhau());
            themNhanKhauRecord.setInt(2, dangKyThemNhanKhau.getIdNguoiKhai());
            themNhanKhauRecord.setDate(3, dangKyThemNhanKhau.getNgayKhai());
            themNhanKhauRecord.setString(4, dangKyThemNhanKhau.getHoTen());
            themNhanKhauRecord.setString(5, dangKyThemNhanKhau.getBietDanh());
            themNhanKhauRecord.setInt(6, dangKyThemNhanKhau.getSoCMT());
            themNhanKhauRecord.setDate(7, dangKyThemNhanKhau.getNgayCapCMT());
            themNhanKhauRecord.setString(8, dangKyThemNhanKhau.getNoiCapCMT());
            themNhanKhauRecord.setInt(9, dangKyThemNhanKhau.getNamSinh());
            themNhanKhauRecord.setString(10, dangKyThemNhanKhau.getGioiTinh());
            themNhanKhauRecord.setString(11, dangKyThemNhanKhau.getNoiSinh());
            themNhanKhauRecord.setString(12, dangKyThemNhanKhau.getDanToc());
            themNhanKhauRecord.setString(13, dangKyThemNhanKhau.getTonGiao());
            themNhanKhauRecord.setString(14, dangKyThemNhanKhau.getQuocTich());
            themNhanKhauRecord.setString(15, dangKyThemNhanKhau.getNguyenQuan());
            themNhanKhauRecord.setString(16, dangKyThemNhanKhau.getNoiThuongTru());
            themNhanKhauRecord.setString(17, dangKyThemNhanKhau.getNgheNghiep());
            themNhanKhauRecord.setString(18, dangKyThemNhanKhau.getNoiLamViec());
            themNhanKhauRecord.setDate(19, dangKyThemNhanKhau.getNgayDangKyThuongTru());
            themNhanKhauRecord.setBoolean(20, dangKyThemNhanKhau.isTrangThaiTamTru());
            themNhanKhauRecord.setBoolean(21, dangKyThemNhanKhau.isTrangThaiTamVang());
            themNhanKhauRecord.setString(22, dangKyThemNhanKhau.getGhiChu());
            boolean thanhCong = themNhanKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoSoHoKhau(dangKyThemHoKhau dangKyThemHoKhau)
    {
        try{
            String sqlInsertInToThemHoKhau = "INSERT INTO dang_ky_them_ho_khau  VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement themHoKhauRecord = connectDB.prepareStatement(sqlInsertInToThemHoKhau);
            themHoKhauRecord.setInt(1, dangKyThemHoKhau.getIdGiayDangKyThemHoKhau());
            themHoKhauRecord.setInt(2, dangKyThemHoKhau.getIdChuHo());
            themHoKhauRecord.setString(3, dangKyThemHoKhau.getMaKhuVuc());
            themHoKhauRecord.setString(4, dangKyThemHoKhau.getDiaChi());
            themHoKhauRecord.setDate(5, dangKyThemHoKhau.getNgayLap());
            themHoKhauRecord.setDate(6, dangKyThemHoKhau.getNgayKhai());
            themHoKhauRecord.setInt(7, dangKyThemHoKhau.getIdNguoiKhai());

            boolean thanhCong = themHoKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiaySuaNhanKhau(dangKySuaNhanKhau dangKySuaNhanKhau)
    {
        try{
            String sqlInsertInToSuaNhanKhau = "INSERT INTO dang_ky_sua_nhan_khau  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                                                                            "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement suaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaNhanKhau);
            suaNhanKhauRecord.setInt(1, dangKySuaNhanKhau.getIdGiayDangKySuaNhanKhau());
            suaNhanKhauRecord.setInt(2, dangKySuaNhanKhau.getIdNguoiKhai());
            suaNhanKhauRecord.setInt(3, dangKySuaNhanKhau.getIdNguoiDuocSua());
            suaNhanKhauRecord.setDate(4, dangKySuaNhanKhau.getNgayKhai());
            suaNhanKhauRecord.setString(5, dangKySuaNhanKhau.getHoTenMoi());
            suaNhanKhauRecord.setString(6, dangKySuaNhanKhau.getBietDanhMoi());
            suaNhanKhauRecord.setInt(7, dangKySuaNhanKhau.getSoCMTMoi());
            suaNhanKhauRecord.setDate(8, dangKySuaNhanKhau.getNgayCapCMT());
            suaNhanKhauRecord.setString(9, dangKySuaNhanKhau.getNoiCapCMT());
            suaNhanKhauRecord.setInt(10, dangKySuaNhanKhau.getNamSinhMoi());
            suaNhanKhauRecord.setString(11, dangKySuaNhanKhau.getGioiTinhMoi());
            suaNhanKhauRecord.setString(12, dangKySuaNhanKhau.getNoiSinhMoi());
            suaNhanKhauRecord.setString(13, dangKySuaNhanKhau.getDanTocMoi());
            suaNhanKhauRecord.setString(14, dangKySuaNhanKhau.getTonGiaoMoi());
            suaNhanKhauRecord.setString(15, dangKySuaNhanKhau.getQuocTichMoi());
            suaNhanKhauRecord.setString(16, dangKySuaNhanKhau.getNguyenQuanMoi());
            suaNhanKhauRecord.setString(17, dangKySuaNhanKhau.getNoiThuongTruMoi());
            suaNhanKhauRecord.setString(18, dangKySuaNhanKhau.getNgheNghiepMoi());
            suaNhanKhauRecord.setString(19, dangKySuaNhanKhau.getNoiLamViecMoi());
            suaNhanKhauRecord.setDate(20, dangKySuaNhanKhau.getNgayDangKyThuongTruMoi());
            suaNhanKhauRecord.setBoolean(21, dangKySuaNhanKhau.isTamTruMoi());
            suaNhanKhauRecord.setBoolean(22, dangKySuaNhanKhau.isTamVangMoi());
            suaNhanKhauRecord.setString(23, dangKySuaNhanKhau.getGhiChuMoi());

            boolean thanhCong = suaNhanKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiaySuaHoKhau(dangKySuaHoKhau dangKySuaHoKhau)
    {
        try{
            String sqlInsertInToSuaHoKhau = "INSERT INTO dang_ky_sua_ho_khau  VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement suaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaHoKhau);
            suaHoKhauRecord.setInt(1, dangKySuaHoKhau.getIdGiayDangKySuaHoKhau());
            suaHoKhauRecord.setInt(2, dangKySuaHoKhau.getIdHoKhau());
            suaHoKhauRecord.setInt(3, dangKySuaHoKhau.getIdChuHoMoi());
            suaHoKhauRecord.setString(4, dangKySuaHoKhau.getDiaChiMoi());
            suaHoKhauRecord.setDate(5, dangKySuaHoKhau.getNgayThayDoi());
            suaHoKhauRecord.setInt(6, dangKySuaHoKhau.getIdNguoiKhai());

            boolean thanhCong = suaHoKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayXoaNhanKhau(dangKyXoaNhanKhau dangKyXoaNhanKhau)
    {
        try{
            String sqlInsertInToXoaNhanKhau = "INSERT INTO dang_ky_xoa_nhan_khau  VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement xoaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaNhanKhau);
            xoaNhanKhauRecord.setInt(1, dangKyXoaNhanKhau.getIdGiayDangKyXoaNhanKhau());
            xoaNhanKhauRecord.setInt(2, dangKyXoaNhanKhau.getIdNguoiKhai());
            xoaNhanKhauRecord.setInt(3, dangKyXoaNhanKhau.getIdNguoiBiXoa());
            xoaNhanKhauRecord.setDate(4, dangKyXoaNhanKhau.getNgayKhai());
            xoaNhanKhauRecord.setDate(5, dangKyXoaNhanKhau.getNgayXoa());
            xoaNhanKhauRecord.setString(6, dangKyXoaNhanKhau.getNoiChuyen());
            xoaNhanKhauRecord.setString(7, dangKyXoaNhanKhau.getGhiChu());

            boolean thanhCong = xoaNhanKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayXoaHoKhau(dangKyXoaHoKhau dangKyXoaHoKhau)
    {
        try{
            String sqlInsertInToXoaHoKhau = "INSERT INTO dang_ky_xoa_ho_khau  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement xoaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaHoKhau);
            xoaHoKhauRecord.setInt(1, dangKyXoaHoKhau.getIdGiayDangKyXoaHoKhau());
            xoaHoKhauRecord.setInt(2, dangKyXoaHoKhau.getIdHoKhau());
            xoaHoKhauRecord.setString(3, dangKyXoaHoKhau.getLyDo());
            xoaHoKhauRecord.setDate(4, dangKyXoaHoKhau.getNgayKhai());
            xoaHoKhauRecord.setInt(5, dangKyXoaHoKhau.getIdNguoiKhai());

            boolean thanhCong = xoaHoKhauRecord.execute();
            return thanhCong;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }


}
