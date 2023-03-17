/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyTraSua {

    Scanner sc = new Scanner(System.in);
    // Khai báo đối tượng trà sữa
    TraSua ts;
    // Khai báo mảng đối tượng
    TraSua[] mangTS;

    public void nhap() {
        // C1: tạo riêng lẻ từng giá trị 
        System.out.print("Nhập tên:");
        String ten = sc.nextLine();
        System.out.print("Nhập thể loại:");
        int theLoai = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá:");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng:");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập 0-đá/1-nóng:");
        boolean nong = Boolean.parseBoolean(sc.nextLine());

        // 1: tạo bằng contructor không tham số
//        ts = new TraSua();
//        ts.setTen(ten);
//        ts.setTheLoai(theLoai);
//        ts.setGia(gia);
//        ts.setSoLuong(soLuong);
//        ts.setNong(nong);
        // 2: tạo bằng contructor có tham số
        ts = new TraSua(ten, theLoai, gia, soLuong, nong);
    }

    public void nhapMang() {
        System.out.print("Nhập số lượng phần tử:");
        int soLuong = Integer.parseInt(sc.nextLine());
        mangTS = new TraSua[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập tên:");
            String ten = sc.nextLine();
            System.out.print("Nhập thể loại:");
            int theLoai = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá:");
            double gia = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập số lượng:");
            int sl = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập 0-đá/1-nóng:");
            boolean nong = Boolean.parseBoolean(sc.nextLine());

            TraSua t = new TraSua(ten, theLoai, gia, sl, nong);
            mangTS[i] = t;            
        }
    }
    
    public void hienThiMang() {
        if (mangTS.length <= 0) {
            System.out.println("Mảng không có giá trị");
        } else {
            for (TraSua t : mangTS) {
                System.out.println(t.inThongTin());
            }
        }
    }
    public void tinhTong() {
        if (mangTS.length <= 0) {
            System.out.println("Mảng không có giá trị");
        } else {
            double tong = 0;
            for (TraSua t : mangTS) {
                tong += t.getGia() * t.getSoLuong();
            }
            System.out.println("Tổng tiền phải trả là:"  + tong);
        }
    }
}
