package model;

import java.sql.Date;

public class dangKySuaNhanKhau {
    private int idGiayDangKySuaNhanKhau;
    private int idNguoiKhai;
    private int idNguoiDuocSua;
    private Date ngayKhai;
    private String hoTenMoi;
    private String bietDanhMoi;
    private int soCMTMoi;
    private Date ngayCapCMT;
    private String noiCapCMT;
    private int namSinhMoi;
    private String gioiTinhMoi;
    private String noiSinhMoi;
    private String danTocMoi;
    private String tonGiaoMoi;
    private String quocTichMoi;
    private String nguyenQuanMoi;
    private String noiThuongTruMoi;
    private String ngheNghiepMoi;
    private String noiLamViecMoi;
    private Date ngayDangKyThuongTruMoi;
    private boolean tamTruMoi;
    private boolean tamVangMoi;
    private String ghiChuMoi;

    public dangKySuaNhanKhau() {
    }

    public dangKySuaNhanKhau(int idGiayDangKySuaNhanKhau, int idNguoiKhai, int idNguoiDuocSua, Date ngayKhai,
                             String hoTenMoi, String bietDanhMoi, int soCMTMoi, Date ngayCapCMT, String noiCapCMT,
                             int namSinhMoi, String gioiTinhMoi, String noiSinhMoi, String danTocMoi, String tonGiaoMoi,
                             String quocTichMoi, String nguyenQuanMoi, String noiThuongTruMoi, String ngheNghiepMoi,
                             String noiLamViecMoi, Date ngayDangKyThuongTruMoi, boolean tamTruMoi, boolean tamVangMoi,
                             String ghiChuMoi) {
        this.idGiayDangKySuaNhanKhau = idGiayDangKySuaNhanKhau;
        this.idNguoiKhai = idNguoiKhai;
        this.idNguoiDuocSua = idNguoiDuocSua;
        this.ngayKhai = ngayKhai;
        this.hoTenMoi = hoTenMoi;
        this.bietDanhMoi = bietDanhMoi;
        this.soCMTMoi = soCMTMoi;
        this.ngayCapCMT = ngayCapCMT;
        this.noiCapCMT = noiCapCMT;
        this.namSinhMoi = namSinhMoi;
        this.gioiTinhMoi = gioiTinhMoi;
        this.noiSinhMoi = noiSinhMoi;
        this.danTocMoi = danTocMoi;
        this.tonGiaoMoi = tonGiaoMoi;
        this.quocTichMoi = quocTichMoi;
        this.nguyenQuanMoi = nguyenQuanMoi;
        this.noiThuongTruMoi = noiThuongTruMoi;
        this.ngheNghiepMoi = ngheNghiepMoi;
        this.noiLamViecMoi = noiLamViecMoi;
        this.ngayDangKyThuongTruMoi = ngayDangKyThuongTruMoi;
        this.tamTruMoi = tamTruMoi;
        this.tamVangMoi = tamVangMoi;
        this.ghiChuMoi = ghiChuMoi;
    }

    public int getIdGiayDangKySuaNhanKhau() {
        return idGiayDangKySuaNhanKhau;
    }

    public void setIdGiayDangKySuaNhanKhau(int idGiayDangKySuaNhanKhau) {
        this.idGiayDangKySuaNhanKhau = idGiayDangKySuaNhanKhau;
    }

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }

    public int getIdNguoiDuocSua() {
        return idNguoiDuocSua;
    }

    public void setIdNguoiDuocSua(int idNguoiDuocSua) {
        this.idNguoiDuocSua = idNguoiDuocSua;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public String getHoTenMoi() {
        return hoTenMoi;
    }

    public void setHoTenMoi(String hoTenMoi) {
        this.hoTenMoi = hoTenMoi;
    }

    public String getBietDanhMoi() {
        return bietDanhMoi;
    }

    public void setBietDanhMoi(String bietDanhMoi) {
        this.bietDanhMoi = bietDanhMoi;
    }

    public int getSoCMTMoi() {
        return soCMTMoi;
    }

    public void setSoCMTMoi(int soCMTMoi) {
        this.soCMTMoi = soCMTMoi;
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

    public int getNamSinhMoi() {
        return namSinhMoi;
    }

    public void setNamSinhMoi(int namSinhMoi) {
        this.namSinhMoi = namSinhMoi;
    }

    public String getGioiTinhMoi() {
        return gioiTinhMoi;
    }

    public void setGioiTinhMoi(String gioiTinhMoi) {
        this.gioiTinhMoi = gioiTinhMoi;
    }

    public String getNoiSinhMoi() {
        return noiSinhMoi;
    }

    public void setNoiSinhMoi(String noiSinhMoi) {
        this.noiSinhMoi = noiSinhMoi;
    }

    public String getDanTocMoi() {
        return danTocMoi;
    }

    public void setDanTocMoi(String danTocMoi) {
        this.danTocMoi = danTocMoi;
    }

    public String getTonGiaoMoi() {
        return tonGiaoMoi;
    }

    public void setTonGiaoMoi(String tonGiaoMoi) {
        this.tonGiaoMoi = tonGiaoMoi;
    }

    public String getQuocTichMoi() {
        return quocTichMoi;
    }

    public void setQuocTichMoi(String quocTichMoi) {
        this.quocTichMoi = quocTichMoi;
    }

    public String getNguyenQuanMoi() {
        return nguyenQuanMoi;
    }

    public void setNguyenQuanMoi(String nguyenQuanMoi) {
        this.nguyenQuanMoi = nguyenQuanMoi;
    }

    public String getNoiThuongTruMoi() {
        return noiThuongTruMoi;
    }

    public void setNoiThuongTruMoi(String noiThuongTruMoi) {
        this.noiThuongTruMoi = noiThuongTruMoi;
    }

    public String getNgheNghiepMoi() {
        return ngheNghiepMoi;
    }

    public void setNgheNghiepMoi(String ngheNghiepMoi) {
        this.ngheNghiepMoi = ngheNghiepMoi;
    }

    public String getNoiLamViecMoi() {
        return noiLamViecMoi;
    }

    public void setNoiLamViecMoi(String noiLamViecMoi) {
        this.noiLamViecMoi = noiLamViecMoi;
    }

    public Date getNgayDangKyThuongTruMoi() {
        return ngayDangKyThuongTruMoi;
    }

    public void setNgayDangKyThuongTruMoi(Date ngayDangKyThuongTruMoi) {
        this.ngayDangKyThuongTruMoi = ngayDangKyThuongTruMoi;
    }

    public boolean isTamTruMoi() {
        return tamTruMoi;
    }

    public void setTamTruMoi(boolean tamTruMoi) {
        this.tamTruMoi = tamTruMoi;
    }

    public boolean isTamVangMoi() {
        return tamVangMoi;
    }

    public void setTamVangMoi(boolean tamVangMoi) {
        this.tamVangMoi = tamVangMoi;
    }

    public String getGhiChuMoi() {
        return ghiChuMoi;
    }

    public void setGhiChuMoi(String ghiChuMoi) {
        this.ghiChuMoi = ghiChuMoi;
    }
}
