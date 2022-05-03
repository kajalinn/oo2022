public class naide3{
    int kordaja;
    int eksemplariLoendur;
    static int klassiloendur;
    public naide3(int uusKordaja){
        kordaja= uusKordaja;
    }
    int korruta(int arv){
        eksemplariLoendur++;
        klassiloendur++;
        return kordaja*arv;
    }
}