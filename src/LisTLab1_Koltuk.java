import java.io.Serializable;

public class LisTLab1_Koltuk implements Serializable {
    private int numara;
    private ListLab1_Bilet bilet;

    public LisTLab1_Koltuk() {
    }
    public LisTLab1_Koltuk(int numara,ListLab1_Bilet bilet) {
        this.numara = numara;
        this.bilet=bilet;
    }

    public ListLab1_Bilet getBilet() {
        return bilet;
    }

    public void setBilet(ListLab1_Bilet bilet) {
        this.bilet = bilet;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    @Override
    public int hashCode(){
        return this.numara+bilet.getNumara();
    }
    @Override
    public boolean equals(Object o){
        LisTLab1_Koltuk koltuk=(LisTLab1_Koltuk) o;
        return this.numara==koltuk.numara&&this.bilet.equals(koltuk.bilet);
    }
    @Override
    public String toString(){
        return "Numara:"+numara+"  Bilet:"+bilet.toString();
    }
}
/*
* numara ve bilet Üzerinden Karşılaştırma
equals() metodunun içinde iki karşılaştırma yapılır:
this.numara == koltuk.numara: Her iki LisTLab1_Koltuk nesnesinin numara alanlarının eşit olup olmadığını kontrol eder.
Eğer iki koltuk aynı numaraya sahipse, bu koltukların eşit olma ihtimali var demektir.
this.bilet.equals(koltuk.bilet): Koltuğa ait biletlerin de karşılaştırılması gerekiyor.
Ancak burada, bilet bir nesne olduğu için, onu direkt == operatörü ile karşılaştıramayız.
Bunun yerine, bilet nesnesinin equals() metodunu çağırarak, iki bilet nesnesinin içeriklerinin eşit olup olmadığını kontrol ederiz.
* equals() Metodunun Mantığı:
Bu metot, iki LisTLab1_Koltuk nesnesinin eşit olup olmadığını belirlemek için şu koşulları kullanır:
Koltuğun numarası aynı olmalı: Eğer iki koltuk farklı numaralara sahipse, onlar farklı koltuklardır.
Koltuğa atanmış biletler aynı olmalı: Sadece koltuk numarası aynıysa yeterli değil, biletler de eşit olmalı.
Bu, iki farklı biletin aynı koltuğu aldığını düşünmemek için önemli.*/