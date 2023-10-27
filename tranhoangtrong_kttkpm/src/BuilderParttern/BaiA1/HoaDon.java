package BuilderParttern.BaiA1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthds = builder.cthds;
    }

    @Override
    public String toString() {
        return "Thông tin hóa đơn: \n" +
                "Hóa đơn header: \n" + hoaDonHeader +
                "\nChi tiết hóa đơn: \n" + cthds;
    }

    public static class Builder{
        HoaDonHeader hoaDonHeader;
        List<CTHD> cthds = new ArrayList<>();

        Builder setHoaDon(String m,String n,String t)
        {
            hoaDonHeader = new HoaDonHeader(m,n,t);
            return this;
        }
        Builder setCTHoaDon(String sp,int sl,float dg, float ck)
        {
            cthds.add(new CTHD(sp,sl,dg,ck));
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
