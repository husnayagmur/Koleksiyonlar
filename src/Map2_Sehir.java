import java.io.Serializable;

public class Map2_Sehir implements Serializable {
    private String isim;
    private int nufus;

    public Map2_Sehir() {
    }
    public Map2_Sehir(String isim,int nufus) {
        this.isim = isim;
        this.nufus=nufus;
    }

    public String getIsim() {
        return isim;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    @Override
    public int hashCode(){
        return isim.hashCode();
    }
    @Override
    public boolean equals(Object o){
        Map2_Sehir sehir=(Map2_Sehir) o;
        return this.isim.equals(sehir.isim);
    }
    @Override
    public String toString(){
        return "İsim:"+isim+"  "+"Nüfus:"+nufus;
    }
}
