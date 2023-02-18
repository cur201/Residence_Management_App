package model;

import java.sql.Date;

public class dangKyXoaHoKhau {
    private Integer idGiayDangKyXoaHoKhau;
    private Integer idHoKhau;
    private String lyDo;
    private Date ngayKhai;
    private Integer idNguoiKhai;

    public dangKyXoaHoKhau() {
    }

    public dangKyXoaHoKhau(Integer idGiayDangKyXoaHoKhau, Integer idHoKhau, String lyDo, Date ngayKhai, Integer idNguoiKhai) {
        this.idGiayDangKyXoaHoKhau = idGiayDangKyXoaHoKhau;
        this.idHoKhau = idHoKhau;
        this.lyDo = lyDo;
        this.ngayKhai = ngayKhai;
        this.idNguoiKhai = idNguoiKhai;
    }

    public Integer getIdGiayDangKyXoaHoKhau() {
        return idGiayDangKyXoaHoKhau;
    }

    public void setIdGiayDangKyXoaHoKhau(Integer idGiayDangKyXoaHoKhau) {
        this.idGiayDangKyXoaHoKhau = idGiayDangKyXoaHoKhau;
    }

    public Integer getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(Integer idHoKhau) {
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

    public Integer getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(Integer idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }
}
