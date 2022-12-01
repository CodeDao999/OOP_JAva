import java.util.Scanner;

public class QuanLiSinhVien {
    private String ten;
    private String mssv;
    private int diemToan;
    private int diemLy;
    private int diemHoa;

    private float dtb;

    private String xL="";

    public QuanLiSinhVien() {
    }

    public QuanLiSinhVien(String ten, String mssv , int diemToan, int diemLy, int diemHoa){
        this.ten=ten;
        this.mssv=mssv;
        this.diemHoa=diemHoa;
        this.diemLy=diemLy;
        this.diemToan=diemToan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public String getxL() {
        return xL;
    }

    public void setxL(String xL) {
        this.xL = xL;
    }

    public float dTb(){
        dtb = (diemHoa+diemLy+diemToan)/3;
        return dtb;
    }
//           public void layThongTinSv(){
//               System.out.println("Ten"+ten);
//               System.out.println("MSSV"+mssv);
//               System.out.println("Diem Toan"+diemToan);
//               System.out.println("Diem Hoa"+diemHoa);
//               System.out.println("Diem Ly"+diemHoa);
//           }
           public void nhapDuLieu(Scanner scanner){
               System.out.println("Nhap Ho va Ten: ");
               ten= scanner.nextLine();

               System.out.println("Nhap Ma so sinh vien: ");
               mssv=scanner.nextLine();

               System.out.println("Nhap diem Toan: ");
               diemToan=scanner.nextInt();

               System.out.println("Nhap diem Hoa: ");
               diemHoa=scanner.nextInt();

               System.out.println("Nhap diem Ly: ");
               diemLy= scanner.nextInt();
           }
           public String xepLoai() {
               if (dtb >= 9) {
                   xL = "Xuất sắc";
                  } else if (dtb < 9 && dtb >= 8) {
                   xL = "Giỏi";
                    } else if (dtb < 8 && dtb >= 7) {
                   xL = "Khá";
               } else if (dtb < 7 && dtb >= 6) {
                   xL = "Trung bình Khá";
               } else if (dtb < 6 && dtb > 5) {
                   xL = "Trung bình";
               } else {
                   xL = "Yếu";
               }
               return this.xL;
           }
           public void XuatThongTin(){
               System.out.println("Tên: "+this.ten+"\nMã số sinh viên: "+this.mssv+"\nĐiểm Toán: "+this.diemToan+"\nĐiểm Lý: "+this.diemLy+"\nĐiểm Hóa: "+this.diemHoa+"\nĐiểm Trung Bình: "+this.dtb+"\nXếp loại: "+this.xL  );

           }


}
