package model;

public class coSoNhaVanHoa {
    private int idDoDung;
    private String tenDoDung;
    private String hienTrang;
    private int soLuong;
    private String ghiChu;

    public coSoNhaVanHoa() {
    }

    public coSoNhaVanHoa(int idDoDung, String tenDoDung, String hienTrang, int soLuong, String ghiChu) {
        this.idDoDung = idDoDung;
        this.tenDoDung = tenDoDung;
        this.hienTrang = hienTrang;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public int getIdDoDung() {
        return idDoDung;
    }

    public void setIdDoDung(int idDoDung) {
        this.idDoDung = idDoDung;
    }

    public String getTenDoDung() {
        return tenDoDung;
    }

    public void setTenDoDung(String tenDoDung) {
        this.tenDoDung = tenDoDung;
    }

    public String getHienTrang() {
        return hienTrang;
    }

    public void setHienTrang(String hienTrang) {
        this.hienTrang = hienTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
