public class naide4{
    private int kordaja;
    private int eksemplariLoendur=0;
    static int klassiloendur;
    public naide3(int uusKordaja){
        kordaja= uusKordaja;
    }
    int korruta(int arv){
        eksemplariLoendur++;
        klassiloendur++;
        return kordaja*arv;
    }
    int mituKordaEksemplarisKaivitatud(){
        return eksemplariLoendur;
    }
}