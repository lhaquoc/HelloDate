package oop.baitap.quanlysach;

public class QuanLySach {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ngay ngay1 = new Ngay(15, 5, 2022);
        Ngay ngay2 = new Ngay(15, 5, 2022);
        Ngay ngay3 = new Ngay(15, 5, 2023);

        TacGia tacGia1 = new TacGia("Quoc", ngay1);
        TacGia tacGia2 = new TacGia("Quoc", ngay2);
        TacGia tacGia3 = new TacGia("Quoc", ngay3);

        Sach sach1 = new Sach("Lap trinh java", 50000, 2022, tacGia1);
        Sach sach2 = new Sach("Lap trinh C", 100000, 2022, tacGia2);
        Sach sach3 = new Sach("Lap trinh TypeScript", 150000, 2023, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        System.out.println("So sanh NXB sach1 va sach3: " + sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("So sanh NXB sach1 va sach2: " + sach1.kiemTraCungNamXuatBan(sach2));

        System.out.println("Gia sach1 sau khi giam: " + sach1.giaSauKhiGiam(10));
    }
}
