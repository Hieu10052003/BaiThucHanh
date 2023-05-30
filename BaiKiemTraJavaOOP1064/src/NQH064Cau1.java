import java.util.ArrayList;
import java.util.Scanner;

public class NQH064Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        App sv = new App();
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sv.EnterData(null, n, sc);
        sv.Insert(null);
    }
}
