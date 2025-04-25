package quanli;

import java.util.ArrayList;
import java.util.List;

public class BacSi {
    private String ten;
    private List<BenhNhan> danhSachBenhNhan;

    public BacSi(String ten) {
        this.ten = ten;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public List<BenhNhan> getDanhSachBenhNhan() {
        return danhSachBenhNhan;
    }

    public void themBenhNhan(BenhNhan benhNhan) {
        if (!danhSachBenhNhan.contains(benhNhan)) {
            danhSachBenhNhan.add(benhNhan);
            benhNhan.themBacSi(this); // Gắn ngược lại
        }
    }

    public void hienThiDanhSach() {
        System.out.println("Bác sĩ " + ten + " đang điều trị các bệnh nhân:");
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println("- " + bn.getTen());
        }
    }
}

