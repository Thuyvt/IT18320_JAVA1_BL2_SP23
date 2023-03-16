/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        // tạo đối tượng = constructor có tham số
        SinhVien sv1 = new SinhVien("Vũ Thị Thúy", 1993, "thuyvt66@fpt.edu.vn", 8.7);
        System.out.println(sv1.getTen());
        System.out.println(sv1.getNamSinh());
        System.out.println(sv1.getEmail());
        System.out.println(sv1.getDiemTb());
        // Gọi phương thức của đối tượng
        sv1.inThongTin();
        // tạo ra đối tượng = từ khóa new
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Nguyễn Anh Duy");
        sv2.setNamSinh(2004);
        sv2.setEmail("duyna21@fpt.edu.vn");
        sv2.setDiemTb(8.5);
        sv2.inThongTin();
        System.out.printf("Điểm tổng kết là %.2f", sv2.tinhDiem("DG", 3));
        System.out.printf("Điểm tổng kết là %.2f", sv2.tinhDiem(4, 2));
        
    }
}
