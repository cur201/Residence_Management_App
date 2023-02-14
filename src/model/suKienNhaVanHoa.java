package model;

import java.sql.Date;

public class suKienNhaVanHoa {
    private int idSuKien;
    private Date ngayToChuc;
    private String loaiSuKien;
    private int phiSuDung;
    private String ghiChu;

    public suKienNhaVanHoa() {
    }

    public suKienNhaVanHoa(int idSuKien, Date ngayToChuc, String loaiSuKien, int phiSuDung, String ghiChu) {
        this.idSuKien = idSuKien;
        this.ngayToChuc = ngayToChuc;
        this.loaiSuKien = loaiSuKien;
        this.phiSuDung = phiSuDung;
        this.ghiChu = ghiChu;
    }

    public int getIdSuKien() {
        return idSuKien;
    }

    public void setIdSuKien(int idSuKien) {
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

    public int getPhiSuDung() {
        return phiSuDung;
    }

    public void setPhiSuDung(int phiSuDung) {
        this.phiSuDung = phiSuDung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
