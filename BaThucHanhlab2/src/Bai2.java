import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
       System.out.print("nhap vao so:");
       n = sc.nextInt();
       if (n % 2 == 0) System.out.print(" số vừa nhập là số chẵn");
       else System.out.print("số vừa nhập là số lẻ");
    }
}
