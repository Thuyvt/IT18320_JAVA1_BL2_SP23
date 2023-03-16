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
public class SinhVien {
    // Khai báo thuộc tính của đối tượng
    private String ten;// private chỉ tồn tại trong class
    int namSinh;// default: cùng pakage sẽ truy cập được
    protected String email;// proteced: khác pakage nhưng có kế thừa vẫn truy cập được
    public double diemTb;// public có thể truy cập được ở bất cứ đâu
    
    // Hàm khởi tạo - constructor
    // Contructor
    public SinhVien() {
    }
    
    // Hàm khởi tạo - có tham số
    public SinhVien(String ten, int namSinh, String email, double diemTb) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.email = email;
        this.diemTb = diemTb;
    }
    // Getter thuộc tính ten
    public String getTen(){
        return this.ten;
    }
    // Setter thuộc tính ten
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }
    
    // Phương thức
    public void inThongTin() {
        System.out.printf("Ten %s, nam sinh %d, email %s, diemTb %.2f\n", 
                this.ten, this.namSinh, this.email, this.diemTb);
    }
    
    public double tinhDiem(int loaiSv, int soMon) {
        double diemTongKet = this.diemTb / soMon;
        return diemTongKet;
    } 
    
    public double tinhDiem(String loaiSv, int soMon) {
        if (loaiSv.equalsIgnoreCase("IT")) {
            return this.diemTb/ soMon;
        } else if (loaiSv.equalsIgnoreCase("DG")) {
            return this.diemTb * 0.9 /soMon; 
        } else {
            return this.diemTb;
        }
        
    }
}
