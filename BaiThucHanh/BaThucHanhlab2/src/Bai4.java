import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
    
       System.out.print("nhap vao so:");
       n = sc.nextInt();
       switch(n){
        case 1: System.out.print(" Tháng 1");
        break;
        case 2: System.out.print(" Tháng 2");
        break;
        case 3: System.out.print(" Tháng 3");
        break;
        case 4: System.out.print(" Tháng 4");
        break;
        case 5: System.out.print(" Tháng 5");
        break;
        case 6: System.out.print(" Tháng 6");
        break;
        case 7: System.out.print(" Tháng 7");
        break;
        case 8: System.out.print(" Tháng 8");
        break;
        case 9: System.out.print(" Tháng 9");
        break;
        case 10: System.out.print(" Tháng 10");
        break;
        case 11: System.out.print(" Tháng 11");
        break;
        case 12: System.out.print(" Tháng 12");
        break;
        
        default:
        System.out.print(" Số Tháng sai");
       
       }
    }
}
