/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyGiaoVien {

    // khai báo mảng
    GiaoVien[] mangGv;
    Scanner sc = new Scanner(System.in);

    // nhập
    public void nhap() {
        System.out.println("Nhập số lượng giảng viên;");
        int n = Integer.parseInt(sc.nextLine());
        // Tạo mảng có n giảng viên
        mangGv = new GiaoVien[n];
        for (int i = 0; i < n; i++) {
            GiaoVien gv = new GiaoVien();
            System.out.println("Nhập mã:");
            gv.setMaGv(sc.nextLine());
            System.out.println("Nhập họ và tên:");
            gv.setHoTen(sc.nextLine());
            System.out.println("Nhập điểm:");
            gv.setDiem(Double.parseDouble(sc.nextLine()));

            // gán đối tượng gv vào mảng tại vị trí đang xét
            mangGv[i] = gv;

        }
    }

    // xuất
    public void xuat() {
        for (GiaoVien item : mangGv) {
            System.out.println("================");
            System.out.println("Tên:" + item.getHoTen());
            System.out.println("Mã gv:" + item.getMaGv());
            System.out.println("Điểm:" + item.getDiem());
            System.out.println("Xếp loại:" + item.xepLoai());
            System.out.println("================");
        }
    }

}
