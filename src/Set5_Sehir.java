public class Set5_Sehir implements Comparable<Set5_Sehir>{
    public String plakaKodu;
    public String isim;

    public Set5_Sehir() {
    }
    public Set5_Sehir(String plakaKodu,String isim) {
        this.plakaKodu = plakaKodu;
        this.isim=isim;
    }

    public String getPlakaKodu() {
        return plakaKodu;
    }

    public void setPlakaKodu(String plakaKodu) {
        this.plakaKodu = plakaKodu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    @Override
    public String toString(){
        return "Plaka:"+plakaKodu+" "+"İsim:"+isim;
    }

    @Override
    public int compareTo(Set5_Sehir o) {
        return this.plakaKodu.compareTo(o.plakaKodu);
    }
}
