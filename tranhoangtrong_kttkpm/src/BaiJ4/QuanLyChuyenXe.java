package BaiJ4;

import BaiJ1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dscx = new ArrayList<>();
    public void them(ChuyenXe chuyenXe){
        dscx.add(chuyenXe);
    }

    public void inDS(){
        for(ChuyenXe cx : dscx)
        {
            System.out.println(cx.toString());
        }
    }
    int tinhDoanhThuXeNgoaiThanh(){
        int tong = 0;
        for(ChuyenXe c : dscx){
           if(c instanceof ChuyenXeNoiThanh)
               tong += c.doanhThu;
        }
        return tong;
    }

    int tinhDoanhThuXeNoiThanh(){
        int tong = 0;
        for(ChuyenXe c: dscx)
        {
            if(c instanceof ChuyenXeNgoaiThanh){
                tong+=c.doanhThu;
            }
        }
        return tong;
    }

    int tongDoanhThu(){
        return  tinhDoanhThuXeNgoaiThanh() + tinhDoanhThuXeNoiThanh();
    }
}
