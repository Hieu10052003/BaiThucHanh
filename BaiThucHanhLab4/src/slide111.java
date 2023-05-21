import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
  public static void main(String[] args) {
    LinkedList<Integer> linked = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.print("nhập số phần tử của mảng Arraylist: ");
    int n = sc.nextInt();
    for(int i = 0; i < n;i++)
    {
        System.out.println("nhập phần tử thứ " + i+": ");
        number = sc.nextInt();
        linked.add(number);
    }
    int sum = 0;
    int tbc;
    int dem =0;
    for(int i = 0; i < n;i++)
    {
        if(linked.get(i) % 2 ==0){
            sum +=linked.get(i);
            dem++;
        }
    }
    tbc = (int)sum / dem;
    System.out.println("trung bình cộng các số chẵn trong Linkedlist là: " + tbc);
  }
}
