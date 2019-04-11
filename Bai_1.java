package bai_1;

import java.util.Scanner;


/*
    * Phương trình bậc nhất là phương trình có dạng: ax + b = 0.
        TH1: Nếu a == 0 VÀ b == 0 thì phương trình có vô số nghiệm.
        TH2: Nếu a == 0 VÀ b != 0 thì phương trình vô nghiệm.
        TH3: Nếu a != 0 thì phương trình có nghiệm x = -b/a.
 */
public class Bai_1 {

    public float a;
    public float b;
    public float x;

    public static Scanner scan = new Scanner(System.in);

    // khoi tao gia tri cho hai he so a va b.
    public static void khoiTao(Bai_1 ptbn) {
        System.out.print("nhap he so a:");
        ptbn.a = scan.nextFloat();
        System.out.print("nhap he so b:");
        ptbn.b = scan.nextFloat();
    }

    // giai phuong trinh bac nhat.
    public static void giaiPTBN(Bai_1 ptbn) {
        if (ptbn.a == 0) {
            if (ptbn.b == 0) {
                System.out.println("phuong trinh co vo so nghiem!");
            } else {
                System.out.println("phuong trinh vo nghiem!");
            }
        } else {
            ptbn.x = -(ptbn.b / ptbn.a);
            System.out.println("phuong trinh co nghiem x = " + ptbn.x);
        }
    }

    public static void main(String[] args) {
        Bai_1 bn = new Bai_1();
        boolean tiep_tuc;
        do {
            khoiTao(bn);
            giaiPTBN(bn);
            System.out.print("Tiep tuc?(1-yes, 0-no):");
            int lua_chon;
            lua_chon = scan.nextInt();
            if(lua_chon == 1){
                tiep_tuc = true;
            }else{
                tiep_tuc = false;
            }
        } while (tiep_tuc == true);
    }
}
