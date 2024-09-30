import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        /*
        Burada, SortedSet arayüzünün bir implementasyonu olan TreeSet kullanılıyor. TreeSet, öğeleri doğal sıralama düzenine göre (bu durumda artan sayısal sıraya göre) sıralar.
SortedSet arayüzü sayesinde, eklenecek tüm öğeler TreeSet içinde otomatik olarak sıralı bir şekilde tutulacaktır.*/
        sortedSet.add(3);
        sortedSet.add(5);
        sortedSet.add(8);
        Iterator<Integer> iterator = sortedSet.iterator();
        /*
        Bu satır, TreeSet'in içindeki öğeler üzerinde sırayla gezinebilmek için bir iterator oluşturur.
Iterator, Set'teki öğeleri baştan sona kadar dolaşmak için kullanılır.*/
        while (iterator.hasNext()) {
            /*
            Iterator, Set'teki öğelerin sonuna kadar ilerlemek için kullanılır. hasNext() metodu,
            hala ziyaret edilmemiş bir öğe olup olmadığını kontrol eder. Eğer varsa, döngü devam eder.*/
            Integer next = iterator.next();//Iterator'un sıradaki öğesini alır ve next değişkenine atar.
            System.out.println(next);
        }
        SortedSet<String> sortedSet2 = new TreeSet<>();
        sortedSet2.add("Hüsna");
        sortedSet2.add("Yagmur");
        sortedSet2.add("İrem");
        sortedSet2.add("Melike");
        Iterator<String> iterator2 = sortedSet2.iterator();
        while (iterator2.hasNext()) {
            String next2 = iterator2.next();
            System.out.println(next2);
        }
        SortedSet<Set1_Ogrenci> sortedSet3=new TreeSet<>();
        sortedSet3.add(new Set1_Ogrenci(5,"Hüsna"));
        sortedSet3.add(new Set1_Ogrenci(4,"İrem"));
        sortedSet3.add(new Set1_Ogrenci(6,"Melike"));
        Iterator<Set1_Ogrenci> iterator3=sortedSet3.iterator();
        while (iterator3.hasNext()){
            Set1_Ogrenci next3=iterator3.next();
            System.out.println(next3);
        }

    }
}