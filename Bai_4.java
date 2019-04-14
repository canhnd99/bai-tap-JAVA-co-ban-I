/*
    Bài tập 4: Viết chương trình tính n!.
        Định nghĩa: n! = 1.2.3...(n-1).n
                VD: 5! = 1.2.3.4.5
            +) Cách 1: Sử dụng vòng lặp (ý tưởng sẽ giống như bài 3)
            +) Cách 2: Sử dụng đệ quy.
 */
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_4 {

    private int n;

    public static void factorialUsingLoop(Bai_4 b4) {
        
        int fac = 1;
        int n = b4.n;

        // Nhập vào n
        System.out.print("Enter n: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        // Kiểm tra xem n có hợp lệ không.
        while (n < 0) {
            System.out.println("n must be greater than 0!");
            System.out.print("Enter n: ");
            n = scan.nextInt();
        }
        
        // Tính n!
        for(int i = 2; i <= n; i++){
            fac = fac * i;
        }

        System.out.println(n + "! = " + fac);
    }
    
    // Sử dụng giải thuật đệ quy.
    public static int factorialUsingRecursion(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorialUsingRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        
        Bai_4 bai4 = new Bai_4();
        factorialUsingLoop(bai4);
        
        System.out.println(3 + "!= " + factorialUsingRecursion(3));

    }
}
