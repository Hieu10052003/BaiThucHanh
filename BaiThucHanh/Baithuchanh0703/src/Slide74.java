import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.print("nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while(n < 0);
        int A[] = new int [n];
        int sum =0;
        System.out.print("nhập phần tử cho mảng: ");
        for ( int i = 0; i < n; i++)
        {
            System.out.print("nhập phần tử thứ " + i +": ");
            A[i] = sc.nextInt();
            if ( A[i] % 2 == 0)
            {
                sum = sum + A[i];
            }
            System.out.print(" tổng các số chẵn trong mảng là:" + sum);
        }

    }
}

