
/*
    Bài tập 6: Viết chương trình tính tổng S(n) = 1 + 1/2 + 1/3 + ... + 1/n 
               Cách 1: Sử dụng vòng lặp ( for hoặc while ).
               Cách 2: Sử dụng giải thuật đệ quy.
*/

package BaiTapLan_I;

import java.util.Scanner;

public class Bai_6 {
    
    private int n;
    
    public static Scanner scan = new Scanner(System.in);
    
    // su dung vong lap.
    public static void Sum(Bai_6 b6){
        int n = b6.n;
        float sum = 0;
        
        System.out.print("Enter n: ");
        n = scan.nextInt();
        
        // tinh tong
        for(int i = 1; i <= n; i++){
            sum = sum + (float) 1/i;
        }
        
        System.out.println("SUM IS:" + sum);
        
    }
    
    // su dung giai thuat de qui
    public static float sumUsingRecusion(int n){
        if(n == 1){
            return 1;
        }else{
            return (float) 1/n + sumUsingRecusion(n-1);
        }
    }
    
    public static void main(String[] args) {
        
        // in ra ket qua bang vong lap
        Bai_6 bai6 = new Bai_6();
        Sum(bai6);
        
        // in ra ket qua bang de qui
        System.out.println("SUM IS: " + sumUsingRecusion(2));
    }
}
