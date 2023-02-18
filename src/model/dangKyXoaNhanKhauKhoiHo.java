package model;

import java.sql.Date;

public class dangKyXoaNhanKhauKhoiHo {
    Integer id;
    Date ngayKhai;
    Integer idNhanKhauBiXoa;
    Integer idHoKhauBiXoa;

    public dangKyXoaNhanKhauKhoiHo() {
    }

    public dangKyXoaNhanKhauKhoiHo(Integer id, Date ngayKhai, Integer idNhanKhauBiXoa, Integer idHoKhauBiXoa) {
        this.id = id;
        this.ngayKhai = ngayKhai;
        this.idNhanKhauBiXoa = idNhanKhauBiXoa;
        this.idHoKhauBiXoa = idHoKhauBiXoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public Integer getIdNhanKhauBiXoa() {
        return idNhanKhauBiXoa;
    }

    public void setIdNhanKhauBiXoa(Integer idNhanKhauBiXoa) {
        this.idNhanKhauBiXoa = idNhanKhauBiXoa;
    }

    public Integer getIdHoKhauBiXoa() {
        return idHoKhauBiXoa;
    }

    public void setIdHoKhauBiXoa(Integer idHoKhauBiXoa) {
        this.idHoKhauBiXoa = idHoKhauBiXoa;
    }
}
