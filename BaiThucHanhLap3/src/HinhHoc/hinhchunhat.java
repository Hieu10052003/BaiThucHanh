package HinhHoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float rong, dai;
    public hinhchunhat(){
        ten = " Hình chữ nhật";
    }
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
        System.out.println("nhap chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
    
    }
    public void tinhChuVi(){
        chuvi = (rong + dai)*2;
    }
    public void tinhDientich(){
        dientich = rong * dai;
    }
}

