import java.io.Serializable;

public class Map4_Kisi implements Serializable {
    private String tc;
    private String ad;
    private String soyad;
    private Map4_Cinsiyet cinsiyet;

    public Map4_Kisi() {
    }
    public Map4_Kisi(String tc,String ad,String Soyad,Map4_Cinsiyet cinsiyet) {
        this.tc = tc;
        this.ad=ad;
        this.soyad=soyad;
        this.cinsiyet=cinsiyet;
    }

    public String getTc() {
        return tc;
    }

    public Map4_Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Map4_Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    @Override
    public int hashCode(){
        return tc.hashCode();
    }
    @Override
    public boolean equals(Object o){
        Map4_Kisi kisi1=(Map4_Kisi) o;
        return kisi1.tc.equals(this.tc);
    }
    @Override
    public String toString(){
        return "Tc:"+tc+" "+"Ad:"+ad+" "+"Soyad:"+soyad+" "+"Cinsiyet:"+cinsiyet;
    }
}
