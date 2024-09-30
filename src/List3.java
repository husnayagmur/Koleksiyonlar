import java.util.ArrayList;

public class List3 {
    public static void main(String[] args) {

        ArrayList<List3_Film> arrayList=new ArrayList<>();
        arrayList.add(new List3_Film("X","Ali CAN",List3_FilmTipi.BELGESEL,2020));
        arrayList.add(new List3_Film("Y","Ertuğrul ÇALIŞKAN",List3_FilmTipi.BİLİM_KURGU,2022));
        arrayList.add(new List3_Film("Z","Ertuğ YILMAZ",List3_FilmTipi.KOMEDİ,1998));
        for (int i=0;i<arrayList.size();i++){
            List3_Film film= arrayList.get(i);
            System.out.println(film);
        }
        System.out.println("--------------");
        System.out.println(arrayList.get(0));
    }
}
