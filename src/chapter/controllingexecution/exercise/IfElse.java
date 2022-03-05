package chapter.controllingexecution.exercise;

import static net.mindview.util.Print.print;

public class IfElse {

    static int result = 0;

    static void test(int testValue, int target) {
        if (testValue > target)
            result = +1;
        else if (testValue < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }

}
