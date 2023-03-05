import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) {
    int tong = 0, n ;
    String str =  " ";
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print("Nhập vào số:");
        n  = scanner.nextInt();
        tong = tong + n;
        str += n + " + ";
    } while ( tong < 100);
    str = str.substring(0, str.length()-2);
    System.out.println(" tổng các sô vừa nhập là: " +str+ " = " + tong);


    }
}
    

