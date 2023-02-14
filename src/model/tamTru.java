package model;

import java.sql.Date;

public class tamTru {
    private int idGiayTamTru;
    private int idNhanKhau;
    private String noiTamTru;
    private String noiThuongTru;
    private Date tuNgay;
    private Date denNgay;

    public tamTru() {
    }

    public tamTru(int idGiayTamTru, int idNhanKhau, String noiTamTru, String noiThuongTru, Date tuNgay, Date denNgay, String lyDo) {
        this.idGiayTamTru = idGiayTamTru;
        this.idNhanKhau = idNhanKhau;
        this.noiTamTru = noiTamTru;
        this.noiThuongTru = noiThuongTru;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.lyDo = lyDo;
    }

    public int getIdGiayTamTru() {
        return idGiayTamTru;
    }

    public void setIdGiayTamTru(int idGiayTamTru) {
        this.idGiayTamTru = idGiayTamTru;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
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
