import java.io.IOException;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class Proov{
    public static void main(String[] args) throws IOException {
        Toiduaine juust = new Toiduaine("Saarema juust", 31.0, 15.0, 2.0);
        Toiduaine kana = new Toiduaine("Maxima kanatiivad", 10.0, 12.0, 3.5);

        Komponent juustuTukk = new Komponent(200.0, juust);
        Komponent kanatiib = new Komponent(150.0, kana);


        juustuTukk.rasvaSisu();
        kanatiib.valguSisu();


        ArrayList products = new ArrayList<>();
        products.add(juustuTukk);
        products.add(kanatiib);

        Retsept retsept = new Retsept();
        retsept.toiduaineteArvutamine("Salat Caesar", products, 5000.0);

        
        // Toit toit = new Toit("Kartuli salat", products);
        // toit.toidudeKogus("Kartuli salat", products);
    }
}