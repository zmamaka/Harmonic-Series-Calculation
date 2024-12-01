import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        float total = 0;

        System.out.print("Sayı giriniz => ");
        n = scan.nextInt();

        for (float i = 1; i <= n; i++)
            total += (1/i);
        
        System.out.println(total);

    }
}
