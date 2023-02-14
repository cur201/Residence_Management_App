package model;

import java.sql.Date;

public class dangKyXoaHoKhau {
    private int idGiayDangKyXoaHoKhau;
    private int idHoKhau;
    private String lyDo;
    private Date ngayKhai;
    private int idNguoiKhai;

    public dangKyXoaHoKhau() {
    }

    public dangKyXoaHoKhau(int idGiayDangKyXoaHoKhau, int idHoKhau, String lyDo, Date ngayKhai, int idNguoiKhai) {
        this.idGiayDangKyXoaHoKhau = idGiayDangKyXoaHoKhau;
        this.idHoKhau = idHoKhau;
        this.lyDo = lyDo;
        this.ngayKhai = ngayKhai;
        this.idNguoiKhai = idNguoiKhai;
    }

    public int getIdGiayDangKyXoaHoKhau() {
        return idGiayDangKyXoaHoKhau;
    }

    public void setIdGiayDangKyXoaHoKhau(int idGiayDangKyXoaHoKhau) {
        this.idGiayDangKyXoaHoKhau = idGiayDangKyXoaHoKhau;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }
}
