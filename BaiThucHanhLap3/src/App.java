import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.printf("\n1.Hình tròn \n2.Student \nVui lòng chọn: ");
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
            
        } 
       
       
    }
}
