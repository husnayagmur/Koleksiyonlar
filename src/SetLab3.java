import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetLab3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SortedSet<SetLab3_Ogrenci> sortedSet=new TreeSet<>();
        System.out.println("Öğrenci eklemek için (E),uygulamadan çıkmak için (X) tuslayiniz!");
        String line=null;
        while ((line=scanner.nextLine()).equals("E")){
            System.out.print("Numara:");
            int numara=Integer.parseInt(scanner.nextLine());
            System.out.print("Ad:");
            String adi=scanner.nextLine();
            System.out.print("Soyad:");
            String soyad=scanner.nextLine();
            System.out.print("Sinif:");
            String  sinif=scanner.nextLine();
            sortedSet.add(new SetLab3_Ogrenci(numara,adi,soyad,sinif));
            System.out.println("Öğrenci eklemek için (E),uygulamadan çıkmak için (X) tuslayiniz!");
        }
        Iterator<SetLab3_Ogrenci> iterator=sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
