package chapter.two.exercises;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("Overloaded method");
		}
		new Tree();
	}

}
