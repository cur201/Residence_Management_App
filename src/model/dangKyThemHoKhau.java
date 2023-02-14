package model;

import java.sql.Date;

public class dangKyThemHoKhau {
    private int idGiayDangKyThemHoKhau;
    private int idChuHo;
    private String maKhuVuc;
    private String diaChi;
    private Date ngayLap;
    private Date ngayKhai;
    private int idNguoiKhai;

    public dangKyThemHoKhau() {
    }

    public dangKyThemHoKhau(int idGiayDangKyThemHoKhau, int idChuHo, String maKhuVuc, String diaChi, Date ngayLap, Date ngayKhai, int idNguoiKhai) {
        this.idGiayDangKyThemHoKhau = idGiayDangKyThemHoKhau;
        this.idChuHo = idChuHo;
        this.maKhuVuc = maKhuVuc;
        this.diaChi = diaChi;
        this.ngayLap = ngayLap;
        this.ngayKhai = ngayKhai;
        this.idNguoiKhai = idNguoiKhai;
    }

    public int getIdGiayDangKyThemHoKhau() {
        return idGiayDangKyThemHoKhau;
    }

    public void setIdGiayDangKyThemHoKhau(int idGiayDangKyThemHoKhau) {
        this.idGiayDangKyThemHoKhau = idGiayDangKyThemHoKhau;
    }

    public int getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(int idChuHo) {
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

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }
}
