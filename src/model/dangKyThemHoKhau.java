package model;

import java.sql.Date;

public class dangKyThemHoKhau {
    private Integer idGiayDangKyThemHoKhau;
    private Integer idChuHo;
    private String maKhuVuc;
    private String diaChi;
    private Date ngayLap;
    private Date ngayKhai;
    private Integer idNguoiKhai;

    public dangKyThemHoKhau() {
    }

    public dangKyThemHoKhau(Integer idGiayDangKyThemHoKhau, Integer idChuHo, String maKhuVuc, String diaChi, Date ngayLap, Date ngayKhai, Integer idNguoiKhai) {
        this.idGiayDangKyThemHoKhau = idGiayDangKyThemHoKhau;
        this.idChuHo = idChuHo;
        this.maKhuVuc = maKhuVuc;
        this.diaChi = diaChi;
        this.ngayLap = ngayLap;
        this.ngayKhai = ngayKhai;
        this.idNguoiKhai = idNguoiKhai;
    }

    public Integer getIdGiayDangKyThemHoKhau() {
        return idGiayDangKyThemHoKhau;
    }

    public void setIdGiayDangKyThemHoKhau(Integer idGiayDangKyThemHoKhau) {
        this.idGiayDangKyThemHoKhau = idGiayDangKyThemHoKhau;
    }

    public Integer getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(Integer idChuHo) {
        this.idChuHo = idChuHo;
    }

    public String getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(String maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
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
