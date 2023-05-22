import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class slide113 {
    public static void main(String[] args) {
        HashSet<String> traicay = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String tentrai;
        System.out.println("Nhập số trái cây cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            System.out.println("Trái cầy thứ " + (i +1 )+ " là:");
            tentrai = sc.nextLine();
            traicay.add(tentrai);
        }
        //tìm trái cây
        System.out.println("Số trái cây vừa nhập là: " + traicay.size());
        System.out.print("Nhập loại trái cay cần tìm: ");
        String tim = sc.nextLine();
        if(traicay.contains(tim)){
            System.out.println("Đã tìm thấy " + tim +" có trong Hashset");
        }else{
            System.out.println("Không tìm thấy trái cây cần tìm");
        }
        //xoá trái cây
        System.out.print("Nhập trái cây cần xoá: ");
        String xoa = sc.nextLine();
        if(traicay.contains(xoa))
        {
            traicay.remove(tim);
            System.out.println("Xoá thành công");
            System.out.println("Các trái cây còn lại trong Hashset là: " + traicay);
        }else{
            System.out.println("Không tìm thấy trái cây cần xoá");
        }
        //list
        List<String> list = new ArrayList<>();
        list.add("mận");
        list.add("na");
        list.add("sầu riêng");
        list.add("xoài");

        traicay.addAll(list);
        System.out.println("các phần tử có trong Hashset sau khi thêm");
        Iterator<String> iterator = list.iterator();   
       while(iterator.hasNext()){
        System.out.println(iterator.next());
       }     
       traicay.removeAll(list);
       System.out.println("Các phần tử có trong Hashset sau khi xoá:" + traicay);
    }
}
