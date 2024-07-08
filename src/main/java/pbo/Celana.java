package pbo;

public class Celana {
    // Atribut dan Encapsulation
    private String namaPembeli, kodePembeli;
    private int harga;
    
    //Method Constructor
    public Celana(String namaPembeli, String kodePembeli, int harga) {
        this.namaPembeli = namaPembeli;
        this.kodePembeli = kodePembeli;
        this.harga = harga;
    }
    
    //Method Mutator (Setter)
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setKodePembeli(String kodePembeli) {
        this.kodePembeli = kodePembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //Method Accessor (Getter)
    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getKodePembeli() {
        return kodePembeli;
    }

    public int getHarga() {
        return harga;
    }
    
    //Tampil Data
    public String info() {
        return "Nama Pembeli: "+getNamaPembeli()+
               "\nKode Pembeli: "+getKodePembeli()+
               "\nHarga: "+getHarga();
    }
    
    // Polymorphism (Overloading)
    public String info(String stok) {
        return info() + "\nStok Celana: " + stok;
    }
}