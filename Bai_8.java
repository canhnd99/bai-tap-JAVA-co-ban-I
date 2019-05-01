/*
    Bài tập 8: Viết chương trình in ra bảng cửu chương.
    ý tưởng: sử dụng hai vòng lặp lồng nhau.
 */
package BaiTapLan_I;

public class Bai_8 {
    public static void main(String[] args) {
        int i = 2;
        while(i <= 9){
            int j = 1;
            while(j <= 9){
                System.out.println(i + "*" + j + "=" + i*j);
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
