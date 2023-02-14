package model;

import java.sql.Date;

public class tamVang {
    private int idGiayTamVang;
    private int idNhanKhau;
    private String noiThuongTru;
    private Date tuNgay;
    private Date denNgay;
    private String lyDo;

    public tamVang() {
    }

    public tamVang(int idGiayTamVang, int idNhanKhau, String noiThuongTru, Date tuNgay, Date denNgay, String lyDo) {
        this.idGiayTamVang = idGiayTamVang;
        this.idNhanKhau = idNhanKhau;
        this.noiThuongTru = noiThuongTru;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.lyDo = lyDo;
    }

    public int getIdGiayTamVang() {
        return idGiayTamVang;
    }

    public void setIdGiayTamVang(int idGiayTamVang) {
        this.idGiayTamVang = idGiayTamVang;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
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
}
