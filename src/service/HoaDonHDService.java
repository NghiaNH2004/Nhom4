package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HoaDonHD;

public class HoaDonHDService {

    public List<HoaDonHD> getHoaDonQuanLy( ) {
        String sql = """
            SELECT [ID_HoaDon]
                  ,[ID_Nhanvien]
                  ,[MaKhachHang]
                  ,[Ngaytao]
                  ,[MaGioHang]
                  ,[TongTien]
                  ,[Thanhtien]
                  ,[TienKhachTra]
                  ,[TienTraLai]
                  ,[ghichu]
                  ,[Trangthai]
              FROM [dbo].[HoaDon] 
                    """;
        List<HoaDonHD> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonHD hd = new HoaDonHD();
                hd.setIdHoaDon(rs.getString(1));
                hd.setIdNhanVien(rs.getString(2));
                hd.setMaKhachHang(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));
                hd.setMaGioHang(rs.getString(5));
                hd.setTongTien(rs.getInt(6));
                hd.setThanhTien(rs.getInt(7));
                hd.setTienKhachTra(rs.getInt(8));
                hd.setTienTralai(rs.getInt(9));
                hd.setGhiChu(rs.getString(10));
                hd.setTrangThai(rs.getBoolean(11));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
