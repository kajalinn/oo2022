public class Joogipudel{
    Double maht;    //liitrites
    String pudelityyp; //klaaspudel , metallipurg, plastpudel
    Double pudeliMass; // tuhi pudel grammis
    Double taaraMaksumus;
    Jook jook;


    public Joogipudel(Double maht, String pudelityyp, Double pudeliMass, Double taaraMaksumus, Jook jook){
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.pudeliMass = pudeliMass;
        this.taaraMaksumus = taaraMaksumus;
        this.jook = jook;
    }


    public void taisMass(Jook jook){
        Double joogiMass = maht * jook.erikaal;
        Double yldMassGrammis = joogiMass + pudeliMass;
        Double yldMass = yldMassGrammis / 1000;
        System.out.println(yldMass + " täis mass kilogrammis " + jook.nimetus + " + " + pudelityyp);
    }

    public void realHind(Jook jook){
        Double omaHind = maht * jook.hindL;
        System.out.println(omaHind + " eurot maksab " + jook.nimetus);
    }


}