public class Set1_Ogrenci implements Comparable<Set1_Ogrenci> {
    private String  isim;
    private int numara;

    public Set1_Ogrenci() {
    }
    public Set1_Ogrenci(int numara,String isim) {
        this.numara=numara;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    @Override
    public String toString(){
        return "Numara:"+numara+" "+"İsim:"+isim;
    }
//Numaraya göre siralar.
    /*@Override
    public int compareTo(Set1_Ogrenci o) {
        return o.numara-this.numara;
    }*/
//İsme göre siralar.
    @Override
    public int compareTo(Set1_Ogrenci o) {
        return this.isim.compareTo(o.isim);
    }
    /*
    * Bu kod parçası, Java'daki Comparable arayüzü ile ilgilidir
ve bir sınıftaki nesnelerin nasıl sıralanacağını tanımlamak için kullanılır.
compareTo() metodu, iki nesneyi karşılaştırarak hangi nesnenin büyük,
küçük veya eşit olduğunu belirler.

    * compareTo(Set1_Ogrenci o):
Bu, Comparable arayüzünden gelen ve iki Set1_Ogrenci nesnesini karşılaştırmak için kullanılan bir metottur.
Parametre olarak başka bir Set1_Ogrenci nesnesi (o) alır ve bu nesneyi, mevcut nesne (this) ile karşılaştırır.

* return o.numara - this.numara; ne yapar?
o.numara: Karşılaştırılan diğer Set1_Ogrenci nesnesinin numarasıdır.
this.numara: Bu, karşılaştırmayı yapan mevcut Set1_Ogrenci nesnesinin numarasıdır.

* Eğer iki Set1_Ogrenci nesnesinin numara değerleri şöyle olsaydı:

Birinci öğrenci: this.numara = 5
İkinci öğrenci: o.numara = 10
Metot şu şekilde çalışır:

return 10 - 5; (sonuç pozitif)
Pozitif sonuç, ikinci öğrencinin (10 numara) birinci öğrenciden (5 numara) önce geleceği anlamına gelir.*/
}
