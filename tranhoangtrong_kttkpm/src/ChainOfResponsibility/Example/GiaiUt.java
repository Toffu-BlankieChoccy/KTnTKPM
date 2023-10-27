package ChainOfResponsibility.Example;

import ChainOfResponsibility.VeSo.IDoVeSo;

public class GiaiUt implements IDoVeSo {
    String tenGiai;
    String[] soTrungThuong;

    public GiaiUt(String tenGiai, String[] soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }

    @Override
    public IDoVeSo giaiKeTiep(IDoVeSo keTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for(String s:soTrungThuong)
            if(veSo.endsWith(s))
                return "Bạn đã trúng giải "+tenGiai;
        return "Chúc bạn may mắn lần sau.";
    }
}
