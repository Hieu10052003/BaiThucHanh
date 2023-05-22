import java.util.ArrayList;
import java.util.Scanner;

public class slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            int number;
            System.out.print("nhập số phần tử của mảng Arraylist: ");
            int n = sc.nextInt();
            for(int i = 0; i < n;i++)
            {
                System.out.println("nhập phần tử thứ " + i+": ");
                number = sc.nextInt();
                arr.add(number);
            }
            for(int i = 0; i < arr.size(); i++)
            {
                arr.sort((o1,o2)->o1-o2);
            }
            System.out.println("phần tử lớn nhất trong mảng Arraylist là: " + arr.get(arr.size()-1));
            
                System.out.println("nhập phần tử cần xoá: ");
                int xoa = sc.nextInt();
                for(int i = 0; i < arr.size(); i++)
                {
                    if(arr.get(i) == xoa){
                        arr.remove(i);
                    }
                }
                arr.sort((o1,o2)->o1-o2);
                System.out.println("các phần tử còn lại trong mảng theo chiều tăng dần là:");
                System.out.println(arr);
            
}
}