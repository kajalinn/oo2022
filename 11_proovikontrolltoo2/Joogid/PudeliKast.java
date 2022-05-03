public class PudeliKast{
    String kastityyp;
    Double kastiHind;
    Double kastimass;
    int pesadeArv;

    public PudeliKast(String kastityyp, Double kastiHind, Double kastimass, int pesadeArv){
        this.kastityyp = kastityyp;
        this.kastiHind = kastiHind;
        this.kastimass = kastimass;
        this.pesadeArv = pesadeArv;
    }

    public void yldAndmed(Joogipudel joogipudel, int pudeliteArv, Jook jook){
        if(pudeliteArv > pesadeArv){
            System.out.println("Pudelid ei mahu. Max kogus " + pesadeArv);
        } else {
            Double tuhiKastiMass = kastimass + (joogipudel.pudeliMass * pudeliteArv);
            Double taisKastiMass = ((jook.erikaal * joogipudel.maht) * pudeliteArv + tuhiKastiMass) / 1000;
            Double omaHind = kastiHind + (joogipudel.taaraMaksumus * pudeliteArv) + (jook.hindL * joogipudel.maht * pudeliteArv);  

            System.out.println("Kasti mass koos tühi pudelitega - " + tuhiKastiMass);
            System.out.println("Kasti mass koos täis pudelitega - " + taisKastiMass);
            System.out.println("Omahind selle kasti eest - " + omaHind + " eur");

            
        }
    }
}