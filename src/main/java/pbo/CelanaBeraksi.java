package pbo;

import java.util.Scanner;

public class CelanaBeraksi {
    public static void main(String[] args) {
         //Objek
        //Celana celana = new Baju("Muhammad Fauzan Kesumadinata", "111111",5500000);
        
        //System.out.println(celana.info());
        //System.out.println(celana.info(5));
        // Error Handling
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in);
            
            // Array untuk menyimpan objek CelanaDetail
            CelanaDetail[] celana = new CelanaDetail[2];
            
            // Perulangan Inputan Data
            for (int i = 0; i < celana.length; i++) {
                System.out.println("Masukkan Data Ke-" + (i + 1) + ":");
                System.out.print("Masukkan Nama Pembeli: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Kode Pembeli: ");
                String kode = scanner.nextLine();
                System.out.print("Masukkan Harga: ");
                int harga = Integer.parseInt(scanner.nextLine());
            
                // Objek
                celana[i] = new CelanaDetail(nama, kode, harga);
            }
            
            // Perulangan Untuk Menampilkan Data Celana
            for (CelanaDetail data : celana) {
                System.out.println("================");
                System.out.println("Data Pembelian: ");
                System.out.println(data.info());
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Terjadi Kesalahan Saat Memasukkan Harga: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Terjadi Kesalahan Pada Format Kode Pembeli: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}
