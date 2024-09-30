import java.io.Serializable;

public class List5_Yazar implements Serializable {
    private String ad;
    private String soyad;

    public List5_Yazar() {
    }
    public List5_Yazar(String ad,String soyad) {
        this.ad = ad;
        this.soyad=soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    @Override
    public boolean equals(Object o){
        List5_Yazar yazar=(List5_Yazar)o;
        return yazar.ad.equals(this.ad)&&yazar.soyad.equals(this.soyad);
    }
    @Override
    public int hashCode(){
        return this.ad.hashCode()+this.soyad.hashCode();
    }
    @Override
    public String toString(){
        return "Ad:"+ad+" "+"  Soyad:"+soyad;
    }
}
