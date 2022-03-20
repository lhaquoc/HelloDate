package chapter.two.exercises;
import static net.mindview.util.Print.print;

class Cup {
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		print("Cups()");
	}
}

public class ExplicitStatic {
	public static void main(String[] args) {
		Cups.cup1.f(99);

	}
}
