import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args){
        Scanner scacnner = new Scanner(System.in);
        QuanLiSinhVien qlsv = new QuanLiSinhVien();
//        qlsv.layThongTinSv();
        qlsv.nhapDuLieu(scacnner);
        qlsv.dTb();
        qlsv.xepLoai();
        qlsv.XuatThongTin();
        System.out.println("Điểm trung bình: "+qlsv.getDtb());
        System.out.println("Xếp loại: "+qlsv.getxL());


    }
}
