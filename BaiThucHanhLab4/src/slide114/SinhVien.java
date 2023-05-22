package slide114;

import java.util.Scanner;

public class SinhVien {
    String maSinhVien;
    String name;
    String lop;
    Scanner scanner = new Scanner(System.in);
   

    
    public void NhapThongTin(){
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien=scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        name=scanner.nextLine();
        System.out.print("Nhập lớp: ");
        lop=scanner.nextLine();
    }
    //hien thi
    public void HienThiThongTin(){
        System.out.println("Mã Sinh viên: " + maSinhVien);
        System.out.println("Họ và tên: " + name);
        System.out.println("Lớp: " + lop);
    }

}
