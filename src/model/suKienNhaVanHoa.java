package model;

import java.sql.Date;

public class suKienNhaVanHoa {
    private Integer idSuKien;
    private Date ngayToChuc;
    private String loaiSuKien;
    private Integer phiSuDung;
    private String ghiChu;

    public suKienNhaVanHoa() {
    }

    public suKienNhaVanHoa(Integer idSuKien, Date ngayToChuc, String loaiSuKien, Integer phiSuDung, String ghiChu) {
        this.idSuKien = idSuKien;
        this.ngayToChuc = ngayToChuc;
        this.loaiSuKien = loaiSuKien;
        this.phiSuDung = phiSuDung;
        this.ghiChu = ghiChu;
    }

    public Integer getIdSuKien() {
        return idSuKien;
    }

    public void setIdSuKien(Integer idSuKien) {
        this.idSuKien = idSuKien;
    }

    public Date getNgayToChuc() {
        return ngayToChuc;
    }

    public void setNgayToChuc(Date ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }

    public String getLoaiSuKien() {
        return loaiSuKien;
    }

    public void setLoaiSuKien(String loaiSuKien) {
        this.loaiSuKien = loaiSuKien;
    }

    public Integer getPhiSuDung() {
        return phiSuDung;
    }

    public void setPhiSuDung(Integer phiSuDung) {
        this.phiSuDung = phiSuDung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
