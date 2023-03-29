/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo class QLDT
        QLDT ql = new QLDT();
        while (true) {
            System.out.println("1. Nhập danh sách đối tượng");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính tổng tiền phải trả");
            System.out.println("4. Hiển thị thông tin vị trí của loại thuốc có giá cao nhất");
            System.out.println("5. Hiển thị thông tin các loại thuốc có loại là viên");
            System.out.println("6. Xóa những loại thuốc không phải thuốc theo đơn và giá > 100");
            System.out.println("0. Thoát");
            System.out.println("Nhập chương trình cần chạy");
            int chuongTrinh = Integer.parseInt(sc.nextLine());
            switch (chuongTrinh) {
                case 1 -> {
                    ql.nhap();
                    // C2: new QLDT().nhap();
                    break;
                }
                case 2 -> {
                    ql.xuat();
                    break;
                }
                case 3 -> {
              
                    break;
                }
                case 4 -> {
                   
                    break;
                }
                case 5 -> {
                   
                    break;
                }
                case 6 -> {
                   
                    break;
                } 
                case 0 -> {
                    System.exit(0);
                } 
                default -> {
                    System.out.println("Nhập sai, yêu cầu nhập lại");
                }
            }
        }
    }
}
