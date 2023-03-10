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
public class ChucNang {

    Scanner sc = new Scanner(System.in);

    // Bai 1
    public void inThongTin() {
        String tenBo = nhapGiaTri("tên bố");
        int tuoiBo = Integer.parseInt(nhapGiaTri("tuổi bố"));
        String tenMe = nhapGiaTri("tên mẹ");
        int tuoiMe = Integer.parseInt(nhapGiaTri("tuổi mẹ"));
        System.out.printf("Ten bo: %s - tuoi: %d", tenBo, tuoiBo);
        System.out.printf("Ten me: %s, tuoi: %d", tenMe, tuoiMe);
    }

    // Bai 2
    public void tinhDiem() {
        double toan = Double.parseDouble(nhapGiaTri("điểm toán"));
        double van = Double.parseDouble(nhapGiaTri("điểm văn"));
        double anh = Double.parseDouble(nhapGiaTri("điểm anh"));
        double tb = (toan + van + anh) / 3;
        if (tb >= 8 && tb <= 10) {
            System.out.println("Học lực giỏi");
        } else if (tb >= 6) {
            System.out.println("Học lực khá");
        } else if (tb >= 4) {
            System.out.println("Học lực trung bình");
        } else if (tb < 4) {
            System.out.println("Học lực yếu");
        }
    }

    public String nhapGiaTri(String thongBao) {
        System.out.print("Nhập " + thongBao + ": ");
        return sc.nextLine();
    }

    public void tinhtien() {
        int gbd, gkt;
        do {
            System.out.print("Moi nhap vao gio bat dau: ");
            gbd = sc.nextInt();
            System.out.print("Moi nhap vao gio ket thuc: ");
            gkt = sc.nextInt();
            if (gbd < 12 || gkt > 23) {
                System.out.print("Chung toi chi hoat dong tu 12h den 23h.Vui long nhap lai!\n");
            }
        } while (gbd < 12 || gkt > 23);
        System.out.println("Tong tien can thanh toan la: " + tinhtoan(gbd, gkt));
    }

    public double tinhtoan(int gbd, int gkt) {
        double total;
        int h = gkt - gbd;
        if (h <= 3) {
            total = h * 150000;
        } else {
            total = (3 * 150000) + (h - 3) * 150000 * 0.7;
        }
        if (gbd >= 14 && gbd <= 17) {
            total = total * 0.9;
        }
        return total;
    }

    public void nhapSoPhongThuy() {
        int n = Integer.parseInt(nhapGiaTri("số lượng"));
        int[] mang = new int[n];
        // Nhập giá trị cho mảng
        for (int i = 0; i < mang.length; i++) {
            // C1
            mang[i] = Integer.parseInt(nhapGiaTri("phần tử thứ" + i));
            // C2
//            System.out.println("Nhập phần tử thứ " + i);
//            mang[i] = sc.nextInt();
        }
        // Hiển thị
        System.out.print("\nMảng vừa nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d", mang[i]);
        }
        System.out.print("\nMảng vừa nhập là:");
        for (int so : mang) {
            System.out.printf("%d", so);
        }
        // Các số chia hết cho 3
        System.out.print("\nCác số chia hết cho 3 là:");
        for (int so : mang) {
            if (so % 3 == 0) {
                System.out.printf("%d", so);
            }
        }
        // Tìm max
        int max = mang[n-1];
        for (int i = n - 1; i >= 0; i--) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất của dãy phong thủy là:" + max);
    }

}
