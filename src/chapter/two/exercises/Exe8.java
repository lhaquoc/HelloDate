/* Create a class with two methods. Within the first method, call the
* second method twice: the first time without using this, and the second time
* using this - just to see it working; you should not use this form in 
* practice.
*/
package chapter.two.exercises;
import static net.mindview.util.Print.*;
/**
 * @author anhquoc
 *
 */
public class Exe8 {
	void firstMethod() {
		print("Call the second method from first method, not use this and use this");
		secondMethod();
		this.secondMethod();
	}
	
	void secondMethod() {
		print("-Second method");
	}
}
