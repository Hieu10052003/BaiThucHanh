import java.util.Scanner;

public class bai11 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số phần tử của mảng :");
            n = sc.nextInt();
        }while( n < 0);
        int A[] = new int[n];
        for( int i = 0; i < n; i++){
            System.out.print("nhập phần tử thứ "+ i + ": ");
            A[i] = sc.nextInt();
        }        
        for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (A[i] > A[j]) {
	                int sapxep = A[i];
	                A[i] = A[j];
	                A[j] = sapxep;
	            }
	        }
	    }
        System.out.print("phần tử của mảng đã sắp xếp theo thứ tự tăng dần là :" );
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
    

