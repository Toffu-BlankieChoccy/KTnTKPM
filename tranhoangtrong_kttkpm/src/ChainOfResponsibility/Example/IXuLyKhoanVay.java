package ChainOfResponsibility.Example;

public interface IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon(IXuLyKhoanVay XLKhoanVay);
    String xuLyVay(int tienVay);
}
