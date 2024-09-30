import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Map4 {
    public static void main(String[] args) {
        SortedMap<Integer,Map4_Kisi> sortedMap=new TreeMap<>();
        sortedMap.put(1,new Map4_Kisi("123","Ali","Oz",Map4_Cinsiyet.ERKEK));
        sortedMap.put(3,new Map4_Kisi("789","Merve","Un",Map4_Cinsiyet.KADIN));
        sortedMap.put(4,new Map4_Kisi("246","Hira","Kar",Map4_Cinsiyet.KADIN));
        sortedMap.put(2,new Map4_Kisi("456","Abdurrahman","Demir",Map4_Cinsiyet.ERKEK));

        /*
        *Bu kodda, SortedMap<Integer, Map4_Kisi> kullanarak bir TreeMap oluşturuyorsunuz.
        * TreeMap, Java'da sıralı bir haritadır ve anahtarları doğal sıralamalarına veya belirtilen bir Comparator'a göre sıralar.*/

        Set<Map.Entry<Integer,Map4_Kisi>> entries=sortedMap.entrySet();
        Iterator<Map.Entry<Integer,Map4_Kisi>> iterator=entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Map4_Kisi> kisi1=iterator.next();
            System.out.println(kisi1.getKey()+" "+kisi1.getValue());
        }

    }
}
