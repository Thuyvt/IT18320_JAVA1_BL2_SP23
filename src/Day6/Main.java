/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng, liên kết với phương thức bên class QuanLyTraSua
        QuanLyTraSua ql = new QuanLyTraSua();
//        // nhập
//        ql.nhap();
//        // hiển thị thông tin đối tượng
//        System.out.println("Tên:" + ql.ts.getTen());
//        System.out.println(ql.ts.inThongTin());
        // nhập mảng trà sữa
        ql.nhapMang();
        // hiển thị
        ql.hienThiMang();
        // tính tổng tiền phải trả cho mảng đã nhập
        ql.tinhTong();
        // B1: tính giá trung bình các món
        // B2: hiển thị các món có giá > 30k
    }
}
