package oop.baitap.quanlysinhvien;

import java.util.Objects;

public class SinhVien {
    private String maSoSinhVien;
    private String hoTen;
    private Ngay ngaySinh;
    private float diemTrungBinh;
    private Lop lopHoc;

    public SinhVien(String maSoSinhVien, String hoTen, Ngay ngaySinh, float diemTrungBinh, Lop lopHoc) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lopHoc = lopHoc;
    }

    public String getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(String maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(Lop lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String LayTenKhoa() {
        return this.lopHoc.getTenKhoa();
    }

    public boolean KiemTraLenLop() {
        return this.diemTrungBinh >= 5.0f;
    }

    public boolean KiemTraCungNgaySinh(SinhVien sinhVienKhac) {
        return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
    }
}
