import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) {
    int tong = 0, n;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Nhập vào số:");
        n  = scanner.nextInt();
        tong = tong + n;
    } while ( tong < 100);
    System.out.println(" tổng = " + tong);


    }
}
    

