package ChainOfResponsibility.VeSo;

public interface IDoVeSo {
    IDoVeSo giaiKeTiep(IDoVeSo keTiep);
    String doVeSo(String veSo);
}
