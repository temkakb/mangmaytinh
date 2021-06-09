import java.util.Scanner;

public class main {

    public  static void main (String args[])
    {
    System.out.print("nhap chuoi:");
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();
        System.out.println("so ky tu cua chuoi "+chuoi.toUpperCase().replaceAll("\\s+","").length());
    }
}
