package oop.baitap.quanlybophim;

public class QuanLyBoPhim {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ngay ngayChieu1 = new Ngay(5, 5, 2022);
        Ngay ngayChieu2 = new Ngay(14, 9, 2022);
        Ngay ngayChieu3 = new Ngay(22, 10, 2022);

        HangSanXuat hangSX1 = new HangSanXuat("Phe Phim", "Viet Nam");
        HangSanXuat hangSX2 = new HangSanXuat("Holiquyt", "My");
        HangSanXuat hangSX3 = new HangSanXuat("YamahaSuzuki", "Nhat Ban");

        BoPhim boPhim1 = new BoPhim(2018, "Nguoi Cho", hangSX1, 120000, ngayChieu1);
        BoPhim boPhim2 = new BoPhim(2014, "Nhung ke huy diet", hangSX2, 330000, ngayChieu2);
        BoPhim boPhim3 = new BoPhim(2009, "Kham pha Nhat Ban", hangSX3, 220000, ngayChieu3);

        System.out.println("So sanh gia boPhim1 < boPhim2: " + boPhim1.KiemTraGiaVeReHon(boPhim2));
        System.out.println("So sanh gia boPhim1 < boPhim3: " + boPhim1.KiemTraGiaVeReHon(boPhim3));
        System.out.println("So sanh gia boPhim2 < boPhim3: " + boPhim2.KiemTraGiaVeReHon(boPhim3));

        System.out
                .println("Hang san xuat cua bo phim " + boPhim1.getTenPhim() + " : " + boPhim1.LayTenHangSanXuatPhim());
        System.out
                .println("Hang san xuat cua bo phim " + boPhim2.getTenPhim() + " : " + boPhim2.LayTenHangSanXuatPhim());
        System.out
                .println("Hang san xuat cua bo phim " + boPhim3.getTenPhim() + " : " + boPhim3.LayTenHangSanXuatPhim());
        System.out.println(
                "Gia ve bo phim " + boPhim1.getTenPhim() + " sau khi khuyen mai: " + boPhim1.GiaVeSauKhuyenMai(10));
        System.out.println(
                "Gia ve bo phim " + boPhim2.getTenPhim() + " sau khi khuyen mai: " + boPhim2.GiaVeSauKhuyenMai(10));
        System.out.println(
                "Gia ve bo phim " + boPhim3.getTenPhim() + " sau khi khuyen mai: " + boPhim3.GiaVeSauKhuyenMai(10));
    }
}
