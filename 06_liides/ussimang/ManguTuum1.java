public class ManguTuum1 implements ManguTuum{

    int ounX, ounY;
    int peaX, peaY;
    final int laius=10, korgus = 10;
    char suund = 'p';


    public void vasakule() {suund='v';}
    public void paremale() {suund= 'p';}
    public void yles() {suund='y';}
    public void alla() {suund= 'a';}
    public void samm() {
        if(suund == 'v') {peaX--;}
        if(suund == 'p') {peaX++;}
        if(suund == 'y') {peaY++;}
        if(suund == 'a') {peaY--;}

        if(peaX == ounX && peaY == ounY){
            System.out.println("Vaga maitsekas oun, tahan veel!");
            ounaleJuhuslikKoht();
        }
    }
    
    public int[] [] ussiKohad() {
        return new int [] [] {{peaX, peaY}};}
    public int[] ounaKoht() {
        return new int[] {ounX, ounY};
    }
    
    public void ounaleJuhuslikKoht(){
        ounX = (int) (laius*Math.random());
        ounY = (int) (korgus*Math.random());
    }
    

}