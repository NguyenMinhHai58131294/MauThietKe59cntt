/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author admin
 */
public class CTHD {
    String SanPham;
    int SoLuong;
    float DonGia, ChietKhau;

    protected CTHD(Builder builder) {
        this.SanPham = builder.SanPham;
        this.SoLuong = builder.SoLuong;
        this.DonGia = builder.DonGia;
        this.ChietKhau =builder.ChietKhau;
    }

    @Override
    public String toString() {
        return "Tên Sản Phẩm: "+SanPham+"\n"+"Số Lượng: "+SoLuong+"\n"+"Đơn giá: "+DonGia+"\n"+"Chiết khấu: "+ChietKhau
                +"\n";
    }
    public static class Builder
        {
            String SanPham;
            int SoLuong;
            float DonGia, ChietKhau;
            public Builder addSanPham(String sanPham)
            {
                this.SanPham = sanPham;
                return this;
            }
            public Builder addSoLuong(int soLuong)
            {
                this.SoLuong = soLuong;
                return this;
            }
            public Builder addDonGia(float donGia)
            {
                this.DonGia = donGia;
                return this;
            }
            public Builder addChietKhau(float chietKhau)
            {
                this.ChietKhau = chietKhau;
                return this;
            }
            public CTHD build()
            {
                return new CTHD(this);
            }
            
        }
}
