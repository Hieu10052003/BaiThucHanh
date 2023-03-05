import java.util.Scanner;
public class Slide40 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số: ");
        n  = scanner.nextInt();
    
    switch (n) {
        case 1: System.out.println(" Thứ Hai");
        break;
        case 2: System.out.println("Thứ Ba");
        break;
        case 3: System.out.println("Thứ Bốn");
        break;
        case 4: System.out.println("Thứ Năm");
        break;
        case 5: System.out.println("Thứ Sáu");
        break;
        case 6: System.out.println("Thứ Bảy");
        break;
        case 7: System.out.println("Chủ Nhật");
        break;
        default:
                System.out.println("Số ngày sai.");

    
    }
}
}
