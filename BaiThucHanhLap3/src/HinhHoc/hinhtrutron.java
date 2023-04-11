package HinhHoc;
import java.util.Scanner;
public class hinhtrutron extends hinhtron{
    public float h;
    public hinhtrutron(){
        ten = "Hình trụ tròn";
    }
    public void nhapChieuCao(){
        nhapBankinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao hình trụ tròn: ");
        h = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDientich();
        thetich = dientich * h;
    }
}
