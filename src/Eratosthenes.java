import java.util.Scanner;

public class Eratosthenes {
    public void algorithm() {

        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = true;
        for (int g = 2; g <= n; g++) {
            for (int i = 2; i < g; i++) {
                if (g % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(g);
            else b = true;
        }
    }
}
