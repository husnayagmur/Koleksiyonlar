import java.io.Serializable;

public class List3_Film implements Serializable {
    private String ad;
    private String yonetmen;
    private List3_FilmTipi tip;
    private int yayinlanmaYili;

    public List3_Film() {
    }
    public List3_Film(String ad,String yonetmen,List3_FilmTipi tip,int yayinlanmaYili) {
        this.ad = ad;
        this.yonetmen=yonetmen;
        this.tip=tip;
        this.yayinlanmaYili=yayinlanmaYili;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List3_FilmTipi getTip() {
        return tip;
    }

    public void setTip(List3_FilmTipi tip) {
        this.tip = tip;
    }

    public String getYönetmen() {
        return yonetmen;
    }

    public void setYönetmen(String yönetmen) {
        this.yonetmen = yönetmen;
    }

    public int getYayinlanmaYili() {
        return yayinlanmaYili;
    }

    public void setYayinlanmaYili(int yayinlanmaYili) {
        this.yayinlanmaYili = yayinlanmaYili;
    }
    @Override
    public int hashCode(){
        return this.yayinlanmaYili+ad.hashCode();
    }
    @Override
    public boolean equals(Object o){
        List3_Film film=(List3_Film) o;
        return film.ad.equals(this.ad)&&film.yayinlanmaYili==((List3_Film) o).yayinlanmaYili;
    }
    @Override
    public String toString(){
        return "Ad:"+ad+"  Yönetmen:"+yonetmen+"  Tip:"+tip+"  Yayınlanma Yılı"+yayinlanmaYili;
    }
}
