import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
    String chuoi;
    int inhoa = 0, inthg = 0, chuso = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập vào chuỗi bất kỳ :");
    chuoi = sc.nextLine();
    for(int i = 0; i < chuoi.length(); i++){

    if(Character.isUpperCase(chuoi.charAt(i))){
        inhoa++;
    } 
    if(Character.isLowerCase(chuoi.charAt(i))){  
        inthg++;            
    }
    if(Character.isDigit(chuoi.charAt(i))){
        chuso++;
}
}
System.out.println("Trong chuối có số ký tự in hoa là:" + inhoa);
System.out.println("Trong chuối có số ký tự in  thường là:" + inthg);
System.out.println("Trong chuối có số ký tự chữ số là:" + chuso);
    }
}