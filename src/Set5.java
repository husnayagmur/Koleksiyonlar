import java.util.Iterator;
import java.util.TreeSet;

public class Set5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Siyah");
        treeSet.add("Beyaz");
        treeSet.add("Kırmızı");
        System.out.println(treeSet.size());
        Iterator<String> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }

        TreeSet<Set5_Sehir> treeSet1=new TreeSet<>();
        treeSet1.add(new Set5_Sehir("42","Konya"));
        treeSet1.add(new Set5_Sehir("70","Karaman"));
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
        Iterator<Set5_Sehir> iterator1=treeSet1.iterator();
        while (iterator1.hasNext()){
            Set5_Sehir next1=iterator1.next();
            System.out.println(next1);
        }
        }
    }
