
import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        ListIterator<String> listIterator = arr.listIterator();
        System.out.println("các phần tử có trong arr là:");
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

    }
}
