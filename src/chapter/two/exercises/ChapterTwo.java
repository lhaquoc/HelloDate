package chapter.two.exercises;

public class ChapterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			//new Rock();
			new Rock2(i);
		}
		String myString = null;
		String myString2 = "Hello";
		new Exe1(myString);
		new Exe2(myString2);

		// exercise 3
		new Exe3();

		// exercise 4
		new Exe4("This is exercise 4");

		// exercise 5
		Dog dog = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		int i = 0;
		dog.bark(c);
		dog.bark(b);
		dog.bark(s);
		dog.bark(i);
		dog.bark(1L);
		dog.bark(1f);
		dog.bark(1.0);

		// exercise 6
		dog.bark(c, i);
		dog.bark(i, 1L);

		// exercise 8
		Exe8 exe8 = new Exe8();
		exe8.firstMethod();
	}

}
