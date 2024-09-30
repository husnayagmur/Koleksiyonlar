import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Scanner;

public class SetLab2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çıkmak için -1 giriniz!");
        int i=0;
        while ((i=scanner.nextInt())!=-1){
            linkedHashSet.add(i);
        }
        System.out.println("Sayi adedi:"+linkedHashSet.size());
        Iterator<Integer> iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
