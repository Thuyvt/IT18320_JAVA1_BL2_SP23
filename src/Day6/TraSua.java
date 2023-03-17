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
public class TraSua {
    // Thuộc tính đối tượng
    private String ten;
    private int theLoai; // 1: truyền thống, 2: kem chese
    private double gia;
    private int soLuong;
    private boolean nong; // true: nóng, false: đá
    
    // Constructor không tham số
    public TraSua() {
    }
    
    // Constructor có tham số
    public TraSua(String ten, int theLoai, double gia, int soLuong, boolean nong) {
        this.ten = ten;
        this.theLoai = theLoai;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nong = nong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(int theLoai) {
        this.theLoai = theLoai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isNong() {
        return nong;
    }

    public void setNong(boolean nong) {
        this.nong = nong;
    }
    
    // in thông tin trà sữa
    public String inThongTin() {
        return "Tên:" + this.ten + 
                "- thể loại: " + (this.theLoai == 1 ? " truyền thống" : " kem chese") +
                "- giá: " + this.gia +
                "- số lượng: " + this.soLuong +
                "- " + (this.nong == true ? "nóng" : "đá");
    }
    
}
