package model;

import java.sql.Date;

public class dangKyXoaNhanKhau {
    private Integer idGiayDangKyXoaNhanKhau;
    private Integer idNguoiKhai;
    private Integer idNguoiBiXoa;
    private Date ngayKhai;
    private Date ngayXoa;
    private String noiChuyen;
    private String ghiChu;

    public dangKyXoaNhanKhau() {
    }

    public dangKyXoaNhanKhau(Integer idGiayDangKyXoaNhanKhau, Integer idNguoiKhai, Integer idNguoiBiXoa, Date ngayKhai,
                             Date ngayXoa, String noiChuyen, String ghiChu) {
        this.idGiayDangKyXoaNhanKhau = idGiayDangKyXoaNhanKhau;
        this.idNguoiKhai = idNguoiKhai;
        this.idNguoiBiXoa = idNguoiBiXoa;
        this.ngayKhai = ngayKhai;
        this.ngayXoa = ngayXoa;
        this.noiChuyen = noiChuyen;
        this.ghiChu = ghiChu;
    }

    public Integer getIdGiayDangKyXoaNhanKhau() {
        return idGiayDangKyXoaNhanKhau;
    }

    public void setIdGiayDangKyXoaNhanKhau(Integer idGiayDangKyXoaNhanKhau) {
        this.idGiayDangKyXoaNhanKhau = idGiayDangKyXoaNhanKhau;
    }

    public Integer getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(Integer idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }

    public Integer getIdNguoiBiXoa() {
        return idNguoiBiXoa;
    }

    public void setIdNguoiBiXoa(Integer idNguoiBiXoa) {
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
