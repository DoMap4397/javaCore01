package library;

public class Library {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soLuong;
    private String viTri;

    public Library(String maSach, String tenSach, String nhaXuatBan, int soLuong, String viTri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void inputData() {

    }

    @Override
    public String toString() {
        return maSach + " _ " + tenSach + nhaXuatBan;
    }
}
