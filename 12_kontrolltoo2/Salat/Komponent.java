

public class Komponent{
    Double kogus;
    Toiduaine toiduaine;
    public Komponent(Double kogus, Toiduaine toiduaine){
        this.kogus = kogus; //kogus grammis
        this.toiduaine = toiduaine;
    }

    public Double rasvaSisu(){
        return this.kogus * (this.toiduaine.rasvad / 100);

    }
    public Double valguSisu(){
        return this.kogus * (this.toiduaine.valgud / 100);

    }
    public Double susiVesikuSisu(){
        return this.kogus * (this.toiduaine.susiVesikud / 100);

    }
}