public class Mangija_proov{
    public static void main(String[] arg) {
        Mangija pl1 = new Mangija("Ronaldo", 15.5, 12.5, 60.0, 4.0);
        System.out.println(pl1.toString());
        System.out.println(pl1);
        pl1.liigu(1.0);
        System.out.println(pl1);
        pl1.kaugus(15, 12);
        System.out.println(pl1);
    }
}