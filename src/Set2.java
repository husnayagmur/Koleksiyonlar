import java.util.*;

public class Set2 {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet=new TreeSet<>();
        navigableSet.add(2);
        navigableSet.add(8);
        navigableSet.add(4);
        navigableSet.add(3);
        navigableSet.add(3);
        navigableSet.add(5);
        System.out.println(navigableSet.size());//iki tane 3 yazdik birini kabul eder.
        System.out.println("-------");
        Iterator<Integer> iterator=navigableSet.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }
        System.out.println("-------");
        System.out.println(navigableSet.ceiling(5));//5 veya 5'den buyuk en kucuk degeri dondurur.
        System.out.println("-------");
        System.out.println(navigableSet.floor(6));//6 veya 6'dan kucuk en buyuk degeri dondurur.
        System.out.println("-------");
        System.out.println(navigableSet.lower(4));//4'den kucuk en buyuk degeri dondurur.
        System.out.println("-------");
        System.out.println(navigableSet.higher(5));//5'den buyuk en kucuk degeri dondurur

        SortedSet<Integer> sortedSet=navigableSet.headSet(5,true);
        Iterator<Integer> iterator2=sortedSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        /*
        * headSet() yalnızca, mevcut sıralı Set'in bir alt kümesini döndürür.
Yani sıralama zaten mevcut olduğundan, metot sıralama işlemi gerçekleştirmez,
yalnızca belirtilen sınır değerine kadar olan öğeleri seçer ve bunları döndürür.
        * navigableSet.headSet(5, true):
Bu ifade, NavigableSet arayüzüne ait bir headSet() metodunu kullanıyor.
headSet(5, true) metodu, navigableSet'teki tüm öğeleri alır ve bu öğelerin 5'ten küçük ya da 5'e eşit olanlarını döner.
headSet(5, true) ifadesindeki true parametresi, sınır değeri olan 5'in dahil edilip edilmediğini belirtir. true olduğu için, 5 de dönen Set'e dahil edilir. Eğer false olsaydı, 5 dahil edilmeyecekti.
Bu metot, 5'e kadar olan tüm öğeleri içeren bir SortedSet döndürür.
Yani, sortedSet içerisinde navigableSet'in 5'ten küçük veya 5'e eşit tüm öğeleri bulunur.

        * sortedSet.iterator():
sortedSet'in içindeki öğeleri sırayla dolaşmak için bir iterator oluşturur.
Iterator, Set'teki öğelere sırayla erişmek için kullanılır.

        *SortedSet<Integer> sortedSet = SortedSet.headSet(5, true);
Bu kod hatalıdır. Çünkü:
SortedSet, sadece bir arayüzdür (interface),
yani SortedSet'in kendisinden bir nesne oluşturulamaz ve SortedSet doğrudan çağrılıp metodlarına erişilemez.
SortedSet bir sınıf değil, bir arayüz olduğu için bu tarz kullanım yanlıştır.

       *SortedSet<Integer> sortedSet = navigableSet.headSet(5, true);
Bu kod doğru çalışır çünkü:
navigableSet bir NavigableSet nesnesidir.
NavigableSet, SortedSet arayüzünden türemiştir, yani NavigableSet, SortedSet'in sağladığı tüm işlevleri sağlar ve ek olarak daha fazla özellik sunar.
NavigableSet.headSet(5, true) metodu, 5'e kadar olan elemanları içeren bir alt küme döner. true parametresi ise 5'in alt kümeye dahil edilip edilmeyeceğini belirler. Burada true olduğu için 5 dahil edilir.*/


    }
}
