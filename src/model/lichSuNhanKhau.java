package model;

import java.sql.Date;

public class lichSuNhanKhau {
    private Integer idNhanKhau;
    private Date ngayThayDoi;
    private String loaiThayDoi;

    public lichSuNhanKhau() {
    }

    public lichSuNhanKhau(Integer idNhanKhau, Date ngayThayDoi, String loaiThayDoi) {
        this.idNhanKhau = idNhanKhau;
        this.ngayThayDoi = ngayThayDoi;
        this.loaiThayDoi = loaiThayDoi;
    }

    public Integer getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(Integer idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public Date getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(Date ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public String getLoaiThayDoi() {
        return loaiThayDoi;
    }

    public void setLoaiThayDoi(String loaiThayDoi) {
        this.loaiThayDoi = loaiThayDoi;
    }
}
