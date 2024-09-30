import java.io.Serializable;
import java.util.Date;

public class Map6_Kitap implements Serializable {
    private String ad;
    private Date yayinTarihi;
    private String yazar;

    public Map6_Kitap() {
    }
    public Map6_Kitap(String ad,Date yayinTarihi,String Yazar) {
        this.ad = ad;
        this.yayinTarihi=yayinTarihi;
        this.yazar=yazar;
    }

    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Date getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(Date yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    @Override
    public int hashCode(){
        return ad.hashCode()+yayinTarihi.hashCode()+yazar.hashCode();
    }
    @Override
    public boolean equals(Object o){
        Map6_Kitap kitap=(Map6_Kitap) o;
        return kitap.yazar.equals(this.yazar)&&kitap.yayinTarihi.equals(this.yayinTarihi)&&kitap.ad.equals(this.ad);
    }
    @Override
    public String toString(){
        return "Ad:"+ad+"  Yayinlanma Tarihi:"+yayinTarihi+"  Yazar:"+yazar;
    }
}
