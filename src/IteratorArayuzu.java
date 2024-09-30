import java.util.ArrayList;
import java.util.Random;

public class IteratorArayuzu {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<100;i++){
            System.out.println(random.nextInt(100));
        }
        System.out.println(arrayList.size());
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
/*
* Iterator, Java'da koleksiyonlar (listeler, setler vb.) üzerinde elemanları sırayla dolaşmak (iterate etmek) için kullanılan bir arayüzdür. Iterator kullanarak bir koleksiyonun her bir elemanına teker teker ulaşabilir ve gerektiğinde bu elemanları koleksiyondan kaldırabilirsiniz.

Neden Iterator Kullanılır?
Koleksiyonun elemanlarını sırayla işlemek için.
Iterator kullanımı, döngülerde indeksleme yapma ihtiyacını ortadan kaldırır.
Elemanları güvenli bir şekilde kaldırmanıza imkan tanır (yani, remove() yöntemiyle).
Temel Yöntemler:
hasNext(): İteratörde daha fazla eleman olup olmadığını kontrol eder. Eğer eleman varsa true, yoksa false döner.
next(): İteratördeki bir sonraki elemanı döner.
remove(): İteratördeki son döndürülen elemanı koleksiyondan kaldırır.*/
