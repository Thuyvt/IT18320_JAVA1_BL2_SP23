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
public class Day2 {

    public static void main(String[] args) {
        String traLoi;
        do {            
            System.out.println("Ngay 2");
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ten:");
            String ten = sc.nextLine();
            // C1: Xoa bo nho dem du thua = sc.nextLine();
//        System.out.print("Nhap tuoi:");
//        int tuoi = sc.nextInt();
//        sc.nextLine();
            // C2: ep kieu du lieu thong qua wrapper
            System.out.print("Nhap tuoi:");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap email:");
            String email = sc.nextLine();
            System.out.printf("Ten toi la %s, nam nay toi %d, email la %s\n",
                    ten, tuoi, email);
            System.out.println("Nhap tiep hay khong co / khong:");
            traLoi = sc.nextLine();
        } while (traLoi.equalsIgnoreCase("co") || traLoi.equalsIgnoreCase("c"));
    }
}
