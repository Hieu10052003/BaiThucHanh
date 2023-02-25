import java.util.Scanner;

public class Baithuchanh2102 {
public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
   
    int n, tong = 0;
    System.out.println("nhập số nguyên : ");
    n =scanner.nextInt();
    while(n > 0)
    {
        tong= tong + n%10;
        n = n/10;
    }
    System.out.println("tong = " + tong);
}
    
}
