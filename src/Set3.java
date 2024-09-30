import java.util.HashSet;
import java.util.Iterator;
//Sırasız Veri Yapısı: Elemanlar ekleme sırasına göre değil, rastgele bir sırayla saklanır.
public class Set3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Karaman");
        hashSet.add("Konya");
        hashSet.add("Ankara");
        hashSet.add("Karaman");

        System.out.println(hashSet.size());// Ayni stringleri tek sayar.
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("--------------------");
        HashSet<Set3_Calisan> hashSet1 = new HashSet<>();
        hashSet1.add(new Set3_Calisan("Ali", 12345));
        hashSet1.add(new Set3_Calisan("Kerem", 75698));
        hashSet1.add(new Set3_Calisan("Cansu", 45612));
        hashSet1.add(new Set3_Calisan("Kerem", 75698));
        Iterator<Set3_Calisan> iterator1 = hashSet1.iterator();
        while (iterator1.hasNext()) {
            Set3_Calisan calisan = iterator1.next();
            System.out.println(calisan);
           /*
           hashCodeleri farklidir cunku override etmedik.
            System.out.println(calisan) burada iki kez keremi ekrana basar.

            @Override
    public int hashCode(){
       return Integer.valueOf(tcNo);
    } Sinifimiza bu kodlari eklersek  keremi 2 kez basar  hashCodeleri ayni olur.

            @Override
    public boolean equals(Object other){
        Set3_Calisan calisan=(Set3_Calisan) other;
        return Objects.equals(this.tcNo, calisan.tcNo);
    }Sinifimiza bu kodlari eklersek  keremi 2 kez basmaz artik ayni kisi oldugunu anlar.
            */
        }
    }
}
