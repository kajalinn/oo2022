public class Proov2a {
    public static void main(String[] arg) { 
        String juhis = "kee";
        if(arg.length > 0) {juhis = arg[0];}
        KilpKonn n1 = new KilpKonn();
        for (int i = 0; i < juhis.length(); i++) {
            if(juhis.charAt(i) == 'e' ) {n1.edasi();} else {n1.keera();}
            System.out.println(n1);
        }
    }
}