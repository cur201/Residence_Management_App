package model;

public class thanhVienCuaHo {
    private int id;
    private int idNhanKhau;
    private int idHoKhau;
    private String quanHeVoiChuHo;

    public thanhVienCuaHo() {
    }

    public thanhVienCuaHo(int id, int idNhanKhau, int idHoKhau, String quanHeVoiChuHo) {
        this.id = id;
        this.idNhanKhau = idNhanKhau;
        this.idHoKhau = idHoKhau;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }
}
