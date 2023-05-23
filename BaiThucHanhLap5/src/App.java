import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int []arr ;
       int x ;
       Scanner sc = new Scanner(System.in);
       System.out.println(" nhap so phan tu cua mang: ");
       int n = sc.nextInt();
       do{
        try {
            for(int i = 0; i <n; i++)
            {
                System.out.printf("arr[%d] = ", i);
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
            
            x = 1;
        }
       
       }while();
       System.out.printf("%d/%d = %d", a,b,x);
}
}