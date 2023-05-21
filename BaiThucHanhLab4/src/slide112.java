
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class slide112 {
    public static void main(String[] args) {
       String fullname, thongtin = null;
       String arrThongTin[];
       float diem;
       Scanner sc = new Scanner(System.in);

     LinkedList<String> dsSV = new LinkedList<>();
     LinkedList<String> SVthilai = new LinkedList<>();
     LinkedList<String> SVdiemcao = new LinkedList<>();
     LinkedList<String> svCanTim = new LinkedList<>();
     do {
        System.out.println("Nhập vào họ và tên sinh viên: ");
        fullname = sc.nextLine();
        if (!fullname.isEmpty()) {
            System.out.println("Nhập vào điểm sinh viên: ");
            diem = Float.parseFloat(sc.nextLine());
            thongtin = fullname + "\t" + diem;
            dsSV.add(thongtin);
        }
    } while (!fullname.isEmpty());
    System.out.println("Số sinh viên có trong danh sách = " + (dsSV.size()));
    System.out.println("Thông tin của các sinh viên vừa nhập là: ");
    System.out.println("Tên sinh viên\t Điểm");
    Iterator<String> iterator = dsSV.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
        for (int i = 0; i < dsSV.size(); i++) 
        {
            String sv = dsSV.get(i);  
            arrThongTin = sv.split("\t");
            double point = Double.parseDouble(arrThongTin[1]);
            if (point <= 5) {
                SVthilai.add(sv);
          }
        }
         if (SVthilai.isEmpty()) {
                System.out.println("Không có sinh viên phải thi lại!");
            } else {
                System.out.println("Số sinh viên phải thi lại = " + (SVthilai.size()));
                System.out.println("Thông tin của các sinh viên phải thi lại là: ");
                System.out.println("Tên sinh viên\t Điểm");
                iterator = SVthilai.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        float diemmax = 0;
        int i = 0;
        while(i < dsSV.size())
        {
            arrThongTin = dsSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) >= diemmax) {
                diemmax = Float.parseFloat(arrThongTin[1]);
            }
            i++;
        }
        int n = 0;
        while(n < dsSV.size())
        {
            arrThongTin = dsSV.get(n).split("\t");
            if (Float.parseFloat(arrThongTin[1]) == diemmax) {
                SVdiemcao.add(dsSV.get(n));
            }
            n++;
        }
            System.out.println("Thông tin của các sinh viên có điểm cao nhất là: ");
            System.out.println("Tên sinh viên\t Điểm");
            iterator =SVdiemcao.iterator();
            while (iterator.hasNext()) {
            System.out.println(iterator.next());

        System.out.println("Nhập tên sinh viên cần tìm: ");
        String search = sc.nextLine();       
        int z = 0;
        while(z < dsSV.size())
        {
             arrThongTin = dsSV.get(z).split("\t");
             fullname = arrThongTin[0];
             if (search.equalsIgnoreCase(fullname)) {
                svCanTim.add(dsSV.get(z));
            }   
            z++;
        }
       System.out.println("Thông tin của các sinh viên tên là " + search + ": ");
       System.out.println("Tên sinh viên\t Điểm");
       iterator = svCanTim.iterator();
       while (iterator.hasNext()) 
       {
          System.out.println(iterator.next());
       }
               
}
}
}
