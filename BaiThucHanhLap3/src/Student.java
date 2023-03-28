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
// xay dững class hình trụ tròn bán kính cv thể tích điện tính, và các phương thức nhập bán kính, tính chú vi, tính diện tích , tính tjeesr tích, và phương thức in thông tin
// xây dưng class nhân viên viên bao gồm pt sau: mã nv, ho ten nv, tuổi, hệ số lương, lcb= 1490000, xay dựng các pt nhập tt nv tính lương, hsl x lcb, và phương thức hiện thị thông tin nhân viên