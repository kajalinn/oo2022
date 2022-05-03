public class naide3_proov{
    public static void main(String[] arg){
        naide4 a = new naide4(2);
        naide4 b = new naide4(3);
        System.out.println(a.korruta(8));
        System.out.println(a.korruta(2));
        System.out.println(b.korruta(15));
        System.out.println(b.korruta(20));
        System.out.println(a.mituKordaEksemplarisKaivitatud());
        System.out.println(b.mituKordaEksemplarisKaivitatud()); // each separate eksemplar output times a-2 b-2 non static method!
        System.out.println(naide4.klassiloendur); //general output times a+b=4 static method!
    }
}