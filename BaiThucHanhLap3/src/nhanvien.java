import java.util.Scanner;

public class nhanvien {
    String ten,mnv;
    final int lcb = 1490000;
    int hsl, tuoi,luong;
    public void nhapthongtin(){
    Scanner sc = new  Scanner(System.in);
    System.out.println("Nhập tên nhân viên: ");
    ten = sc.nextLine();
    System.out.println("Nhập mã nhân viên: ");
    mnv = sc.nextLine();
    System.out.println("Nhập số tuổi của nhân viên: ");
    tuoi = sc.nextInt();
    System.out.println("Nhập hệ số lương của nhân viên; ");
    hsl = sc.nextInt();
    
    }
    public void TinhLuong(){
        luong = lcb * hsl;
    }
    public  void InThongTin(){
        System.out.printf("Nhân viên %s \nMã NV:%s \n%d Tuổi \nHệ số lương:%d \nLương = %d",  ten,mnv,tuoi,hsl,luong);
    }
}
