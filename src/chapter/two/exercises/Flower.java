/**
 * 
 */
package chapter.two.exercises;
import static net.mindview.util.Print.*;
/**
 * @author anhquoc
 *
 */
public class Flower {

	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals) {
		this.petalCount = petals;
		print("Constructor w/ int arg only. PetalCount = " + this.petalCount);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f = new Flower(5);
		System.gc();
	}

}
