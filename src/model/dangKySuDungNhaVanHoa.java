package model;

import java.sql.Date;

public class dangKySuDungNhaVanHoa {
    private int idGiayDangKy;
    private Date ngayToChuc;
    private String loaiSuKien;
    private int phiSuDung;
    private String ghiChu;

    public dangKySuDungNhaVanHoa() {
    }

    public dangKySuDungNhaVanHoa(int idGiayDangKy, Date ngayToChuc, String loaiSuKien, int phiSuDung, String ghiChu) {
        this.idGiayDangKy = idGiayDangKy;
        this.ngayToChuc = ngayToChuc;
        this.loaiSuKien = loaiSuKien;
        this.phiSuDung = phiSuDung;
        this.ghiChu = ghiChu;
    }

    public int getIdGiayDangKy() {
        return idGiayDangKy;
    }

    public void setIdGiayDangKy(int idGiayDangKy) {
        this.idGiayDangKy = idGiayDangKy;
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
