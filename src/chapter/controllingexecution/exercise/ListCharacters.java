package chapter.controllingexecution.exercise;

import static net.mindview.util.Print.print;

public class ListCharacters {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                print("value: " + (int) c + " character: " + c);
    }

}
