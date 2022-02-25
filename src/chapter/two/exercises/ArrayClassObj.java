package chapter.two.exercises;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("Length of a = " + a.length);
		for(int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(500);
		print(Arrays.toString(a));
	}

}
