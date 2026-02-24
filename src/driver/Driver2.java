import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) { {
        Scanner sc = new Scanner(System.in);

        // Input jumlah data
        int N = sc.nextInt();
        int[] nilai = new int[N];

        // Input deret nilai
        for (int i = 0; i < N; i++) {
            nilai[i] = sc.nextInt();
        }

        // Input kode kelompok
        int k = sc.nextInt();

        // Karena setiap kelompok hanya 1 nilai
        if (k >= 1 && k <= N) {
            System.out.println(nilai[k - 1]);
        } else {
            System.out.println("Kelompok tidak valid");
        }

        sc.close();
    }
}
    
}
