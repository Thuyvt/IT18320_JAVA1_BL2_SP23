/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class OnTap {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
                    inThongTin();
                    break;
                }
                case "2" -> {
                    break;
                }
                case "3" -> {
                    break;
                }
                case "4" -> {
                    break;
                }
                case "0" -> {
                    System.exit(0);
                }
            }
        }
    }

    // Bai 1
    static void inThongTin() {
        System.out.println("Nhap ten bo:");
        String tenBo = sc.nextLine();
        System.out.println("Nhap tuoi bo:");
        int tuoiBo = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten me:");
        String tenMe = sc.nextLine();
        int tuoiMe = Integer.parseInt(sc.nextLine());
        System.out.printf("Ten bo: %s - tuoi: %d", tenBo, tuoiBo);
        System.out.printf("Ten me: %s, tuoi: %d", tenMe, tuoiMe);
    }
}
