
/*
    Bài tập 5: Viết chương trình tính tổng: S(n) = 1^2 + 2^2 + 3^2 + ... + n^2.
               Cách 1: Sử dụng vòng lặp ( for hoặc while ).
               Cách 2: Sử dụng giải thuật đệ quy.
 */
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_5 {

    private int n;

    public static void Sum(Bai_5 b5) {

        int n = b5.n;
        int S = 0;
        Scanner scan = new Scanner(System.in);

        // Thực hiện nhập vào số n.
        System.out.print("Enter n: ");
        n = scan.nextInt();

        // Kiểm tra xem n có hợp lệ hay không.
        while (n <= 0) {
            System.out.println("n must be greater than zero!");
            System.out.print("Enter n: ");
            n = scan.nextInt();
        }
        
        // Tính tổng S(n) = 1^2 + 2^2 + 3^2 + ... + n^2
        
        // Sử dụng vòng lặp for.
//        for(int i = 1; i <= n; i++){
//            S = S + i*i;
//        }
        // Sử dụng vòng lặp while.
        int j = 1;
        while (j <= n) {            
            S = S + j*j;
            j++;
        }
        
        // In ra kết quả.
        System.out.println("SUM 1^2 + 2^2 + ... + " + n + "^2 = " + S);
    }
    
    
    // SỬ Dụng Giải Thuật Đệ Quy.
    public static int sumUsingRecursion(int n){
        if(n == 1){
            return 1;
        }else{
            return (int) (Math.pow(n, 2) + sumUsingRecursion(n-1));
        }
    }

    public static void main(String[] args) {
//        Bai_5 bai5 = new Bai_5();
//        Sum(bai5);
        System.out.println("SUM IS: " + sumUsingRecursion(4));
    }
}
