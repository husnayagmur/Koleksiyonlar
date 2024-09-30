import java.util.Iterator;

public class IteratorLab {
    public static void main(String[] args) {
        IteratorLab_Ogrenci ogrenci=new IteratorLab_Ogrenci();
        ogrenci.setIsim("Hüsna Yağmur");
        int[] ogrNot=new int[4];
        ogrNot[0]=90;
        ogrNot[1]=70;
        ogrNot[2]=55;
        ogrNot[3]=85;
        ogrenci.setNotlar(ogrNot);

        Iterator<Integer> iterator=ogrenci.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }

    }
}
