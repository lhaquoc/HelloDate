package shapes;
import static net.mindview.util.Print.print;
public class HinhTron implements HinhHoc {
	protected String ten;
	protected float banKinh;

	// constructor
	public HinhTron(float banKinh) {
		this.ten = "";
		this.banKinh = banKinh;
	}

	@Override
	public float TinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * PI * banKinh;
	}

	@Override
	public float TinhDienTich() {
		// TODO Auto-generated method stub
		return PI * banKinh * banKinh;
	}

	@Override
	public float TinhTheTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void InThongTin() {
		// TODO Auto-generated method stub
		print(ten);
		print("Chu vi: " + TinhChuVi());
		print("Dien tich: " + TinhDienTich());
	}

}
