import java.util.Scanner;

public class XeBuyt {
    private int maXe;
    private String nhanHieu;
    private int soChoNgoi;
    private int soKm;
    Scanner scanner = new Scanner(System.in);

    // ham tao rong
    // 1 class nếu ko có constructor thì java sẽ tạo 1 constructor mặc dinh public ko tham số
    // bất kì 1 construction nào có option thì mặc đinh này sẽ cancel
    public XeBuyt (){

    }
    public XeBuyt(int maXe, String nhanHieu, int soChoNgoi, int soKm) {
        this.maXe = maXe;
        this.nhanHieu = nhanHieu;
        this.soChoNgoi = soChoNgoi;
        this.soKm = soKm;
        // phuong thuc khoi dong
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    public int tinhTien(int soTien) {
        return soKm * soTien;
    }

    public void layThongTinXe() {
        System.out.println("Ma xe: " + maXe);
        System.out.println("Nhan hieu: " + nhanHieu);
        System.out.println("So cho ngoi: " + soChoNgoi);
        System.out.println("so Km: " + soKm);
    }

    public void nhapDulieu(Scanner scanner) {
        System.out.println("Nhap ma xe: ");
        maXe = scanner.nextInt();
        System.out.println("Nhap nhan hieu xe: ");
        nhanHieu = scanner.nextLine();
        System.out.println("Nhap so cho ngoi: ");
        soChoNgoi = scanner.nextInt();
        System.out.println("Nhap so km: ");
        soKm = scanner.nextInt();
    }
}
