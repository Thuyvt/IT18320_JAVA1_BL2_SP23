/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // Tạo mảng động
        ArrayList<String> arrStr = new ArrayList<>();
        // add() thêm phần tử vào mảng
        arrStr.add("java 1");
        arrStr.add("java 2");
        arrStr.add("12");
        arrStr.add("C");
        // Duyệt mảng
        for (String str : arrStr) {
            System.out.print(str + " ");
        }
        // Mảng động lưu trữ đối tượng
        ArrayList<GiaoVien> arrGv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int traLoi;
        do {            
            GiaoVien gv = new GiaoVien();
            System.out.println("Nhập mã:");
            gv.setMaGv(sc.nextLine());
            System.out.println("Nhập họ và tên:");
            gv.setHoTen(sc.nextLine());
            System.out.println("Nhập điểm:");
            gv.setDiem(Double.parseDouble(sc.nextLine()));

            // thêm đối tượng gv vào mảng
            arrGv.add(gv);
            System.out.println("Có tiếp tục nhập hay không 1/có-2/không");
            traLoi = Integer.parseInt(sc.nextLine());
        } while (traLoi == 1);
        // duyệt mảng để hiển thị
        for (int i = 0; i < arrGv.size(); i++) {
            // get(index): lấy ra phần tử tại vị trí đang xét
            GiaoVien item = arrGv.get(i);
            System.out.println("Tên:" + item.getHoTen());
            System.out.println("Mã:" + item.getMaGv());
            System.out.println("Điểm:" + item.getDiem());
        }
        // remove() : xóa các đối tượng trong array
        // 1: xóa với giá trị đối tượng
        arrStr.remove("java 1");
        System.out.println(arrStr);
        // 2: Xóa với index đối tượng
        // xóa phần tử thứ 1 khỏi arr
        // index = 1 - 1= 0
//        arrGv.remove(0);
        // xóa các giáo viên < 50
        for (int i = 0; i < arrGv.size(); i++) {
            if (arrGv.get(i).getDiem() < 50) {
                arrGv.remove(i);
            }
        }
        // duyệt mảng để hiển thị
        for (int i = 0; i < arrGv.size(); i++) {
            // get(index): lấy ra phần tử tại vị trí đang xét
            GiaoVien item = arrGv.get(i);
            System.out.println("Tên:" + item.getHoTen());
            System.out.println("Mã:" + item.getMaGv());
            System.out.println("Điểm:" + item.getDiem());
        }
    }
}
