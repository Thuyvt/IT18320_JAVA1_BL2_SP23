/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChucNang cn = new ChucNang();
        while (true) {
            System.out.println("============MENU========");
            System.out.println("1. Thông tin gia đình");
            System.out.println("2. Tính điểm trung bình");
            System.out.println("3. Tính tiền");
            System.out.println("4. Thông tin dãy số phong thủy");
            System.out.println("0. Thoat");
            System.out.println("====================");
            System.out.print("Nhap chuong trinh can chay:");
            String menu = sc.nextLine();
            switch (menu) {
                case "1" -> {
                    cn.inThongTin();
                    break;
                }
                case "2" -> {
                    cn.tinhDiem();
                    break;
                }
                case "3" -> {
                    cn.tinhtien();
                    break;
                }
                case "4" -> {
                    cn.nhapSoPhongThuy();
                    break;
                }
                case "0" -> {
                    System.exit(0);
                }
            }
        }
    }
}
