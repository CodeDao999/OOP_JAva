import java.util.Scanner;

public class MainXeBuyt {
    public static void main(String[] args){
         XeBuyt xeBuyt = new XeBuyt();
         xeBuyt.layThongTinXe();
         xeBuyt.nhapDulieu(new Scanner(System.in));
         int tongtien = xeBuyt.tinhTien(10);
         System.out.println("Tong tien : "+tongtien);
         Scanner scanner = new Scanner(System.in);
        }
    }

