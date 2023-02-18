package model;

import java.sql.Date;

public class tamTru {
    private Integer idGiayTamTru;
    private Integer idNhanKhau;
    private String noiTamTru;
    private String noiThuongTru;
    private Date tuNgay;
    private Date denNgay;

    public tamTru() {
    }

    public tamTru(Integer idGiayTamTru, Integer idNhanKhau, String noiTamTru, String noiThuongTru, Date tuNgay, Date denNgay, String lyDo) {
        this.idGiayTamTru = idGiayTamTru;
        this.idNhanKhau = idNhanKhau;
        this.noiTamTru = noiTamTru;
        this.noiThuongTru = noiThuongTru;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.lyDo = lyDo;
    }

    public Integer getIdGiayTamTru() {
        return idGiayTamTru;
    }

    public void setIdGiayTamTru(Integer idGiayTamTru) {
        this.idGiayTamTru = idGiayTamTru;
    }

    public Integer getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(Integer idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getNoiTamTru() {
        return noiTamTru;
    }

    public void setNoiTamTru(String noiTamTru) {
        this.noiTamTru = noiTamTru;
    }

    public String getNoiThuongTru() {
        return noiThuongTru;
    }

    public void setNoiThuongTru(String noiThuongTru) {
        this.noiThuongTru = noiThuongTru;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    private String lyDo;
}
