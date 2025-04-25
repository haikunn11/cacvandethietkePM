package quanli;

import java.util.ArrayList;
import java.util.List;

public class BenhNhan {
    private String ten;
    private List<BacSi> danhSachBacSi;

    public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public List<BacSi> getDanhSachBacSi() {
        return danhSachBacSi;
    }

    public void themBacSi(BacSi bacSi) {
        if (!danhSachBacSi.contains(bacSi)) {
            danhSachBacSi.add(bacSi);
            bacSi.themBenhNhan(this); 
        }
    }
}

