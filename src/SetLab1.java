import java.util.*;

public class SetLab1 {
    public static void doldur(SortedSet<Integer> integerss,int sütunn){
        integerss.clear();
        Random random=new Random();
        while (integerss.size()<sütunn){
            int sayi=random.nextInt(49)+1;//0 -48 dahil sayi üretir biz 49 u istedigimiz icin 1 ekledik.
            integerss.add(sayi);
        }
    }
    public static void main(String[] args) {
        SortedSet<Integer> integers=new TreeSet<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Satir sayisi:");
        int satir=scanner.nextInt();
        System.out.print("Sütun sayisi:");
        int sütun=scanner.nextInt();
        for (int i=0;i<satir;i++){
            doldur(integers,sütun);
            Iterator<Integer> iterator=integers.iterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next()+" ");
            }
            System.out.println();
        }
    }
}
