public class Proov3{
    public static void main(String[] arg){
        Logija prooviLogija = new FailiLogija("logi.txt");
        LoendavLogija loendavLogija1 = new LoendavLogija();
        Logija proovLogija = loendavLogija1;
        prooviLogija.logi("algus");
        if(arg.length == 2){
            System.out.println(
                Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
        }
        prooviLogija.logi("ots");
        System.out.println(loendavLogija1.logimisteArv());
    }
}