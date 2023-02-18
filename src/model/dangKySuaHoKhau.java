package model;

import java.sql.Date;

public class dangKySuaHoKhau {
    private Integer idGiayDangKySuaHoKhau;
    private Integer idHoKhau;
    private Integer idChuHoMoi;
    private String diaChiMoi;
    private Date ngayThayDoi;
    private Integer idNguoiKhai;

    public dangKySuaHoKhau() {
    }

    public dangKySuaHoKhau(Integer idGiayDangKySuaHoKhau, Integer idHoKhau, Integer idChuHoMoi, String diaChiMoi, Date ngayThayDoi, Integer idNguoiKhai) {
        this.idGiayDangKySuaHoKhau = idGiayDangKySuaHoKhau;
        this.idHoKhau = idHoKhau;
        this.idChuHoMoi = idChuHoMoi;
        this.diaChiMoi = diaChiMoi;
        this.ngayThayDoi = ngayThayDoi;
        this.idNguoiKhai = idNguoiKhai;
    }

    public Integer getIdGiayDangKySuaHoKhau() {
        return idGiayDangKySuaHoKhau;
    }

    public void setIdGiayDangKySuaHoKhau(Integer idGiayDangKySuaHoKhau) {
        this.idGiayDangKySuaHoKhau = idGiayDangKySuaHoKhau;
    }

    public Integer getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(Integer idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public Integer getIdChuHoMoi() {
        return idChuHoMoi;
    }

    public void setIdChuHoMoi(Integer idChuHoMoi) {
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

    public Integer getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(Integer idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }
}
