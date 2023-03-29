/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QLDT {

    ArrayList<DonThuoc> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        String nhapTiep;
        do {
            System.out.println("Nhập tên:");
            String ten = sc.nextLine();
            System.out.println("Nhập số lượng:");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập loại:");
            String loai = sc.nextLine();
            System.out.println("Nhập giá:");
            double gia = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập hãng");
            String hang = sc.nextLine();
            System.out.println("Nhập mô tả:");
            String moTa = sc.nextLine();
            System.out.println("Có phải thuốc theo đơn không:");
            boolean theoDon = Boolean.parseBoolean(sc.nextLine());
            // tạo đối tượng bằng contructor có tham số
            DonThuoc dt = new DonThuoc(ten, soLuong, loai, gia, hang, moTa, theoDon);
            // thêm đối tượng vào mảng
            arr.add(dt);
            System.out.println("Nhập tiếp không y(yes)- n(no):");
            nhapTiep = sc.nextLine();
        } while (nhapTiep.equalsIgnoreCase("yes") || nhapTiep.equalsIgnoreCase("y"));
    }

    // Xuất thông tin
    public void xuat() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (DonThuoc dt : arr) {
                dt.inThongTin();
            }
        }
    }

    // tính tổng tiền 
    public void tinhTong() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            double tongTien = 0;
            for (DonThuoc dt : arr) {
                tongTien += dt.tinhTien();
            }
            System.out.println("Tổng tiền của đơn thuốc là " + tongTien);
        }
    }

    // hiển thị thông tin thuốc có giá cao nhất
    public void thuocMax() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            // Giả sử thuốc có giá lớn nhất ở vị trí đầu tiên
            DonThuoc max = arr.get(0);
            int viTriMax = 0;
            for (int i = 0; i < arr.size(); i++) {
                // Nếu giá max < giá của phần tử tại vị trí đang xét
                if (max.getGia() < arr.get(i).getGia()) {
                    max = arr.get(i); // thay đổi max = phần tử tại vị trí đang xét
                    viTriMax = i; // thay đổi vị trí max = vị trí đang xét
                }
            }

            System.out.println("Vị trí thuốc có giá cao nhất" + viTriMax);
        }
    }

    // hiển thị thông tin thuốc có loại là viê
    public void hienThiVien() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (DonThuoc dt : arr) {
                if (dt.getLoai().equalsIgnoreCase("vien") || dt.getLoai().equalsIgnoreCase("viên")) {
                    dt.inThongTin();
                }
            }
        }
    }
    // 6. Xóa những loại thuốc không phải thuốc theo đơn và giá &gt; 100
    public void xoa() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).isTheoDon() && arr.get(i).getGia() > 100) {
                    arr.remove(i);
                }
            }
            // hiển thị lại 
            xuat();
        }
    }
}
