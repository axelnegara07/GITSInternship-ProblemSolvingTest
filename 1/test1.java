import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            int hasil = ((i * (i + 1)) / 2) + 1;
            if (i != input - 1) {
                System.out.print(hasil + "-");
            } else {
                System.out.print(hasil);
            }
        }
        scanner.close();
    }
}