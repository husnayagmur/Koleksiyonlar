import java.util.Vector;

public class List4 {
    public static void main(String[] args) {
        Vector<String > vector=new Vector<>(4);
        //vektör kapasitesini aşınca 2 katına çıkar.
        vector.add("Kedi");
        vector.add("Kopek");
        vector.add("Kuş");
        vector.add("Ayı");
        vector.add("Tavşan");
        for (int i=0;i<vector.size();i++){
            String string=vector.get(i);
            System.out.println(i+" "+string);
        }
        System.out.println(vector.capacity());
        System.out.println(vector.contains("At"));
        int indexOf=vector.indexOf("Kaplan");
        System.out.println(indexOf);

        vector.clear();//vektorun icerindeki elemanlari temizler.
        System.out.println(vector.size());
        System.out.println(vector.capacity());//genisledigi degerler aynı olur.
    }
}
