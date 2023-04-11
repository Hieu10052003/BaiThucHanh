package HinhHoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public hinhvuong()
    {
        ten = "Hình Vuông";
    }
    public void nhapCanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh :");
        dai = rong = sc.nextFloat();
    }
    
}
