public class Celana {
    ...
}

public class CelanaDetail extends Celana {
    ...
}

public class CelanaBeraksi {
    ...
}
2. *Object* adalah instance dari class. Pada kode ini, Celana[i] = new CelanaDetail(nama, kode, harga); adalah contoh pembuatan object.

    java
    Celana[i] = new CelanaDetail(nama, kode, harga);
    

3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, namaPembeli, kodePembeli, dan harga adalah contoh atribut.

    java
    private String namaPembeli;
    private String kodePembeli;
    private int harga;
    

4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Celana dan CelanaDetail.

    java
    public Celana(String namaPembeli, String kodePembeli, int harga) {
        this.namaPembeli = namaPembeli;
        this.kodePembeli = kodePembeli;
        this.harga = harga;
    }

    public CelanaDetail(String namaPembeli, String kodePembeli, int harga) {
        super(namaPembeli, kodePembeli, harga);
    }
    

5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNamaPembeli, setKodePembeli, dan setHarga adalah contoh method mutator.

    java
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setKodePembeli(String kodePembeli) {
        this.kodePembeli = kodePembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    

6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNamaPembeli, getKodePembeli, dan getHarga adalah contoh method accessor.

    java
    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getKodePembeli() {
        return kodePembeli;
    }

    public int getHarga() {
        return harga;
    }
    

7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut namaPembeli, kodePembeli, dan harga dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

    java
    private String namaPembeli;
    private String kodePembeli;
    private int harga;
    

8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, CelanaDetail mewarisi Celana dengan sintaks extends.

    java
    public class CelanaDetail extends Celana {
        ...
    }
    

9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method info(String) di Celana merupakan overloading method info dan info di CelanaDetail merupakan override dari method info di Celana.

    java
    public String info(String stok) {
        return info() + "\nStok Celana: " + stok;
    }

    @Override
    public String info() {
        return super.info() +
               "\nMerk Celana: " + getMerkCelana() +
               "\nWarna Celana: " + getWarnaCelana() +
               "\nUkuran Celana: " + getUkuranCelana();
    }
    

10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi switch dalam method getMerkCelana, getWarnaCelana, dan getUkuranCelana.

    java
    public String getMerkCelana() {
        String kodeMerk = getKodePembeli().substring(0, 2);
        return switch (kodeMerk) {
            case "11":
                return "LEVI'S";
            case "12":
                return "NIKE";
            case "13":
                return "GUCCI";
            case "14":
                return "CHANEL";
            case "15":
                return "HERMES";
            default:
                return "Merk Lain";
        }
    }

    public String getWarnaCelana() {
        String kodeWarna = getKodePembeli().substring(2, 4);
        return switch (kodeWarna) {
            case "11":
                return "Merah";
            case "12":
                return "Kuning";
            case "13":
                return "Hijau";
            case "14":
                return "Biru";
            case "15":
                return "Hitam";
            default:
                return "Warna Lain";
        }
    }

    public String getUkuranCelana() {
        String kodeUkuran = getKodePembeli().substring(4, 6);
        return switch (kodeUkuran) {
            case "11":
                return "S";
            case "12":
                return "M";
            case "13":
                return "L";
            case "14":
                return "XL";
            case "15":
                return "XXL";
            default:
                return "Ukuran Lain";
        }
    }
    

11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

    java
    for (int i = 0; i < Celana.length; i++) {
        ...
    }
    

12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

    java
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nama Pembeli: ");
    String nama = scanner.nextLine();

    System.out.println("================");
    System.out.println("Data Pembelian: ");
    System.out.println(data.info());
    

13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, CelanaDetail[] Celana = new CelanaDetail[2]; adalah contoh penggunaan array.

    java
    CelanaDetail[] Celana = new CelanaDetail[2];
    

14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

    java
    try {
        // code that might throw an exception
    } catch (NumberFormatException e) {
        System.out.println("Terjadi Kesalahan Saat Memasukkan Harga: " + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Terjadi Kesalahan Pada Format Kode Pembeli: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan Umum: " + e.getMessage());
    }
    

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Muhammad Fauzan Kesumadinata
NPM: 2210010707
