
import java.util.ArrayList;

import java.util.Iterator;


public class slide18 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(8);

        Iterator<Integer> iterator = arr.iterator();
        System.out.println("các phần tử có trong arr là:");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next() );
        }

    }
    
}
