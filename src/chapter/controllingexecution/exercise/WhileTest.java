package chapter.controllingexecution.exercise;

import static net.mindview.util.Print.print;

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        while (condition())
            print("Inside 'while'");
        print("Outside 'while'");
    }

}
