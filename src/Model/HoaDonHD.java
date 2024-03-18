package model;

import java.util.Date;

public class HoaDonHD {

    private String idHoaDon;
    private String idNhanVien;
    private String maKhachHang;
    private Date ngayTao;
    private String maGioHang;
    private int tongTien;
    private int thanhTien;
    private int tienKhachTra;
    private int tienTralai;
    private String ghiChu;
    private Boolean trangThai;
    private String tenSP;
    private String tenKhachHang;
    private int giaBan;
    private String iMei;

    public HoaDonHD() {
    }

    public HoaDonHD(String idHoaDon, String idNhanVien, String maKhachHang, Date ngayTao, String maGioHang, int tongTien, int thanhTien, int tienKhachTra, int tienTralai, String ghiChu, Boolean trangThai, String tenSP, String tenKhachHang, int giaBan, String iMei) {
        this.idHoaDon = idHoaDon;
        this.idNhanVien = idNhanVien;
        this.maKhachHang = maKhachHang;
        this.ngayTao = ngayTao;
        this.maGioHang = maGioHang;
        this.tongTien = tongTien;
        this.thanhTien = thanhTien;
        this.tienKhachTra = tienKhachTra;
        this.tienTralai = tienTralai;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.tenSP = tenSP;
        this.tenKhachHang = tenKhachHang;
        this.giaBan = giaBan;
        this.iMei = iMei;
    }

    @Override
    public String toString() {
        return "Hoadon{" + "idHoaDon=" + idHoaDon + ", idNhanVien=" + idNhanVien + ", maKhachHang=" + maKhachHang + ", ngayTao=" + ngayTao + ", maGioHang=" + maGioHang + ", tongTien=" + tongTien + ", thanhTien=" + thanhTien + ", tienKhachTra=" + tienKhachTra + ", tienTralai=" + tienTralai + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + ", tenSP=" + tenSP + ", tenKhachHang=" + tenKhachHang + ", giaBan=" + giaBan + ", iMei=" + iMei + '}';
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getTienKhachTra() {
        return tienKhachTra;
    }

    public void setTienKhachTra(int tienKhachTra) {
        this.tienKhachTra = tienKhachTra;
    }

    public int getTienTralai() {
        return tienTralai;
    }

    public void setTienTralai(int tienTralai) {
        this.tienTralai = tienTralai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getiMei() {
        return iMei;
    }

    public void setiMei(String iMei) {
        this.iMei = iMei;
    }

    

}
