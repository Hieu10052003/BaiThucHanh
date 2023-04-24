import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n ,i = 1;
        long gt = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhập vào số :");
            n = sc.nextInt();
        }while(n < 0);
        while(i <= n){
            gt = gt * i;
            i++;
        }
            
                    
        System.out.print(" giai thừa của số vừa nhập là :" + gt); 


    
}
}