import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        SortedMap<String,String> sortedMap=new TreeMap<>();
        sortedMap.put("Ev","Home");
        sortedMap.put("Araba","Car");
        sortedMap.put("Kalem","Pencil");

        String value=sortedMap.get("Araba");//value dondurur.
        System.out.println(value);//Car
        System.out.println("------");
        Set<String> keyset=sortedMap.keySet();
        Iterator<String > iterator=keyset.iterator();
        /*
        * sortedMap.keySet() metodu, SortedMap içerisindeki tüm anahtarları bir Set olarak döner.
Set arayüzü, tekrarlayan (duplicate) elemanlara izin vermez. Dolayısıyla, her anahtar benzersiz olur.
* Bu satırda, keyset üzerindeki anahtarlar arasında gezinmek için bir Iterator oluşturulur.
*/
        while (iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next+" "+sortedMap.get(next));
        }
        /*
        * Detaylı Açıklama:
iterator() metodu, bir Set üzerinde sırayla ilerleyebilmek için bir iteratör döner.
Bu iteratör, keyset'in içindeki her anahtarı sırayla almanızı sağlar.
Iterator arayüzünün temel metotları şunlardır:
hasNext() → Sıradaki elemanın olup olmadığını kontrol eder. Eğer eleman varsa true, yoksa false döner.
next() → Sıradaki elemanı döner ve ilerler.*/

    }
}
