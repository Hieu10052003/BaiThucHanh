import java.util.Scanner;
public class Hinhtron {
    final float Pi = 3.14f;
    float r;
    float dt, cv;
    
    void nhapBankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập bán kính hình tròn: ");
        r = sc.nextFloat();
    }
    void tinhChuVi(){
        cv = 2*r*Pi;
    }
    void tinhDientich(){
        dt = r * r * Pi;

    }
    void inKetQua(String name){
        System.out.printf("chu vi của hình tròn %s ban kính %f = %f" ,name,r,cv);
        System.out.printf("diện tích của hình tròn %s ban kính %f = %f" ,name,r,dt);
    }

}




