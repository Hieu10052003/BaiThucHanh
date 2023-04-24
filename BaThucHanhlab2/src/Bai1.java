import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int a,b;
       System.out.print("nhap so thư nhat:");
       a = sc.nextInt();
       System.out.print("nhap so thư nhat:"); 
       b = sc.nextInt();
     
       System.out.println("a + b = " + (a+b));
       System.out.println("a : b = " + (a/b));
       System.out.println("a - b = " + (a-b));
       System.out.println("a x b = " + (a*b));
       System.out.println("phần dư 2 số = " + (a%b));
       if( a > b) System.out.println("a > b"); 
       else System.out.println(" b > a");
    }  

}
