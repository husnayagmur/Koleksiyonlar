import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set4 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(9);
        System.out.println(hashSet.size());//4 olur cunku 2 tane 3 vardir lakin birini gecerli sayar.
        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }

        LinkedHashSet<Set4_Araba> hashSet1=new LinkedHashSet<>();
        hashSet1.add(new Set4_Araba("42 AA 789","X","Y"));
        hashSet1.add(new Set4_Araba("70 HS 200","A","B"));
        hashSet1.add(new Set4_Araba("23 SH 220","X","B"));
        hashSet1.add(new Set4_Araba("70 HS 200","A","B"));
        Iterator<Set4_Araba> iterator1=hashSet1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
/*
* Temel Fark:
Birinci Yaklaşım (Doğrudan Yazdırma): Sıradaki eleman doğrudan yazdırılır. Hızlı ve pratik bir yöntemdir, ancak elemanı bir değişkende tutmaz. Eğer eleman üzerinde başka işlemler yapmayacaksanız, bu yöntemi kullanabilirsiniz.

İkinci Yaklaşım (Değişkene Atayıp Yazdırma): Sıradaki eleman önce bir değişkene atanır ve sonra yazdırılır. Eğer bu elemanla başka işlemler yapmak isterseniz (mesela elemanı kontrol etmek, başka bir değere çevirmek, hesaplama yapmak), bu yöntem daha esnek olur.*/
