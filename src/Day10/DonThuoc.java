/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

/**
 *
 * @author ThuyVT
 */
public class DonThuoc {    
    private String ten;
    private int soLuong;
    private String loai;
    private double gia;
    private String hang;
    private String moTa;
    private boolean theoDon;

    public DonThuoc() {
    }

    public DonThuoc(String ten, int soLuong, String loai, double gia, String hang, String moTa, boolean theoDon) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.loai = loai;
        this.gia = gia;
        this.hang = hang;
        this.moTa = moTa;
        this.theoDon = theoDon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isTheoDon() {
        return theoDon;
    }

    public void setTheoDon(boolean theoDon) {
        this.theoDon = theoDon;
    }
    
    public void inThongTin() {
        System.out.printf("Tên: %s, số lượng: %d, loại: %s, giá: %.2f, "
                + "hãng: %s, mô tả: %s, là thuốc theo đơn: %s, tiền: %.2f, đánh giá: %s \n", 
                this.ten, this.soLuong, this.loai, this.gia,
                this.hang, this.moTa, this.theoDon, tinhTien(), danhGia());
    }
    
    public double tinhTien() {
        return this.gia * this.soLuong;
    }
    
    public String danhGia() {
        return this.gia >= 50 ? "Đắt" : "Rẻ";
    }
}
