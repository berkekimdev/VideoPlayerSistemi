package KursPlayer;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    private ArrayList<Ogrenci> kursOgrencileri;
    private boolean yayinda;


    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.kursOgrencileri = new ArrayList<>();
        kursEgitmenleri.add(0, basEgitmen);
        this.yayinda = false;
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen) {

        if (!(kursEgitmenleri.contains(yeniEgitmen))) {
            kursEgitmenleri.add(yeniEgitmen);
            System.out.println(yeniEgitmen.getIsim() + " Kursa eğitmen olarak eklendi.");
        } else
            System.out.println(yeniEgitmen.getIsim() + "Zaten kursta tanımlı bir eğitmendir");
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen) {

        if (silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())) {
            System.out.println(silinecekEgitmen.getIsim() + "Kursu baş eğitmeni  o yüzden silinemez");
        } else {
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim() + " kurs eğitmenliğinden çıkarıldı");
        }


    }

    public void kursaDersEkle(Ders eklenecekDers) {
        kurstakiDersler.add(eklenecekDers);
    }

    public int kurstakiDersSayisi() {
        return kurstakiDersler.size();
    }

    private double kurstakiToplamDerslerinDakikaSuresi() {

        double toplamSure = 0;

        for (Ders temp : kurstakiDersler) {

            toplamSure = toplamSure + temp.getDakika();

        }

        return toplamSure;
    }

    public boolean kursYayindaKontrol() {
        if (kurstakiDersler.size() >= 5 && kurstakiToplamDerslerinDakikaSuresi() >= 60) {
            yayinda = true;
            return true;
        } else return false;
    }


    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }
}


