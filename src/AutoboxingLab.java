import java.util.ArrayList;

public class AutoboxingLab {
    public static void main(String[] args) {
        {
            // Bir List koleksiyonu oluşturuyoruz. Bu koleksiyon sadece Integer türünde nesneleri saklar.
            ArrayList<Integer> sayilar = new ArrayList<>();

            // Autoboxing: Burada 5 bir int veri türü, ancak Java otomatik olarak bunu Integer nesnesine dönüştürür.
            sayilar.add(5);  // int -> Integer (Autoboxing)

            // Aynı şekilde diğer int değerler de ekleniyor.
            sayilar.add(10); // int -> Integer (Autoboxing)
            sayilar.add(15); // int -> Integer (Autoboxing)

            // Koleksiyon elemanlarını ekrana yazdırıyoruz.
            for (Integer sayi : sayilar) {
                System.out.println(sayi); // Çıktı: 5, 10, 15
            }
        }
    }
}
/*
    * Koleksiyonlar ve Nesneler ile Çalışma: Java'nın koleksiyon sınıfları (List, Set, vb.)
    ve diğer bazı yapılar sadece nesnelerle çalışır, primitive türlerle değil. Bu yüzden, int gibi primitive türleri Integer gibi sarmalayıcı sınıflara dönüştürmek gerekir.
    Autoboxing sayesinde bu dönüşüm otomatik yapılır.
    * Java'da her bir temel veri türünün karşılık gelen bir wrapper sınıfı vardır:

int → Integer
char → Character
double → Double
boolean → Boolean
float → Float
long → Long
byte → Byte
short → Short
Autoboxing ile temel bir veri türü (örneğin int)
gerektiğinde otomatik olarak onun sarmalayıcı sınıfı olan Integer nesnesine dönüştürülür.
*/
