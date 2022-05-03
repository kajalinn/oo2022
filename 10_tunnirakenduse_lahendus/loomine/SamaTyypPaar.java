import java.util.*;
public class SamaTyypPaar<Tyybinimi extends Comparable<Tyybinimi> > implements Comparable< SamaTyypPaar<Tyybinimi>>{

    public Tyybinimi esimene;
    public Tyybinimi teine;

    @Override
    public int compareTo(SamaTyypPaar<Tyybinimi> vorreldav){
        int vahe1 = esimene.compareTo(vorreldav.esimene);
        if(vahe1!=0){return vahe1;}
        return teine.compareTo(vorreldav.teine);
    }

    @Override
    public String toString(){
        return "("+esimene+"; "+teine+")";
    }
}