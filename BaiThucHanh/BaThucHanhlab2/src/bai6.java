import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        
            System.out.print("nhập vào số :");
            n = sc.nextInt();
            long gt = 1;
            if( n != 0 && n != 1){
                int i = 2;
               while ( n <= i) {
            gt = gt*i;
            i++;
                           }  
                        } 
        System.out.print(" giai thừa của số vừa nhập là " + gt); 


    
}
}