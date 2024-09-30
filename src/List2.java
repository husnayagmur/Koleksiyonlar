import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {
        ArrayList<String > arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String line=null;
        while (!(line=scanner.nextLine()).equals("exit")){
            arrayList.add(line);
        }
        /*Iterator<String > iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

         */
        for (int i=0;i<arrayList.size();i++){//for ile ekrana yazdirma.
            System.out.println("İndex:"+i+" "+"Deger:"+arrayList.get(i));
        }
        arrayList.remove(1);//1. indexdeki elemani sil.
    }
}
