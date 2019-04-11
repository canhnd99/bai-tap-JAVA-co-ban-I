package BaiTapLan_I;

import java.util.Scanner;


/*
    * Phương trình bậc hai là phương trình có dạng ax^2 + bx + c = 0 (a khác 0)
        Tính biệt thức: denta = b^2 - 4*a*c
            Nếu denta < 0 --> Phương trình vô nghiệm.
            Nếu denta == 0 --> Phương trình có nghiệm kép: x1 = x2 = -b / 2*a.
            Nếu denta > 0 --> Phương trình có hai nghiệm phân biệt:
                +) x1 = (-b + sqrt(denta)) / 2*a.
                +) x2 = (-b - sqrt(denta)) / 2*a.
 */
public class Bai_2 {

    public float a;
    public float b;
    public float c;

    public static Scanner scan = new Scanner(System.in);

    // Khoi tao cac gia tri dau vao (a, b, c)
    public static void khoiTao(Bai_2 bh) {

        do {
            System.out.print("nhap he so a:");
            bh.a = scan.nextFloat();
        } while (bh.a == 0);
        
        System.out.print("nhap he so b:");
        bh.b = scan.nextFloat();
        System.out.print("nhap he so c:");
        bh.c = scan.nextFloat();
    }

    public static void giaiPTBH(Bai_2 bh) {
        float denta = (bh.b) * (bh.b) - 4 * (bh.a) * (bh.c);
        if (denta < 0) {
            System.out.println("phuong trinh vo nghiem!");
        } else if (denta == 0) {
            System.out.println("phuong trinh co hai nghiem x1 = x2 = " + -((bh.b) / 2 * (bh.a)));
        } else {
            float x1 = (float) ((-(bh.b) + Math.sqrt(denta)) / (2 * bh.a));
            float x2 = (float) ((-(bh.b) - Math.sqrt(denta)) / (2 * bh.a));
            System.out.println("phuong trinh co hai nghiem phan biet x1 = " + x1 + " và x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Bai_2 bh = new Bai_2();
        khoiTao(bh);
        giaiPTBH(bh);
    }

}
