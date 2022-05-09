public class Toiduaine{
    String nimetus;
    Double valgud;      //% sisu kokku ei saa rohkem kui 100%
    Double rasvad;
    Double susiVesikud;


    public Toiduaine(String nimetus, Double valgud, Double rasvad, Double susiVesikud){
        this.nimetus = nimetus;
        if(valgud + rasvad + susiVesikud >= 100.0){
            System.out.println("Valkude % ei saa uletada 100%");
        } else {
            this.valgud = valgud;
            this.rasvad = rasvad;
            this.susiVesikud = susiVesikud;
        }
    }
}



