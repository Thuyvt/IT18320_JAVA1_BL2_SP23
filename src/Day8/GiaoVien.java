/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

/**
 *
 * @author ThuyVT
 */
public class GiaoVien {

    private String maGv;
    private String hoTen;
    private double diem;

    public GiaoVien() {
    }

    public GiaoVien(String maGv, String hoTen, double diem) {
        this.maGv = maGv;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String xepLoai() {
        if (this.diem >= 70 ) {
            return "Tốt";
        } else if (this.diem >= 50) {
            return "Trung Bình";
        } else  {
            return "Yếu";
        }
    }
}
