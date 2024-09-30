import java.io.Serializable;
import java.util.Date;

public class ListLab1_Bilet implements Serializable {
    private int numara;
    private Date tarih;
    private float fiyat;

    public ListLab1_Bilet() {
    }
    public ListLab1_Bilet(int numara,Date tarih,float fiyat) {
        this.numara = numara;
        this.tarih=tarih;
        this.fiyat=fiyat;
    }

    public int getNumara() {
        return numara;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    @Override
    public int hashCode(){
       return numara;
    }
    @Override
    public boolean equals(Object o){
        ListLab1_Bilet bilet=(ListLab1_Bilet) o;
        return bilet.numara==this.numara;
    }
    /*
    * bject o ve Object other arasında fonksiyonel olarak hiçbir fark yoktur.
Değişken adı, yalnızca metodun içinde o değişkeni nasıl kullanacağınızı belirtir.
Java derleyicisi açısından bu iki adın işlevi aynıdır.*/
    @Override
    public String toString(){
        return "Numara:"+numara+"  Tarih:"+tarih+"  Fiyat:"+fiyat;
    }
}
