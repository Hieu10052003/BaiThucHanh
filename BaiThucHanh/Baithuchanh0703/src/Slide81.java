import java.util.Scanner;

public class Slide81 {
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
        int max = A[0][0];
        for( int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
            System.out.printf("nhập vào phần tử thứ A[%d,%d] =", i,j);
            A[i][j] = sc.nextInt();
            if (max < A[i][j]) {
                max = A[i][j];
            }
            }
        }
    System.out.println("Phần tử lớn nhất trong ma trận = " + max);
}
}