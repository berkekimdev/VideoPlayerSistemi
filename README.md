# VideoPlayerSistemi
Kurs video player uygulamalarının altyapı simülasyonu.Sistemde öğrenciler ve eğitmenler var. Öğrenciler istediği kursları satın almış ve istediği dersleri izleyebiliyor.Eğitmenler ise kursları  ve dersleri açıyor.Uyulan bazı kurallar var bunları aşağıda verdim.


# Projenin esas aldığı kurallar

Eğitmenlerin kurs oluşturabildiği ve öğrencilerin kursa katıldığı bir uygulama.
Bir kurs derslerden oluşur ve bir kursun aktif olması için ve o kursa öğrencilerin katılabilmesi için en az 5 tane derse sahip olması lazım. Ayrıca bu derslerin toplam uzunluğu 60 dakikadan fazla olması gerekiyor.
Bu altyapıyla birlikte öğrenci farklı kurslardaki dersleri bir listeye ekleyebilir ve bu listedeki dersleri ileri-geri gezip izleyebilir.

*Bir listeye bir ders eklenmeden önce öğrencinin kursa katılmış olması gerekiyor.Eğer kursa sahip değilse derslere erişemez.
*Bir öğrenci kursa katılacaksa o kursun en az 5 ders ve en az 60 dakikalık bir içeriğe sahip olması gerekiyor.
*Bir kursun birden fazla eğitmeni olabilir fakat ana eğitmen kurstan çıkamaz.


# Kullandığım araçlar ve yapılar.
Inheritance  yapısını kullanıp daha az kod kullandım.Dependency injection kurallarına uymaya çalıştım ve dikkat ettim.
Polymorphism kullanarak bağımlılığı azalttım.Bu sayede kod karmaşıklılığının önüne geçtim.
Collections  yapılarını kullandım.
Bazı yapılarda Arraylist kullandım ve bu sayede ilerde yapıların büyümesi endişesini duymadım.
İzlenilen dersleri gezmem gerektiği için LinkedList kullandım.
ListIterator kullanarak bu yapıları gezebildim.


![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/javailk.PNG?raw=true)
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/java2.PNG?raw=true )
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/javaliste1.PNG?raw=true )
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/javaliste2.PNG?raw=true )
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/javaliste3.PNG?raw=true )
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/1111111111.PNG?raw=true )
![image](https://github.com/sudkostik/VideoPlayerSistemi/blob/main/CollectionsProjesi/resimler/hocalar.PNG?raw=true )
