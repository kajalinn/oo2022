public class Meeskond{
    List <Mangija> mangijad = new ArrayList<Mangija>();
    String nimetus;
    public Meeskond(String uusNimetus){nimetus = uusNimetus;}
    public void lisamangija(Mangija m){mangijad.add(m);}
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(nimetus+ "\n");
        for (Mangija m : mangijad) {
            sb.append(m);
        }
        return sb.toString();
    }
    public void liigu(double sek){
        for (Mangija m : mangijad) {
            m.liigu(sek);
        }
    }
}