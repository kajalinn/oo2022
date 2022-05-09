import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Toit{
    String nimetus;
    ArrayList<Komponent> toiduKomponendid;
    FileWriter fw = null;
    BufferedWriter bw = null;
    PrintWriter pw = null;

    public Toit(String nimetus, ArrayList<Komponent> toiduKomponendid){
        this.toiduKomponendid = toiduKomponendid;
    }

    public void toidudeKogus(String nimetus, ArrayList<Komponent> toiduKomponendid) throws IOException{
        Double yldRasvud = 0.0;
        Double yldValgud = 0.0;
        Double yldSusiVesikud = 0.0;
        Double yldKogus = 0.0;
        fw = new FileWriter("toiduNimekiri.txt", true);
        bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw);
        for(Integer product = 0; product < toiduKomponendid.size(); product++){
            yldRasvud = yldRasvud + toiduKomponendid.get(product).rasvaSisu();
            yldValgud = yldValgud + toiduKomponendid.get(product).valguSisu();
            yldSusiVesikud = yldSusiVesikud + toiduKomponendid.get(product).susiVesikuSisu();
            yldKogus = yldKogus + toiduKomponendid.get(product).kogus;
            // pw.println();
        }

        System.out.println("Retsepti nimetus - " + nimetus);
        pw.println("Retsepti nimetus - " + nimetus);
        System.out.println("Yld kogus - " + yldKogus);
        pw.println("Yld kogus - " + yldKogus);
        System.out.println("Toiduainete statistiika kokku: ");
        pw.println("Toiduainete statistiika kokku: ");
        System.out.println("Rasvud söögis - " + yldRasvud);
        pw.println("Rasvud söögis - " + yldRasvud);
        System.out.println("Valgud söögis - " + yldValgud);
        pw.println("Valgud söögis - " + yldValgud);
        System.out.println("Susivesikute söögis - " + yldSusiVesikud);
        pw.println("Susivesikute söögis - " + yldSusiVesikud);
        System.out.println("Eraldi toiduainete väärtused:");
        pw.println("Eraldi toiduainete väärtused:");
        Double aineRasvud = 0.0;
        Double aineValgud = 0.0;
        Double aineSusiVesikud = 0.0;

        for(Integer product = 0; product < toiduKomponendid.size(); product++){            
            aineRasvud = toiduKomponendid.get(product).rasvaSisu();
            aineValgud = toiduKomponendid.get(product).valguSisu();
            aineSusiVesikud = toiduKomponendid.get(product).susiVesikuSisu();
            System.out.println(toiduKomponendid.get(product).toiduaine.nimetus + " :");
            pw.println(toiduKomponendid.get(product).toiduaine.nimetus + " :");
            System.out.println("Rasvud söögis - " + aineRasvud);
            pw.println("Rasvud söögis - " + aineRasvud);
            System.out.println("Valgud söögis - " + aineValgud);
            pw.println("Valgud söögis - " + aineValgud);
            System.out.println("Susivesikute söögis - " + aineSusiVesikud);
            pw.println("Susivesikute söögis - " + aineSusiVesikud);
        }
        pw.flush();
    }
}