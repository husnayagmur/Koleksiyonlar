import javax.swing.text.html.parser.Entity;
import java.io.*;
import java.util.*;

public class MapLab1 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\PC\\Desktop\\JAVA\\Java301Koleksiyonlar\\MapLab1.txt");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            fileWriter=new FileWriter(file,true);//sona ekler.
            String line=null;
            SortedMap<String ,String > sortedMap=new TreeMap<>();
            while ((line=bufferedReader.readLine())!=null){
                String[] string=line.split(":");
                /*System.out.println(string[0]);
                System.out.println(string[1]);*/
                sortedMap.put(string[0],string[1]);
            }Scanner scanner=new Scanner(System.in);
            String input=null;
            System.out.print("Kelime:");
            while (!(input=scanner.nextLine()).equals("exit")){
                //input kullanıcıdan alınan kelimedir ve bu kelime, sortedMap içinde bir anahtar olarak aranır.
                String value=sortedMap.get(input);
                if(value!=null){
                    System.out.println(value);
                }else {
                    System.out.println("Kelime Bulunamadı.Eklemek ister misiniz? (E)(H)");
                    if(scanner.nextLine().equals("E")){
                        System.out.print("Yeni Kelime:");
                        String yeniKelime=scanner.nextLine();
                        fileWriter.write("\n");
                        fileWriter.write(input);
                        fileWriter.write(":");
                        fileWriter.write(yeniKelime);
                        fileWriter.flush();
                        sortedMap.put(input,yeniKelime);
                    }
                }
                System.out.println("Kelime");
            }
            /*
            Set<Map.Entry<String,String>> entrySet=sortedMap.entrySet();
            Iterator<Map.Entry<String ,String>> iterator=entrySet.iterator();
            while (iterator.hasNext()){
                Map.Entry<String ,String > next=iterator.next();
                System.out.println(next);
            }*/
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
                if(fileReader!=null){
                    fileReader.close();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    }