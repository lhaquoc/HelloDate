/**
 * Exercise 5
 */
package chapter.two.exercises;

import static net.mindview.util.Print.print;

/**
 * @author anhquoc
 *
 */
public class Dog {
	public Dog() {}

	void bark() {
		print("quiet");
	}

	void bark(char c) { print("cawcaw"); }
	void bark(byte b) { print("barkbark"); }
	void bark(short c) { print("slurpslurp"); }
	void bark(int i) { print("iyow"); }
	void bark(long l) { print("lalala"); }
	void bark(float f) { print("fififoofum"); }
	void bark(double d) { print("dodo"); }
	void bark(char c, int i) { print("caw-iyow"); }
	void bark(int i, long l) { print("iyow-lalala"); }
}
