package behaviour.strategy.BaiCC2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Trong",new Date(), 6f);
        SinhVien sv2 = new SinhVien("Trong",new Date(), 6f);
        QLSV qlsv = new QLSV();
        qlsv.dsSV.add(sv1);
        qlsv.dsSV.add(sv2);
        qlsv.sapXep(new SoSanhTheoDiem());
        qlsv.inDS();


    }
}
