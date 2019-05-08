/*
    Bài tập 10: Viết chương trình in ra hình chữ nhật rỗng kích thước m*n.
               
               --> ý tưởng: sử dụng vòng lặp lồng nhau for hoặc while
                VD: 5*4

                   j=0         j=4
               i=0  *  *  *  *  *
                    *           *
                    *           *
               i=3  *  *  *  *  *
*/
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_10 {
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int wid, len;
        int i, j;
        System.out.println("Enter wid: ");
        wid = scan.nextInt();
        System.out.println("Enter len: ");
        len = scan.nextInt();
        
        // in ra man hinh hinh chu nhat rong
        for(i = 0; i < wid; i++){
            for(j = 0; j < len; j++){
                if(i == 0 || i == wid-1 || j == 0 || j == len-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
