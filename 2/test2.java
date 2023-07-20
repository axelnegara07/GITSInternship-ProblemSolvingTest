import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("jumlah pemain: ");
        int pemain = scanner.nextInt();

        System.out.print("skor: ");
        String skor = scanner.nextLine(); // read the newline character
        skor = scanner.nextLine();
        String[] spSkor = skor.split(" ");
        int[] arrSkor = new int[spSkor.length];
        for (int i = 0; i < spSkor.length; i++) {
            arrSkor[i] = Integer.parseInt(spSkor[i]);
        }

        System.out.print("jumlah permainan: ");
        int permainan = scanner.nextInt();

        System.out.print("skor permainan: ");
        scanner.nextLine(); // read the newline character
        String skorPermainan = scanner.nextLine();
        String[] spPemain = skorPermainan.split(" ");
        int[] arrPermainan = new int[spPemain.length];
        for (int i = 0; i < spPemain.length; i++) {
            arrPermainan[i] = Integer.parseInt(spPemain[i]);
        }

        ArrayList<Integer> ranking = new ArrayList<>();

        if (spSkor.length > pemain) {
            System.out.println("Input Skor melebihi batas!");
            System.exit(0);
        } else {
            ArrayList<Integer> uniqueSkor = new ArrayList<>();
            for (int score : arrSkor) {
                if (!uniqueSkor.contains(score)) {
                    uniqueSkor.add(score);
                }
            }
            arrSkor = new int[uniqueSkor.size()];
            for (int i = 0; i < uniqueSkor.size(); i++) {
                arrSkor[i] = uniqueSkor.get(i);
            }
        }

        if (spPemain.length > permainan) {
            System.out.println("Input Skor Permainan melebihi batas!");
            System.exit(0);
        } else {
            ArrayList<Integer> uniquePermainan = new ArrayList<>();
            for (int score : arrPermainan) {
                if (!uniquePermainan.contains(score)) {
                    uniquePermainan.add(score);
                }
            }
            arrPermainan = new int[uniquePermainan.size()];
            for (int i = 0; i < uniquePermainan.size(); i++) {
                arrPermainan[i] = uniquePermainan.get(i);
            }
        }

        for (int list : arrPermainan) {
            for (int i = arrSkor.length - 1; i >= 0; i--) {
                if (list == arrSkor[i]) {
                    ranking.add(i + 1);
                    break;
                } else if (list < arrSkor[i]) {
                    ranking.add(i + 2);
                    break;
                }

                if (i == 0 && list > arrSkor[i]) {
                    ranking.add(i + 1);
                }
            }
        }

        for (int list : ranking) {
            System.out.print(list + " ");
        }
        scanner.close();
    }
}