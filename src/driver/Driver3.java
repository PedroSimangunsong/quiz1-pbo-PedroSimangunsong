import java.util.Scanner;

class Laundry {
    String namaMahasiswa;
    double berat;
    boolean tasResmi;
    boolean adaDaftar;
    int jam;

    public Laundry(String namaMahasiswa, double berat, boolean tasResmi, boolean adaDaftar, int jam) {
        this.namaMahasiswa = namaMahasiswa;
        this.berat = berat;
        this.tasResmi = tasResmi;
        this.adaDaftar = adaDaftar;
        this.jam = jam;
    }

    public void verifikasi() {

        System.out.println("\n=== HASIL VERIFIKASI ===");

        if (berat > 5) {
            System.out.println("DITOLAK: Berat melebihi 5 kg.");
        } 
        else if (!tasResmi) {
            System.out.println("DITOLAK: Tidak menggunakan tas resmi.");
        } 
        else if (!adaDaftar) {
            System.out.println("DIKEMBALIKAN: Tidak ada daftar pakaian.");
        } 
        else if (jam > 19) {
            System.out.println("DITOLAK: Melewati jam penjemputan.");
        } 
        else {

            System.out.println("DITERIMA ✅");

            if (jam <= 18) {
                System.out.println("Penjemputan: Gelombang 1 (18.00)");
            } else {
                System.out.println("Penjemputan: Gelombang 2 (19.00)");
            }

            System.out.println("Pengantaran kembali: Sabtu jam 17.00");
        }
    }
}

public class Driver3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM LAUNDRY DEL ===");

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Berat Laundry (kg): ");
        double berat = sc.nextDouble();
        sc.nextLine();

        System.out.print("Menggunakan tas resmi? (y/n): ");
        boolean tas = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("Ada daftar pakaian? (y/n): ");
        boolean daftar = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("Jam penyerahan (18 atau 19): ");
        int jam = sc.nextInt();

        Laundry laundry = new Laundry(nama, berat, tas, daftar, jam);
        laundry.verifikasi();

        sc.close();
    }
}
