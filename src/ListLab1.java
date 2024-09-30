import java.awt.List;
import java.util.*;

public class ListLab1 {
    /*
    * Neden kullanılır?
Veri yapılarına hızlı erişim: hashCode(), özellikle HashMap ve HashSet gibi veri yapılarında anahtarların veya nesnelerin hızlı bir şekilde bulunabilmesi için kullanılır. Hash tabanlı veri yapıları, verilerin depolanacağı yeri belirlemek için bu hash kodunu kullanır.
Eşitlik kontrolü: Nesneler arasında karşılaştırma yaparken, eğer iki nesnenin hashCode() metodu aynı sonucu döndürüyorsa, bu nesneler potans
* iyel olarak eşittir (ancak eşit olduklarından emin olmak için equals() metodu da kontrol edilmelidir).*/
    public static void main(String[] args) {
        /*
        ListLab1_Bilet bilet=new ListLab1_Bilet(1,new Date(),25);
        LisTLab1_Koltuk koltuk=new LisTLab1_Koltuk(1,bilet);
        System.out.println(koltuk);
         */
        Random random=new Random();
        ArrayList<ListLab1_Bilet> biletListesi=new ArrayList<>();
        for(int a=0;a<100;a++){
            ListLab1_Bilet bilet=new ListLab1_Bilet(random.nextInt(1000),new Date(),random.nextFloat()*100);
            biletListesi.add(bilet);
       }
        ArrayList<LisTLab1_Koltuk> koltukListesi=new ArrayList<>();
       Scanner scanner=new Scanner(System.in);
        int secim=0;
        int  koltukNumarasi=0;
        System.out.println("Lütfenn Seçim Yapınız (1 Bilet Al),(0 Çıkış Yap)");
        while ((secim=scanner.nextInt())!=0){
            ListLab1_Bilet bilet=biletListesi.get(random.nextInt(biletListesi.size()));
            biletListesi.remove(bilet);//Rastgele seçilen bu bilet, tekrar satılmaması için listeden çıkarılır.
            LisTLab1_Koltuk koltuk=new LisTLab1_Koltuk(++koltukNumarasi,bilet);
            /*
            * Burada yeni bir koltuk oluşturuluyor. Koltuk, LisTLab1_Koltuk sınıfına ait bir nesne ve bir numara ile birlikte bir biletle ilişkilendiriliyor.
++koltukNumarasi ifadesi, koltuk numarasını bir artırır ve bu numara yeni koltuğa atanır.
Bu işlem her bir biletin bir koltukla ilişkilendirilmesini sağlar.*/
            koltukListesi.add(koltuk);
            System.out.println("Lütfenn Seçim Yapınız (1 Bilet Al),(0 Çıkış Yap)");
        }
        System.out.println("Satılan Bilet Sayisi:"+koltukListesi.size()+"  "+"Kalan Bilet Sayisi:"+biletListesi.size());
        Iterator<LisTLab1_Koltuk> iterator=koltukListesi.iterator();
        while (iterator.hasNext()){
            LisTLab1_Koltuk koltuk=iterator.next();
            System.out.println(koltuk);
        }
  }
}
