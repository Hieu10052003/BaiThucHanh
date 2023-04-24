import java.util.Scanner;

public class Bai3 {  
    public static void main(String[] args) {
        int namsinh, tuoi;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên :");
        ten = sc.nextLine();
        System.out.print("năm sinh :");
        namsinh = sc.nextInt();
        tuoi = 2023 - namsinh;
        if( tuoi >=18){
            System.out.printf("  bạn %s đã già", ten);
        }
           else if(tuoi >= 16 && tuoi < 18){
                System.out.printf("  bạn %s ở độ tuổi trưởng thành", ten);
           }
            else System.out.printf(" bạn %s ở tuổi vị thành niên ", ten);
            
        }
}


