package chapter.two.exercises;

import static net.mindview.util.Print.print;

public class Exe10 {

	boolean loggedIn = false;

	Exe10(boolean logStatus) {
		this.loggedIn = logStatus;
	}

	void Login() {
		this.loggedIn = true;
	}

	void LogOut() {
		this.loggedIn = false;
	}

	@Override
    protected void finalize() {
		if(this.loggedIn)
			print("Error: still logged in");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exe10 a = new Exe10(true);
		Exe10 b = new Exe10(true);
		a.LogOut();
		b.LogOut();
		new Exe10(true);
		// Force garbage collection
		System.gc();
	}

}
