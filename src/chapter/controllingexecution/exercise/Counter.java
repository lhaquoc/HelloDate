package chapter.controllingexecution.exercise;

import static net.mindview.util.Print.print;

public class Counter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i <= 100; i++)
            print("i = " + i);
        int count = 0;
        while (count <= 100) {
            print("count = " + count);
            count += 1;
        }
    }
}
