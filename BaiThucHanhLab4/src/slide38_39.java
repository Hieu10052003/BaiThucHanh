
import java.util.LinkedList;

public class slide38_39 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("ví dụ về phương thức addAll().");
        System.out.println("-----------------------------");
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);
        System.out.println("ví dụ về phương thức retainAll().");
        System.out.println("-----------------------------");
        LinkedList<Integer> listB = new LinkedList<Integer>();
        listB.add(9);
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);
        System.out.println("ví dụ sử dụng phương thức removeAll()");
        System.out.println("-----------------------------------");
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }
    public static void showList(LinkedList<Integer> list) {
        for (Integer obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}

