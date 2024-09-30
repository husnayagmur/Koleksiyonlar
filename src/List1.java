import java.util.Iterator;
import java.util.LinkedList;

public class List1 {
    /*
    * List Özellikleri:
Sıralı Yapı (Ordered Structure): List arayüzü elemanları ekleme sırasına göre tutar, yani elemanlar eklenme sırasına göre sıralıdır.
Tekrarlı Elemanlar (Duplicate Elements): List, aynı elemanı birden fazla kez içerebilir. Örneğin, aynı değeri birçok kez listeye ekleyebilirsiniz.
Null Değeri: List'e null değeri eklenebilir ve birden fazla null değeri içerebilir.*/
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(2,55);//2. indekse 55 degerini ekle.
        System.out.println("Eleman sayisi: "+linkedList.size());
        Iterator<Integer> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }
        System.out.println(linkedList.get(0));//get(0) ifadesi, listenin ilk elemanını temsil eder.
        System.out.println(linkedList.get(linkedList.size()-1));//linkedList.size() - 1, listenin son elemanının indeksini ifade eder (çünkü indeksler 0'dan başladığı için son elemanın indeksi size - 1 olur).
        linkedList.addFirst(33);//addFirst() metodu, elemanı listenin en önüne (ilk eleman olarak) ekler.
        System.out.println(linkedList.getFirst());
        /*
        * Bu satır, listenin ilk elemanını ekrana yazdırır.
getFirst() metodu, listenin başındaki elemanı döndürür. Az önce 33 başa eklendiği için bu satır 33 çıktısını verir.*/
        linkedList.addLast(44);//addLast() metodu, elemanı listenin sonuna ekler.
        System.out.println(linkedList.getLast());
        /*
        * getLast() metodu, listenin sonundaki elemanı döndürür. Az önce sonuna 44 eklendiği için bu satır 44 çıktısını verir.*/
        int indexOf=linkedList.indexOf(33);
        System.out.println(indexOf);
        /*
        *indexOf(33) metodu, listenin içinde 33'ün bulunduğu ilk konumun indeksini döndürür. Eğer 33 listenin başına eklendiyse, indeksi 0 olacaktır.*/
        System.out.println(linkedList.indexOf(22));
        System.out.println(linkedList.lastIndexOf(22));
        /*
        *System.out.println(linkedList.indexOf(22));
indexOf(22) metodu, linkedList içinde 22 sayısının ilk geçtiği yerin indeksini bulur.
Eğer 22 listede mevcutsa, bu metot 22'nin bulunduğu ilk indeks numarasını döndürür.
Eğer 22 listede yoksa, bu metot -1 döndürür.

2. System.out.println(linkedList.lastIndexOf(22));
lastIndexOf(22) metodu, linkedList içinde 22 sayısının son geçtiği yerin indeksini bulur.
Eğer 22 listede mevcutsa, bu metot 22'nin bulunduğu son indeks numarasını döndürür.
Eğer 22 listede yoksa, bu metot da -1 döndürür.*/
    }
}
