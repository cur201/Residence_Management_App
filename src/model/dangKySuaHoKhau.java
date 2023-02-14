package model;

import java.sql.Date;

public class dangKySuaHoKhau {
    private int idGiayDangKySuaHoKhau;
    private int idHoKhau;
    private int idChuHoMoi;
    private String diaChiMoi;
    private Date ngayThayDoi;
    private int idNguoiKhai;

    public dangKySuaHoKhau() {
    }

    public dangKySuaHoKhau(int idGiayDangKySuaHoKhau, int idHoKhau, int idChuHoMoi, String diaChiMoi, Date ngayThayDoi, int idNguoiKhai) {
        this.idGiayDangKySuaHoKhau = idGiayDangKySuaHoKhau;
        this.idHoKhau = idHoKhau;
        this.idChuHoMoi = idChuHoMoi;
        this.diaChiMoi = diaChiMoi;
        this.ngayThayDoi = ngayThayDoi;
        this.idNguoiKhai = idNguoiKhai;
    }

    public int getIdGiayDangKySuaHoKhau() {
        return idGiayDangKySuaHoKhau;
    }

    public void setIdGiayDangKySuaHoKhau(int idGiayDangKySuaHoKhau) {
        this.idGiayDangKySuaHoKhau = idGiayDangKySuaHoKhau;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public int getIdChuHoMoi() {
        return idChuHoMoi;
    }

    public void setIdChuHoMoi(int idChuHoMoi) {
        this.idChuHoMoi = idChuHoMoi;
    }

    public String getDiaChiMoi() {
        return diaChiMoi;
    }

    public void setDiaChiMoi(String diaChiMoi) {
        this.diaChiMoi = diaChiMoi;
    }

    public Date getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(Date ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }
}
