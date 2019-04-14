/*
Bài tập 3: Liệt kê các số tự nhiên, các số chẵn, các số lẻ nhỏ hơn n và tính tổng của chúng.
            Ý tưởng: Sử dụng vòng lặp for (while) để duyệt từ 0 -> n.
                    +) Nếu chia hết cho 2 --> số chẵn. Nếu không thì là số lẻ
                    +) Để tính tổng thì cần một biến S = 0 
                        --> mỗi lần lặp ta cộng dồn i vào S (i là biến chạy) --> return S sau khi lặp xong.
 */
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_3 {

    private int n;

    public static Scanner scan = new Scanner(System.in);

    // Lấy giá trị đầu vào n.
    public static void getInput(Bai_3 b3) {
        System.out.print("nhap vao n:");
        b3.n = scan.nextInt();
    }

    public static int sumOffAllNumbers(Bai_3 b3) {
        int Sum = 0;
        for (int i = 0; i < b3.n; i++) {
            Sum = Sum + i;
        }
        return Sum;
    }

    public static int sumOffEvenNumbers(Bai_3 b3) {
        int Sum = 0;
        for (int i = 0; i < b3.n; i++) {
            if (i % 2 == 0) {
                Sum = Sum + i;
            }
        }
        return Sum;
    }

    public static int sumOffOddNumbers(Bai_3 b3) {
        int Sum = 0;
        for (int i = 0; i < b3.n; i++) {
            if (i % 2 != 0) {
                Sum = Sum + i;
            }
        }
        return Sum;
    }

    public static void main(String[] args) {

        Bai_3 bai3 = new Bai_3();
        getInput(bai3);
        int choice;
        System.out.println("1-tong cac tu nhien");
        System.out.println("2-tong cac so chan");
        System.out.println("3-tong cac so le");
        System.out.println("lua chon: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Tong cac so tu nhien nho n:" + sumOffAllNumbers(bai3));
                break;
            case 2:
                System.out.println("Tong cac so chan nho n:" + sumOffEvenNumbers(bai3));
                break;
            case 3:
                System.out.println("Tong cac so le nho n:" + sumOffOddNumbers(bai3));
                break;
        }

    }
}
