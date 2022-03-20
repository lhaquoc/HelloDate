package chapter.two.exercises;

import static net.mindview.util.Print.print;

class Go {
	static String s1 = "run";
	static String s2, s3;
	static {
		s2 = "drive car";
		s3 = "fly plane";
		print("s2 & s3 initialized");
	}
	static void how() {
		print(s1 + " or " + s2 + " or " + s3);
	}

	Go() {
		print("Go()");
	}
}

public class Exe14 {
	public static void main(String[] args) {
		print("Inside main()");
		Go.how();
		print("Go.s1: " + Go.s1);
	}
	static Go g1 = new Go();
	static Go g2 = new Go();
}
