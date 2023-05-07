
import java.util.HashSet;
import java.util.Scanner;

public class slide56 {
    public static void main(String[] args) {
        String kytu;
    HashSet<String> hash = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hash.add("X");
    hash.add("I");
    hash.add("N");
    hash.add("C");
    hash.add("H");
    hash.add("A");
    hash.add("O");
    System.out.println("Các ký phần tử trong Hashset là: ");
    System.out.println(hash);
    System.out.println("Nhập các phần tử cần xoá : ");
    kytu = sc.nextLine();
    if(hash.contains(kytu))
    {
        hash.add(kytu);
        hash.remove(kytu);
        System.out.println("Xoá thành công !");
        System.out.println("Xác phần tử của Hashset sau khi xoá là:");
        System.out.println(hash);
    }else{
        System.out.println("Xoá không thành công");
    }
    }

}
