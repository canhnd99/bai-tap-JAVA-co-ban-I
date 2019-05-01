/*
    Bài tập 7: Viết chương trình in ra một menu đơn giản
*/
package BaiTapLan_I;

import java.util.Scanner;

public class Bai_7 {
    
    private boolean tiep_tuc;
    private int chon_mon; 
    private static int tong_tien;
    private static int tien;
    private int x;
    
    public static Scanner scan = new Scanner(System.in);
    
    // hiển thị menu cho khách hàng lựa chọn.
    public static void Menu(){
        System.out.println("-------------Nhà Hàng 3.P-------------");
        System.out.println("    1. Bún chả - 20k");
        System.out.println("    2. Bún đậu mắm tôm - 25k");
        System.out.println("    3. Bún mọc - 20k");
        System.out.println("    4. Bún sườn bò - 30k");
    }
    
    // trả về lựa chọn (món ăn) của khách hàng.
    public static int ChonMon(Bai_7 b7){
        int chon_mon = b7.chon_mon;
        System.out.println("--> Chon mon:");
        chon_mon = scan.nextInt();
        
        //kiểm tra xem món ăn có trong menu không?
        while(chon_mon != 1 && chon_mon != 2 && chon_mon != 3 && chon_mon != 4){
            System.out.println("Không có món này!");
            System.out.println("Chọn lại");
            chon_mon = scan.nextInt();
        }
        
        switch(chon_mon){
            case 1: 
                System.out.println("--> Bạn chọn bún chả.");
                break;
            case 2: 
                System.out.println("--> Bạn chọn bún đậu mắm tôm.");
                break;
            case 3: 
                System.out.println("--> Bạn chọn bún mọc.");
                break;
            case 4:
                System.out.println("--> Bạn chọn bún sườn bò.");
                break;
        }
        
        return chon_mon;
    }
    
    public static int ThanhTien(Bai_7 b7){
        int n = b7.x;
        
        switch (n) {
            case 1:
                b7.tien = b7.tien + 20;
                break;
            case 2:
                b7.tien = b7.tien + 25;
                break;
            case 3:
                b7.tien = b7.tien + 20;
                break;
            case 4:
                b7.tien = b7.tien + 30;
                break;
            default:
                break;
        }
        
        return b7.tien;
    }
    
    public static void main(String[] args) {
        Bai_7 bai7 = new Bai_7();
        Menu();// show ra menu.
        do {            
            bai7.x = ChonMon(bai7);
            bai7.tong_tien = ThanhTien(bai7);
            System.out.println("Tiếp tục chọn món?(1-yes , 0-no)");// hỏi xem khách hàng có chọn tiếp không
            int lua_chon;
            lua_chon = scan.nextInt();
            if(lua_chon == 1)
                bai7.tiep_tuc = true;
            else{
                bai7.tiep_tuc = false;
                System.out.println("-------------------------");
                System.out.println("Thành tiền: " + bai7.tong_tien + "k");
            }
        } while (bai7.tiep_tuc == true);
    }
}
