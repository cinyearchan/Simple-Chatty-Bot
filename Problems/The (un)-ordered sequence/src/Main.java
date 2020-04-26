import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean asc = true;
        boolean des = true;

        int prev;
        int next = scanner.nextInt();

        while (true) {
            prev = next;
            next = scanner.nextInt();

            if (next == 0) {
                break;
            }

            if (asc && next < prev) {
                asc = false;
                continue;
            }

            if (des && next > prev) {
                des = false;
                continue;
            }

            if (!asc && !des) {
                break;
            }
        }
        System.out.println(asc || des);
    }
}