package model;

import java.sql.Date;

public class nhanKhau {
    private Integer idNhanKhau;
    private String hoTen;
    private String bietDanh;
    private Integer soCMT;
    private Date ngayCapCMT;
    private String noiCapCMT;
    private Integer namSinh;
    private String gioiTinh;
    private String noiSinh;
    private String danToc;
    private String tonGiao;
    private String quocTich;
    private String nguyenQuan;
    private String noiThuongTru;
    private String ngheNghiep;
    private String noiLamViec;
    private Date ngayDangKyThuongTru;
    private boolean trangThaiTamTru;
    private boolean trangThaiTamVang;
    private String ghiChu;

    public nhanKhau() {
    }

    public nhanKhau(Integer idNhanKhau, String hoTen, String bietDanh, Integer soCMT, Date ngayCapCMT, String noiCapCMT,
                    Integer namSinh, String gioiTinh, String noiSinh, String danToc, String tonGiao, String quocTich,
                    String nguyenQuan, String noiThuongTru, String ngheNghiep, String noiLamViec,
                    Date ngayDangKyThuongTru, boolean trangThaiTamTru, boolean trangThaiTamVang, String ghiChu) {
        this.idNhanKhau = idNhanKhau;
        this.hoTen = hoTen;
        this.bietDanh = bietDanh;
        this.soCMT = soCMT;
        this.ngayCapCMT = ngayCapCMT;
        this.noiCapCMT = noiCapCMT;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.noiSinh = noiSinh;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
        this.quocTich = quocTich;
        this.nguyenQuan = nguyenQuan;
        this.noiThuongTru = noiThuongTru;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
        this.trangThaiTamTru = trangThaiTamTru;
        this.trangThaiTamVang = trangThaiTamVang;
        this.ghiChu = ghiChu;
    }

    public Integer getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(Integer idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getBietDanh() {
        return bietDanh;
    }

    public void setBietDanh(String bietDanh) {
        this.bietDanh = bietDanh;
    }

    public Integer getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(Integer soCMT) {
        this.soCMT = soCMT;
    }

    public Date getNgayCapCMT() {
        return ngayCapCMT;
    }

    public void setNgayCapCMT(Date ngayCapCMT) {
        this.ngayCapCMT = ngayCapCMT;
    }

    public String getNoiCapCMT() {
        return noiCapCMT;
    }

    public void setNoiCapCMT(String noiCapCMT) {
        this.noiCapCMT = noiCapCMT;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public void setNguyenQuan(String nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
    }

    public String getNoiThuongTru() {
        return noiThuongTru;
    }

    public void setNoiThuongTru(String noiThuongTru) {
        this.noiThuongTru = noiThuongTru;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public Date getNgayDangKyThuongTru() {
        return ngayDangKyThuongTru;
    }

    public void setNgayDangKyThuongTru(Date ngayDangKyThuongTru) {
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
    }

    public boolean isTrangThaiTamTru() {
        return trangThaiTamTru;
    }

    public void setTrangThaiTamTru(boolean trangThaiTamTru) {
        this.trangThaiTamTru = trangThaiTamTru;
    }

    public boolean isTrangThaiTamVang() {
        return trangThaiTamVang;
    }

    public void setTrangThaiTamVang(boolean trangThaiTamVang) {
        this.trangThaiTamVang = trangThaiTamVang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
