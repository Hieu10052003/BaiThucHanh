import java.util.List;
import java.util.Scanner;

public class App{
    String Fullname;
    String lop;
    int masv;
    Scanner sc = new Scanner(System.in);
    public void nhapthongtin()
    {
        System.out.println("ho va ten:");
        Fullname = sc.nextLine();
        System.out.println("nhap ma sinh vien");
        masv = Integer.parseInt(sc.nextLine());
        System.out.println("nhap lop: ");
        lop = sc.nextLine();
    }
    public void EnterData(List<App> svlist, int n, Scanner sc)
    {
     for(int i = 0; i < n; i++)
     {
        System.out.println("thong tin sinh vien thu " + (i + 1) + ":");
        App sv = new App();
        sv.nhapthongtin();
        svlist.add(sv);
     }
    }
    public void hienthi()
    {
        System.out.println("Ho va ten: " + Fullname + "\nMa sinh vien: " + masv + "\nLop: " + lop);

    }
    public void Insert(List<App> svlist)
    {
        System.out.println("thong tin sinh vien");
        for(App sv: svlist)
        {
            sv.hienthi();;
        }
    }
    public void Update(List<App> svlist, Scanner sc)
    {
        System.out.println("----update sinh vien-----");
        System.out.println("nhap ten sinh vien can tim: ");
        String tim = sc.nextLine();
        String svtim = null;
        for( App sv : svlist)
        {
            if(sv.Fullname.contains(tim))
            {
                svtim = tim;
                break;
            }
        }
        if(svtim != null)
        {
            System.out.println("ho va ten: ");
            String name = sc.nextLine();
            System.out.println("lop");
            String clas = sc.nextLine();
            svtim.Fullname = name;
            svtim.lop = clas;

        }else{
            System.out.println("khong tim thay sinh vien");
        }
    }
    public void Delete(List<App> svlist, Scanner sc)
    {
        System.out.println("----update sinh vien-----");
        System.out.println("nhap ten sinh vien can tim: ");
        String tim = sc.nextLine();
        String svtim = null;
        for( App sv : svlist)
        {
            if(sv.Fullname.contains(tim))
            {
                svtim = tim;
                break;
            }
        }
        if(svtim != null){

        }
    }
}
