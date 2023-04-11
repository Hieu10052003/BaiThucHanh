package HinhHoc;
import java.util.Scanner;
public class hinhtron extends hinhhoc {
   public float r;
   public hinhtron()
   {
    ten = "Hình tròn";
   }
    public void nhapBankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập bán kính: ");
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi= 2*r*Pi;
    }
    public void tinhDientich(){
        dientich = r * r * Pi;

    }
}



    
