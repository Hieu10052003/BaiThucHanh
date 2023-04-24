import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhập vào chuỗi bất kỳ :");
    chuoi = sc.nextLine();
        }while(chuoi.length() > 80);
        System.out.print("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        kytu = sc.next().charAt(0);
        for(int i = 0; i < chuoi.length(); i++){
            if (kytu == chuoi.charAt(i)) {
                dem++;      
        }
        }  
        System.out.println("Số lần xuất hiện của ký tự " + kytu +
        " trong chuỗi vừa nhập là :"+ dem);
}
    }

