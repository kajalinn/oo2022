public class Meeskond_proov{
    public static void main(String[] args){
        Meeskond legion = new Meeskond("Legion");
        Mangija pl2 = new Mangija("Messi", 54, 45, 45, 7);
        Mangija pl3 = new Mangija("Mbappe", 22, 13, 70, 12);
        System.out.println(pl2, pl3);
        legion.lisamangija(pl2);
        legion.lisamangija(pl3);
        System.out.println(legion);
        pl2.liigu(3);
        pl2.liigu(7);
        System.out.println(pl2);
        System.out.println(pl3);

    }
}