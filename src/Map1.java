import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
    //Iterator arayüzünü implemente etmez.
    /*
    * Map'in Temel Özellikleri
Anahtar (Key): Her anahtar benzersizdir. Aynı anahtarla birden fazla giriş eklenmeye çalışılırsa, eski anahtar üzerine yazılır.
Değer (Value): Aynı değer farklı anahtarlarla eşleştirilebilir.
Entry: Bir anahtar ve ona karşılık gelen değerin oluşturduğu çift. Bu girişler Map içinde saklanır.
*/
    public static void main(String[] args) {
        HashMap<Integer,String > hashMap=new HashMap<>();
        //Bu satır, anahtar olarak Integer (tamsayı) ve değer olarak String (metin) türünde veriler depolayan bir HashMap oluşturur. HashMap, anahtar-değer çiftlerini hash tabanlı bir yapıda tutar.
        hashMap.put(34,"Istanbul");//put() metodu, HashMap'e bir anahtar-değer çifti ekler.
        hashMap.put(70,"Karaman");//Anahtar: 70, Değer: "Karaman"
        hashMap.put(23,"Elazığ");
        System.out.println(hashMap.size());

        String string=hashMap.get(10);
        // Bu satır, get() metodu ile HashMap'ten anahtar değeri 10 olan girişin değerini alır. Ancak, HashMap'te 10 anahtarı bulunmadığı için bu satır null dönecektir.
        System.out.println(string);

        /*
        * keySet() metodu, HashMap içindeki tüm anahtarları bir Set olarak döner. Bu set, tekrar eden elemanlar içermez.
        * Şu ana kadar HashMap'e 34, 70, ve 23 anahtarları eklendiğinden, keySet() bu anahtarları döner.*/
        Set<Integer> keyset=hashMap.keySet();
        Iterator<Integer> iterator=keyset.iterator();
        //iterator() metodu, anahtarlar üzerinde gezinmemizi sağlayan bir Iterator döner. Bu iterator, while döngüsü ile kullanılarak tüm anahtarları sırayla alır.
        while (iterator.hasNext()){
            Integer key=iterator.next();
            System.out.print(key+" ");
            String value=hashMap.get(key);
            System.out.println(value);
        }


    }
}
