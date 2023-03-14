import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0, number;
        float tbc;
       
        System.out.print(" nhập vào các số nguyên trong dãy :");
        n = sc.nextInt();
        for(int i = 1; i <=n;i++){
            System.out.print("nhập số thứ " + i + ": ");
            number = sc.nextInt();
            tong += number;

        }
        tbc = (float)tong / n ;
        System.out.println(" trung bình cộng của dãy là: " + tbc);

    } 
}
