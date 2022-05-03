public class Proov3{
    public static void main (String[] arg) {
        int[][] laud=new int [10] [10];
        laud [2] [3] = 1;
        //Võtke eelmisest näitest teksti abil juhitav kilpkonn
        //Igasse tema teekonna punkti kirjutage 1
        String juhis = "kek";
        if(arg.length > 0) {juhis = arg[0];}
        KilpKonn n1 = new KilpKonn();
        for (int i = 0; i < juhis.length(); i++) {
            if(juhis.charAt(i) == 'e' ) {n1.edasi();} else {n1.keera();}

            //System.out.println(n1);
            laud[n1.kysiX()][n1.kysiY()] = 1;
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(laud[i][j]);
            }
            System.out.println();
        }
    }
}