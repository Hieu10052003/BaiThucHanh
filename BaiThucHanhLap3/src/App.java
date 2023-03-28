import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        hinhtrutron htt = new hinhtrutron();
        nhanvien nv = new nhanvien();
        int chon;
        System.out.printf("\n1. Hình tròn \n2. Student \n3. Hình trụ tròn \n4. Nhân viên \nVui lòng chọn: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
            ht.nhapBankinh();
            ht.tinhChuVi();
            ht.tinhDientich();
            ht.inKetQua();
                
                break;
            case 2:
            st.nhapThongtin();
            st.Tuoi();
            st.InThongTin();
            break;
            case 3:
            htt.NhapBanKinh();
            htt.chuvi();
            htt.dientich();
            htt.thetich();
            htt.inthongtin();
            break;
            case 4:
            nv.nhapthongtin();
            nv.TinhLuong();
            nv.InThongTin(); 
            break;
            default:
            System.out.println("vui lòng chọn lại");
            break;
        } 
       
    }
}
