package ChainOfResponsibility.VeSo;

import ChainOfResponsibility.Example.GiaiUt;

public class MainDoVeSo {
    public static void main(String[] args) {
        IDoVeSo giaiTam = new GiaiUt("Giải tám", new String[] {"22"});
        GiaiThuong giaiThuong5 = new GiaiThuong("Giải năm", new String[]{"2122"});
        GiaiThuong giaiThuong4 = new GiaiThuong("Giải tư", new String[]{"03514", "88419","17221","78331","87167","61796","66330"});
        GiaiThuong giaiThuong3 = new GiaiThuong("Giải ba", new String[]{"50532", "32381"});
        GiaiThuong giaiThuong2 = new GiaiThuong("Giải nhì", new String[]{"44256"});
        GiaiThuong giaiThuong1 = new GiaiThuong("Giải nhất", new String[]{"19256"});
        GiaiThuong giaiDacBiet = new GiaiThuong("Giải đặc biệt", new String[]{"666666"});

        giaiDacBiet.giaiKeTiep(giaiThuong1)
                        .giaiKeTiep(giaiThuong2)
                                .giaiKeTiep(giaiThuong3)
                                        .giaiKeTiep(giaiThuong4)
                                                .giaiKeTiep(giaiThuong5)
                                                        .giaiKeTiep(giaiTam);

//        giaiDacBiet.doVeSo("319256");
        System.out.println(giaiDacBiet.doVeSo("309256"));
        System.out.println(giaiDacBiet.doVeSo("302122"));
    }
}
