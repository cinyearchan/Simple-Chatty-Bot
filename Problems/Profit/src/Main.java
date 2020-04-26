import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        // money
        double m = scanner.nextDouble();
        // percent
        double p = scanner.nextDouble();
        // target
        double k = scanner.nextDouble();
        double rate = (100 + p) / 100;
        int year = 0;
        while (m < k) {
            m = m * rate;
            year++;
        }
        System.out.println(year);
    }
}