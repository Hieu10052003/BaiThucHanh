
import java.util.HashSet;
import java.util.Scanner;

public class slide54 {
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
    System.out.println("nhập các phần tử cần thêm: ");
    kytu = sc.nextLine();
    if(!hash.contains(kytu))
    {
        hash.add(kytu);
        System.out.println("Thêm thành công");
        System.out.println("các phần tử của Hashset sau khi thêm là:");
        System.out.println(hash);
    }else{
        System.out.println("phần tử "+ kytu + " đã tồn tại");
    }
    }

}
