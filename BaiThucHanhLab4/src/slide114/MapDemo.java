package slide114;
import java.util.HashMap;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, SinhVien> danhSachSinhVien = new HashMap<>();
        System.out.println("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();
        //nhap
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ "+ (i+1) + ": ");
            SinhVien sinhVien = new SinhVien();
            sinhVien.NhapThongTin();
            danhSachSinhVien.put(sinhVien.maSinhVien, sinhVien);
        }
        scanner.nextLine();
        //tim voi ten lop
        System.out.print("Nhập lớp những sinh viên cần tìm:");
        String classString= scanner.nextLine();
        for(SinhVien sVien : danhSachSinhVien.values()){
            if(sVien.lop.equals(classString)){
                sVien.HienThiThongTin();
            }
        }
        //tim voi ma sinh vien
        System.out.print("Nhập mã sinh viên cần tìm:");
        String ma = scanner.nextLine();
        for(SinhVien sVien : danhSachSinhVien.values()){
            if(sVien.maSinhVien.equals(ma)){
                System.out.printf("Mã sinh viên %s có tên và lớp là:",ma);
                System.out.println("\nHọ va Tên: " + sVien.name);
                System.out.println("Lớp: " + sVien.lop);
            }
        }
    }
}
