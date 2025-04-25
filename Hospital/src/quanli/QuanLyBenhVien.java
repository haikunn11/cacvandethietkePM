package quanli;

public class QuanLyBenhVien {
    public static void main(String[] args) {
        BacSi bacSi1 = new BacSi("Dr. A");
        BacSi bacSi2 = new BacSi("Dr. B");

        BenhNhan benhNhan1 = new BenhNhan("Nguyen Van An");
        BenhNhan benhNhan2 = new BenhNhan("Le Thi Binh");

        bacSi1.themBenhNhan(benhNhan1);
        bacSi1.themBenhNhan(benhNhan2);
        bacSi2.themBenhNhan(benhNhan1);

        bacSi1.hienThiDanhSach();
        bacSi2.hienThiDanhSach();
    }
}
