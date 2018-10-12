package menampilkan3angka;
import java.util.Scanner;
public class Menampilkan3angka {
public static void main(String[] args) {
     Scanner Number = new Scanner (System.in);
     int a;
     int b;
     int c;
     System.out.print("number 1= ");
     a = Number.nextInt();
     System.out.print("number 2= ");
     b = Number.nextInt();
     System.out.print("number 3= ");
     c = Number.nextInt();
     System.out.println("Rata-rata = " + ((a+b+c)/3));
    }
    
}
