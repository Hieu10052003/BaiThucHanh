import java.util.Scanner;

public class hinhtrutron {
    final float PI = 3.14f;
    float r, h, cv, dt, v;
    void NhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình trụ tròn: ");
        r = sc.nextFloat();
        System.out.println("Nhập chiều cao hình trụ tròn: ");
        h = sc.nextFloat();
    }
    public void chuvi(){
        cv = 2 * r * PI;
    }
    public void dientich(){
        dt = 2 * PI * r * (r + h);
    }
    public void thetich(){
        v = PI * r * r * h;
    }
    public void inthongtin(){
        System.out.printf("Chu vi hình trụ tròn là: %f", cv);
        System.out.printf("\nDiện tích hình trụ tròn là: %f", dt);
        System.out.printf("\nThể tích hình trụ tròn là: %f", v);

    }
    
}

    

