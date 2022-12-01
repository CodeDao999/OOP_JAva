import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1/System in,out
        // 2/Variable(Biến),datatype( kiểu dữ lieu)
        // 3/If else(câu điều kiện),phép so sánh
        // 4/Array,List(mảng,danh sách)
        // 5/Loop(vòng lặp)
        // 6/OOP

        Scanner scanner = new Scanner(System.in);

//
//        System.out.println("Nhap vao chuoi: ");
//        String chuoiThuNhat = scanner.nextLine();
//
//        System.out.println("Nhap vao chuoi 2: ");
//        String chuooiThuHai = scanner.nextLine();
//
//        if (chuoiThuNhat.toLowerCase().equals(chuooiThuHai.toLowerCase())) {
//            System.out.println("Giong nhau!");
//        } else {
//            System.out.println("Khong giong nhau!");
//        }
//
//        System.out.println("Nhap vao 1 so: ");
//        float So = scanner.nextFloat();
//
//        if (So < 5) {
//            System.out.println("Kem!");
//        } else if (5 <= So && So < 7.5) {
//            System.out.println(" Trung binh ");
//        } else if (7.5 <= So && So < 8.5) {
//            System.out.println(" Kha ");
//        } else if (So >= 8.5) {
//            System.out.println("Gioi!");
//        }
//        // Mảng (Array)
//
//        //Khai báo kiểu dữ liệu là gì thì giá trị ứng với kiểu dữ liệu đó
//
//
//        //Cach 1: Kiểu dữ lieu[] ten biến ={ [giá trị 1] , [giá trị 2] , ......}
//        // index ( chỉ mục,vị trí phần tử)
//        //             0 1 2 3 4
//        int[] mangso = {5, 4, 3, 2, 1};
//        //mangso.length
//
//
//        //tên biến mảng[index] lấy giá trị ở vị trí
//
//        // Cach 2:Kiểu dữ lieu[] ten biến = new kiểu dữ liệu [so phần t]
////      int [] mangSoHai = new int[3];
////      mangSoHai[0]=5;
////      mangSoHai[1]=4;
////      mangSoHai[3]=3;
////        System.out.println(mangSoHai[0]);
//
//        //List<String>
//        List<String> danhSachChuoi = new ArrayList<>();
//        danhSachChuoi.add("5");
//        danhSachChuoi.add("A");
//        danhSachChuoi.add("B");
//
//
//        //danhSachChuoi.remove();
//        //danhSachChuoi.size();
//        System.out.println(danhSachChuoi.get(2));
//
//        //Loop:Vòng lặp
//        //Gồm:while,do while,for,foreach;
//        //Có 1 danh sách ;
//        //Lặp lại 1 thao tác nào đó nhiều lần có thứ tự
//        //Khai báo vòng lặp : điều kiện dừng,biến dừng,câu lệnh xử lý
//
//        //Còn đúng còn chạy. danhSachChuoi.size()
//        for (int i = 0; i < mangso.length; i++) {
//            System.out.println(mangso[i] + "");
//        }
//
//        //foreach:duyệt phần tử
//        for (int item : mangso) {
//            System.out.println(item + "");
//        }
//        for (String item : danhSachChuoi) {
//            System.out.println(item + "");
//        }
        int[] pt = new int[5];
        for (int i = 0; i < pt.length; i++) {
            System.out.println("Nhap vao phan tu " +i);
            pt[i]= scanner.nextInt();
        }
int temp = 0;
        for ( int i = 0; i< pt.length;i++){
            for (int j = i+1;j< pt.length;j++)
            { if (pt[j]<pt[i])
                temp = pt[i];
                pt[i]=pt[j];
                pt[j]=temp;
            }
        }
        System.out.println("Mang sap xep: ");
        for (int i = 0;i< pt.length;i++ ) {
            System.out.println(pt[i] +" ");

        }



    }

    }
