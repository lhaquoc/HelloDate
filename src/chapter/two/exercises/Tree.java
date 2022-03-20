package chapter.two.exercises;

import static net.mindview.util.Print.print;

public class Tree {
	int height;

	Tree() {
		print("Planting a seedling");
		this.height = 0;
	}

	Tree(int initialHeight) {
		this.height = initialHeight;
		print("Creating new Tree that is " + this.height + " feet tall");
	}

	void info() {
		print("Tree is " + this.height + " feet tall");
	}

	void info(String s) {
		print(s + " : Tree is " + this.height + " feet tall");
	}
}
