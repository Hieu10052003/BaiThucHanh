import java.util.Scanner;

public class Student {
    String ten;
    int tuoi, namsinh;
    String gioitinh;
    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Vui lòng nhập năm sinh : ");
        namsinh = sc.nextInt();
        System.out.println("Vui lòng nhập giới tính: ");
        gioitinh = sc.next();
    }
    public void Tuoi(){
        tuoi = 2023 - namsinh;
    }
    void InThongTin(){
        System.out.print("Thông tin student vừa nhập là: ");
        System.out.printf("\nTên: %s \nTuổi: %d \nGiới tính: %s" ,ten, tuoi, gioitinh);
    }
    

}

