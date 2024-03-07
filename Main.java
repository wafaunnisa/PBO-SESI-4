// Parent class BangunDatar
abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}

// Kelas Segitiga
abstract class Segitiga extends BangunDatar {
    protected double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

// Kelas turunan SegitigaSikuSiku
class SegitigaSikuSiku extends Segitiga {
    private double sisi;

    public SegitigaSikuSiku(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        double semiPerimeter = sisi / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sisi) * (semiPerimeter - sisi) + sisi * sisi);
        return area;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}

// Kelas Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas
        SegitigaSikuSiku segitiga = new SegitigaSikuSiku(7);
        System.out.println("Luas Segitiga Siku-Siku: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga Siku-Siku: " + segitiga.hitungKeliling());
        
        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        
        Lingkaran lingkaran = new Lingkaran(4);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}
