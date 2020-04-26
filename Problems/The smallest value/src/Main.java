import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long target = scanner.nextLong();
        long result = 1;
        long min = 1;
        while (result <= target) {
            min++;
            result = result * min;
        }
        System.out.println(min);
    }
}
