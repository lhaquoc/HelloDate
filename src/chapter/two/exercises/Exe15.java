package chapter.two.exercises;
import static net.mindview.util.Print.print;

class Sample {
	String s;
	{
		s = "Initializing string in Sample";
		print("s :" + s);
	}
	Sample() {
		print("Sample()");
	}
}

public class Exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample();
	}

}
