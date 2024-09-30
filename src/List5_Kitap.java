import java.io.Serializable;

public class List5_Kitap implements Serializable {
    private String ad;
    private int yil;
    private List5_Yazar yazar;

    public List5_Kitap() {
    }
    public List5_Kitap(String ad,int yil,List5_Yazar yazar) {
        this.ad = ad;
        this.yil=yil;
        this.yazar=yazar;
    }

    public List5_Yazar getYazar() {
        return yazar;
    }

    public void setYazar(List5_Yazar yazar) {
        this.yazar = yazar;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    @Override
    public boolean equals(Object o){
        List5_Kitap kitap=(List5_Kitap) o;
        return this.ad.equals(this.ad)&&this.yazar.equals(this.yazar);
    }
    @Override
    public String toString(){
        return "Ad:"+ad+" "+"  Yil:"+yil+"  Yazar:"+yazar;
    }
}
