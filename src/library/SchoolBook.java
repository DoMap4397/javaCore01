package library;

import java.util.Scanner;

public class SchoolBook extends Library{
    private int soTrang;
    private String tinhTrang;
    private int soLuongMuon;
    public SchoolBook(String maSach, String tenSach, String nhaXuatBan, int soLuong, String viTri) {
        super(maSach, tenSach, nhaXuatBan, soLuong, viTri);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner scanner = new Scanner(System.in);
        soTrang = Integer.valueOf(scanner.nextLine());
    }

    public int bookAvail() {
        return getSoLuong() - soLuongMuon;
    }
}
