
import java.util.ArrayList;

public class slide16 {
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(1);
    arr.add(5);
    arr.add(1000);
    System.out.println("các phần tử có trong arr là: ");
    for(int i = 0; i < arr.size(); i++)
    {
        System.out.println(arr.get(i));
    }
}
}
