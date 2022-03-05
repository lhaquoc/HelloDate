package chapter.controllingexecution.exercise;

import static net.mindview.util.Print.print;

public class Exercise {
    public static void CalculateSumEven(int maxValue) {
        int sumEven = 0;
//        int i = 1;
//        while (i < maxValue) {
//            if (i % 2 == 0)
//                sumEven += i;
//            i++;
//        }
        for (int i = 1; i < maxValue; i++) {
            if (i % 2 == 0)
                sumEven += i;
        }
        print("Sum of Even numbers: " + sumEven);
    }

    public static void FindPrimeNumber(int maxValue) {
//        int sumPrime = 0;
//        int i = 2;
//        while (i < maxValue) {
//            int count = 0;
//            int j = 1;
//            while (j <= i) {
//                if (i % j == 0)
//                    count++;
//                j++;
//            }
//            if (count == 2) {
//                print(i);
//                sumPrime += i;
//            }
//            i++;
//        }
        for (int i = 2; i < maxValue; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    count++;
            if (count == 2)
                print(i);
        }

//        print(sumPrime);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CalculateSumEven(100);
        FindPrimeNumber(100);
    }

}
