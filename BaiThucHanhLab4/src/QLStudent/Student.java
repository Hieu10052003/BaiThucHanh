package QLStudent;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
        Scanner sc = new Scanner(System.in);
        public String Fullname;
        public int age;
        
        public  void NhapThongTin()
        {
            System.out.println("nhập họ và tên: ");
            Fullname = sc.nextLine();
            System.out.println("nhập số tuổi: ");
            age = sc.nextInt();
        }
        public  void dienthongtin(List<Student> stdlist ,int n)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.println("nhập thông tin sinh viên thứ " + (i + 1) + ":");
                Student std = new Student();
                std.NhapThongTin();
                stdlist.add(std); 
            }
        }
        public void hienthi()
        {
            System.out.println("họ và tên: "+  Fullname  + "\ntuổi: " + age );
            System.out.println("-----------------------");
        }
        public void hienthithongtin(List<Student> stdlist)
         {
            System.out.println("Thông tin tất cả sinh viên: ");
            for (Student student : stdlist) 
            {
                student.hienthi();
            }
         }
            public void suathongtin(List<Student> stdlist, Scanner sc)
             {
                System.out.println("sửa thông tin:");
                System.out.println("Nhập tên sinh viên cần sửa: ");
                String tim = sc.nextLine();
                Student stTim = null;
                for (Student student : stdlist) {
                    if (student.Fullname.contains(tim)) {
                        stTim = student;
                        break;
                    }
                }
                if (stTim != null) {
                    System.out.print("nhập họ và tên ");
                    String ten = sc.nextLine();
                    System.out.print("nhập tuổ: ");
                    int tuoi = sc.nextInt();
                    stTim.Fullname = ten;
                    stTim.age = tuoi;
        
                } else {
                    System.out.println("không tìm thấy sinh viên cần sửa");
                }
            }  
            public void XoaSinhVien(List<Student> stdlist, Scanner sc) {
                System.out.println("xoá sinh viên");
                System.out.print("Nnhập tên sinh viên cần xoá: ");
                String tim = sc.nextLine();
                Student stTim = null;
                for (Student student : stdlist) {
                    if (student.Fullname.contains(tim)) {
                        stTim = student;
                        break;
                    }
                }
                if (stTim != null) {
                    stdlist.remove(stTim);
                    System.out.println("đã xoá tên sinh viên thành cồng");
                } else {
                    System.out.println("không tìm thấy sinh viên");
                }     
        
    
}
               //---------------------------------
               public  void dienthongtin(Set<Student> stdset ,int n)
               {
                   for(int i = 0; i < n; i++)
                   {
                       System.out.println("nhập thông tin sinh viên thứ " + (i + 1) + ":");
                       Student std = new Student();
                       std.NhapThongTin();
                       stdset.add(std); 
                   }
               }
               public void hienthithongtin(Set<Student> stdset)
                {
                   System.out.println("Thông tin tất cả sinh viên: ");
                   for (Student student : stdset) 
                   {
                       student.hienthi();
                   }
                }
                   public void suathongtin(Set<Student> stdset, Scanner sc)
                    {
                       System.out.println("sửa thông tin:");
                       System.out.println("Nhập tên sinh viên cần sửa: ");
                       String tim = sc.nextLine();
                       Student stTim = null;
                       for (Student student : stdset) {
                           if (student.Fullname.contains(tim)) {
                               stTim = student;
                               break;
                           }
                       }
                       if (stTim != null) {
                           System.out.print("nhập họ và tên ");
                           String ten = sc.nextLine();
                           System.out.print("nhập tuổ: ");
                           int tuoi = sc.nextInt();
                           stTim.Fullname = ten;
                           stTim.age = tuoi;
               
                       } else {
                           System.out.println("không tìm thấy sinh viên cần sửa");
                       }
                   }  
                   public void XoaSinhVien(Set<Student> stdset, Scanner sc) {
                       System.out.println("xoá sinh viên");
                       System.out.print("Nnhập tên sinh viên cần xoá: ");
                       String tim = sc.nextLine();
                       Student stTim = null;
                       for (Student student : stdset) {
                           if (student.Fullname.contains(tim)) {
                               stTim = student;
                               break;
                           }
                       }
                       if (stTim != null) {
                           stdset.remove(stTim);
                           System.out.println("đã xoá tên sinh viên thành cồng");
                       } else {
                           System.out.println("không tìm thấy sinh viên");
                       }     
               
           
       }
                public void dienthongtin(HashSet<Student> stdhash, int n) {
                }
                   
}