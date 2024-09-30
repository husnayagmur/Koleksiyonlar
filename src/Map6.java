import java.util.*;

public class Map6 {
    public static void main(String[] args) {
        HashMap<Integer,Map6_Kitap> hashMap=new HashMap<>();
        hashMap.put(1,new Map6_Kitap("X",new Date(),"A"));
        hashMap.put(3,new Map6_Kitap("Z",new Date(),"C"));
        hashMap.put(2,new Map6_Kitap("Y",new Date(),"B"));
        Set<Integer> keyset=hashMap.keySet();
        Iterator<Integer> iterator=keyset.iterator();
        while (iterator.hasNext()){
            Integer key=iterator.next();
            System.out.println(key+" "+hashMap.get(key));
        }


    }
}
