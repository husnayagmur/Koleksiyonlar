import java.util.Iterator;

public class IteratorLab_Ogrenci implements Iterable<Integer> {
    private String isim;
    private int[] notlar;

    public IteratorLab_Ogrenci() {
    }

    public IteratorLab_Ogrenci(String isim, int[] notlar) {
        this.isim = isim;
        this.notlar = notlar;
    }

    private int index = 0;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int[] getNotlar() {
        return notlar;
    }

    public void setNotlar(int[] notlar) {
        this.notlar = notlar;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return index<notlar.length;
            }

            @Override
            public Integer next() {
                return notlar[index++];
            }
        };
    }
}
/*
*index < notlar.length;
index değişkeni, dizideki mevcut konumu temsil eder. Dizi, notlar adlı bir tam sayı dizisi.
notlar.length, dizinin uzunluğunu (eleman sayısını) verir.
Bu ifade, index değişkeninin dizinin sonuna ulaşıp ulaşmadığını kontrol eder.
Eğer index, dizinin boyutundan küçükse (<), hâlâ dizide okunmamış elemanlar var demektir ve true döndürülür.
* Aksi halde, false döndürülerek daha fazla elemanın olmadığı belirtilir.

* return notlar[index++];
İlk olarak index değerini kullanır (yani dizinin o anki konumundaki elemanı döndürür).
Daha sonra index değişkeninin değerini 1 artırır.
Örneğin, diyelim ki index değeri 2, notlar[2] döndürülecek, ancak işlem tamamlandıktan sonra index değeri 3 olacaktır.
Böylece bir sonraki next() çağrısında, dizideki bir sonraki eleman döndürülecek.*/
