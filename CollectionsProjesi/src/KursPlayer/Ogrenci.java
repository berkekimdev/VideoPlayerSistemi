package KursPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;


    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
        izlenecekDersListesi = new LinkedList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }

    public void kursaKatil(Kurs javaKursu) {

        if (javaKursu.kursYayindaKontrol()) {
            javaKursu.getKursOgrencileri().add(this);
            katildigiKurslar.add(javaKursu);
            System.out.println(this.getIsim() + " kullanicisi " + javaKursu.getKursAdi() + " kursuna katıldı");
        } else {

            System.out.println(javaKursu.getKursAdi() + " isimli kurs yayında değil katılamazsınız");
        }


    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    public void izlenecekDersEkle(Ders izlenecekDers) {
        boolean dersBulundu = false;
        if (katildigiKurslar.size() > 0) {
            for (Kurs temp : katildigiKurslar) {
                if (temp.getKurstakiDersler().contains(izlenecekDers)) {
                    System.out.println("izlenecekler listesine " + temp.getKursAdi() + " kursunda bulunan " + izlenecekDers.getDersBaslik() + " Dersi eklendi");
                    izlenecekDersListesi.add(izlenecekDers);
                    dersBulundu = true;
                    break;
                }
            }
            if (!dersBulundu) {
                System.out.println("Girilen ders kurslarda bulunamadi veya yetkisiz erişim");
            }

        }
    }


}
