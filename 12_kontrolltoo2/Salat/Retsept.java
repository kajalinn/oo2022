import java.io.IOException;
import java.util.ArrayList;

public class Retsept{
    String nimetus;
    ArrayList<Komponent> toiduKomponendid;
    Double kaal;

    public void toiduaineteArvutamine(String nimetus, ArrayList<Komponent> toiduKomponendid, Double kaal) throws IOException{
        Double yldKogus = 0.0;
        for(Integer product = 0; product < toiduKomponendid.size(); product++){
            yldKogus = yldKogus + toiduKomponendid.get(product).kogus;   
        }
        Double k = kaal / yldKogus;
        System.out.println("Soovime valmistada: " + nimetus);
        System.out.println("Kui palju: " + kaal + " grammi ");
        for(Integer product = 0; product < toiduKomponendid.size(); product++){
             Double uusAineKogus = Math.round((k * (toiduKomponendid.get(product).kogus))*100.00)/100.00;
             System.out.println(toiduKomponendid.get(product).toiduaine.nimetus + " nõutav kogus " + uusAineKogus);
        }
    }
}