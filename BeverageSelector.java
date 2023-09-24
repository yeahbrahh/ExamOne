import java.util.Scanner;
public class BeverageSelector {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press 1 for Water; 2 for Coke; 3 for Coffee: ");
        int bev = sc.nextInt();

       switch(bev) {
           case 1: System.out.println("Water");
           break;
           case 2: System.out.println("Coke");
           break;
           case 3: System.out.println("Coffee");
           break;

       }

    }
}
