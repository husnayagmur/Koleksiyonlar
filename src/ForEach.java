import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        // Bir ArrayList tanımlıyoruz ve içine bazı tamsayılar ekliyoruz.
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        // foreach döngüsü ile liste elemanlarını yazdırma
        for (Integer sayi : sayilar) {
            System.out.println(sayi);  // Liste elemanlarını sırayla yazdır
        }
    }
}
