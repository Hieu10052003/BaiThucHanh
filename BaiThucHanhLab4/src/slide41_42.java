
import java.util.LinkedList;
import java.util.Scanner;

public class slide41_42 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(18);
    list.add(12);
    list.add(14);
    list.add(16);
    list.add(22);
    list.add(25);
    list.add(8);
    list.add(31);
    list.add(90);
    list.add(81);
    list.add(122);
   
    System.out.println("nhập chỉ số của số phần tử cần lấy: ");
    int index = sc.nextInt();
    if((index < 0) || (index > list.size()-1))
    {
      System.out.println("chỉ số cần lấy phải nhỏ hơn 0 và nhỏ hơn " + (list.size()-1));
    }else {
      Integer node = list.get(index);
      System.out.println("phần tử có chỉ số = " + index + " trong linedlist là " + node);
      Integer FirstNode = list.getFirst();
      Integer LasttNode = list.getLast();
      System.out.print("Phần tử đầu tiên trong danh sách là " + FirstNode + "\nPhần tử cuối cùng trong danh sách là " + LasttNode);
    } 
  }  
}