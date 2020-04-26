import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean stopped = false;
        int count = 1;
        int i = 0;
        while (!stopped) {
            for (int j = 1; j < i; j++) {
                System.out.print(i - 1 + " ");
                if (count == n) {
                    stopped = true;
                    break;
                }
                count++;
            }
            i++;
            System.out.println();
        }
    }
}