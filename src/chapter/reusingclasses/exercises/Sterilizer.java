package chapter.reusingclasses.exercises;
import static net.mindview.util.Print.print;

public class Sterilizer extends Detergent {

	@Override
    public void scrub() {
		append(" Sterilizer.scrub() ");
	}

	public void sterilize() {
		append(" sterilize() ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sterilizer sterilizer = new Sterilizer();
		sterilizer.dilute();
		sterilizer.apply();
		sterilizer.scrub();
		sterilizer.foam();
		sterilizer.sterilize();
		print(sterilizer);
		print("Testing base class:");
		Detergent.main(args);
	}

}
