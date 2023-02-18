package model;

import java.sql.Date;

public class dangKySuDungNhaVanHoa {
    private Integer idGiayDangKy;
    private Date ngayToChuc;
    private String loaiSuKien;
    private Integer phiSuDung;
    private String ghiChu;

    public dangKySuDungNhaVanHoa() {
    }

    public dangKySuDungNhaVanHoa(Integer idGiayDangKy, Date ngayToChuc, String loaiSuKien, Integer phiSuDung, String ghiChu) {
        this.idGiayDangKy = idGiayDangKy;
        this.ngayToChuc = ngayToChuc;
        this.loaiSuKien = loaiSuKien;
        this.phiSuDung = phiSuDung;
        this.ghiChu = ghiChu;
    }

    public Integer getIdGiayDangKy() {
        return idGiayDangKy;
    }

    public void setIdGiayDangKy(Integer idGiayDangKy) {
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
