import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map5 {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Bilgisayar", 22000.0);
        hashMap.put("Telefon", 18000.0);
        hashMap.put("Araba", 1000000.0);
        Set<String> keyset = hashMap.keySet();
        Iterator<String> iterator = keyset.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " " + hashMap.get(key));
        }

        System.out.println("-------");
        hashMap.remove("Araba");//Arabayi siler.
        Set<String> keyset1 = hashMap.keySet();
        Iterator<String> iterator1 = keyset.iterator();
        while (iterator1.hasNext()) {
            String key1 = iterator1.next();
            System.out.println(key1 + " " + hashMap.get(key1));
        }
        hashMap.replace("Telefon", 16000.0);//Günceller.
        System.out.println("-------");
        hashMap.remove("Araba");//Arabayi siler.
        Set<String> keyset2 = hashMap.keySet();
        Iterator<String> iterator2 = keyset.iterator();
        while (iterator2.hasNext()) {
            String key2 = iterator2.next();
            System.out.println(key2 + " " + hashMap.get(key2));
        }
    }
}
