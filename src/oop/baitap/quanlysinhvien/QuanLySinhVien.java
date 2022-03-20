package oop.baitap.quanlysinhvien;

public class QuanLySinhVien {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ngay ngaySinh1 = new Ngay(12, 5, 1989);
        Ngay ngaySinh2 = new Ngay(12, 5, 1989);
        Ngay ngaySinh3 = new Ngay(17, 11, 1995);

        Lop lopHoc1 = new Lop("Lap Trinh Huong Doi Tuong", "CNTT");
        Lop lopHoc2 = new Lop("Lap Trinh CSDL", "CNTT");
        Lop lopHoc3 = new Lop("Lap Trinh Nhung", "DDT");

        SinhVien sv1 = new SinhVien("08ABC123", "Tran Van A", ngaySinh1, 4.2f, lopHoc1);
        SinhVien sv2 = new SinhVien("09ABC009", "Le Van B", ngaySinh2, 7.87f, lopHoc2);
        SinhVien sv3 = new SinhVien("15ABC421", "Nguyen Van C", ngaySinh3, 9.21f, lopHoc3);

        System.out.println("sv1 thuoc khoa: " + sv1.LayTenKhoa());
        System.out.println("sv2 thuoc khoa: " + sv2.LayTenKhoa());
        System.out.println("sv3 thuoc khoa: " + sv3.LayTenKhoa());

        System.out.println("sv1 len lop: " + sv1.KiemTraLenLop());
        System.out.println("sv2 len lop: " + sv2.KiemTraLenLop());
        System.out.println("sv3 len lop: " + sv3.KiemTraLenLop());

        System.out.println("Kiem tra cung ngay sinh:");
        System.out.println("sv1 va sv2: " + sv1.KiemTraCungNgaySinh(sv2));
        System.out.println("sv1 va sv3: " + sv1.KiemTraCungNgaySinh(sv3));
        System.out.println("sv2 va sv3: " + sv2.KiemTraCungNgaySinh(sv3));
    }

}
