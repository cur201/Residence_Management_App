package model;

import java.sql.Date;

public class lichSuNhanKhau {
    private Integer idNhanKhau;
    private Date ngayThayDoi;
    private String typeNhanKhau;

    public lichSuNhanKhau() {
    }

    public lichSuNhanKhau(Integer idNhanKhau, Date ngayThayDoi, String typeNhanKhau) {
        this.idNhanKhau = idNhanKhau;
        this.ngayThayDoi = ngayThayDoi;
        this.typeNhanKhau = typeNhanKhau;
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

    public String getTypeNhanKhau() {
        return typeNhanKhau;
    }

    public void setTypeNhanKhau(String typeNhanKhau) {
        this.typeNhanKhau = typeNhanKhau;
    }
}
