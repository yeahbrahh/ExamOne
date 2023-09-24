import java.util.Scanner;
public class Summer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            sum += num;

        } while(num != 0);

        System.out.println(sum);


    }
}
