import java.util.Scanner;

public class Slide75 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, sum =0;
        
        do {
            System.out.print(" nhập số cột của mảng :");
            a = sc.nextInt();
            System.out.print(" nhập số dòng của mảng :");
            b = sc.nextInt();
        }while(a <= 0 || b <= 0);
        int A[][] = new int [a][b];
    for( int i = 0; i < a; i++){
        for(int j = 0; j < b; j++){
        System.out.printf("nhập vào phần tử thứ A[%d,%d] =", i,j);
        A[i][j] = sc.nextInt();
        if( A[i][j] % 2 == 0){
            sum += A[i][j];
        }
    }
}
System.out.print("tổng các phần tử chẵn trong mảng là: " + sum);
}
}
