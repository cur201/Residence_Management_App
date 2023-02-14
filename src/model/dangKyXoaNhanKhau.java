package model;

import java.sql.Date;

public class dangKyXoaNhanKhau {
    private int idGiayDangKyXoaNhanKhau;
    private int idNguoiKhai;
    private int idNguoiBiXoa;
    private Date ngayKhai;
    private Date ngayXoa;
    private String noiChuyen;
    private String ghiChu;

    public dangKyXoaNhanKhau() {
    }

    public dangKyXoaNhanKhau(int idGiayDangKyXoaNhanKhau, int idNguoiKhai, int idNguoiBiXoa, Date ngayKhai,
                             Date ngayXoa, String noiChuyen, String ghiChu) {
        this.idGiayDangKyXoaNhanKhau = idGiayDangKyXoaNhanKhau;
        this.idNguoiKhai = idNguoiKhai;
        this.idNguoiBiXoa = idNguoiBiXoa;
        this.ngayKhai = ngayKhai;
        this.ngayXoa = ngayXoa;
        this.noiChuyen = noiChuyen;
        this.ghiChu = ghiChu;
    }

    public int getIdGiayDangKyXoaNhanKhau() {
        return idGiayDangKyXoaNhanKhau;
    }

    public void setIdGiayDangKyXoaNhanKhau(int idGiayDangKyXoaNhanKhau) {
        this.idGiayDangKyXoaNhanKhau = idGiayDangKyXoaNhanKhau;
    }

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }

    public int getIdNguoiBiXoa() {
        return idNguoiBiXoa;
    }

    public void setIdNguoiBiXoa(int idNguoiBiXoa) {
        this.idNguoiBiXoa = idNguoiBiXoa;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public Date getNgayXoa() {
        return ngayXoa;
    }

    public void setNgayXoa(Date ngayXoa) {
        this.ngayXoa = ngayXoa;
    }

    public String getNoiChuyen() {
        return noiChuyen;
    }

    public void setNoiChuyen(String noiChuyen) {
        this.noiChuyen = noiChuyen;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
