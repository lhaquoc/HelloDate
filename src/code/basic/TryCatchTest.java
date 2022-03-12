package code.basic;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TryCatchTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int i;
//        float f;
//        try {
//            i = Integer.parseInt("10");
//            f = Float.parseFloat("4.5a");
//            System.out.println(i);
//            System.out.println(f);
//            int value = 10 / 0;
//            System.out.println(value);
//        } catch (NumberFormatException e) {
//            // TODO Auto-generated catch block
//            System.out.println(e);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }

        // Tạo một mảng 10 các số nguyên ngẫu nhiên
//        int randomIntNumbers[] = new int[10];
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            randomIntNumbers[i] = rand.nextInt(100);
//        }

        // Cho người dùng nhập một số nguyên và in ra màn hình
        // phần tử mảng tương ứng
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Bạn muốn in ra phần tử mảng thứ mấy? ");
//            int index = input.nextInt();
//            System.out.println("OK, phần tử mảng thứ " + index + " mang giá trị " + randomIntNumbers[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // TODO Auto-generated catch block
//            System.out.println(e);
//        } catch (InputMismatchException e) {
//            System.out.println(e);
//        }

        try {
            Scanner input = new Scanner(System.in);
            Integer intNumber = null;
            System.out.println("Hãy nhập vào một số nguyên: ");
            String strNumber = input.nextLine();
            intNumber = new Integer(strNumber);
            System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập vào một số nguyên");
        }

    }
}