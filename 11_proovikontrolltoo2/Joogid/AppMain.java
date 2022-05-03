public class AppMain{
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("hey guys, u menya vsjo nice");
        Jook jook1 = new Jook("Coca-cola", 1.80, 1040.0);
        Joogipudel pudel1 = new Joogipudel(1.5, "taasplast", 0.041, 0.1 , jook1);
        pudel1.taisMass(jook1);
        pudel1.realHind(jook1);
        Joogivaat vaat1 = new Joogivaat(30.0, 20.0);
        Jook jook2 = new Jook("Sprite", 1.80, 1040.0);
        Joogipudel pudel2 = new Joogipudel(2.0, "plastpudel", 0.1, 0.1, jook2);
        vaat1.pudeliTaitmine(pudel2);
        PudeliKast kast1 = new PudeliKast("puukast", 5.0, 1.0, 24);
        kast1.yldAndmed(pudel2, 24, jook1);

    }
}