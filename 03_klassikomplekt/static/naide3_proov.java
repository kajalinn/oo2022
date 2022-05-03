public class naide3_proov{
    public static void main(String[] arg){
        naide3 a = new naide3(2);
        naide3 b = new naide3(3);
        System.out.println(a.korruta(8));
        System.out.println(a.korruta(2));
        System.out.println(a.korruta(15));
        System.out.println(b.korruta(20));
        System.out.println(a.eksemplariLoendur);
        System.out.println(b.eksemplariLoendur); // each separate eksemplar output times a-2 b-2 non static method!
        System.out.println(naide3.klassiloendur); //general output times a+b=4 static method!
    }
}