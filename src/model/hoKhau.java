package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class hoKhau {
    private int idHoKhau;
    private int idChuHo;
    private String maKhuVuc;
    private String diaChi;
    private Date ngayLap;

    private List<String> hoKhauList;

    public hoKhau() {
        hoKhauList = new ArrayList<>();
    }

    public hoKhau(int idHoKhau, int idChuHo, String maKhuVuc, String diaChi, Date ngayLap) {
        this.idHoKhau = idHoKhau;
        this.idChuHo = idChuHo;
        this.maKhuVuc = maKhuVuc;
        this.diaChi = diaChi;
        this.ngayLap = ngayLap;
        hoKhauList = new ArrayList<>();

    }


    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public int getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(int idChuHo) {
        this.idChuHo = idChuHo;
    }

    public String getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(String maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }


}
