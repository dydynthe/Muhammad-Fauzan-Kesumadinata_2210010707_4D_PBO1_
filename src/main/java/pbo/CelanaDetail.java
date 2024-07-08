package pbo;

//Inheritance
public class CelanaDetail extends Celana {
    // Constructor
    public CelanaDetail(String namaPembeli, String kodePembeli, int harga) {
        super(namaPembeli, kodePembeli, harga);
    }
    
    public String getMerkCelana() {
        String kodeMerk = getKodePembeli().substring(0, 2);
        // Seleksi Percabangan Switch Case
        return switch (kodeMerk) {
            case "11" -> "CROOZ";
            case "12" -> "SUNDAYS";
            case "13" -> "NIFTY";
            case "14" -> "NERD";
            case "15" -> "GEEK";
            default -> "Merk Lain";
        };
    }
    
    public String getWarnaCelana() {
        String kodeWarna = getKodePembeli().substring(2, 4);
        return switch (kodeWarna) {
            case "11" -> "Biru";
            case "12" -> "Kuning";
            case "13" -> "Merah";
            case "14" -> "Kelabu";
            case "15" -> "Jingga";
            default -> "Warna Lain";
        };
    }
    
    public String getUkuranCelana() {
        String kodeUkuran = getKodePembeli().substring(4, 6);
        return switch (kodeUkuran) {
            case "11" -> "S";
            case "12" -> "M";
            case "13" -> "L";
            case "14" -> "XL";
            default -> "Ukuran Lain";
        };
    }
    
    // Polymorphism (Overriding)
    
    @Override
    public String info() {
        return super.info() +
                "\nMerk Celana: " + getMerkCelana() +
                "\nWarna Celana: " + getWarnaCelana() +
                "\nUkuran Celana: " + getUkuranCelana();
    }
}