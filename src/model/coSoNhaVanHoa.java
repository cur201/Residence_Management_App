package model;

public class coSoNhaVanHoa {
    private Integer idDoDung;
    private String tenDoDung;
    private String hienTrang;
    private Integer soLuong;
    private String ghiChu;

    public coSoNhaVanHoa() {
    }

    public coSoNhaVanHoa(Integer idDoDung, String tenDoDung, String hienTrang, Integer soLuong, String ghiChu) {
        this.idDoDung = idDoDung;
        this.tenDoDung = tenDoDung;
        this.hienTrang = hienTrang;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public Integer getIdDoDung() {
        return idDoDung;
    }

    public void setIdDoDung(Integer idDoDung) {
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

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
