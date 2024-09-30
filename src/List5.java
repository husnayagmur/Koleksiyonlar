import java.util.Vector;

public class List5 {
    public static void main(String[] args) {
        Vector<List5_Kitap> vector=new Vector<>();
        vector.add(new List5_Kitap("X",2010,new List5_Yazar("Ali","Ertuğ")));
        vector.add(new List5_Kitap("Y",2012,new List5_Yazar("Efnan","Demir")));
        vector.add(new List5_Kitap("Z",2022,new List5_Yazar("Ceyhun","Irmak")));
        for (int i=0;i<vector.size();i++){
            List5_Kitap kitap=vector.get(i);
            System.out.println(kitap);
        }
        System.out.println("---------------");
        //Tersten yazdirma
        for (int i=vector.size()-1;i>=0;i--){
            List5_Kitap kitap=vector.get(i);
            System.out.println(kitap);
        }

    }
}
