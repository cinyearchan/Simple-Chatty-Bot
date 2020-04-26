import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        int num = 1;
        while (num * num <= end) {
            System.out.println(num * num);
            num++;
        }
    }
}
