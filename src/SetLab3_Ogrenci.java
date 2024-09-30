public class SetLab3_Ogrenci implements  Comparable<SetLab3_Ogrenci>{
    private int numara;
    private String ad;
    private String soyad;
    private String sinif;

    public SetLab3_Ogrenci() {
    }

    public SetLab3_Ogrenci(int numara,String ad,String soyad,String sinif) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    public int getNumara() {
        return numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
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

    public void setNumara(int numara) {
        this.numara = numara;
    }
    @Override
    public String toString(){
        return "Numara:"+numara+" "+"Ad:"+ad+" "+"Soyad:"+soyad+" "+"Sınıf:"+sinif;
    }
    @Override
    public boolean equals(Object object){
        SetLab3_Ogrenci ogrenci=(SetLab3_Ogrenci) object;
        return ogrenci.numara==this.numara;
    }
    @Override
    public int hashCode(){
        return this.numara;
    }

    @Override
    public int compareTo(SetLab3_Ogrenci o) {
            return this.numara-o.numara;
    }
}
