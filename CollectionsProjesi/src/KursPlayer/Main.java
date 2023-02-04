package KursPlayer;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    //ctrlaltl tuşuyla sayfa düzenlenir.
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("ali", "alinin tanitim yazisi", "ali_udemy");
        Ogrenci ogr2 = new Ogrenci("ahmet", "ahmetin tanıtım yazısı", "ahmet_udemy");
        Egitmen hoca1 = new Egitmen("Hoca1", "Hoca1 java", "Hoca1 udemy");
        Egitmen deneme = new Egitmen("deneme", "deneme java", "deneme_udemy");
        //System.out.println(ogr1);
        //System.out.println(hoca1);


        Ders d1 = new Ders(1, " Giriş", 3.5);
        Ders d2 = new Ders(2, " Java Nedir", 9.2);
        Ders d3 = new Ders(3, " Primitive Veri Tipleri", 22.9);
        Ders d4 = new Ders(4, " Diziler", 15.9);
        Ders d5 = new Ders(5, " Metotlar", 15.9);
        Ders d6 = new Ders(6, " Nesneler", 15.9);
        Ders d7 = new Ders(7, " Try-Catch", 15.9);
        Ders d8 = new Ders(8, " Recyclerview", 15.9);
        Ders d9 = new Ders(9, " Sharedpreferencas", 15.9);
        Ders d10 = new Ders(10, " Firebase", 15.9);

        Kurs javaKursu = new Kurs("İleri seviye Java Kursu", hoca1);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);
        javaKursu.kursaEgitmenEkle(deneme);
        javaKursu.kursaEgitmenSil(hoca1);
        javaKursu.kursaEgitmenSil(deneme);

        Kurs androidKursu = new Kurs("android kursu", hoca1);
        androidKursu.kursaDersEkle(d6);
        androidKursu.kursaDersEkle(d7);
        androidKursu.kursaDersEkle(d8);
        androidKursu.kursaDersEkle(d9);
        androidKursu.kursaDersEkle(d10);

        ogr1.kursaKatil(javaKursu);
        ogr1.kursaKatil(androidKursu);
        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d2);
        ogr1.izlenecekDersEkle(d8);
        ogr1.izlenecekDersEkle(d7);

        ogr2.kursaKatil(javaKursu);
        ogr2.kursaKatil(androidKursu);
        ogr2.izlenecekDersEkle(d10);
        ogr2.izlenecekDersEkle(d8);
        ogr2.izlenecekDersEkle(d5);
        ogr2.izlenecekDersEkle(d3);
        ogr2.izlenecekDersEkle(d2);
        ogr2.izlenecekDersEkle(d1);


        Scanner tara = new Scanner(System.in);
        System.out.println("****************Lütfen hangi öğrenci için bilgi almak istiyorsanız  seçiniz *********");
        System.out.println("1. öğrenci için '1' ikinci öğrenci için '2' giriniz \n");
        int secim = tara.nextInt();

        if (secim == 1) {
            listeyiOynat(ogr1.getIzlenecekDersListesi());
        }
        if (secim == 2) {
            listeyiOynat(ogr2.getIzlenecekDersListesi());
        } else {
            System.out.println("Doğru seçim yapmadınız");
        }

    }


    public static void listeyiOynat(LinkedList<Ders> izlenecekDersler) {

        Scanner tara = new Scanner(System.in);
        boolean cikis = false;
        boolean ileriDogruHareket = true;

        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println(" Henüz bir ders eklenmemiş");

        } else {

            Ders ilkDers = iterator.next();
            System.out.println(" Şuan izlenen ders : " + ilkDers.getDersBaslik() + ", Süresi : " + ilkDers.getDakika());
        }


        menuGoster();
        while (!cikis) {
            System.out.println("Seçiminiz : ");
            int kullaniciSecimi = tara.nextInt();


            switch (kullaniciSecimi) {

                case 0:
                    System.out.println("Uygulamadan çıkılıyor...");
                    cikis = true;
                    break;
                case 1:
                    if (!ileriDogruHareket) {
                        ileriDogruHareket = true;
                        if (iterator.hasNext())
                            iterator.next();
                    }
                    if (iterator.hasNext()) {
                        Ders ilkDers = iterator.next();
                        System.out.println("==========================================================");
                        System.out.println(" Şuan oynatılan : Ders  no: " + ilkDers.getDersNo() + " , Başlık : " + ilkDers.getDersBaslik() + ", Süre : " + ilkDers.getDakika());
                        System.out.println("==========================================================");
                    } else {
                        System.out.println(" Listenin sonuna geldiniz");
                    }
                    break;
                case 2:
                    if (ileriDogruHareket) {
                        ileriDogruHareket = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        Ders ilkDers = iterator.previous();
                        System.out.println("==========================================================");
                        System.out.println(" Şuan oynatılan : Ders  no: " + ilkDers.getDersNo() + " , Başlık : " + ilkDers.getDersBaslik() + ", Süre : " + ilkDers.getDakika());
                        System.out.println("==========================================================");

                    } else {
                        System.out.println(" Listenin başına geldiniz");


                    }
                    break;
                case 3:
                    izlenecekDersleriListele(izlenecekDersler);
                    break;


                case 9:
                    menuGoster();
                    break;
            }
        }

    }

    private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {
        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println(" Henüz bir ders eklenmemiş.");
            return;

        } else {
            while (iterator.hasNext()) {
                Ders ilkDers = iterator.next();

                System.out.println(" Ders no: " + ilkDers.getDersNo() + ",  Başlık : " + ilkDers.getDersBaslik() + ", Süre : " + ilkDers.getDakika());

            }
        }

    }

    private static void menuGoster() {

        System.out.println("*************** MENU *********************");
        System.out.println("0- Çıkış");
        System.out.println("1-  Bir sonraki derse git");
        System.out.println("2- Bir önceki derse git");
        System.out.println("3-Tüm listeyi göster");
        System.out.println("9- Menüyü Gör");


    }


}
