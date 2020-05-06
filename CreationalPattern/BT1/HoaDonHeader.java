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
public class HoaDonHeader {
    String MaHoaDon,NgayBan, TenKhachHang;

    protected HoaDonHeader(Builder builder) {
        this.MaHoaDon = builder.MaHoaDon;
        this.NgayBan = builder.NgayBan;
        this.TenKhachHang = builder.TenKhachHang;
    }

    @Override
    public String toString() {
        return "Mã hóa đơn: "+MaHoaDon+"\n"+"Ngày bán: "+NgayBan+"\n"+"Tên khách hàng: "+TenKhachHang+"\n";
    }
    public static class Builder
      {
      String MaHoaDon,NgayBan, TenKhachHang;

      public Builder() {
      }
      public Builder addMaHoaDon(String maHoaDon)
      {
          this.MaHoaDon = maHoaDon;
          return this;
      }
      public Builder addNgayBan(String ngayBan)
      {
          this.NgayBan = ngayBan;
          return this;
      }
      public Builder addTenKhachHang(String tenKhachHang)
      {
          this.TenKhachHang = tenKhachHang;
          return this;
      }
      public HoaDonHeader build()
      {
          return new HoaDonHeader(this);
      }
      }  
}
