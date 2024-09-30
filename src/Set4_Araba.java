public class Set4_Araba {
    private String marka;
    private String model;
    private String plaka;

    public Set4_Araba() {
    }
    public Set4_Araba(String plaka,String marka,String model) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override//İşlevi: İki nesnenin eşit olup olmadığını karşılaştırmak için kullanılır.Bu metod, nesnelerin içeriklerine göre kıyaslama yapmanızı sağlar.
    public boolean equals(Object o){
        Set4_Araba araba=(Set4_Araba)o;
        return this.plaka.equals(((Set4_Araba) o).plaka);
    }
    @Override///İşlevi: Bir nesnenin benzersiz bir tam sayı (int) değerini döndürür. Bu, bir nesneyi hash tabanlı veri yapılarında (örneğin, HashSet veya HashMap) saklarken kullanılır. Aynı nesneler için aynı hashCode() değeri döndürülmelidir.
    public int hashCode(){
        return this.plaka.hashCode();
    }
    @Override
    public String toString(){
        return "Plaka: "+plaka+" "+"Marka: "+marka+" "+"Model: "+model;
    }
}

