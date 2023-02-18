package controller;

import model.*;

import java.sql.*;

public class canBoNhapLieu_controller {

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");
    public boolean taoGiayTamVang(tamVang tamVang) {

        try{
            String sqlInsertInToTamVang = "INSERT INTO tam_vang (idNhanKhau, noiThuongTru, tuNgay, denNgay, lyDo)  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement tamVangRecord = connectDB.prepareStatement(sqlInsertInToTamVang);
            tamVangRecord.setInt(1, tamVang.getIdNhanKhau());
            tamVangRecord.setString(2, tamVang.getNoiThuongTru());
            tamVangRecord.setDate(3, tamVang.getTuNgay());
            tamVangRecord.setDate(4, tamVang.getDenNgay());
            tamVangRecord.setString(5, tamVang.getLyDo());

            int thanhCong = tamVangRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayTamTru(tamTru tamTru) {

        try{
            String sqlInsertInToTamTru = "INSERT INTO tam_tru (idNhanKhau, noiTamTru, noiThuongTru, tuNgay, denNgay, lyDo)  VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement tamTruRecord = connectDB.prepareStatement(sqlInsertInToTamTru);
            if(tamTru.getIdNhanKhau() == null)
            {
                tamTruRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                tamTruRecord.setInt(1, tamTru.getIdNhanKhau());
            }
            tamTruRecord.setString(2, tamTru.getNoiTamTru());
            tamTruRecord.setString(3, tamTru.getNoiThuongTru());
            tamTruRecord.setDate(4, tamTru.getTuNgay());
            tamTruRecord.setDate(5, tamTru.getDenNgay());
            tamTruRecord.setString(6, tamTru.getLyDo());

            int thanhCong = tamTruRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayDangKySuDungNhaVanHoa(dangKySuDungNhaVanHoa dangKySuDungNhaVanHoa)
    {
        try{
            String sqlInsertInToDangKySuDungNhaVanHoa = "INSERT INTO dang_ky_su_dung_nha_van_hoa (ngayToChuc, loaiSuKien, phiSuDung, ghiChu) VALUES (?, ?, ?, ?)";
            PreparedStatement dangKySuDungNhaVanhoaRecord = connectDB.prepareStatement(sqlInsertInToDangKySuDungNhaVanHoa);
            dangKySuDungNhaVanhoaRecord.setDate(1, dangKySuDungNhaVanHoa.getNgayToChuc());
            dangKySuDungNhaVanhoaRecord.setString(2, dangKySuDungNhaVanHoa.getLoaiSuKien());
            if(dangKySuDungNhaVanHoa.getPhiSuDung() == null)
            {
                dangKySuDungNhaVanhoaRecord.setNull(3, Types.INTEGER);
            }
            else
            {
                dangKySuDungNhaVanhoaRecord.setInt(3, dangKySuDungNhaVanHoa.getPhiSuDung());
            }
            dangKySuDungNhaVanhoaRecord.setString(4, dangKySuDungNhaVanHoa.getGhiChu());

            int thanhCong = dangKySuDungNhaVanhoaRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayThemNhanKhau(dangKyThemNhanKhau dangKyThemNhanKhau)
    {
        try{
            String sqlInsertInToThemNhanKhau = "INSERT INTO dang_ky_them_nhan_khau (idNguoiKhai, ngayKhai, hoTen, " +
                    "bietDanh, soCMT, ngayCapCMT, noiCapCMT, namSinh, gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, " +
                    "ngheNghiep, noiLamViec, ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
                    "?, ?, ?, ?, ?, ?)";
            PreparedStatement themNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToThemNhanKhau);
            if(dangKyThemNhanKhau.getIdNguoiKhai() == null)
            {
                themNhanKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                themNhanKhauRecord.setInt(1, dangKyThemNhanKhau.getIdNguoiKhai());
            }
            themNhanKhauRecord.setDate(2, dangKyThemNhanKhau.getNgayKhai());
            themNhanKhauRecord.setString(3, dangKyThemNhanKhau.getHoTen());
            themNhanKhauRecord.setString(4, dangKyThemNhanKhau.getBietDanh());
            if(dangKyThemNhanKhau.getSoCMT() == null)
            {
                themNhanKhauRecord.setNull(5, Types.INTEGER);
            }
            else
            {
                themNhanKhauRecord.setInt(5, dangKyThemNhanKhau.getSoCMT());
            }
            themNhanKhauRecord.setDate(6, dangKyThemNhanKhau.getNgayCapCMT());
            themNhanKhauRecord.setString(7, dangKyThemNhanKhau.getNoiCapCMT());
            if(dangKyThemNhanKhau.getNamSinh() == null)
            {
                themNhanKhauRecord.setNull(8, Types.INTEGER);
            }
            else
            {
                themNhanKhauRecord.setInt(8, dangKyThemNhanKhau.getNamSinh());
            }
            themNhanKhauRecord.setString(9, dangKyThemNhanKhau.getGioiTinh());
            themNhanKhauRecord.setString(10, dangKyThemNhanKhau.getNoiSinh());
            themNhanKhauRecord.setString(11, dangKyThemNhanKhau.getDanToc());
            themNhanKhauRecord.setString(12, dangKyThemNhanKhau.getTonGiao());
            themNhanKhauRecord.setString(13, dangKyThemNhanKhau.getQuocTich());
            themNhanKhauRecord.setString(14, dangKyThemNhanKhau.getNguyenQuan());
            themNhanKhauRecord.setString(15, dangKyThemNhanKhau.getNoiThuongTru());
            themNhanKhauRecord.setString(16, dangKyThemNhanKhau.getNgheNghiep());
            themNhanKhauRecord.setString(17, dangKyThemNhanKhau.getNoiLamViec());
            themNhanKhauRecord.setDate(18, dangKyThemNhanKhau.getNgayDangKyThuongTru());
            themNhanKhauRecord.setBoolean(19, dangKyThemNhanKhau.isTrangThaiTamTru());
            themNhanKhauRecord.setBoolean(20, dangKyThemNhanKhau.isTrangThaiTamVang());
            themNhanKhauRecord.setString(21, dangKyThemNhanKhau.getGhiChu());
            int thanhCong = themNhanKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoSoHoKhau(dangKyThemHoKhau dangKyThemHoKhau)
    {
        try{
            String sqlInsertInToThemHoKhau = "INSERT INTO dang_ky_them_ho_khau (idChuHo, maKhuVuc, diaChi, ngayLap, ngayKhai, idNguoiKhai) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement themHoKhauRecord = connectDB.prepareStatement(sqlInsertInToThemHoKhau);
            if(dangKyThemHoKhau.getIdChuHo() == null)
            {
                themHoKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                themHoKhauRecord.setInt(1, dangKyThemHoKhau.getIdChuHo());
            }

            themHoKhauRecord.setString(2, dangKyThemHoKhau.getMaKhuVuc());
            themHoKhauRecord.setString(3, dangKyThemHoKhau.getDiaChi());
            themHoKhauRecord.setDate(4, dangKyThemHoKhau.getNgayLap());
            themHoKhauRecord.setDate(5, dangKyThemHoKhau.getNgayKhai());

            if(dangKyThemHoKhau.getIdNguoiKhai() == null)
            {
                themHoKhauRecord.setNull(6, Types.INTEGER);
            }
            else
            {
                themHoKhauRecord.setInt(6, dangKyThemHoKhau.getIdNguoiKhai());
            }


            int thanhCong = themHoKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiaySuaNhanKhau(dangKySuaNhanKhau dangKySuaNhanKhau)
    {
        try{
            String sqlInsertInToSuaNhanKhau = "INSERT INTO dang_ky_sua_nhan_khau (idNguoiKhai, idNguoiDuocSua, ngayKhai, hoTenMoi, " +
                    "bietDanhMoi, soCMTMoi, ngayCapCMT, noiCapCMT, namSinhMoi, gioiTinhMoi, noiSinhMoi, danTocMoi, tonGiaoMoi, " +
                    "quocTichMoi, nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi, noiLamViecMoi, ngayDangKyThuongTruMoi, tamTruMoi, " +
                    "tamVangMoi, ghiChuMoi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement suaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaNhanKhau);

            if(dangKySuaNhanKhau.getIdNguoiKhai() == null)
            {
                suaNhanKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                suaNhanKhauRecord.setInt(1, dangKySuaNhanKhau.getIdNguoiKhai());
            }


            if(dangKySuaNhanKhau.getIdNguoiDuocSua() == null)
            {
                suaNhanKhauRecord.setNull(2, Types.INTEGER);
            }
            else
            {
                suaNhanKhauRecord.setInt(2, dangKySuaNhanKhau.getIdNguoiDuocSua());
            }

            suaNhanKhauRecord.setDate(3, dangKySuaNhanKhau.getNgayKhai());
            suaNhanKhauRecord.setString(4, dangKySuaNhanKhau.getHoTenMoi());
            suaNhanKhauRecord.setString(5, dangKySuaNhanKhau.getBietDanhMoi());

            if(dangKySuaNhanKhau.getSoCMTMoi() == null)
            {
                suaNhanKhauRecord.setNull(6, Types.INTEGER);
            }
            else
            {
                suaNhanKhauRecord.setInt(6, dangKySuaNhanKhau.getSoCMTMoi());
            }

            suaNhanKhauRecord.setDate(7, dangKySuaNhanKhau.getNgayCapCMT());
            suaNhanKhauRecord.setString(8, dangKySuaNhanKhau.getNoiCapCMT());

            if(dangKySuaNhanKhau.getNamSinhMoi() == null)
            {
                suaNhanKhauRecord.setNull(9, Types.INTEGER);
            }
            else
            {
                suaNhanKhauRecord.setInt(9, dangKySuaNhanKhau.getNamSinhMoi());
            }

            suaNhanKhauRecord.setString(10, dangKySuaNhanKhau.getGioiTinhMoi());
            suaNhanKhauRecord.setString(11, dangKySuaNhanKhau.getNoiSinhMoi());
            suaNhanKhauRecord.setString(12, dangKySuaNhanKhau.getDanTocMoi());
            suaNhanKhauRecord.setString(13, dangKySuaNhanKhau.getTonGiaoMoi());
            suaNhanKhauRecord.setString(14, dangKySuaNhanKhau.getQuocTichMoi());
            suaNhanKhauRecord.setString(15, dangKySuaNhanKhau.getNguyenQuanMoi());
            suaNhanKhauRecord.setString(16, dangKySuaNhanKhau.getNoiThuongTruMoi());
            suaNhanKhauRecord.setString(17, dangKySuaNhanKhau.getNgheNghiepMoi());
            suaNhanKhauRecord.setString(18, dangKySuaNhanKhau.getNoiLamViecMoi());
            suaNhanKhauRecord.setDate(19, dangKySuaNhanKhau.getNgayDangKyThuongTruMoi());
            suaNhanKhauRecord.setBoolean(20, dangKySuaNhanKhau.isTamTruMoi());
            suaNhanKhauRecord.setBoolean(21, dangKySuaNhanKhau.isTamVangMoi());
            suaNhanKhauRecord.setString(22, dangKySuaNhanKhau.getGhiChuMoi());

            int thanhCong = suaNhanKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else{return  true;}
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiaySuaHoKhau(dangKySuaHoKhau dangKySuaHoKhau)
    {
        try{
            String sqlInsertInToSuaHoKhau = "INSERT INTO dang_ky_sua_ho_khau (idHoKhau, idChuHoMoi, diaChiMoi, ngayThayDoi, idNguoiKhai) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement suaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToSuaHoKhau);

            if(dangKySuaHoKhau.getIdHoKhau() == null)
            {
                suaHoKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                suaHoKhauRecord.setInt(1, dangKySuaHoKhau.getIdHoKhau());
            }


            if(dangKySuaHoKhau.getIdChuHoMoi() == null)
            {
                suaHoKhauRecord.setNull(2, Types.INTEGER);
            }
            else
            {
                suaHoKhauRecord.setInt(2, dangKySuaHoKhau.getIdChuHoMoi());
            }

            suaHoKhauRecord.setString(3, dangKySuaHoKhau.getDiaChiMoi());
            suaHoKhauRecord.setDate(4, dangKySuaHoKhau.getNgayThayDoi());

            if(dangKySuaHoKhau.getIdNguoiKhai() == null)
            {
                suaHoKhauRecord.setNull(5, Types.INTEGER);
            }
            else
            {
                suaHoKhauRecord.setInt(5, dangKySuaHoKhau.getIdNguoiKhai());
            }


            int thanhCong = suaHoKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean taoGiayXoaNhanKhau(dangKyXoaNhanKhau dangKyXoaNhanKhau)
    {
        try{
            String sqlInsertInToXoaNhanKhau = "INSERT INTO dang_ky_xoa_nhan_khau (idNguoiKhai, idNguoiBiXoa, ngayKhai, ngayXoa, noiChuyen, ghiChu) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement xoaNhanKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaNhanKhau);

            if(dangKyXoaNhanKhau.getIdNguoiKhai() == null)
            {
                xoaNhanKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                xoaNhanKhauRecord.setInt(1, dangKyXoaNhanKhau.getIdNguoiKhai());
            }


            if(dangKyXoaNhanKhau.getIdNguoiBiXoa() == null)
            {
                xoaNhanKhauRecord.setNull(2, Types.INTEGER);
            }
            else
            {
                xoaNhanKhauRecord.setInt(2, dangKyXoaNhanKhau.getIdNguoiBiXoa());
            }

            xoaNhanKhauRecord.setDate(3, dangKyXoaNhanKhau.getNgayKhai());
            xoaNhanKhauRecord.setDate(4, dangKyXoaNhanKhau.getNgayXoa());
            xoaNhanKhauRecord.setString(5, dangKyXoaNhanKhau.getNoiChuyen());
            xoaNhanKhauRecord.setString(6, dangKyXoaNhanKhau.getGhiChu());

            int thanhCong = xoaNhanKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
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

    public boolean taoGiayXoaHoKhau(dangKyXoaHoKhau dangKyXoaHoKhau)
    {
        try{
            String sqlInsertInToXoaHoKhau = "INSERT INTO dang_ky_xoa_ho_khau (idHoKhau, lyDo, ngayKhai, idNguoiKhai) VALUES (?, ?, ?, ?)";
            PreparedStatement xoaHoKhauRecord = connectDB.prepareStatement(sqlInsertInToXoaHoKhau);

            if(dangKyXoaHoKhau.getIdHoKhau() == null)
            {
                xoaHoKhauRecord.setNull(1, Types.INTEGER);
            }
            else
            {
                xoaHoKhauRecord.setInt(1, dangKyXoaHoKhau.getIdHoKhau());
            }

            xoaHoKhauRecord.setString(2, dangKyXoaHoKhau.getLyDo());
            xoaHoKhauRecord.setDate(3, dangKyXoaHoKhau.getNgayKhai());

            if(dangKyXoaHoKhau.getIdNguoiKhai() == null)
            {
                xoaHoKhauRecord.setNull(4, Types.INTEGER);
            }
            else
            {
                xoaHoKhauRecord.setInt(4, dangKyXoaHoKhau.getIdNguoiKhai());
            }


            int thanhCong = xoaHoKhauRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }


    public boolean taoGiayThemThanhVienHoKhau(dangKyThemNhanKhauVaoHo dk)
    {
        try{
            String sqlInsertInToThemNhanKhauVaoHo = "INSERT INTO dang_ky_them_nhan_khau_vao_ho (ngayKhai, idNhanKhauDuocThem, idHoKhauDuocThem, quanHeVoiChuHo) VALUES (?, ?, ?, ?)";
            PreparedStatement themNhanKhauVaoHoRecord = connectDB.prepareStatement(sqlInsertInToThemNhanKhauVaoHo);

            if(dk.getNgayKhai() == null)
            {
                themNhanKhauVaoHoRecord.setNull(1, Types.DATE);
            }
            else
            {
                themNhanKhauVaoHoRecord.setDate(1, dk.getNgayKhai());
            }

            themNhanKhauVaoHoRecord.setInt(2, dk.getIdNhanKhauDuocThem());
            themNhanKhauVaoHoRecord.setInt(3, dk.getIdHoKhauDuocThem());
            themNhanKhauVaoHoRecord.setString(4, dk.getQuanHeVoiChuHo());

            int thanhCong = themNhanKhauVaoHoRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean xoaThanhVienKhoiHo(dangKyXoaNhanKhauKhoiHo dk)
    {
        try{
            String sqlInsertInToXoaNhanKhauKhoiHo = "INSERT INTO dang_ky_xoa_nhan_khau_khoi_ho (ngayKhai, idNhanKhauBiXoa, idHoKhauBiXoa) VALUES (?, ?, ?)";
            PreparedStatement xoaNhanKhauKhoiHoRecord = connectDB.prepareStatement(sqlInsertInToXoaNhanKhauKhoiHo);

            if(dk.getNgayKhai() == null)
            {
                xoaNhanKhauKhoiHoRecord.setNull(1, Types.DATE);
            }
            else
            {
                xoaNhanKhauKhoiHoRecord.setDate(1, dk.getNgayKhai());
            }

            xoaNhanKhauKhoiHoRecord.setInt(2, dk.getIdNhanKhauBiXoa());
            xoaNhanKhauKhoiHoRecord.setInt(3, dk.getIdHoKhauBiXoa());

            int thanhCong = xoaNhanKhauKhoiHoRecord.executeUpdate();
            if(thanhCong == 0)
            {
                return false;
            }
            else {
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
