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

    public ArrayList<nhanKhau> thongKeNhanKhau()
    {
        ArrayList<nhanKhau> dsNhanKhau = new ArrayList<nhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectNhanKhau = "SELECT * FROM nhan_khau" ;
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
    public ArrayList<dangKySuDungNhaVanHoa> thongKeSuKien()
    {
        ArrayList<dangKySuDungNhaVanHoa> dsDangKySuDungNhaVanHoa = new ArrayList<dangKySuDungNhaVanHoa>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKySuDungNhaVanHoa = "SELECT * FROM dang_ky_su_dung_nha_van_hoa" ;
            ResultSet tblSuKien = stmt.executeQuery(sqlSelectDangKySuDungNhaVanHoa);

            while(tblSuKien.next())
            {
                int idGiayDangKy = tblSuKien.getInt("idGiayDangKy");
                Date ngayToChuc = tblSuKien.getDate("ngayToChuc");
                String loaiSuKien = tblSuKien.getString("loaiSuKien");
                int phiSuDung = tblSuKien.getInt("phiSuDung");
                String ghiChu = tblSuKien.getString("ghiChu");

                dangKySuDungNhaVanHoa sk = new dangKySuDungNhaVanHoa(idGiayDangKy, ngayToChuc, loaiSuKien, phiSuDung, ghiChu);
                dsDangKySuDungNhaVanHoa.add(sk);
            }
            return dsDangKySuDungNhaVanHoa;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<tamTru> thongKeTamTru()
    {
        ArrayList<tamTru> dsTamTru = new ArrayList<tamTru>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectTamTru = "SELECT * FROM tam_tru" ;
            ResultSet tblTamTru = stmt.executeQuery(sqlSelectTamTru);

            while(tblTamTru.next())
            {
                int idGiayTamTru = tblTamTru.getInt("idGiayTamTru");
                int idNhanKhau = tblTamTru.getInt("idNhanKhau");
                String noiTamTru = tblTamTru.getString("noiTamTru");
                String noiThuongTru = tblTamTru.getString("noiThuongTru");
                Date tuNgay = tblTamTru.getDate("tuNgay");
                Date denNgay = tblTamTru.getDate("denNgay");
                String lyDo = tblTamTru.getString("lyDo");

                tamTru tt = new tamTru(idGiayTamTru, idNhanKhau, noiTamTru, noiThuongTru, tuNgay,denNgay,lyDo);
                dsTamTru.add(tt);
            }
            return dsTamTru;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<tamVang> thongKeTamVang()
    {
        ArrayList<tamVang> dsTamVang = new ArrayList<tamVang>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectTamVang = "SELECT * FROM tam_vang" ;
            ResultSet tblTamVang = stmt.executeQuery(sqlSelectTamVang);

            while(tblTamVang.next())
            {
                int idGiayTamVang = tblTamVang.getInt("idGiayTamVang");
                int idNhanKhau = tblTamVang.getInt("idNhanKhau");
                String noiThuongTru = tblTamVang.getString("noiThuongTru");
                Date tuNgay = tblTamVang.getDate("tuNgay");
                Date denNgay = tblTamVang.getDate("denNgay");
                String lyDo = tblTamVang.getString("lyDo");

                tamVang tv = new tamVang(idGiayTamVang, idNhanKhau, noiThuongTru, tuNgay,denNgay,lyDo);
                dsTamVang.add(tv);
            }
            return dsTamVang;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<dangKyThemNhanKhau> thongKeThemNhanKhau()
    {
        ArrayList<dangKyThemNhanKhau> dsDangKyThemNhanKhau = new ArrayList<dangKyThemNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKyThemNhanKhau = "SELECT * FROM dang_ky_them_nhan_khau" ;
            ResultSet tblThemNhanKhau = stmt.executeQuery(sqlSelectDangKyThemNhanKhau);

            while(tblThemNhanKhau.next())
            {
                int idGiayDangKyThemNhanKhau = tblThemNhanKhau.getInt("idGiayDangKyThemNhanKhau");
                int idNguoiKhai = tblThemNhanKhau.getInt("idNguoiKhai");
                Date ngayKhai = tblThemNhanKhau.getDate("ngayKhai");
                String hoTen = tblThemNhanKhau.getString("hoTen");
                String bietDanh = tblThemNhanKhau.getString("bietDanh");
                int soCMT = tblThemNhanKhau.getInt("soCMT");
                Date ngayCapCMT = tblThemNhanKhau.getDate("ngayCapCMT");
                String noiCapCMT = tblThemNhanKhau.getString("noiCapCMT");
                int namSinh = tblThemNhanKhau.getInt("namSinh");
                String gioiTinh = tblThemNhanKhau.getString("gioiTinh");
                String noiSinh = tblThemNhanKhau.getString("noiSinh");
                String danToc = tblThemNhanKhau.getString("danToc");
                String tonGiao = tblThemNhanKhau.getString("tonGiao");
                String quocTich = tblThemNhanKhau.getString("quocTich");
                String nguyenQuan = tblThemNhanKhau.getString("nguyenQuan");
                String noiThuongTru = tblThemNhanKhau.getString("noiThuongTru");
                String ngheNghiep = tblThemNhanKhau.getString("ngheNghiep");
                String noiLamViec = tblThemNhanKhau.getString("noiLamViec");
                Date ngayDangKyThuongTru = tblThemNhanKhau.getDate("ngayDangKyThuongTru");
                boolean trangThaiTamTru = tblThemNhanKhau.getBoolean("trangThaiTamTru");
                boolean trangThaiTamVang = tblThemNhanKhau.getBoolean("trangThaiTamVang");
                String ghiChu = tblThemNhanKhau.getString("ghiChu");

                dangKyThemNhanKhau dktnk = new dangKyThemNhanKhau(idGiayDangKyThemNhanKhau, idNguoiKhai, ngayKhai, hoTen, bietDanh, soCMT, ngayCapCMT, noiCapCMT, namSinh,
                        gioiTinh, noiSinh, danToc, tonGiao, quocTich, nguyenQuan, noiThuongTru, ngheNghiep, noiLamViec,
                        ngayDangKyThuongTru, trangThaiTamTru, trangThaiTamVang, ghiChu);
                dsDangKyThemNhanKhau.add(dktnk);
            }
            return dsDangKyThemNhanKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKySuaNhanKhau> thongKeSuaNhanKhau()
    {
        ArrayList<dangKySuaNhanKhau> dsDangKySuaNhanKhau = new ArrayList<dangKySuaNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKySuaNhanKhau = "SELECT * FROM dang_ky_sua_nhan_khau" ;
            ResultSet tblSuaNhanKhau = stmt.executeQuery(sqlSelectDangKySuaNhanKhau);

            while(tblSuaNhanKhau.next())
            {
                int idGiayDangKySuaNhanKhau = tblSuaNhanKhau.getInt("idGiayDangKySuaNhanKhau");
                int idNguoiKhai = tblSuaNhanKhau.getInt("idNguoiKhai");
                int idNguoiDuocSua = tblSuaNhanKhau.getInt("idNguoiDuocSua");
                Date ngayKhai = tblSuaNhanKhau.getDate("ngayKhai");
                String hoTenMoi = tblSuaNhanKhau.getString("hoTenMoi");
                String bietDanhMoi = tblSuaNhanKhau.getString("bietDanhMoi");
                int soCMTMoi = tblSuaNhanKhau.getInt("soCMTMoi");
                Date ngayCapCMT = tblSuaNhanKhau.getDate("ngayCapCMT");
                String noiCapCMT = tblSuaNhanKhau.getString("noiCapCMT");
                int namSinhMoi = tblSuaNhanKhau.getInt("namSinhMoi");
                String gioiTinhMoi = tblSuaNhanKhau.getString("gioiTinhMoi");
                String noiSinhMoi = tblSuaNhanKhau.getString("noiSinhMoi");
                String danTocMoi = tblSuaNhanKhau.getString("danTocMoi");
                String tonGiaoMoi = tblSuaNhanKhau.getString("tonGiaoMoi");
                String quocTichMoi = tblSuaNhanKhau.getString("quocTichMoi");
                String nguyenQuanMoi = tblSuaNhanKhau.getString("nguyenQuanMoi");
                String noiThuongTruMoi = tblSuaNhanKhau.getString("noiThuongTruMoi");
                String ngheNghiepMoi = tblSuaNhanKhau.getString("ngheNghiepMoi");
                String noiLamViecMoi = tblSuaNhanKhau.getString("noiLamViecMoi");
                Date ngayDangKyThuongTruMoi = tblSuaNhanKhau.getDate("ngayDangKyThuongTruMoi");
                boolean tamTruMoi = tblSuaNhanKhau.getBoolean("trangThaiTamTruMoi");
                boolean tamVangMoi = tblSuaNhanKhau.getBoolean("trangThaiTamVangMoi");
                String ghiChuMoi = tblSuaNhanKhau.getString("ghiChuMoi");

                dangKySuaNhanKhau dksnk = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau, idNguoiKhai,idNguoiDuocSua, ngayKhai, hoTenMoi, bietDanhMoi, soCMTMoi, ngayCapCMT, noiCapCMT, namSinhMoi,
                        gioiTinhMoi, noiSinhMoi, danTocMoi, tonGiaoMoi, quocTichMoi, nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi, noiLamViecMoi,
                        ngayDangKyThuongTruMoi, tamTruMoi, tamVangMoi, ghiChuMoi);
                dsDangKySuaNhanKhau.add(dksnk);
            }
            return dsDangKySuaNhanKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyXoaNhanKhau> thongKeXoaNhanKhau()
    {
        ArrayList<dangKyXoaNhanKhau> dsDangKyXoaNhanKhau = new ArrayList<dangKyXoaNhanKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKyXoaNhanKhau = "SELECT * FROM dang_ky_xoa_nhan_khau" ;
            ResultSet tblXoaNhanKhau = stmt.executeQuery(sqlSelectDangKyXoaNhanKhau);

            while(tblXoaNhanKhau.next())
            {
                int idGiayDangKyXoaNhanKhau = tblXoaNhanKhau.getInt("idGiayDangKyXoaNhanKhau");
                int idNguoiKhai = tblXoaNhanKhau.getInt("idNguoiKhai");
                int idNguoiBiXoa = tblXoaNhanKhau.getInt("idNguoiBiXoa");
                Date ngayKhai = tblXoaNhanKhau.getDate("ngayKhai");
                Date ngayXoa = tblXoaNhanKhau.getDate("ngayXoa");
                String noiChuyen = tblXoaNhanKhau.getString("noiChuyen");
                String ghiChu = tblXoaNhanKhau.getString("ghiChu");

                dangKyXoaNhanKhau dkxhk = new dangKyXoaNhanKhau(idGiayDangKyXoaNhanKhau,idNguoiKhai,idNguoiBiXoa,ngayKhai,ngayXoa,noiChuyen,ghiChu );
                dsDangKyXoaNhanKhau.add(dkxhk);
            }
            return dsDangKyXoaNhanKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<dangKyThemHoKhau> thongKeThemHoKhau()
    {
        ArrayList<dangKyThemHoKhau> dsDangKyThemHoKhau = new ArrayList<dangKyThemHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKyThemHoKhau = "SELECT * FROM dang_ky_them_ho_khau" ;
            ResultSet tblThemHoKhau = stmt.executeQuery(sqlSelectDangKyThemHoKhau);

            while(tblThemHoKhau.next())
            {
                int idGiayDangKyThemHoKhau = tblThemHoKhau.getInt("idGiayDangKyThemHoKhau");
                int idChuHo = tblThemHoKhau.getInt("idChuHo");
                String maKhuVuc = tblThemHoKhau.getString("maKhuVuc");
                String diaChi = tblThemHoKhau.getString("diaChi");
                Date ngayLap = tblThemHoKhau.getDate("ngayLap");
                Date ngayKhai = tblThemHoKhau.getDate("ngayKhai");
                int idNguoiKhai = tblThemHoKhau.getInt("idNguoiKhai");


                dangKyThemHoKhau dkthk = new dangKyThemHoKhau(idGiayDangKyThemHoKhau,idChuHo,maKhuVuc,diaChi,ngayLap,ngayKhai,idNguoiKhai);
                dsDangKyThemHoKhau.add(dkthk);
            }
            return dsDangKyThemHoKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKySuaHoKhau> thongKeSuaHoKhau()
    {
        ArrayList<dangKySuaHoKhau> dsDangKySuaHoKhau = new ArrayList<dangKySuaHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKySuaHoKhau = "SELECT * FROM dang_ky_sua_ho_khau" ;
            ResultSet tblSuaHoKhau = stmt.executeQuery(sqlSelectDangKySuaHoKhau);

            while(tblSuaHoKhau.next())
            {
                int idGiayDangKySuaHoKhau = tblSuaHoKhau.getInt("idGiayDangKySuaHoKhau");
                int idHoKhau = tblSuaHoKhau.getInt("idHoKhau");
                int idChuHoMoi = tblSuaHoKhau.getInt("idChuHoMoi");
                String diaChiMoi = tblSuaHoKhau.getString("diaChiMoi");
                Date ngayThayDoi = tblSuaHoKhau.getDate("ngayThayDoi");
                int idNguoiKhai = tblSuaHoKhau.getInt("idNguoiKhai");


                dangKySuaHoKhau dkshk = new dangKySuaHoKhau(idGiayDangKySuaHoKhau,idHoKhau,idChuHoMoi,diaChiMoi,ngayThayDoi,idNguoiKhai);
                dsDangKySuaHoKhau.add(dkshk);
            }
            return dsDangKySuaHoKhau;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<dangKyXoaHoKhau> thongKeXoaHoKhau()
    {
        ArrayList<dangKyXoaHoKhau> dsDangKyXoaHoKhau = new ArrayList<dangKyXoaHoKhau>();
        Statement stmt;
        try{
            stmt = connectDB.createStatement();
            String sqlSelectDangKyXoaHoKhau = "SELECT * FROM dang_ky_xoa_ho_khau" ;
            ResultSet tblXoaHoKhau = stmt.executeQuery(sqlSelectDangKyXoaHoKhau);

            while(tblXoaHoKhau.next())
            {
                int idGiayDangKyXoaHoKhau = tblXoaHoKhau.getInt("idGiayDangKyXoaHoKhau");
                int idHoKhau = tblXoaHoKhau.getInt("idHoKhau");
                String lyDo = tblXoaHoKhau.getString("lyDo");
                Date ngayKhai = tblXoaHoKhau.getDate("ngayKhai");
                int idNguoiKhai = tblXoaHoKhau.getInt("idNguoiKhai");

                dangKyXoaHoKhau dkxhk = new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau,idHoKhau,lyDo,ngayKhai,idNguoiKhai);
                dsDangKyXoaHoKhau.add(dkxhk);
            }
            return dsDangKyXoaHoKhau;
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

                String sqlDropSuKienNhaVanHoa = "DELETE FROM su_kien_nha_van_hoa WHERE idGiayDangKy = " + idSuDungNhaVanHoaRecord;
                PreparedStatement dropDangKySuDungNhaVanhoaRecord = connectDB.prepareStatement(sqlDropSuKienNhaVanHoa);

                boolean thanhCong = dangKySuDungNhaVanhoaRecord.execute();
                dropDangKySuDungNhaVanhoaRecord.execute();
                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try {
                String sqlDropSuKienNhaVanHoa = "DELETE FROM su_kien_nha_van_hoa WHERE idGiayDangKy = " + idSuDungNhaVanHoaRecord;
                PreparedStatement dropDangKySuDungNhaVanhoaRecord = connectDB.prepareStatement(sqlDropSuKienNhaVanHoa);

                boolean thanhCong = dropDangKySuDungNhaVanhoaRecord.execute();
                return thanhCong;
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

                String sqlDropThemTamVang = "DELETE FROM tam_vang WHERE (idGiayTamVang = ?)";
                PreparedStatement dropTamVangRecord = connectDB.prepareStatement(sqlDropThemTamVang);

                boolean thanhCong = tamVangRecord.execute();

                dropTamVangRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropThemTamVang = "DELETE FROM tam_vang WHERE (idGiayTamVang = ?)";
                PreparedStatement dropTamVangRecord = connectDB.prepareStatement(sqlDropThemTamVang);
                boolean thanhCong = dropTamVangRecord.execute();
                return thanhCong;
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

                String sqlDropThemTamVang = "DELETE FROM tam_tru WHERE (idGiayTamTru = ?)";
                PreparedStatement dropTamTruRecord = connectDB.prepareStatement(sqlDropThemTamVang);

                tamTruRecord.setInt(1, tamTru.getIdNhanKhau());
                boolean thanhCong = tamTruRecord.execute();

                dropTamTruRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropThemTamVang = "DELETE FROM tam_tru WHERE (idGiayTamTru = ?)";
                PreparedStatement dropTamTruRecord = connectDB.prepareStatement(sqlDropThemTamVang);

                boolean thanhCong = dropTamTruRecord.execute();

                return thanhCong;
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

                String sqlDropThemNhanKhau = "DELETE FROM giay_dang_ky_them_nhan_khau where idGiayDangKyThemNhanKhau = ?;";
                PreparedStatement dropThemNhanKhauRecord = connectDB.prepareStatement(sqlDropThemNhanKhau);

                themNhanKhauRecord.setInt(1, idThemNhanKhauRecord);

                boolean thanhCong = themNhanKhauRecord.execute();

                dropThemNhanKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropThemNhanKhau = "DELETE FROM giay_dang_ky_them_nhan_khau where idGiayDangKyThemNhanKhau = ?;";
                PreparedStatement dropThemNhanKhauRecord = connectDB.prepareStatement(sqlDropThemNhanKhau);

                boolean thanhCong = dropThemNhanKhauRecord.execute();

                return thanhCong;
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

                String sqlDropThemHoKhau = "DELETE FROM dang_ky_them_ho_khau WHERE idGiayDangKyThemHoKhau = ?";
                PreparedStatement dropThemHoKhauRecord = connectDB.prepareStatement(sqlDropThemHoKhau);

                themHoKhauRecord.setInt(1, idThemHoKhauRecord);

                boolean thanhCong = themHoKhauRecord.execute();

                dropThemHoKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropThemHoKhau = "DELETE FROM dang_ky_them_ho_khau WHERE idGiayDangKyThemHoKhau = ?";
                PreparedStatement dropThemHoKhauRecord = connectDB.prepareStatement(sqlDropThemHoKhau);

                boolean thanhCong = dropThemHoKhauRecord.execute();

                return thanhCong;
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

                String sqlDropNhanKhau = "DELETE FROM dang_ky_xoa_nhan_khau WHERE (idGiayDangKyXoaNhanKhau = ?);";
                PreparedStatement dropXoaNhanKhauRecord = connectDB.prepareStatement(sqlDropNhanKhau);

                xoaNhanKhauRecord.setInt(1, xoaNhanKhau.getIdNguoiBiXoa());

                boolean thanhCong = xoaNhanKhauRecord.execute();

                dropXoaNhanKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropNhanKhau = "DELETE FROM dang_ky_xoa_nhan_khau WHERE (idGiayDangKyXoaNhanKhau = ?);";
                PreparedStatement dropXoaNhanKhauRecord = connectDB.prepareStatement(sqlDropNhanKhau);

                boolean thanhCong = dropXoaNhanKhauRecord.execute();

                return thanhCong;
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

                String sqlDropXoaHoKhau = "DELETE FROM dang_ky_xoa_ho_khau WHERE (idGiayDangKyXoaHoKhau = ?);";
                PreparedStatement DropXoaHoKhauRecord = connectDB.prepareStatement(sqlDropXoaHoKhau);

                boolean thanhCong = xoaHoKhauRecord.execute();

                DropXoaHoKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropXoaHoKhau = "DELETE FROM dang_ky_xoa_ho_khau WHERE (idGiayDangKyXoaHoKhau = ?);";
                PreparedStatement DropXoaHoKhauRecord = connectDB.prepareStatement(sqlDropXoaHoKhau);

                boolean thanhCong = DropXoaHoKhauRecord.execute();

                return thanhCong;
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

                String sqlDropSuaNhanKhau = "DELETE FROM dang_ky_sua_nhan_khau WHERE idGiayDangKySuaNhanKhau = ?";
                PreparedStatement dropSuaNhanKhauRecord = connectDB.prepareStatement(sqlDropSuaNhanKhau);

                boolean thanhCong = suaNhanKhauRecord.execute();

                dropSuaNhanKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropSuaNhanKhau = "DELETE FROM dang_ky_sua_nhan_khau WHERE idGiayDangKySuaNhanKhau = ?";
                PreparedStatement dropSuaNhanKhauRecord = connectDB.prepareStatement(sqlDropSuaNhanKhau);

                boolean thanhCong = dropSuaNhanKhauRecord.execute();

                return thanhCong;
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
                suaHoKhauRecord.setInt(1, suaHoKhau.getIdChuHoMoi());
                suaHoKhauRecord.setString(2, suaHoKhau.getDiaChiMoi());
                suaHoKhauRecord.setDate(3, suaHoKhau.getNgayThayDoi());
                suaHoKhauRecord.setInt(4, suaHoKhau.getIdHoKhau());

                String sqlDropSuaHoKhau = "DELETE FROM dang_ky_sua_ho_khau where idGiayDangKySuaHoKhau = ?";
                PreparedStatement dropSuaHoKhauRecord = connectDB.prepareStatement(sqlDropSuaHoKhau);

                boolean thanhCong = suaHoKhauRecord.execute();
                dropSuaHoKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            try{
                String sqlDropSuaHoKhau = "DELETE FROM dang_ky_sua_ho_khau where idGiayDangKySuaHoKhau = ?";
                PreparedStatement dropSuaHoKhauRecord = connectDB.prepareStatement(sqlDropSuaHoKhau);

                boolean thanhCong = dropSuaHoKhauRecord.execute();

                return thanhCong;
            }catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
    }
}
