
package Model;

public class GiamGiaChiTiet1 {

    private int idgiamgia;
    private String idsp;
    private int phantramgiam;

    public GiamGiaChiTiet1() {
    }

    public GiamGiaChiTiet1(int idgiamgia, String idsp, int phantramgiam) {
        this.idgiamgia = idgiamgia;
        this.idsp = idsp;
        this.phantramgiam = phantramgiam;
    }

    public int getidgiamgia() {
        return idgiamgia;
    }

    public void setidgiamgia(int idgiamgia) {
        this.idgiamgia = idgiamgia;
    }

    public String getidSP() {
        return idsp;
    }

    public void setidSp(String tensp) {
        this.idsp = tensp;
    }

    public int getPhantramgiam() {
        return phantramgiam;
    }

    public void setPhantramgiam(int phantramgiam) {
        this.phantramgiam = phantramgiam;
    }

    @Override
    public String toString() {
        return  phantramgiam +"%";
    }

}
