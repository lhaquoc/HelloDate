package chapter.string.exercises;

import static net.mindview.util.Print.print;

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String q = "Howdy";
        print(q);
        String qq = upcase(q);
        print(qq);
    }

}
