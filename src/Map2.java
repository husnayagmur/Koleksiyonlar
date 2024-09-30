import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer,Map2_Sehir> map2SehirMap=new HashMap<>();
        map2SehirMap.put(34,new Map2_Sehir("Istanbul",15_634_257));
        map2SehirMap.put(23,new Map2_Sehir("Elazığ",592_811));
        map2SehirMap.put(70,new Map2_Sehir("Karaman",263_960));

        System.out.println(map2SehirMap.size());
        System.out.println("-----------");
        Map2_Sehir sehir1=map2SehirMap.get(34);
        System.out.println(sehir1);
        System.out.println("-----------");
        Set<Integer> keySet=map2SehirMap.keySet();
        Iterator<Integer> iterator=keySet.iterator();
        while (iterator.hasNext()){
            Integer index=iterator.next();
            System.out.println(index+" "+map2SehirMap.get(index));
        }//Index ve degerleri yazdirir.
        System.out.println("-----------");
        Collection<Map2_Sehir> values=map2SehirMap.values();
        Iterator<Map2_Sehir> iterator1=values.iterator();
        while (iterator1.hasNext()){
            Map2_Sehir sehir2=iterator1.next();
            System.out.println(sehir1);
        }//Degerleri yazdirir.
        System.out.println("-----------");
        Set<Map.Entry<Integer,Map2_Sehir>> entries=map2SehirMap.entrySet();
        Iterator<Map.Entry<Integer,Map2_Sehir>> iterator2=entries.iterator();
        while (iterator2.hasNext()){
            Map.Entry<Integer,Map2_Sehir> sehir3 =iterator2.next();
            System.out.print(sehir3.getKey()+" ");
            System.out.println(sehir3.getValue());
        }//anahtar ve degerleri yazdirir.
        System.out.println("***************");

    }
}
