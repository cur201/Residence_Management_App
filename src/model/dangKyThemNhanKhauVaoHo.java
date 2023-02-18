package model;

import java.sql.Date;

public class dangKyThemNhanKhauVaoHo {
    Integer id;
    Date ngayKhai;
    Integer idNhanKhauDuocThem;
    Integer idHoKhauDuocThem;
    String quanHeVoiChuHo;

    public dangKyThemNhanKhauVaoHo() {
    }

    public dangKyThemNhanKhauVaoHo(Integer id, Date ngayKhai, Integer idNhanKhauDuocThem, Integer idHoKhauDuocThem, String quanHeVoiChuHo) {
        this.id = id;
        this.ngayKhai = ngayKhai;
        this.idNhanKhauDuocThem = idNhanKhauDuocThem;
        this.idHoKhauDuocThem = idHoKhauDuocThem;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public Integer getIdNhanKhauDuocThem() {
        return idNhanKhauDuocThem;
    }

    public void setIdNhanKhauDuocThem(Integer idNhanKhauDuocThem) {
        this.idNhanKhauDuocThem = idNhanKhauDuocThem;
    }

    public Integer getIdHoKhauDuocThem() {
        return idHoKhauDuocThem;
    }

    public void setIdHoKhauDuocThem(Integer idHoKhauDuocThem) {
        this.idHoKhauDuocThem = idHoKhauDuocThem;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }
}
