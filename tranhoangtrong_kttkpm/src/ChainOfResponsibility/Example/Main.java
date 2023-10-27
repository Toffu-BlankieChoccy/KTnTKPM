package ChainOfResponsibility.Example;

import structural.decorator.clc_bieuthuc.Nhan;

public class Main {
    public static void main(String[] args) {

        IXuLyKhoanVay nv1 = new NhanVien("Tieu K", "Nhan vien quen",200);
        IXuLyKhoanVay nv2 = new NhanVien("Tieu Ngu", "Nhan vien khong quen",500);
        IXuLyKhoanVay nv3 = new NhanVien("Sieu Nhan", "Nhan vien cap 1",700);
        IXuLyKhoanVay giamDoc = new GiamDoc("Dai K", 700);

        nv1.capCaoHon(nv2);
        nv2.capCaoHon(nv3);
        nv3.capCaoHon(giamDoc);
        System.out.println(nv1.xuLyVay(250));
    }
}
