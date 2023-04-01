/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class StringDemo {

    public static void main(String[] args) {
        String truong = "FPT POLYTECHNIC";
        // toLowerCase(): chuyển string thành viết thường toàn bộ
        System.out.println(truong.toLowerCase());
        String hoVaTen = "  vu thi thuy     ";
        // toUpperCase(): chuyển string thành viết hoa toàn bộ
        System.out.println(hoVaTen.toUpperCase());
        // length(): lấy ra độ dài của String
        System.out.println("Độ dài họ và tên là:" + hoVaTen.length());
        // equals(): so sánh giá trị chuỗi có phân biệt hoa thường
        if (hoVaTen.toLowerCase().trim().equals("Vu Thi Thuy".toLowerCase().trim())) {
            System.out.println("Tên giống nhau");
        }
        // equalsIgnoreCase(): so sánh giá trị string không biệt hoa thường
        if (hoVaTen.equalsIgnoreCase("Vu Thi Thuy")) {
            System.out.println("If2 - Tên giống nhau");
        }
        // trim(): cắt các ký tự trắng ở cả 2 đầu string
        String email = "thuyvt66@fe.edu.vn";
        // contains() : kiểm tra string có chứa ký tự hay không
        if (email.contains("@")) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email phải chứa @");
        }
        String soDienThoai = "0903299690";
        // startWiths(): kiểm tra string có bắt đầu bằng ký tự ... hay không
        if (soDienThoai.startsWith("090")) {
            System.out.println("nhà mạng mobi");
        } else if (soDienThoai.startsWith("091")) {
            System.out.println("Nhà mạng vina");
        } else if (soDienThoai.startsWith("097")) {
            System.out.println("Nhà mạng viettel");
        }
        // endWiths(): kiểm tra string có kết thúc bằng ký tự ... hay không
        // substring(beginIndex): lấy ra chuỗi con trong chuỗi gốc
        System.out.println("Cắt chuỗi từ index 8 đến hết:" + email.substring(8));
        // substring(beginIndex, endIndex): lấy ra chuỗi con từ beginIndex đến endIndex
        System.out.println("Cắt chuỗi từ index 2 đến 9:" + email.substring(2, 9));
        // split(): tách chuỗi thành mảng
        String[] ten = hoVaTen.trim().split(" ");
        for (int i = 0; i < ten.length; i++) {
            System.out.println(ten[i]);
        }
        Scanner sc = new Scanner(System.in);
        // matches(): kiểm tra có đúng định dạng hay không
        System.out.println("Nhập tuổi:");
        String tuoi = sc.nextLine();
        if (tuoi.matches("[0-9]+")) { // \d: tương đương [0-9]
            System.out.println("Nhập đúng tuổi");
        } else {
            System.out.println("Nhập sai định dạng tuổi");
        }
        System.out.println("Nhập điểm:");
        String diem = sc.nextLine();
        if (diem.matches("^\\d+(\\.\\d+)?")) {
            System.out.println("Nhập đúng điểm");
        } else {
            System.out.println("Nhập sai điểm");
        }
        // [a-z A-Z 0-9]+ // chuỗi ký tự
    }

}
