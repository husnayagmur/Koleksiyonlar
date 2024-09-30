import java.util.Objects;

public class Set3_Calisan {
    private String isim;
    private int tcNo;

    public Set3_Calisan() {
    }
    public Set3_Calisan(String isim,int tcNo) {
        this.isim = isim;
        this.tcNo=tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }
    @Override
    public int hashCode(){
       return Integer.valueOf(tcNo);
    }
    @Override
    public boolean equals(Object other){
        Set3_Calisan calisan=(Set3_Calisan) other;
        return Objects.equals(this.tcNo, calisan.tcNo);
    }
    @Override
    public String toString(){
        return "İsim:"+isim+" "+"Tc:"+tcNo;
    }
}
