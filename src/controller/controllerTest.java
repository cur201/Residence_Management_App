package controller;

import model.*;

import java.sql.Date;
import java.util.ArrayList;

import static constancy.constancy.DEFAULT_ID;

public class controllerTest {
    //only using for controller test purposes, not using in main project
    public static void main(String[] args)
    {
        //hãy cứ vô tư và lạc lạc lạc lạc lạc...
        //*insert tieng chim dai bang

        //-------------------------cán bộ nhập liệu test------------------------//

            //tạo giấy tạm vắng------------------
        int idGiayTamVang = 3;
        int idNhanKhauGiayTamVang = 1;
        String noiThuongTruGiayTamVang = "Quang Linh";
        Date tuNgayGiayTamVang = Date.valueOf("2022-10-01");
        Date denNgayGiayTamVang = Date.valueOf("2023-01-22");
        String lyDoGiayTamVang = null;
        canBoNhapLieu_controller canBoNhapLieu_controller = new canBoNhapLieu_controller();
        tamVang tamVangRecord = new tamVang(idGiayTamVang, idNhanKhauGiayTamVang,
                noiThuongTruGiayTamVang, tuNgayGiayTamVang, denNgayGiayTamVang, lyDoGiayTamVang);
        //canBoNhapLieu_controller.taoGiayTamVang(tamVangRecord);

            //tạo giấy tạm trú------------------
        int idGiayTamTru = 3;
        int idNhanKhauGiayTamTru = 1;
        String noiTamTruGiayTamTru = "Hai Phong";
        String noiThuongTruGiayTamTru = "Quang Linh";
        Date tuNgayGiayTamTru = Date.valueOf("2022-10-01");
        Date denNgayGiayTamTru = Date.valueOf("2023-01-22");
        String lyDoGiaytamTru = null;
        tamTru tamTruRecord = new tamTru(idGiayTamTru, idNhanKhauGiayTamTru, noiTamTruGiayTamTru,
                noiThuongTruGiayTamTru, tuNgayGiayTamTru, denNgayGiayTamTru, lyDoGiaytamTru);
        //canBoNhapLieu_controller.taoGiayTamTru(tamTruRecord);

            //tạo giấy đăng ký sử dụng nhà văn hóa--------------------
        int idGiayDangKySuDungNhaVanHoa = 2;
        Date ngayToChucSuDungNhaVanhoa = Date.valueOf("2029-07-10");
        String loaiSuKienSuDungNhaVanHoa = "dam cuoi";
        int phiSuDungNhaVanHoa = 10000;
        String ghiChu = null;
        dangKySuDungNhaVanHoa dangKySuDungNhaVanHoaRecord = new dangKySuDungNhaVanHoa(idGiayDangKySuDungNhaVanHoa,
                ngayToChucSuDungNhaVanhoa, loaiSuKienSuDungNhaVanHoa, phiSuDungNhaVanHoa, ghiChu);
        //canBoNhapLieu_controller.taoGiayDangKySuDungNhaVanHoa(dangKySuDungNhaVanHoaRecord);

            //tạo giấy thêm nhân khẩu---------------------------------
        //int idGiayDangKyThemNhanKhau = 1;
        dangKyThemNhanKhau dangKyThemNhanKhauRecord = new dangKyThemNhanKhau(DEFAULT_ID, 1, Date.valueOf("2030-12-12"),
                "asd", "asd", 1, Date.valueOf("2030-12-12"), "asd", 2,
                "asd", "asd", "asd", "asd", "asd", "asd",
                "asd", "asd", "asd", Date.valueOf("2030-12-12"),
                false, false, "asd");
        //canBoNhapLieu_controller.taoGiayThemNhanKhau(dangKyThemNhanKhauRecord);

            //tạo sổ hộ khẩu------------------------------------------
        int idGiayDangKyThemHoKhau = 1;
        int idChuHoThemHoKhau = 1;
        String maKhuVucThemHoKhau = "200000";
        String diaChiThemHoKhau = "Quang Linh";
        Date ngayLapThemHoKhau = Date.valueOf("2029-07-10");
        Date ngayKhaiThemHoKhau = null;
        int idNguoiKhaiThemHoKhau = 1;
        dangKyThemHoKhau dangKyThemHoKhauRecord = new dangKyThemHoKhau(idGiayDangKyThemHoKhau, idChuHoThemHoKhau,
                maKhuVucThemHoKhau, diaChiThemHoKhau, ngayLapThemHoKhau, ngayKhaiThemHoKhau, idNguoiKhaiThemHoKhau);
        //canBoNhapLieu_controller.taoSoHoKhau(dangKyThemHoKhauRecord);

            //tạo giấy sửa nhân khẩu----------------------------------
        int idGiayDangKySuaNhanKhau = 1;
        int idNguoiKhaiSuaNhanKhau = 1;
        int idNguoiDuocSua = 1;
        Date ngayKhaiSuaNhanKhau = Date.valueOf("2023-02-05");
        String hoTenMoi = null;
        String bietDanhMoi = null;
        int soCMTMoi = 2201;
        Date ngayCapCMTMoi = null;
        String noiCapCMTMoi = null;
        int namSinhMoi = 2000;
        String gioiTinhMoi = "Thang vai lon";
        String noiSinhMoi = null;
        String danTocMoi = null;
        String tonGiaoMoi =  null;
        String quocTichMoi = null;
        String nguyenQuanMoi = null;
        String noiThuongTruMoi = null;
        String ngheNghiepMoi = null;
        String noiLamViecMoi = null;
        Date ngayDangKyThuongTruMoi = null;
        boolean tamTruMoi = false;
        boolean tamVangMoi = false;
        String ghiChuMoi = null;

        dangKySuaNhanKhau dangKySuaNhanKhauRecord = new dangKySuaNhanKhau(idGiayDangKySuaNhanKhau,
                idNguoiKhaiSuaNhanKhau, idNguoiDuocSua, ngayKhaiSuaNhanKhau, hoTenMoi, bietDanhMoi, soCMTMoi,
                ngayCapCMTMoi, noiCapCMTMoi, namSinhMoi, gioiTinhMoi, noiSinhMoi, danTocMoi, tonGiaoMoi, quocTichMoi,
                nguyenQuanMoi, noiThuongTruMoi, ngheNghiepMoi, noiLamViecMoi, ngayDangKyThuongTruMoi, tamTruMoi,
                tamVangMoi, ghiChuMoi);
        //canBoNhapLieu_controller.taoGiaySuaNhanKhau(dangKySuaNhanKhauRecord);


            //tạo giấy sửa hộ khẩu------------------------------------
        int idGiayDangKySuaHoKhau = 1;
        int idHoKhauSua = 1;
        int idChuHoMoi = 2;
        String diaChiMoi = "Hai Phong";
        Date ngayThayDoiSuaHoKhau = Date.valueOf("2030-10-01");
        int idNguoiKhaiSuaHoKhau = 1;

        dangKySuaHoKhau dangKySuaHoKhauRecord = new dangKySuaHoKhau(idGiayDangKySuaHoKhau, idHoKhauSua, idChuHoMoi,
                diaChiMoi, ngayThayDoiSuaHoKhau, idNguoiKhaiSuaHoKhau);
        //canBoNhapLieu_controller.taoGiaySuaHoKhau(dangKySuaHoKhauRecord);

            //tạo giấy xóa nhân khẩu----------------------------------
        int idGiayDangKyXoaNhanKhau = 1;
        int idNguoiKhaiXoaNhanKhau = 1;
        int idNguoiBiXoa = 199;
        Date ngaykhaiXoaNhanKhau = null;
        Date ngayXoaNhanKhau = null;
        String noiChuyenXoaNhanKhau = null;
        String ghiChiXoaNhanKhau = null;
        dangKyXoaNhanKhau dangKyXoaNhanKhauRecord = new dangKyXoaNhanKhau(idGiayDangKyXoaNhanKhau, idNguoiKhaiXoaNhanKhau,
                idNguoiBiXoa, ngaykhaiXoaNhanKhau, ngayXoaNhanKhau, noiChuyenXoaNhanKhau, ghiChiXoaNhanKhau);
        //canBoNhapLieu_controller.taoGiayXoaNhanKhau(dangKyXoaNhanKhauRecord);

            //tạo giấy xóa hộ khẩu------------------------------------
        int idGiayDangKyXoaHoKhau = 1;
        int idHoKhauXoa = 199;
        String lyDoXoaHoKhau = null;
        Date ngayKhaiXoaHoKhau = null;
        int idNguoiKhai = 1;
        dangKyXoaHoKhau dangKyXoaHoKhauRecord = new dangKyXoaHoKhau(idGiayDangKyXoaHoKhau, idHoKhauXoa, lyDoXoaHoKhau,
                ngayKhaiXoaHoKhau, idNguoiKhai);
        //canBoNhapLieu_controller.taoGiayXoaHoKhau(dangKyXoaHoKhauRecord);


        //----------------------cán bộ nhà văn hóa test-------------------------//

            //thống kê cơ sở vật chất
        String categoryCSVC = "hienTrang";
        String categoryValueCSVC = "xau";
        canBoNhaVanHoa_controller canBoNhaVanHoaController = new canBoNhaVanHoa_controller();
        ArrayList<coSoNhaVanHoa> dsCoSo = canBoNhaVanHoaController.thongKeCoSoVatChatNhaVanHoa();

        for(coSoNhaVanHoa cs: dsCoSo)
        {
            System.out.println(cs.getIdDoDung() + " - " + cs.getTenDoDung() + " - " + cs.getSoLuong() + "\n");
        }

            //sửa cơ sở vật chất nhà văn hóa
        int idDoDungSuaCSVC = 1;
        String tenDoDungSuaCSVC = "luoc chai long trym";
        String hienTrangCapNhat = "xau";
        int soLuongCapNhat = 10;
        String ghiChuCapNhat = "can sua chua";

        coSoNhaVanHoa coSoCapNhat = new coSoNhaVanHoa(idDoDungSuaCSVC, tenDoDungSuaCSVC, hienTrangCapNhat, soLuongCapNhat, ghiChuCapNhat);
        //canBoNhaVanHoaController.suaCoSoVatChatNhaVanHoa(coSoCapNhat);

            //xóa cơ sở vật chất nhà văn hóa
                int idCSVCXoa = 3;
                //canBoNhaVanHoaController.xoaCoSoVatChatNhaVanHoa(idCSVCXoa);


            //thêm cơ sở vật chất nhà văn hóa
        Integer idDoDung = 3;
        String tenDoDung = "ong bo ve sinh";
        String hienTrang = "tot";
        coSoNhaVanHoa coSo = new coSoNhaVanHoa(idDoDung, tenDoDung, hienTrang, null, null);
        //canBoNhaVanHoaController.themCoSoVatChatNhaVanHoa(coSo);
            //thống kê sự kiện nhà văn hóa
        ArrayList<suKienNhaVanHoa> suKienNhaVanHoas = new ArrayList<suKienNhaVanHoa>();
        suKienNhaVanHoas = canBoNhaVanHoaController.thongKeSuKienNhaVanHoa();
        for(suKienNhaVanHoa sk: suKienNhaVanHoas)
        {
            System.out.println(sk.getIdSuKien() + " - " + sk.getLoaiSuKien());
        }
        //-----------------------------tổ trưởng test---------------------------//

            //thống kê nhân khẩu
        String category="hoten";
        String categoryValue = "Duong";
        toTruongController toTruongController = new toTruongController();
        ArrayList<nhanKhau> dsNhanKhau = toTruongController.thongKeNhanKhau();

        for(nhanKhau nk: dsNhanKhau)
        {
            System.out.println(nk.getIdNhanKhau() + " - " + nk.getHoTen() + "\n");
        }

            //phê duyệt nhà văn hóa
        //boolean pheDuyetNVHCheck = toTruongController.pheDuyetNhaVanHoa(true, 2);
/*        if(pheDuyetNVHCheck == true)
        {
            System.out.println("them thanh cong");
        }
        else
        {
            System.out.println("Them that bai");
        }*/

            //kiểm tra lịch sử nhân khẩu
        ArrayList<lichSuNhanKhau> dsLichSuNhanKhau = new ArrayList<lichSuNhanKhau>();
        int idNhanKhauTruyVan = 1;
        dsLichSuNhanKhau = toTruongController.lichSuThayDoiNhanKhau(idNhanKhauTruyVan);
        for(lichSuNhanKhau ls: dsLichSuNhanKhau)
        {
            System.out.println(ls.getIdNhanKhau() + " - " + ls.getLoaiThayDoi() + " - " + ls.getNgayThayDoi() + "\n" );
        }
    }
}
