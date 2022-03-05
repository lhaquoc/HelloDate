package chapter.everythingisobject.exercises;
import static net.mindview.util.Print.*;

class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

public class Cartoon extends Drawing {
	public Cartoon() {
		print("Cartoon constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x = new Cartoon();
	}
}
