/**
 * 
 */
package oop.baitap.quanlybophim;

/**
 * @author anhquoc
 *
 */
public class BoPhim {
    private int namSanXuat;
    private String tenPhim;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public BoPhim(int namSanXuat, String tenPhim, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
        this.namSanXuat = namSanXuat;
        this.tenPhim = tenPhim;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean KiemTraGiaVeReHon(BoPhim phimKhac) {
        return this.giaVe < phimKhac.giaVe;
    }

    public String LayTenHangSanXuatPhim() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    double GiaVeSauKhuyenMai(double phanTram) {
        return this.giaVe * (1 - phanTram / 100);
    }
}
