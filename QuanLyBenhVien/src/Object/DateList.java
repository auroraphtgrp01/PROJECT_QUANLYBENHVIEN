package Object;

public class DateList {
    private String ma, ten, ngayNhap, ngayXuat;
    int soNgayConLai;

    public DateList(String ma, String ten, String ngayNhap, String ngayXuat, int soNgayConLai) {
        this.ma = ma;
        this.ten = ten;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
        this.soNgayConLai = soNgayConLai;
    }

    public int getSoNgayConLai() {
        return soNgayConLai;
    }

    public void setSoNgayConLai(int soNgayConLai) {
        this.soNgayConLai = soNgayConLai;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

}
