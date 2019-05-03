/*
    Bài tập 9: Viết chương trình in ra hình chữ nhật đặc kích thước m*n.
               VD: 5*4
               *  *  *  *  *
               *  *  *  *  *
               *  *  *  *  *
               *  *  *  *  *
               --> ý tưởng: sử dụng vòng lặp lồng nhau for hoặc while
 */
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_9 extends Thread {

    private int chieu_dai;
    private int chieu_rong;

    public static Scanner scan = new Scanner(System.in);

    public static void printRectangle(Bai_9 b9) {
        int dai = b9.chieu_dai;
        int rong = b9.chieu_rong;
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Bai_9 bai9 = new Bai_9();
        System.out.print("Nhập chiều dài: ");
        bai9.chieu_dai = scan.nextInt();
        System.out.print("Nhập chiều rộng: ");
        bai9.chieu_rong = scan.nextInt();
        printRectangle(bai9);
    }
}
